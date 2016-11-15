package chibivaru.additionalrecipe.baubles;

import baubles.api.BaubleType;
import chibivaru.additionalrecipe.AdditionalRecipe;
import chibivaru.additionalrecipe.classes.ARItemBauble;
import cpw.mods.fml.common.Optional;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;

public class CharmOfGuardian extends ARItemBauble
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
