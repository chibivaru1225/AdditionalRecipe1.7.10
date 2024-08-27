package chibivaru.additionalrecipe.dust;

import java.util.List;

import chibivaru.additionalrecipe.classes.ARMetaItemRow;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class DustMetaItems extends Item {
	ARMetaItemRow[] rows = {
			new ARMetaItemRow("DustBedrock", Items.gunpowder.getIconFromDamage(0), true, 0x777777),
			new ARMetaItemRow("DustExchangeIgnition", Items.sugar.getIconFromDamage(0), true, 0xAAAAAA),
			new ARMetaItemRow("DustNetherStar", Items.sugar.getIconFromDamage(0), true, 0x777777),
			new ARMetaItemRow("DustCheaperExchangeIgnition", Items.gunpowder.getIconFromDamage(0), true, 0xAAAAAA),
			new ARMetaItemRow("DustUltimanteExchangeIgnition", Items.gunpowder.getIconFromDamage(0), true, 0x999999),
			new ARMetaItemRow("DustBread", Items.sugar.getIconFromDamage(0), false, 0x999999),
	};
	int metas = rows.length;
	private final int type;

	public DustMetaItems(int row) {
		super();
		this.type = row;
		this.setMaxDamage(0);
		this.setMaxStackSize(64); // スタックできる量
		this.setHasSubtypes(true);
	}

	@Override
	public int getMetadata(int meta) {
		return meta;
	}

	@Override
	public String getUnlocalizedName(ItemStack itemStack) {
		return rows[type].Name;
	}

	@SideOnly(Side.CLIENT)
	public void getSubItems(Item item, CreativeTabs creativeTab, List list) {
		for (int i = 0; i < metas; i++) {
			list.add(new ItemStack(this, 1, i));
		}
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister par1IconRegister) {
		super.registerIcons(par1IconRegister);
		this.itemIcon = rows[type].Icon;
	}

	@Override
	public boolean onItemUse(ItemStack item, EntityPlayer player, World world, int x, int y, int z, int side,
			float disX, float disY, float disZ) {
		// アイテムをブロックに対して右クリックした時に呼ばれる
		return false;
	}

	@Override
	public ItemStack onItemRightClick(ItemStack item, World world, EntityPlayer player) {
		// アイテムを右クリック時に呼ばれる
		return item;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIconFromDamage(int meta) {
		return rows[meta].Icon;
	}

	public int getColorFromItemStack(ItemStack par1ItemStack, int par2) {
		return rows[par2].Color;
	}

	@SideOnly(Side.CLIENT)
	public boolean hasEffect(ItemStack par1ItemStack) {
		return rows[type].Effect;
	}
}
