package chibivaru.additionalrecipe.tools;

import static chibivaru.additionalrecipe.common.ARItemHandler.*;

import java.util.List;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.ItemCraftedEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class BedrockMortar extends Item
{
    private boolean repair;
    public BedrockMortar()
    {
        super();
        setMaxStackSize(1);
    }

    public boolean doesContainerItemLeaveCraftingGrid(ItemStack par1ItemStack)
    {
        return false;
    }

    public boolean hasContainerItem()
    {
        return !repair;
    }

	@Override
	public ItemStack getContainerItem(ItemStack itemStack)
	{
		return itemStack;
	}

	@SubscribeEvent
	public void onCrafting(ItemCraftedEvent event)
	{
		//IDが無くなったので、アイテムインスタンスで比較。
		repair = ARGetItemRegister("bedrockmortar") == event.crafting.getItem();
	}
	
    @Override
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
    {
        par3List.add((new StringBuilder()).append("Usage: ∞ / ∞").toString());
    }

    public int getColorFromItemStack(ItemStack par1ItemStack, int par2)
    {
        return 0x666666;
    }

    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister par1IconRegister)
    {
        this.itemIcon = Items.bowl.getIconFromDamage(0);
    }
}
