package chibivaru.additionalrecipe.tools;

import static chibivaru.additionalrecipe.common.ARConfiguration.*;
import static chibivaru.additionalrecipe.common.ARItemHandler.*;
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
import baubles.api.BaubleType;
import baubles.api.IBauble;
import chibivaru.additionalrecipe.AdditionalRecipe;
import cpw.mods.fml.common.Optional;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.ItemCraftedEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@Optional.Interface(iface = "baubles.api.IBauble", modid = "Baubles")
public class UltimateExchangeIgnition extends Item implements IBauble
{
    private boolean repair;
    private boolean effect;

    public UltimateExchangeIgnition()
    {
        super();
        this.setMaxStackSize(1);
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
		return itemStack;
	}

	@SubscribeEvent
	public void onCrafting(ItemCraftedEvent event)
	{
		//IDが無くなったので、アイテムインスタンスで比較。
		repair = ARGetItemRegister("ultimateexchangeiginiton") == event.crafting.getItem();
	}

    //既存のハサミと見分けるため、テクスチャを赤で乗算
    public int getColorFromItemStack(ItemStack par1ItemStack, int par2)
    {
        return 0x666666;
    }

    //1.5.2のテクスチャ指定
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister par1IconRegister)
    {
        this.itemIcon = Items.ender_eye.getIconFromDamage(0);
    }
    @SideOnly(Side.CLIENT)
    public boolean hasEffect(ItemStack par1ItemStack)
    {
        return !this.effect;
    }
	@Override
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	{
		par3EntityPlayer.swingItem();
		par3EntityPlayer.addExperienceLevel(1);
		return par1ItemStack;
	}
	public void onUpdate(ItemStack stack, World world, Entity entity, int slot, boolean held)
	{
		if(entity instanceof EntityPlayer)
		{
			EntityPlayer player = (EntityPlayer)entity;
			if(player.inventory.hasItem(ARGetItemRegister("ultimateexchangeiginiton")))
			{
				if(ARGetAnother("UltimateExchangeIgnitionEffect",false))
				{
					player.addPotionEffect(new PotionEffect(Potion.damageBoost.id,20*30,75));
					player.addPotionEffect(new PotionEffect(Potion.waterBreathing.id,20*30,75));
					player.addPotionEffect(new PotionEffect(Potion.regeneration.id,20*30,75));
					player.addPotionEffect(new PotionEffect(Potion.digSpeed.id,20*30,75));
					player.addPotionEffect(new PotionEffect(Potion.nightVision.id,20*30));
				}
			}
		}
	}

	@Override
	@Optional.Method(modid = "Baubles")
	public BaubleType getBaubleType(ItemStack itemstack) {
		// TODO 自動生成されたメソッド・スタブ
		return BaubleType.RING;
	}

	@Override
	@Optional.Method(modid = "Baubles")
	public void onWornTick(ItemStack itemstack, EntityLivingBase player) {
		// TODO 自動生成されたメソッド・スタブ
		if(player instanceof EntityPlayer)
		{
			EntityPlayer player2 = (EntityPlayer)player;
			if(AdditionalRecipe.getBaubles(ARGetItemRegister("ultimateexchangeiginiton"), player2))
			{
				if(ARGetAnother("UltimateExchangeIgnitionEffect",false))
				{
					player2.addPotionEffect(new PotionEffect(Potion.damageBoost.id,20*30,75));
					player2.addPotionEffect(new PotionEffect(Potion.waterBreathing.id,20*30,75));
					player2.addPotionEffect(new PotionEffect(Potion.regeneration.id,20*30,75));
					player2.addPotionEffect(new PotionEffect(Potion.digSpeed.id,20*30,75));
					player2.addPotionEffect(new PotionEffect(Potion.nightVision.id,20*30));
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
