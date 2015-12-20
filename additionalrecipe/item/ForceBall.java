package chibivaru.additionalrecipe.item;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ForceBall extends Item
{
	private boolean effect;
	public ForceBall()
	{
		super();
		this.setMaxStackSize(16);
	}
    //既存のハサミと見分けるため、テクスチャを赤で乗算
    public int getColorFromItemStack(ItemStack par1ItemStack, int par2)
    {
        return 0xDDDDDD;
    }

    //1.5.2のテクスチャ指定
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister par1IconRegister)
    {
        this.itemIcon = Items.ender_pearl.getIconFromDamage(0);
    }
    @SideOnly(Side.CLIENT)
    public boolean hasEffect(ItemStack par1ItemStack)
    {
        return !this.effect;
    }
}
