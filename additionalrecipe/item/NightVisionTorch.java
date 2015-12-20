package chibivaru.additionalrecipe.item;

import static chibivaru.additionalrecipe.common.ARItemHandler.*;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class NightVisionTorch extends Item
{
    private boolean repair;
    private boolean effect;

    public NightVisionTorch()
    {
        super();
        this.setMaxStackSize(1);
    }
	@Override
	public boolean onItemUse(ItemStack item, EntityPlayer player, World world, int x, int y, int z, int side, float disX, float disY, float disZ)
	{
		//アイテムをブロックに対して右クリックした時に呼ばれる
		return false;
	}

	@Override
	public ItemStack onItemRightClick(ItemStack item, World world, EntityPlayer player)
	{
		//アイテムを右クリック時に呼ばれる
		return item;
	}
    //既存のハサミと見分けるため、テクスチャを赤で乗算

    //1.5.2のテクスチャ指定
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister par1IconRegister)
    {
        this.itemIcon = Items.blaze_rod.getIconFromDamage(0);
    }
    @SideOnly(Side.CLIENT)
    public boolean hasEffect(ItemStack par1ItemStack)
    {
        return !effect;
    }
    public void onUpdate(ItemStack stack, World world, Entity entity, int slot, boolean held)
	{
		if(entity instanceof EntityPlayer)
		{
			EntityPlayer player = (EntityPlayer)entity;
			if(player.inventory.hasItem(ARGetItemRegister("nightvisiontorch")))
			{
				player.addPotionEffect(new PotionEffect(Potion.nightVision.id,20*30));
			}
		}
	}
}