package chibivaru.additionalrecipe.event;

import static chibivaru.additionalrecipe.common.ARItemHandler.*;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
import net.minecraftforge.event.entity.living.LivingFallEvent;
import chibivaru.additionalrecipe.AdditionalRecipe;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class ARNoFallDamageEventHooks
{
	private boolean noFallDamage = false;
	@SubscribeEvent//(1.6までは@ForgeSubscribe)
	public void LivingUpdate(LivingUpdateEvent event)
	{
		if(event.entityLiving != null && event.entityLiving instanceof EntityPlayer && event.entityLiving .worldObj.isRemote)
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
				if(AdditionalRecipe.equipArmor(ARGetItemRegister("bedrockboots"), player, AdditionalRecipe.ARMOR_BOOTS))
				{
					this.noFallDamage = true;
				}
				else if(AdditionalRecipe.equipArmor(ARGetItemRegister("angelusboots"), player, AdditionalRecipe.ARMOR_BOOTS))
				{
					this.noFallDamage = true;
				}
				else if(AdditionalRecipe.hasItem(ARGetItemRegister("supergravitationfeather"), player))
				{
					this.noFallDamage = true;
				}
				else if((AdditionalRecipe.hasItem(ARGetItemRegister("exchangeiginiton"), player))||(AdditionalRecipe.hasItem(ARGetItemRegister("ultimateexchangeiginiton"), player)))
				{
					this.noFallDamage = true;
				}
				else if(AdditionalRecipe.getBaubles(ARGetItemRegister("supergravitationfeather"), player))
				{
					this.noFallDamage = true;
				}
				else if((AdditionalRecipe.hasItem(ARGetItemRegister("exchangeiginiton"), player))||(AdditionalRecipe.hasItem(ARGetItemRegister("ultimateexchangeiginiton"), player)))
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
