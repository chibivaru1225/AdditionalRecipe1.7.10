package chibivaru.additionalrecipe.event;

import static chibivaru.additionalrecipe.common.ARItemHandler.*;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import chibivaru.additionalrecipe.AdditionalRecipe;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class TearOfCorpelEventHooks
{
	@SubscribeEvent
	public void TearOfCorpelEvent(AttackEntityEvent event)
	{
		EntityPlayer player = ((PlayerEvent)(event)).entityPlayer;
		Entity entity       = event.target;
		boolean compel      = AdditionalRecipe.hasItem(ARGetItemRegister("tearofcompel"), player);
		boolean bauble      = AdditionalRecipe.getBaubles(ARGetItemRegister("tearofcompel"), player);
		if((compel||bauble) && (entity instanceof EntityLivingBase))
		{
			EntityLivingBase target = (EntityLivingBase)entity;
			target.hurtResistantTime = 0;
		}
	}
}
