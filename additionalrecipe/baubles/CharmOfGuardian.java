package chibivaru.additionalrecipe.baubles;

import baubles.api.BaubleType;
import baubles.api.IBauble;
import chibivaru.additionalrecipe.AdditionalRecipe;
import cpw.mods.fml.common.Optional;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

@Optional.Interface(iface = "baubles.api.IBauble", modid = "Baubles")
public class CharmOfGuardian extends Item implements IBauble
{
	private boolean repair;
	private boolean effect;
	public CharmOfGuardian()
	{
		super();
		this.setMaxStackSize(1);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister register)
	{
		this.itemIcon = register.registerIcon(AdditionalRecipe.MODID + ":COG");
	}
	
	@SideOnly(Side.CLIENT)
	public boolean hasEffect(ItemStack par1ItemStack)
	{
		return !effect;
	}
	
	@Override
	@Optional.Method(modid = "Baubles")
	public BaubleType getBaubleType(ItemStack itemstack)
	{
		// TODO Auto-generated method stub
		return BaubleType.AMULET;
	}

	@Override
	@Optional.Method(modid = "Baubles")
	public void onWornTick(ItemStack itemstack, EntityLivingBase player)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	@Optional.Method(modid = "Baubles")
	public void onEquipped(ItemStack itemstack, EntityLivingBase player)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	@Optional.Method(modid = "Baubles")
	public void onUnequipped(ItemStack itemstack, EntityLivingBase player)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	@Optional.Method(modid = "Baubles")
	public boolean canEquip(ItemStack itemstack, EntityLivingBase player)
	{
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	@Optional.Method(modid = "Baubles")
	public boolean canUnequip(ItemStack itemstack, EntityLivingBase player)
	{
		// TODO Auto-generated method stub
		return true;
	}

}
