package chibivaru.additionalrecipe.baubles;

import static chibivaru.additionalrecipe.common.ARItemHandler.*;

import baubles.api.BaubleType;
import baubles.api.IBauble;
import chibivaru.additionalrecipe.AdditionalRecipe;
import cpw.mods.fml.common.Optional;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

@Optional.Interface(iface = "baubles.api.IBauble", modid = "Baubles")
public class CirceForce extends Item implements IBauble{
    private boolean repair;
    private boolean effect;

    public CirceForce()
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
        this.itemIcon = Items.spider_eye.getIconFromDamage(0);
    }
    @SideOnly(Side.CLIENT)
    public boolean hasEffect(ItemStack par1ItemStack)
    {
        return !effect;
    }
    public int getColorFromItemStack(ItemStack par1ItemStack, int par2)
    {
        return 0x0066FF;
    }
    @Override
    public void onUpdate(ItemStack stack, World world, Entity entity, int slot, boolean held)
    {
		if(entity instanceof EntityPlayer)
		{
			if(world.isRemote)
			{
				EntityPlayer player = (EntityPlayer)entity;
				if(player.inventory.hasItem(ARGetItemRegister("circeforce")))
				{
					if(player.isInsideOfMaterial(Material.water))
					{
						player.setAir(300);
						if(!player.isPotionActive(Potion.nightVision.id))
						{
							player.addPotionEffect(new PotionEffect(Potion.nightVision.id,20*30));
						}
					}
					if(player.isInsideOfMaterial(Material.water))
					{
						player.setAir(300);
					}
				}
			}
		}
    }
	@Override
	@Optional.Method(modid = "Baubles")
	public BaubleType getBaubleType(ItemStack itemstack) {
		// TODO 自動生成されたメソッド・スタブ
		return BaubleType.AMULET;
	}
	@Override
	@Optional.Method(modid = "Baubles")
	public void onWornTick(ItemStack itemstack, EntityLivingBase player)
	{
		if(player instanceof EntityPlayer)
		{
			if(AdditionalRecipe.hasBaubles(ARGetItemRegister("circeforce"),(EntityPlayer)player))
			{
				if(player.isInsideOfMaterial(Material.water))
				{
					player.setAir(300);
					if(!player.isPotionActive(Potion.nightVision.id))
					{
						player.addPotionEffect(new PotionEffect(Potion.nightVision.id,20*30));
					}
				}
				if(player.isInsideOfMaterial(Material.water))
				{
					player.setAir(300);
				}
			}
		}
	}
	@Override
	@Optional.Method(modid = "Baubles")
	public void onEquipped(ItemStack itemstack, EntityLivingBase player) {
		// TODO 自動生成されたメソッド・スタブ

	}
	@Override
	@Optional.Method(modid = "Baubles")
	public void onUnequipped(ItemStack itemstack, EntityLivingBase player) {
		// TODO 自動生成されたメソッド・スタブ

	}
	@Override
	@Optional.Method(modid = "Baubles")
	public boolean canEquip(ItemStack itemstack, EntityLivingBase player) {
		// TODO 自動生成されたメソッド・スタブ
		return true;
	}
	@Override
	@Optional.Method(modid = "Baubles")
	public boolean canUnequip(ItemStack itemstack, EntityLivingBase player) {
		// TODO 自動生成されたメソッド・スタブ
		return true;
	}
}
