package chibivaru.additionalrecipe.common;

import static chibivaru.additionalrecipe.AdditionalRecipe.*;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;

public class ARConfiguration
{
    public static Configuration cfg;

    public static void init(FMLPreInitializationEvent event)
    {
        cfg = new Configuration(event.getSuggestedConfigurationFile());
        try
        {
            cfg.load();

            ARSmelting.put("RecycleTool", ARSet("Smelting", "RecycleTool", true));
            ARSmelting.put("WoodTool", ARSet("Smelting", "WoodTool", true));
            ARSmelting.put("StoneTool", ARSet("Smelting", "StoneTool", true));
            ARSmelting.put("IronTool", ARSet("Smelting", "IronTool", true));
            ARSmelting.put("GoldTool", ARSet("Smelting", "GoldTool", true));
            ARSmelting.put("DiamondTool", ARSet("Smelting", "DiamondTool", true));
            ARSmelting.put("Bow", ARSet("Smelting", "Bow", true));
            ARSmelting.put("SteelTool", ARSet("Smelting", "SteelTool", true));
            ARSmelting.put("InvarTool", ARSet("Smelting", "InvarTool", true));

            ARSmelting.put("RecycleArmor", ARSet("Smelting", "RecycleArmor", true));
            ARSmelting.put("ChainArmor", ARSet("Smelting", "ChainArmor", true));
            ARSmelting.put("LeatherArmor", ARSet("Smelting", "LeatherArmor", true));
            ARSmelting.put("IronArmor", ARSet("Smelting", "IronArmor", true));
            ARSmelting.put("GoldArmor", ARSet("Smelting", "GoldArmor", true));
            ARSmelting.put("DiamondArmor", ARSet("Smelting", "DiamondArmor", true));
            ARSmelting.put("SteelArmor", ARSet("Smelting", "SteelArmor", true));
            ARSmelting.put("InvarArmor", ARSet("Smelting", "InvarArmor", true));

            ARSmelting.put("NetherBrick", ARSet("Smelting", "NetherBrick", true, "Require StoneBrick"));
            ARSmelting.put("Netherrack", ARSet("Smelting", "Netherrack", false, "Require Dirt"));
            ARSmelting.put("Leather", ARSet("Smelting", "Leather", true, "Require RottenFlesh"));
            ARSmelting.put("GlowStoneDust", ARSet("Smelting", "GlowStoneDust", true, "Require RedstoneDust"));
            ARSmelting.put("MinecartEmpty", ARSet("Smelting", "MinecartEmpty", true));
            ARSmelting.put("IronDoor", ARSet("Smelting", "IronDoor", true));
            ARSmelting.put("WoodDoor", ARSet("Smelting", "WoodDoor", true));

            ARCfgOther.put("DiamondMortar", ARSet("ItemDamage", "DiamondMortar", 1561));
            ARCfgOther.put("IromMortar", ARSet("ItemDamage", "IromMortar", 250));
            ARCfgOther.put("CheaperExchangeIgnition", ARSet("ItemDamage", "CheaperExchangeIgnition", 128));
            ARCfgOther.put("NIOH", ARSet("ItemDamage", "NIOH", 4));

            ARCfgOther.put("BedrockMortarDust", ARSet("MortarCrafting", "BedrockMortarDust", 8));
            ARCfgOther.put("DiamondMortarDust", ARSet("MortarCrafting", "DiamondMortar", 4));
            ARCfgOther.put("IronMortarDust", ARSet("MortarCrafting", "IronMortarDust", 2));

            ARCfgOther.put("ExelectorFirstExp", ARSet("Another", "ExelectorFirstExp", 100));
            ARCfgOther.put("ExelectorSecondExp", ARSet("Another", "ExelectorSecondExp", 250));
            ARCfgOther.put("ExelectorLastExp", ARSet("Another", "ExelectorLastExp", 500));
            ARCfgOther.put("Difficulty", ARSet("Another", "Difficulty", 0,
                    "0=easy 1=normal 2=hard 3=lunatic 4=ultimate The others are easy."));

            ARCrafting.put("AppliedEnergistics2", ARSet("AnotherMod", "AppliedEnergistics2", true));
            ARCrafting.put("StorageDrawers", ARSet("AnotherMod", "StorageDrawers", true));
            ARCrafting.put("TinkersConstruct", ARSet("AnotherMod", "TinkersConstruct", true));

            ARAnother.put("ExpBottle", ARSet("OreDicitionary", "ExpBottle", false));
            ARAnother.put("BuildCraft_Spring", ARSet("Dig", "BuildCraft_Spring", true));
            ARAnother.put("EndPortal", ARSet("Dig", "EndPortal", false));

            ARAnother.put("ConsoleOut", ARSet("Another", "ConsoleOut", true));
            ARAnother.put("UltimateExchangeIgnitionEffect", ARSet("Another", "UltimateExchangeIgnitionEffect", false));
            ARAnother.put("NIOHPreventDamage", ARSet("Another", "NIOHPreventDamage", true));
            ARAnother.put("BedrockArmorFlying", ARSet("Another", "BedrockArmorFlying", false));
            ARAnother.put("Enderman", ARSet("Another", "Enderman Dont Pick Up Vanila Block", true));
            // ARAnother.put("ReplaceOverworldSpring",ARSet("Another","ReplaceOverworldSpring",true));
            // ARAnother.put("ReplaceNetherLava",ARSet("Another","ReplaceNetherLava",false));
        }
        catch (Exception e)
        {
            ARLogger.logger.warn("Config Load Failure.");
            // FMLLog.log(Level.SEVERE, e, AdditionalRecipe.CONSOLE + "Config
            // Load Failure.");
        }
        finally
        {
            cfg.save();
        }
    }

    private static boolean ARSet(String par1category, String par2key, boolean par3default, String par4comment)
    {
        Property prop = cfg.get(par1category, par2key, par3default);
        prop.comment = par4comment;
        return prop.getBoolean(par3default);
    }

    private static boolean ARSet(String par1category, String par2key, boolean par3default)
    {
        Property prop = cfg.get(par1category, par2key, par3default);
        return prop.getBoolean(par3default);
    }

    private static int ARSet(String par1category, String par2key, int par3default, String par4comment)
    {
        Property prop = cfg.get(par1category, par2key, par3default);
        prop.comment = par4comment;
        return prop.getInt();
    }

    private static int ARSet(String par1category, String par2key, int par3default)
    {
        Property prop = cfg.get(par1category, par2key, par3default);
        return prop.getInt();
    }

    private static int ARSetID(String par1category, String par2key, int par3defaultID, String par4comment)
    {
        Property prop = cfg.get(par1category, par2key, par3defaultID);
        prop.comment = par4comment;
        return prop.getInt();
    }

    private static int ARSetID(String par1category, String par2key, int par3defaultID)
    {
        Property prop = cfg.get(par1category, par2key, par3defaultID);
        return prop.getInt();
    }

    public static boolean ARGetCrafting(String par1key, boolean par2default)
    {
        if (ARCrafting.containsKey(par1key))
        {
            return ARCrafting.get(par1key);
        }
        else
        {
            return par2default;
        }
    }

    public static boolean ARGetSmelting(String par1key, boolean par2default)
    {
        if (ARSmelting.containsKey(par1key))
        {
            return ARSmelting.get(par1key);
        }
        else
        {
            return par2default;
        }
    }

    public static int ARGetCfgOther(String par1key, int par2default)
    {
        if (ARCfgOther.containsKey(par1key))
        {
            return ARCfgOther.get(par1key);
        }
        else
        {
            return par2default;
        }
    }

    public static boolean ARGetAnother(String par1key, boolean par2default)
    {
        if (ARAnother.containsKey(par1key))
        {
            return ARAnother.get(par1key);
        }
        else
        {
            return par2default;
        }
    }
}
