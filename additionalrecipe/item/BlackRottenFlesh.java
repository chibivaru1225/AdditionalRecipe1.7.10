package chibivaru.additionalrecipe.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class BlackRottenFlesh extends Item
{
	public BlackRottenFlesh()
	{
		super();
		this.setMaxStackSize(64);
	}
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister par1IconRegister)
	{
		this.itemIcon = Items.rotten_flesh.getIconFromDamage(0);
	}
	@Override
    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
    	if(par3EntityPlayer.getFoodStats().getFoodLevel() != 0)
    	{
    		PotionEffect Effect = new PotionEffect(Potion.regeneration.id,1200,49);
    		boolean isRegeneration = par3EntityPlayer.isPotionActive(Effect.getPotionID());
    		if(!isRegeneration)
    		{
    			par3EntityPlayer.swingItem();
    			par1ItemStack.stackSize--;
    			par3EntityPlayer.addPotionEffect(Effect);
    			par3EntityPlayer.getFoodStats().addStats(-par3EntityPlayer.getFoodStats().getFoodLevel(), -par3EntityPlayer.getFoodStats().getSaturationLevel());
    		}
    	}
    	return par1ItemStack;
    }
	@SideOnly(Side.CLIENT)
	public boolean hasEffect(ItemStack par1ItemStack)
	{
		return true;
	}
	public int getColorFromItemStack(ItemStack par1ItemStack, int par2)
	{
		return 0x777777;
	}
}