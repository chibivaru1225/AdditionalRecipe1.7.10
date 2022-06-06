package chibivaru.additionalrecipe.event;

import static chibivaru.additionalrecipe.common.ARConfiguration.*;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.passive.EntityBat;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;

public class MobExlieEventHooks
{
    @SubscribeEvent
    public void onEntityJoinWorld(EntityJoinWorldEvent event)  {
        if (ARGetAnother("Bat", true) && event.world.isRemote == false && event.entity instanceof EntityBat) {
            EntityBat bat = (EntityBat)event.entity;
            bat.setDead();
            event.setCanceled(true);
        }
    }
}
