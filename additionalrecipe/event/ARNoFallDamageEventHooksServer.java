package chibivaru.additionalrecipe.event;

import static chibivaru.additionalrecipe.AdditionalRecipe.*;
import static chibivaru.additionalrecipe.common.ARItemHandler.*;

import chibivaru.additionalrecipe.armor.InsaneArmorBase;
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
                InsaneArmorBase iabBoots = getEquippingInsaneArmor(player, ARMOR_BOOTS);
                if(iabBoots != null && iabBoots.getFeatherFalling())
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
