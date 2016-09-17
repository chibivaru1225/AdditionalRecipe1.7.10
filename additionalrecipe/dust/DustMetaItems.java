package chibivaru.additionalrecipe.dust;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class DustMetaItems extends Item
{
	String[]  names   = {"DustBedrock","DustExchangeIgnition","DustNetherStar","DustCheaperExchangeIgnition","DustUltimanteExchangeIgnition"};
	IIcon[]   icons   = {Items.gunpowder.getIconFromDamage(0),Items.sugar.getIconFromDamage(0),Items.sugar.getIconFromDamage(0),Items.gunpowder.getIconFromDamage(0),Items.gunpowder.getIconFromDamage(0)};
	boolean[] effects = {true,true,true,true,true};
	int[]     colors  = {0x777777,0xAAAAAA,0x777777,0xAAAAAA,0x999999};
	int       metas   = names.length;
	public DustMetaItems()
	{
		super();
		this.setMaxDamage(0);
		this.setMaxStackSize(64);	//スタックできる量
		this.setHasSubtypes(true);
	}
	@Override
	public int getMetadata(int meta)
	{
		return meta;
	}
	@Override
	public String getUnlocalizedName(ItemStack itemStack)
	{
		return names[itemStack.getItemDamage()];
	}
	@SideOnly(Side.CLIENT)
	public void getSubItems(Item item, CreativeTabs creativeTab, List list)
	{
		for (int i = 0; i < metas; i ++)
		{
			list.add(new ItemStack(this, 1, i));
		}
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
	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIconFromDamage(int meta)
	{
		return icons[meta];
	}
	public int getColorFromItemStack(ItemStack par1ItemStack, int par2)
	{
		return colors[par1ItemStack.getItemDamage()];
	}
	@SideOnly(Side.CLIENT)
	public boolean hasEffect(ItemStack par1ItemStack)
	{
		return effects[par1ItemStack.getItemDamage()];
	}
}
