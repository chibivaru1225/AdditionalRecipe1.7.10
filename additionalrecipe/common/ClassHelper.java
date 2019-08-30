package chibivaru.additionalrecipe.common;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.IdentityHashMap;

import org.apache.logging.log4j.Level;

import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.relauncher.ReflectionHelper;
import net.minecraft.block.Block;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;

public class ClassHelper
{
    private static ArrayList<Potion>               badPotions;
    private static IdentityHashMap<Block, Boolean> endermanCarriable;

    private static Object                          AvaritiaExtrameCraftingManagerInstance;
    private static Object                          AvaritiaCompressorManagerInstance;

    private static Class<?>                        AvaritiaExtremeCraftingManager;
    private static Class<?>                        AvaritiaCompressorManager;

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

    private static void getAvaritiaExtremeCraftingManagerInstance()
    {
        if (AvaritiaExtremeCraftingManager == null)
        {
            try
            {
                AvaritiaExtremeCraftingManager = Class.forName("fox.spiteful.avaritia.crafting.ExtremeCraftingManager");
            }
            catch (Exception ex)
            {
                FMLLog.warning("[AdditionalRecipe] Not found fox.spiteful.avaritia.crafting.ExtremeCraftingManager");
            }
        }

        if (AvaritiaExtrameCraftingManagerInstance == null)
        {
            try
            {
                Method inm = AvaritiaExtremeCraftingManager.getMethod("getInstance");
                AvaritiaExtrameCraftingManagerInstance = inm.invoke(null);
            }
            catch (Exception ex)
            {
                FMLLog.warning(
                        "[AdditionalRecipe] Could not invoke fox.spiteful.avaritia.crafting.ExtremeCraftingManager method getInstance");
            }
        }
    }

    public static void AvaritiaAddExtremeShapedOreRecipe(ItemStack result, Object... recipe)
    {
        getAvaritiaExtremeCraftingManagerInstance();

        try
        {
            Method met = AvaritiaExtremeCraftingManager.getMethod("addExtremeShapedOreRecipe", ItemStack.class,
                    Object[].class);
            met.invoke(AvaritiaExtrameCraftingManagerInstance, result, recipe);
        }
        catch (Exception ex)
        {
            FMLLog.warning(
                    "[AdditionalRecipe] Could not invoke fox.spiteful.avaritia.crafting.ExtremeCraftingManager method addExtremeShapedOreRecipe");
        }
    }

    public static void AvaritiaAddExtrameShapelessOreRecipe(ItemStack result, Object... recipe)
    {
        getAvaritiaExtremeCraftingManagerInstance();

        try
        {
            Method met = AvaritiaExtremeCraftingManager.getMethod("addShapelessOreRecipe", ItemStack.class,
                    Object[].class);
            met.invoke(AvaritiaExtrameCraftingManagerInstance, result, recipe);
        }
        catch (Exception ex)
        {
            FMLLog.warning(
                    "[AdditionalRecipe] Could not invoke fox.spiteful.avaritia.crafting.ExtremeCraftingManager method addShapelessOreRecipe");
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