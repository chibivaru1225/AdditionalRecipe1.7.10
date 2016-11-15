package chibivaru.additionalrecipe.classes;

import baubles.api.BaubleType;
import baubles.api.IBauble;
import cpw.mods.fml.common.Optional;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

@Optional.Interface(iface = "baubles.api.IBauble", modid = "Baubles")
public class ARItemBauble extends Item implements IBauble
{
	public ARItemBauble()
	{
		super();
	}
	@Override
	@Optional.Method(modid = "Baubles")
	public BaubleType getBaubleType(ItemStack itemstack) {
		// TODO Auto-generated method stub
		return null;
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
		return false;
	}

	@Override
	@Optional.Method(modid = "Baubles")
	public boolean canUnequip(ItemStack itemstack, EntityLivingBase player)
	{
		// TODO Auto-generated method stub
		return false;
	}

}
