package chibivaru.additionalrecipe.event;

import static chibivaru.additionalrecipe.AdditionalRecipe.*;
import static chibivaru.additionalrecipe.common.ARItemHandler.*;

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
					return true;
				}
				else if(equipArmor(ARGetItemRegister("angelusboots"), player, ARMOR_BOOTS))
				{
					return true;
				}
				else if(equipArmor(ARGetItemRegister("k2boots"), player, ARMOR_BOOTS))
				{
					return true;
				}
				else if(searchItem(ARGetItemRegister("gravitationfeather"), player)||(searchItem(ARGetItemRegister("supergravitationfeather"), player)))
				{
					return true;
				}
				else if(searchItem(ARGetItemRegister("exchangeiginiton"), player)||(searchItem(ARGetItemRegister("ultimateexchangeiginiton"), player)))
				{
					return true;
				}
				else if(searchItem(ARGetItemRegister("charmofguardian"), player))
				{
					return true;
				}
				else
				{
					return false;
				}
			}
		}
		return false;
	}
}
