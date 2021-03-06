package chibivaru.additionalrecipe.event;

import static chibivaru.additionalrecipe.AdditionalRecipe.*;
import static chibivaru.additionalrecipe.common.ARItemHandler.*;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;

public class CirceForceEventHooks {
	@SubscribeEvent//(1.6までは@ForgeSubscribe)
	public void LivingUpdate(LivingUpdateEvent event)
	{
		if(event.entityLiving != null && event.entityLiving instanceof EntityPlayer && event.entityLiving .worldObj.isRemote)
		{
			EntityPlayer   player   = (EntityPlayer)   event.entityLiving;
			EntityPlayerSP playerSP = (EntityPlayerSP) event.entityLiving;
			Circe(player,playerSP);
		}
	}
	public void Circe(EntityPlayer par1player,EntityPlayerSP par2player)
	{
		boolean circeForce = searchItem(ARGetItemRegister("circeforce"), par1player);
		if(circeForce)
		{
			if(par1player.isInWater())
			{
				double dashAmount = 1.1D;
				par2player.motionX *= dashAmount;
				par2player.motionZ *= dashAmount;
				if (((EntityPlayerSP)par2player).movementInput.sneak)
				{
					//player.motionY -= 0.4D;//スニークで下降．クリエイティブより少し早い
					par2player.motionY -= 0.1D;
				}
				if (((EntityPlayerSP)par2player).movementInput.jump)
				{
					//player.motionY += 0.4D;//Jumpキーで上昇．クリエ〈略〉
					par2player.motionY += 0.1D;
				}
			}
			if(par1player.isBurning())
			{
				par1player.extinguish();
			}
		}
	}
}
