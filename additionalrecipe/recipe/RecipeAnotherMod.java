package chibivaru.additionalrecipe.recipe;

import static chibivaru.additionalrecipe.common.ARConfiguration.*;
import static chibivaru.additionalrecipe.common.ARItemHandler.*;

import chibivaru.additionalrecipe.AdditionalRecipe;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class RecipeAnotherMod
{
    private static Class MFR;
    private static Class BC;
    private static Class MoInv;

    public void init()
    {
        if (Loader.isModLoaded("Mystcraft"))
        {
            if (ARGetCrafting("LinkModifer", true))
            {
                /*
                 * GameRegistry.addRecipe( new ShapedOreRecipe( new
                 * ItemStack(MystObjects.link_modifer), new
                 * Object[]{"XXX","XYX","XXX",
                 * Character.valueOf('X'),Block.blockDiamond,
                 * Character.valueOf('Y'),Block.blockGold}));
                 */
                if (ARGetAnother("ConsoleOut", true))
                {
                    System.out.println(
                            AdditionalRecipe.CONSOLE + "Link Modifer" + RecipeHandler.RECIPE + RecipeHandler.ADDED);
                }
            }
            else
            {
                if (ARGetAnother("ConsoleOut", true))
                {
                    System.out.println(
                            AdditionalRecipe.CONSOLE + "Link Modifer" + RecipeHandler.RECIPE + RecipeHandler.NOTADDED);
                }
            }
        }
        if (OreDictionary.getOres("dustWheat").size() > 0)
        {
            if (ARGetCrafting("Flour", true))
            {
                GameRegistry.addRecipe(new ShapelessOreRecipe(OreDictionary.getOres("dustWheat").get(0),
                        new Object[] { Items.wheat }));
                if (ARGetAnother("ConsoleOut", true))
                {
                    System.out.println(AdditionalRecipe.CONSOLE + "Flour" + RecipeHandler.RECIPE + RecipeHandler.ADDED);
                }
            }
            else
            {
                if (ARGetAnother("ConsoleOut", true))
                {
                    System.out.println(
                            AdditionalRecipe.CONSOLE + "Flour" + RecipeHandler.RECIPE + RecipeHandler.NOTADDED);
                }
            }
        }
        if (ARGetCrafting("AppliedEnergistics2", true))
        {
            ItemStack SeedCertus = new ItemStack(GameRegistry.findItem("appliedenergistics2", "item.ItemCrystalSeed"),
                    1, 0);
            ItemStack SeedNether = new ItemStack(GameRegistry.findItem("appliedenergistics2", "item.ItemCrystalSeed"),
                    1, 600);
            ItemStack SeedFluix = new ItemStack(GameRegistry.findItem("appliedenergistics2", "item.ItemCrystalSeed"), 1,
                    1200);
            ItemStack PureCertus = new ItemStack(GameRegistry.findItem("appliedenergistics2", "item.ItemMultiMaterial"),
                    1, 10);
            ItemStack PureNether = new ItemStack(GameRegistry.findItem("appliedenergistics2", "item.ItemMultiMaterial"),
                    1, 11);
            ItemStack PureFluix = new ItemStack(GameRegistry.findItem("appliedenergistics2", "item.ItemMultiMaterial"),
                    1, 12);
            ItemStack PureCertus2 = new ItemStack(GameRegistry.findItem("appliedenergistics2", "item.ItemMultiMaterial"),
                    2, 10);
            ItemStack PureNether2 = new ItemStack(GameRegistry.findItem("appliedenergistics2", "item.ItemMultiMaterial"),
                    2, 11);
            ItemStack PureFluix2 = new ItemStack(GameRegistry.findItem("appliedenergistics2", "item.ItemMultiMaterial"),
                    2, 12);
            ItemStack Certus = new ItemStack(GameRegistry.findItem("appliedenergistics2", "item.ItemMultiMaterial"), 1,
                    0);
            ItemStack Fluix = new ItemStack(GameRegistry.findItem("appliedenergistics2", "item.ItemMultiMaterial"), 2,
                    7);
            ItemStack Silicon = new ItemStack(GameRegistry.findItem("appliedenergistics2", "item.ItemMultiMaterial"), 1,
                    20);
            ItemStack GChip = new ItemStack(GameRegistry.findItem("appliedenergistics2", "item.ItemMultiMaterial"), 1,
                    22);
            ItemStack DChip = new ItemStack(GameRegistry.findItem("appliedenergistics2", "item.ItemMultiMaterial"), 1,
                    24);
            ItemStack CChip = new ItemStack(GameRegistry.findItem("appliedenergistics2", "item.ItemMultiMaterial"), 1,
                    23);
            ItemStack GCircuit = new ItemStack(GameRegistry.findItem("appliedenergistics2", "item.ItemMultiMaterial"),
                    1, 18);
            ItemStack DCircuit = new ItemStack(GameRegistry.findItem("appliedenergistics2", "item.ItemMultiMaterial"),
                    1, 17);
            ItemStack CCircuit = new ItemStack(GameRegistry.findItem("appliedenergistics2", "item.ItemMultiMaterial"),
                    1, 16);
            ItemStack CPress = new ItemStack(GameRegistry.findItem("appliedenergistics2", "item.ItemMultiMaterial"), 1,
                    13);
            ItemStack EPress = new ItemStack(GameRegistry.findItem("appliedenergistics2", "item.ItemMultiMaterial"), 1,
                    14);
            ItemStack LPress = new ItemStack(GameRegistry.findItem("appliedenergistics2", "item.ItemMultiMaterial"), 1,
                    15);
            ItemStack SPress = new ItemStack(GameRegistry.findItem("appliedenergistics2", "item.ItemMultiMaterial"), 1,
                    19);

            if ((PureCertus != null) && (SeedCertus != null))
            {
                GameRegistry.addRecipe(new ShapelessOreRecipe(PureCertus, new Object[] { SeedCertus, Blocks.sand }));
                GameRegistry.addRecipe(new ShapelessOreRecipe(PureCertus2, new Object[] { "dustCertusQuartz", Blocks.sand, Blocks.sand, Blocks.sand }));
            }
            if ((PureNether != null) && (SeedNether != null))
            {
                GameRegistry.addRecipe(new ShapelessOreRecipe(PureNether, new Object[] { SeedNether, Blocks.sand }));
                GameRegistry.addRecipe(new ShapelessOreRecipe(PureNether2, new Object[] { "dustNetherQuartz", Blocks.sand, Blocks.sand, Blocks.sand }));
            }
            if ((PureFluix != null) && (SeedFluix != null))
            {
                GameRegistry.addRecipe(new ShapelessOreRecipe(PureFluix, new Object[] { SeedFluix, Blocks.sand }));
                GameRegistry.addRecipe(new ShapelessOreRecipe(PureFluix2, new Object[] { "dustFluix", Blocks.sand, Blocks.sand, Blocks.sand }));
            }
            if (Fluix != null)
            {
                GameRegistry.addRecipe(new ShapelessOreRecipe(Fluix,
                        new Object[] { "crystalCertusQuartz", Items.quartz, Items.redstone }));
            }
            if (Silicon != null && GChip != null && GCircuit != null)
            {
                GameRegistry.addRecipe(new ShapelessOreRecipe(GChip, new Object[] { GCircuit, Silicon, Items.redstone }));
                GameRegistry.addRecipe(new ShapelessOreRecipe(GChip, new Object[] { ARGetItemRegister("handstamp"), Items.gold_ingot, "itemSilicon", Items.redstone }));
            }
            if (Silicon != null && DChip != null && DCircuit != null)
            {
                GameRegistry.addRecipe(new ShapelessOreRecipe(DChip, new Object[] { DCircuit, Silicon, Items.redstone }));
                GameRegistry.addRecipe(new ShapelessOreRecipe(DChip, new Object[] { ARGetItemRegister("handstamp"), Items.diamond, "itemSilicon", Items.redstone }));
            }
            if (Silicon != null && CChip != null && CCircuit != null && PureCertus != null)
            {
                GameRegistry.addRecipe(new ShapelessOreRecipe(CChip, new Object[] { CCircuit, Silicon, Items.redstone }));
                GameRegistry.addRecipe(new ShapelessOreRecipe(CChip, new Object[] { ARGetItemRegister("handstamp"), Certus, "itemSilicon", Items.redstone }));
                GameRegistry.addRecipe(new ShapelessOreRecipe(CChip, new Object[] { ARGetItemRegister("handstamp"), PureCertus, "itemSilicon", Items.redstone }));
            }
            if (CPress != null && Certus != null && PureCertus != null)
            {
                GameRegistry.addRecipe(new ShapelessOreRecipe(CPress, new Object[] { Blocks.iron_block, Certus }));
                GameRegistry.addRecipe(new ShapelessOreRecipe(CPress, new Object[] { Blocks.iron_block, PureCertus }));
            }
            if (EPress != null)
            {
                GameRegistry
                        .addRecipe(new ShapelessOreRecipe(EPress, new Object[] { Blocks.iron_block, Items.diamond }));
            }
            if (LPress != null)
            {
                GameRegistry.addRecipe(
                        new ShapelessOreRecipe(LPress, new Object[] { Blocks.iron_block, Items.gold_ingot }));
            }
            if (SPress != null)
            {
                GameRegistry
                        .addRecipe(new ShapelessOreRecipe(SPress, new Object[] { Blocks.iron_block, "itemSilicon" }));
            }
            if (CPress != null && EPress != null && LPress != null && SPress != null)
            {
                GameRegistry.addRecipe(new ShapelessOreRecipe(ARGetItemRegister("handstamp"),
                        new Object[] { CPress, EPress, LPress, SPress }));
            }
            if (CCircuit != null && Certus != null && PureCertus != null)
            {
                GameRegistry.addRecipe(
                        new ShapelessOreRecipe(CCircuit, new Object[] { ARGetItemRegister("handstamp"), Certus }));
                GameRegistry.addRecipe(
                        new ShapelessOreRecipe(CCircuit, new Object[] { ARGetItemRegister("handstamp"), PureCertus }));
            }
            if (GCircuit != null)
            {
                GameRegistry.addRecipe(new ShapelessOreRecipe(GCircuit,
                        new Object[] { ARGetItemRegister("handstamp"), Items.gold_ingot }));
            }
            if (DCircuit != null)
            {
                GameRegistry.addRecipe(new ShapelessOreRecipe(DCircuit,
                        new Object[] { ARGetItemRegister("handstamp"), Items.diamond }));
            }
            if (Silicon != null)
            {
                GameRegistry.addRecipe(new ShapelessOreRecipe(Silicon,
                        new Object[] { ARGetItemRegister("handstamp"), "itemSilicon" }));
            }
        }
        if (ARGetCrafting("StorageDrawers", true))
        {
            ItemStack Creative = new ItemStack(GameRegistry.findItem("StorageDrawers", "upgradeCreative"), 1, 0);
            ItemStack Temp = new ItemStack(GameRegistry.findItem("StorageDrawers", "upgradeTemplate"), 1, 0);

            if (Creative != null && Temp != null)
            {
                GameRegistry.addRecipe(new ShapedOreRecipe(Creative,
                        new Object[] { "XYX", "YZY", "XYX", Character.valueOf('X'), "ingotBedrockium",
                                Character.valueOf('Y'), Items.stick, Character.valueOf('Z'), Temp }));
                GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Creative.getItem(), 4),
                        new Object[] { "XYX", "YZY", "XYX", Character.valueOf('X'), "ingotUnstable",
                                Character.valueOf('Y'), Items.stick, Character.valueOf('Z'), Temp }));
                GameRegistry.addRecipe(
                        new ShapedOreRecipe(Creative, new Object[] { "XYX", "YZY", "XYX", Character.valueOf('X'),
                                "ingotEnderium", Character.valueOf('Y'), Items.stick, Character.valueOf('Z'), Temp }));
                GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Creative.getItem(), 4),
                        new Object[] { "XYX", "YZY", "XYX", Character.valueOf('X'), Items.nether_star,
                                Character.valueOf('Y'), Items.stick, Character.valueOf('Z'), Temp }));
            }
        }
        if (ARGetCrafting("TinkersConstruct", true) && Loader.isModLoaded("TConstruct"))
        {
            ItemStack Creative = new ItemStack(GameRegistry.findItem("TConstruct", "creativeModifier"), 1, 0);
            ItemStack ExBush = new ItemStack(GameRegistry.findItem("TConstruct", "ore.berries.two"), 1, 9);
            ItemStack YHeart = new ItemStack(GameRegistry.findItem("TConstruct", "heartCanister"), 1, 3);
            ItemStack YCanister = new ItemStack(GameRegistry.findItem("TConstruct", "heartCanister"), 1, 4);
            ItemStack GHeart = new ItemStack(GameRegistry.findItem("TConstruct", "heartCanister"), 1, 5);
            ItemStack GCanister = new ItemStack(GameRegistry.findItem("TConstruct", "heartCanister"), 1, 6);
            if (Creative != null)
            {
                GameRegistry.addRecipe(new ShapedOreRecipe(Creative, new Object[] { " X ", "XYX", " X ",
                        Character.valueOf('X'), Items.nether_star, Character.valueOf('Y'), Blocks.diamond_block }));
                GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Creative.getItem(), 32, 0),
                        new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), Items.ender_pearl,
                                Character.valueOf('Y'), Blocks.diamond_block }));
            }
            if (ExBush != null)
            {
                GameRegistry.addRecipe(new ShapedOreRecipe(ExBush, new Object[] { "XXX", "XYX", "XXX",
                        Character.valueOf('X'), Items.experience_bottle, Character.valueOf('Y'), Blocks.sapling }));
            }
            if (YCanister != null && YCanister != null && GHeart != null && GCanister != null)
            {
                GameRegistry.addRecipe(new ShapelessOreRecipe(GHeart, new Object[] { YHeart, Items.ender_pearl }));
                GameRegistry.addRecipe(new ShapelessOreRecipe(GCanister,
                        new Object[] { YCanister, GHeart, Blocks.diamond_block, Items.ender_pearl }));
            }
        }
        if (Loader.isModLoaded("EnderIO")) {
            ItemStack EnderSkull = new ItemStack(GameRegistry.findItem("EnderIO", "blockEndermanSkull"), 1, 0);
            GameRegistry.addRecipe(
                new ShapelessOreRecipe(
                    new ItemStack(Items.ender_pearl, 16, 0),
                    new Object[]{"ExchangeIgnition", EnderSkull}));
            
            for (int var1 = 0; var1 < 5; ++var1)
            {
                GameRegistry.addRecipe(new ShapelessOreRecipe(EnderSkull, new Object[]{"ExchangeIgnition", new ItemStack(Items.skull, 1, var1)}));
            }
        }
        if (ARGetCrafting("Et Futurum", true) && Loader.isModLoaded("etfuturum"))
        {
            ItemStack Shard   = new ItemStack(GameRegistry.findItem("etfuturum", "prismarine_shard"), 2, 0);
            ItemStack Crystal = new ItemStack(GameRegistry.findItem("etfuturum", "prismarine_crystals"), 2, 0);
            
            if(Shard != null)
            {
                GameRegistry.addRecipe(
                    new ShapelessOreRecipe(
                        Shard,
                        new Object[]{Items.quartz, Items.quartz}));
            }
            if(Crystal != null)
            {
                GameRegistry.addRecipe(
                    new ShapelessOreRecipe(
                        Crystal,
                        new Object[]{Items.quartz, Items.coal}));
                GameRegistry.addRecipe(
                    new ShapelessOreRecipe(
                        Items.glowstone_dust,
                        new Object[]{GameRegistry.findItem("etfuturum", "prismarine_crystals")}));
            }
        }
        /*
         * if(Loader.isModLoaded("Railcraft")) {
         * if(OreDictionary.getOres("ingotSteel").size() != 0) {
         * if(ARGetSmelting("SteelTool",true)) {
         * if(GameRegistry.findItem("Railcraft","railcraft.tool.steel.axe") !=
         * null) { FurnaceRecipes.smelting().addSmelting(GameRegistry.findItem(
         * "Railcraft","railcraft.tool.steel.axe"),new
         * ItemStack(OreDictionary.getOres("ingotSteel").get(0).getItem(),3,
         * OreDictionary.getOres("ingotSteel").get(0).getItemDamage()),0.0f);
         * if(ARGetAnother("ConsoleOut",true)) {
         * System.out.println(AdditionalRecipe.CONSOLE + "Steel Axe" +
         * RecipeHandler.RECIPE + RecipeHandler.ADDED); } } else {
         * System.out.println(AdditionalRecipe.CONSOLE +
         * "Can't Find Railcraft:Steel Axe."); }
         * if(GameRegistry.findItem("Railcraft","railcraft.tool.steel.hoe") !=
         * null) { FurnaceRecipes.smelting().addSmelting(GameRegistry.findItem(
         * "Railcraft","railcraft.tool.steel.hoe").itemID,new
         * ItemStack(OreDictionary.getOres("ingotSteel").get(0).getItem(),2,
         * OreDictionary.getOres("ingotSteel").get(0).getItemDamage()),0.0f);
         * if(ARGetAnother("ConsoleOut",true)) {
         * System.out.println(AdditionalRecipe.CONSOLE + "Steel Hoe" +
         * RecipeHandler.RECIPE + RecipeHandler.ADDED); } } else {
         * System.out.println(AdditionalRecipe.CONSOLE +
         * "Can't Find Railcraft:Steel Hoe."); }
         * if(GameRegistry.findItem("Railcraft","railcraft.tool.steel.pickaxe")
         * != null) {
         * FurnaceRecipes.smelting().addSmelting(GameRegistry.findItem(
         * "Railcraft","railcraft.tool.steel.pickaxe").itemID,new
         * ItemStack(OreDictionary.getOres("ingotSteel").get(0).getItem(),3,
         * OreDictionary.getOres("ingotSteel").get(0).getItemDamage()),0.0f);
         * if(ARGetAnother("ConsoleOut",true)) {
         * System.out.println(AdditionalRecipe.CONSOLE + "Steel Pickaxe" +
         * RecipeHandler.RECIPE + RecipeHandler.ADDED); } } else {
         * System.out.println(AdditionalRecipe.CONSOLE +
         * "Can't Find Railcraft:Steel Pickaxe."); }
         * if(GameRegistry.findItem("Railcraft","railcraft.tool.steel.shovel")
         * != null) {
         * FurnaceRecipes.smelting().addSmelting(GameRegistry.findItem(
         * "Railcraft","railcraft.tool.steel.shovel").itemID,new
         * ItemStack(OreDictionary.getOres("ingotSteel").get(0).getItem(),1,
         * OreDictionary.getOres("ingotSteel").get(0).getItemDamage()),0.0f);
         * if(ARGetAnother("ConsoleOut",true)) {
         * System.out.println(AdditionalRecipe.CONSOLE + "Steel Shovel" +
         * RecipeHandler.RECIPE + RecipeHandler.ADDED); } } else {
         * System.out.println(AdditionalRecipe.CONSOLE +
         * "Can't Find Railcraft:Steel Shovel."); }
         * if(GameRegistry.findItem("Railcraft","railcraft.tool.steel.sword") !=
         * null) { FurnaceRecipes.smelting().addSmelting(GameRegistry.findItem(
         * "Railcraft","railcraft.tool.steel.sword").itemID,new
         * ItemStack(OreDictionary.getOres("ingotSteel").get(0).getItem(),2,
         * OreDictionary.getOres("ingotSteel").get(0).getItemDamage()),0.0f);
         * if(ARGetAnother("ConsoleOut",true)) {
         * System.out.println(AdditionalRecipe.CONSOLE + "Steel Sword" +
         * RecipeHandler.RECIPE + RecipeHandler.ADDED); } } else {
         * System.out.println(AdditionalRecipe.CONSOLE +
         * "Can't Find Railcraft:Steel Sword."); } }
         * if(ARGetSmelting("SteelArmor",true)) {
         * if(GameRegistry.findItem("Railcraft","railcraft.armor.steel.boots")
         * != null) {
         * FurnaceRecipes.smelting().addSmelting(GameRegistry.findItem(
         * "Railcraft","railcraft.armor.steel.boots").itemID,new
         * ItemStack(OreDictionary.getOres("ingotSteel").get(0).getItem(),4,
         * OreDictionary.getOres("ingotSteel").get(0).getItemDamage()),0.0f);
         * if(ARGetAnother("ConsoleOut",true)) {
         * System.out.println(AdditionalRecipe.CONSOLE + "Steel Boots" +
         * RecipeHandler.RECIPE + RecipeHandler.ADDED); } } else {
         * System.out.println(AdditionalRecipe.CONSOLE +
         * "Can't Find Railcraft:Steel Boots."); }
         * if(GameRegistry.findItem("Railcraft","railcraft.armor.steel.helmet")
         * != null) {
         * FurnaceRecipes.smelting().addSmelting(GameRegistry.findItem(
         * "Railcraft","railcraft.armor.steel.helmet").itemID,new
         * ItemStack(OreDictionary.getOres("ingotSteel").get(0).getItem(),5,
         * OreDictionary.getOres("ingotSteel").get(0).getItemDamage()),0.0f);
         * if(ARGetAnother("ConsoleOut",true)) {
         * System.out.println(AdditionalRecipe.CONSOLE + "Steel Helmet" +
         * RecipeHandler.RECIPE + RecipeHandler.ADDED); } } else {
         * System.out.println(AdditionalRecipe.CONSOLE +
         * "Can't Find Railcraft:Steel Helmet."); }
         * if(GameRegistry.findItem("Railcraft","railcraft.armor.steel.legs") !=
         * null) { FurnaceRecipes.smelting().addSmelting(GameRegistry.findItem(
         * "Railcraft","railcraft.armor.steel.legs").itemID,new
         * ItemStack(OreDictionary.getOres("ingotSteel").get(0).getItem(),7,
         * OreDictionary.getOres("ingotSteel").get(0).getItemDamage()),0.0f);
         * if(ARGetAnother("ConsoleOut",true)) {
         * System.out.println(AdditionalRecipe.CONSOLE + "Steel Leggings" +
         * RecipeHandler.RECIPE + RecipeHandler.ADDED); } } else {
         * System.out.println(AdditionalRecipe.CONSOLE +
         * "Can't Find Railcraft:Steel Leggings."); }
         * if(GameRegistry.findItem("Railcraft","railcraft.armor.steel.plate")
         * != null) {
         * FurnaceRecipes.smelting().addSmelting(GameRegistry.findItem(
         * "Railcraft","railcraft.armor.steel.plate").itemID,new
         * ItemStack(OreDictionary.getOres("ingotSteel").get(0).getItem(),8,
         * OreDictionary.getOres("ingotSteel").get(0).getItemDamage()),0.0f);
         * if(ARGetAnother("ConsoleOut",true)) {
         * System.out.println(AdditionalRecipe.CONSOLE + "Steel Plate" +
         * RecipeHandler.RECIPE + RecipeHandler.ADDED); } } else {
         * System.out.println(AdditionalRecipe.CONSOLE +
         * "Can't Find Railcraft:Steel Chestplate."); } } } }
         */
        /*
         * if(Loader.isModLoaded("ThermalExpansion")) {
         * if(OreDictionary.getOres("ingotInvar").size() != 0) {
         * if(ARGetSmelting("InvarTool",true)) {
         * if(GameRegistry.findItem("ThermalExpansion",
         * "thermalexpansion.tool.invarAxe") != null) {
         * FurnaceRecipes.smelting().addSmelting(GameRegistry.findItem(
         * "ThermalExpansion","thermalexpansion.tool.invarAxe").itemID,new
         * ItemStack(OreDictionary.getOres("ingotInvar").get(0).getItem(),3,
         * OreDictionary.getOres("ingotInvar").get(0).getItemDamage()),0.0f);
         * if(ARGetAnother("ConsoleOut",true)) {
         * System.out.println(AdditionalRecipe.CONSOLE + "Invar Axe" +
         * RecipeHandler.RECIPE + RecipeHandler.ADDED); } } else {
         * System.out.println(AdditionalRecipe.CONSOLE +
         * "Can't Find ThermalExpansion:Invar Axe."); }
         * if(GameRegistry.findItem("ThermalExpansion",
         * "thermalexpansion.tool.invarHoe") != null) {
         * FurnaceRecipes.smelting().addSmelting(GameRegistry.findItem(
         * "ThermalExpansion","thermalexpansion.tool.invarHoe").itemID,new
         * ItemStack(OreDictionary.getOres("ingotInvar").get(0).getItem(),3,
         * OreDictionary.getOres("ingotInvar").get(0).getItemDamage()),0.0f);
         * if(ARGetAnother("ConsoleOut",true)) {
         * System.out.println(AdditionalRecipe.CONSOLE + "Invar Hoe" +
         * RecipeHandler.RECIPE + RecipeHandler.ADDED); } } else {
         * System.out.println(AdditionalRecipe.CONSOLE +
         * "Can't Find ThermalExpansion:Invar Hoe."); }
         * if(GameRegistry.findItem("ThermalExpansion",
         * "thermalexpansion.tool.invarPickaxe") != null) {
         * FurnaceRecipes.smelting().addSmelting(GameRegistry.findItem(
         * "ThermalExpansion","thermalexpansion.tool.invarPickaxe").itemID,new
         * ItemStack(OreDictionary.getOres("ingotInvar").get(0).getItem(),3,
         * OreDictionary.getOres("ingotInvar").get(0).getItemDamage()),0.0f);
         * if(ARGetAnother("ConsoleOut",true)) {
         * System.out.println(AdditionalRecipe.CONSOLE + "Invar Pickaxe" +
         * RecipeHandler.RECIPE + RecipeHandler.ADDED); } } else {
         * System.out.println(AdditionalRecipe.CONSOLE +
         * "Can't Find ThermalExpansion:Invar Pickaxe."); }
         * if(GameRegistry.findItem("ThermalExpansion",
         * "thermalexpansion.tool.invarShovel") != null) {
         * FurnaceRecipes.smelting().addSmelting(GameRegistry.findItem(
         * "ThermalExpansion","thermalexpansion.tool.invarShovel").itemID,new
         * ItemStack(OreDictionary.getOres("ingotInvar").get(0).getItem(),3,
         * OreDictionary.getOres("ingotInvar").get(0).getItemDamage()),0.0f);
         * if(ARGetAnother("ConsoleOut",true)) {
         * System.out.println(AdditionalRecipe.CONSOLE + "Invar Shovel" +
         * RecipeHandler.RECIPE + RecipeHandler.ADDED); } } else {
         * System.out.println(AdditionalRecipe.CONSOLE +
         * "Can't Find ThermalExpansion:Invar Shovel."); }
         * if(GameRegistry.findItem("ThermalExpansion",
         * "thermalexpansion.tool.invarSword") != null) {
         * FurnaceRecipes.smelting().addSmelting(GameRegistry.findItem(
         * "ThermalExpansion","thermalexpansion.tool.invarSword").itemID,new
         * ItemStack(OreDictionary.getOres("ingotInvar").get(0).getItem(),3,
         * OreDictionary.getOres("ingotInvar").get(0).getItemDamage()),0.0f);
         * if(ARGetAnother("ConsoleOut",true)) {
         * System.out.println(AdditionalRecipe.CONSOLE + "Invar Sword" +
         * RecipeHandler.RECIPE + RecipeHandler.ADDED); } } else {
         * System.out.println(AdditionalRecipe.CONSOLE +
         * "Can't Find ThermalExpansion:Invar Sword."); } }
         * if(ARGetSmelting("InvarArmor",true)) {
         * if(GameRegistry.findItem("ThermalExpansion",
         * "thermalexpansion.armor.invarBoots") != null) {
         * FurnaceRecipes.smelting().addSmelting(GameRegistry.findItem(
         * "ThermalExpansion","thermalexpansion.armor.invarBoots").itemID,new
         * ItemStack(OreDictionary.getOres("ingotInvar").get(0).getItem(),3,
         * OreDictionary.getOres("ingotInvar").get(0).getItemDamage()),0.0f);
         * if(ARGetAnother("ConsoleOut",true)) {
         * System.out.println(AdditionalRecipe.CONSOLE + "Invar Boots" +
         * RecipeHandler.RECIPE + RecipeHandler.ADDED); } } else {
         * System.out.println(AdditionalRecipe.CONSOLE +
         * "Can't Find ThermalExpansion:Invar Boots."); }
         * if(GameRegistry.findItem("ThermalExpansion",
         * "thermalexpansion.armor.invarHelmet") != null) {
         * FurnaceRecipes.smelting().addSmelting(GameRegistry.findItem(
         * "ThermalExpansion","thermalexpansion.armor.invarHelmet").itemID,new
         * ItemStack(OreDictionary.getOres("ingotInvar").get(0).getItem(),3,
         * OreDictionary.getOres("ingotInvar").get(0).getItemDamage()),0.0f);
         * if(ARGetAnother("ConsoleOut",true)) {
         * System.out.println(AdditionalRecipe.CONSOLE + "Invar Helmet" +
         * RecipeHandler.RECIPE + RecipeHandler.ADDED); } } else {
         * System.out.println(AdditionalRecipe.CONSOLE +
         * "Can't Find ThermalExpansion:Invar Helmet."); }
         * if(GameRegistry.findItem("ThermalExpansion",
         * "thermalexpansion.armor.invarLegs") != null) {
         * FurnaceRecipes.smelting().addSmelting(GameRegistry.findItem(
         * "ThermalExpansion","thermalexpansion.armor.invarLegs").itemID,new
         * ItemStack(OreDictionary.getOres("ingotInvar").get(0).getItem(),3,
         * OreDictionary.getOres("ingotInvar").get(0).getItemDamage()),0.0f);
         * if(ARGetAnother("ConsoleOut",true)) {
         * System.out.println(AdditionalRecipe.CONSOLE + "Invar Leggings" +
         * RecipeHandler.RECIPE + RecipeHandler.ADDED); } } else {
         * System.out.println(AdditionalRecipe.CONSOLE +
         * "Can't Find ThermalExpansion:Invar Leggings."); }
         * if(GameRegistry.findItem("ThermalExpansion",
         * "thermalexpansion.armor.invarPlate") != null) {
         * FurnaceRecipes.smelting().addSmelting(GameRegistry.findItem(
         * "ThermalExpansion","thermalexpansion.armor.invarPlate").itemID,new
         * ItemStack(OreDictionary.getOres("ingotInvar").get(0).getItem(),3,
         * OreDictionary.getOres("ingotInvar").get(0).getItemDamage()),0.0f);
         * if(ARGetAnother("ConsoleOut",true)) {
         * System.out.println(AdditionalRecipe.CONSOLE + "Invar Plate" +
         * RecipeHandler.RECIPE + RecipeHandler.ADDED); } } else {
         * System.out.println(AdditionalRecipe.CONSOLE +
         * "Can't Find ThermalExpansion:Invar Chestplate."); } } } }
         */
        /*
         * try { MFR = Class.forName(
         * "powercrystals.minefactoryreloaded.MineFactoryReloadedCore"); Object
         * pinkSlimeBall = MFR.getField("pinkSlimeballItem").get(null);
         * ItemStack pink = new ItemStack((Item)pinkSlimeBall);
         * if(ARGetCrafting("PinkSlimeBall",true)) { GameRegistry.addRecipe( new
         * ShapedOreRecipe( pink, new Object[]{"XXX","XYX","XXX",
         * Character.valueOf('X'),Items.rotten_flesh,
         * Character.valueOf('Y'),Items.slime_ball}));
         * if(ARGetAnother("ConsoleOut",true)) {
         * System.out.println(AdditionalRecipe.CONSOLE + "PinkSlimeBall" +
         * RecipeHandler.RECIPE + RecipeHandler.ADDED); } } else {
         * if(ARGetAnother("ConsoleOut",true)) {
         * System.out.println(AdditionalRecipe.CONSOLE + "PinkSlimeBall" +
         * RecipeHandler.RECIPE + RecipeHandler.NOTADDED); } } } catch(Exception
         * e) { System.out.println(AdditionalRecipe.CONSOLE +
         * "Can't Find MineFactory Reloaded."); }
         */
        try
        {
            BC = Class.forName("buildcraft.BuildCraftCore");
            Object springBlock = BC.getField("springBlock").get(null);
            Block spring = (Block) springBlock;
            if (ARGetAnother("BuildCraft_Spring", true))
            {
                spring.setHardness(60F);
            }
        }
        catch (Exception e)
        {
            // ARLogger.logger.failLoadingModInfo((String)"BuildCraft");
            // System.out.println(AdditionalRecipe.CONSOLE + "Can't Find
            // BuildCraft.");
        }
        if ((OreDictionary.getOres("oreTofu").size() > 0) && (OreDictionary.getOres("tofuGem").size() > 0))
        {
            GameRegistry.addRecipe(new ShapelessOreRecipe(
                    new ItemStack(OreDictionary.getOres("tofuGem").get(0).getItem(), 2,
                            OreDictionary.getOres("tofuGem").get(0).getItemDamage()),
                    new Object[] { "oreTofu", "MortarTier01" }));
            GameRegistry.addSmelting(OreDictionary.getOres("oreTofu").get(0).getItem(),
                    new ItemStack(OreDictionary.getOres("tofuGem").get(0).getItem(), 2,
                            OreDictionary.getOres("tofuGem").get(0).getItemDamage()),
                    0.0f);
        }
        try
        {
            MoInv = Class.forName("moreinventory.MoreInventoryMod");
            Object WoodContainer = MoInv.getField("StorageBox").get(null);
            ItemStack Diamond = new ItemStack((Item) WoodContainer, 1, 3);
            ItemStack Emerald = new ItemStack((Item) WoodContainer, 3, 10);
            GameRegistry.addRecipe(new ShapedOreRecipe(Emerald,
                    new Object[] { "XYX", "XZX", "XYX", Character.valueOf('X'), Items.emerald, Character.valueOf('Y'),
                            Blocks.stone_slab, Character.valueOf('Z'), Diamond }));
        }
        catch (Exception e)
        {
            // System.out.println(AdditionalRecipe.CONSOLE + "Can't Find
            // MoreInventoryMod.");
        }
    }
}
