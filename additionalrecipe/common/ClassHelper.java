package chibivaru.additionalrecipe.common;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.IdentityHashMap;

import org.apache.logging.log4j.Level;

import cpw.mods.fml.relauncher.ReflectionHelper;
import net.minecraft.block.Block;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.potion.Potion;

public class ClassHelper
{
    private static ArrayList<Potion>               badPotions;
    private static IdentityHashMap<Block, Boolean> endermanCarriable;

    public static void healthInspection()
    {
        badPotions = new ArrayList<Potion>();
        try
        {
            Field stupidMojangPrivateVariable = ReflectionHelper.findField(Potion.class, "isBadEffect",
                    "field_76418_K");

            for (Potion potion : Potion.potionTypes)
            {
                if (potion != null && stupidMojangPrivateVariable.getBoolean(potion))
                    badPotions.add(potion);
            }
        }
        catch (Exception e)
        {
            ARLogger.logger.log(Level.ERROR, "Failure to get potions");
            e.printStackTrace();
        }
    }

    public static void endermanInspection()
    {
        endermanCarriable = new IdentityHashMap<Block, Boolean>();
        try
        {
            Field stupidForgePrivateVariable = ReflectionHelper.findField(EntityEnderman.class, "carriable");

            endermanCarriable = (IdentityHashMap<Block, Boolean>) stupidForgePrivateVariable.get(null);
        }
        catch (Exception e)
        {
            ARLogger.logger.log(Level.ERROR, "Failure to Enderman Pickable");
            e.printStackTrace();
        }
    }

    public static IdentityHashMap<Block, Boolean> endermanCarriable()
    {
        return endermanCarriable;
    }

    public static boolean badPotion(Potion effect)
    {
        return badPotions.contains(effect);
    }
}