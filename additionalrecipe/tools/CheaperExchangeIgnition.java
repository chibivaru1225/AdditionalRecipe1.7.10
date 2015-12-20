package chibivaru.additionalrecipe.tools;

import static chibivaru.additionalrecipe.common.ARItemHandler.*;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.ItemCraftedEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class CheaperExchangeIgnition extends Item
{
	private boolean repair;
	private boolean effect;

	public CheaperExchangeIgnition()
	{
		super();
		this.setMaxDamage(128);
		this.setMaxStackSize(1);
	}

	public boolean doesContainerItemLeaveCraftingGrid(ItemStack par1ItemStack)
	{
		return false;
	}

	@Override
	public boolean hasContainerItem()
	{
		return !repair;
	}

	@SubscribeEvent
	public void onCrafting(ItemCraftedEvent event)
	{
		//IDが無くなったので、アイテムインスタンスで比較。
		repair = ARGetItemRegister("cheaperexchangeiginiton") == event.crafting.getItem();
	}

	@Override
	public ItemStack getContainerItem(ItemStack itemStack)
	{
		if (itemStack != null && itemStack.getItem() == this)
		{
			itemStack.setItemDamage(itemStack.getItemDamage() + 1);
		}
		return itemStack;
	}

	public int getColorFromItemStack(ItemStack par1ItemStack, int par2)
	{
		return 0x666666;
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister par1IconRegister)
	{
		this.itemIcon = Items.diamond.getIconFromDamage(0);
	}
}
