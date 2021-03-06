package chibivaru.additionalrecipe.event;

import static chibivaru.additionalrecipe.AdditionalRecipe.*;
import static chibivaru.additionalrecipe.common.ARItemHandler.*;

import chibivaru.additionalrecipe.armor.InsaneArmorBase;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
import net.minecraftforge.event.entity.living.LivingFallEvent;

public class ARNoFallDamageEventHooks
{
	private boolean noFallDamage = false;
	@SubscribeEvent//(1.6までは@ForgeSubscribe)
	public void LivingUpdate(LivingUpdateEvent event)
	{
		if(event.entityLiving != null && event.entityLiving instanceof EntityPlayerSP && event.entityLiving .worldObj.isRemote)
		{
			EntityPlayerSP player = (EntityPlayerSP) event.entityLiving;
			Falling(player);
		}
	}
	private void Falling(EntityPlayerSP player)
	{
		//クリエイティブでないなら
		if(!player.capabilities.isCreativeMode)
		{
			//飛行が許可されていないなら
			if(!player.capabilities.allowFlying)
			{
		        InsaneArmorBase iabBoots = getEquippingInsaneArmor(player, ARMOR_BOOTS);
				if(iabBoots != null && iabBoots.getFeatherFalling())
				{
					this.noFallDamage = true;
				}
				else if(searchItem(ARGetItemRegister("gravitationfeather"), player)||(searchItem(ARGetItemRegister("supergravitationfeather"), player)))
				{
					this.noFallDamage = true;
				}
				else if(searchItem(ARGetItemRegister("exchangeiginiton"), player)||(searchItem(ARGetItemRegister("ultimateexchangeiginiton"), player)))
				{
					this.noFallDamage = true;
				}
				else if(searchItem(ARGetItemRegister("charmofguardian"), player))
				{
					this.noFallDamage = true;
				}
				else
				{
					this.noFallDamage = false;
				}
			}
		}
	}
	//落下時ダメージ無効化処理。LivingFallEventが実装されたバージョンのみ
	@SubscribeEvent
	public void onPlayerFall(LivingFallEvent event)
	{
		if (event.entityLiving instanceof EntityPlayer) {
			EntityPlayer player = (EntityPlayer)event.entityLiving;
			if (this.noFallDamage)
			{
				event.setCanceled(true);
			}
		}
	}
}
