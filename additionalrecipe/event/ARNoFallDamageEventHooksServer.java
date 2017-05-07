package chibivaru.additionalrecipe.event;

import static chibivaru.additionalrecipe.AdditionalRecipe.*;
import static chibivaru.additionalrecipe.common.ARItemHandler.*;

import chibivaru.additionalrecipe.common.ARLogger;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.living.LivingFallEvent;

public class ARNoFallDamageEventHooksServer
{
	@SubscribeEvent()
	public void onFallDamage(LivingFallEvent event)
	{
		if (event.entityLiving instanceof EntityPlayer) {
			EntityPlayer player = (EntityPlayer)event.entityLiving;
			if (this.HasItem(player))
			{
				event.setCanceled(true);
			}
		}
	}
	public boolean HasItem(EntityPlayer player)
	{
		//クリエイティブでないなら
		if(!player.capabilities.isCreativeMode)
		{
			//飛行が許可されていないなら
			if(!player.capabilities.allowFlying)
			{
				if(equipArmor(ARGetItemRegister("bedrockboots"), player, ARMOR_BOOTS))
				{
					ARLogger.info("bedrockboots");
					return true;
				}
				else if(equipArmor(ARGetItemRegister("angelusboots"), player, ARMOR_BOOTS))
				{
					ARLogger.info("angelusboots");
					return true;
				}
				else if(equipArmor(ARGetItemRegister("k2boots"), player, ARMOR_BOOTS))
				{
					ARLogger.info("k2boots");
					return true;
				}
				else if(searchItem(ARGetItemRegister("gravitationfeather"), player)||(searchItem(ARGetItemRegister("supergravitationfeather"), player)))
				{
					ARLogger.info("gravitationfeather || supergravitationfeather");
					return true;
				}
				else if(searchItem(ARGetItemRegister("exchangeiginiton"), player)||(searchItem(ARGetItemRegister("ultimateexchangeiginiton"), player)))
				{
					ARLogger.info("exchangeiginiton || ultimateexchangeiginiton");
					return true;
				}
				else if(searchItem(ARGetItemRegister("charmofguardian"), player))
				{
					ARLogger.info("charmofguardian");
					return true;
				}
				else
				{
					ARLogger.info("false");
					return false;
				}
			}
		}
		ARLogger.info("????????");
		return false;
	}
}
