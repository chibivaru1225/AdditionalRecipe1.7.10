package chibivaru.additionalrecipe.tools;

import static chibivaru.additionalrecipe.common.ARConfiguration.*;
import static chibivaru.additionalrecipe.common.ARItemHandler.*;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.ItemCraftedEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class DiamondMortar extends Item
{
    private boolean repair;
    public DiamondMortar()
    {
        super();
        setMaxStackSize(1);
        setMaxDamage(ARGetCfgOther("DiamondMortar",1561));
    }

    //アイテムがクラフト後に戻らないようにする
    public boolean doesContainerItemLeaveCraftingGrid(ItemStack par1ItemStack)
    {
        return false;
    }

    //クラフト後にgetContainerItemStackを呼び出す
    public boolean hasContainerItem()
    {
        return !repair;
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

	@SubscribeEvent
	public void onCrafting(ItemCraftedEvent event)
	{
		//IDが無くなったので、アイテムインスタンスで比較。
		repair = ARGetItemRegister("diamondmortar") == event.crafting.getItem();
	}

    //既存のハサミと見分けるため、テクスチャを赤で乗算
    public int getColorFromItemStack(ItemStack par1ItemStack, int par2)
    {
        return 0x8888FF;
    }

    //1.5.2のテクスチャ指定
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister par1IconRegister)
    {
        this.itemIcon = Items.bowl.getIconFromDamage(0);
    }
}
