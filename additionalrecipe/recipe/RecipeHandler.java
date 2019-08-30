package chibivaru.additionalrecipe.recipe;

import static chibivaru.additionalrecipe.common.ARConfiguration.*;

import chibivaru.additionalrecipe.AdditionalRecipe;
import chibivaru.additionalrecipe.common.ARItemHandler;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class RecipeHandler
{
    RecipeARItems              recipeadditionalitems;
    RecipeAnotherMod           recipeanothermod;
    RecipeCrystal              recipecrystal;
    RecipeDusts                recipedusts;
    RecipeItems                recipeitems;
    RecipeMortar               recipemortar;
    RecipeOreDic               recipeoredic;
    RecipeOres                 recipeores;
    RecipeSmelting             recipesmelting;
    public final static String RECIPE   = " crafting recipe";
    public final static String OREDIC   = " oredictionary";
    public final static String AVA      = " avaritia";
    public final static String COMPRESS = " compressor";
    public final static String ADDED    = " was added.";
    public final static String NOTADDED = " was not added.";

    public void init()
    {
        recipeadditionalitems = new RecipeARItems();
        recipeanothermod = new RecipeAnotherMod();
        recipecrystal = new RecipeCrystal();
        recipedusts = new RecipeDusts();
        recipeitems = new RecipeItems();
        recipemortar = new RecipeMortar();
        recipeoredic = new RecipeOreDic();
        recipeores = new RecipeOres();
        recipesmelting = new RecipeSmelting();

        recipeadditionalitems.init();
        recipeanothermod.init();
        recipecrystal.init();
        recipedusts.init();
        recipeitems.init();
        recipemortar.init();
        recipeoredic.init();
        recipeores.init();
        recipesmelting.init();

        ItemStack PinkSlime = new ItemStack(GameRegistry.findItem("MineFactoryReloaded", "pinkslime"));
        if (PinkSlime != null)
        {
            GameRegistry.addRecipe(new ShapedOreRecipe(PinkSlime, new Object[] { "XXX", "XYX", "XXX",
                    Character.valueOf('X'), Items.rotten_flesh, Character.valueOf('Y'), Items.slime_ball }));
        }

//        if (Loader.isModLoaded("Avaritia"))
//        {
//            ClassHelper.AvaritiaAddExtremeShapedOreRecipe(new ItemStack(Blocks.soul_sand),
//                    new Object[] { "XXXXXXXXX", "XXXXXXXXX", "XXXXXXXXX", "XXXXXXXXX", "XXXXXXXXX", "XXXXXXXXX",
//                            "XXXXXXXXX", "XXXXXXXXX", "XXXXXXXXX", Character.valueOf('X'), Blocks.cobblestone });
//            System.out.println(AdditionalRecipe.CONSOLE + "Soul Sand" + AVA + ADDED);
//
//            ClassHelper.AvaritiaAddExtrameShapelessOreRecipe(new ItemStack(Blocks.end_stone),
//                    new Object[] { Blocks.soul_sand, Blocks.soul_sand, Blocks.soul_sand, Blocks.soul_sand,
//                            Blocks.soul_sand, Blocks.soul_sand, Blocks.soul_sand, Blocks.soul_sand, Blocks.soul_sand,
//                            Blocks.soul_sand, Blocks.soul_sand, Blocks.soul_sand, Blocks.soul_sand, Blocks.soul_sand,
//                            Blocks.soul_sand, Blocks.soul_sand, Blocks.soul_sand, Blocks.soul_sand, Blocks.soul_sand });
//            System.out.println(AdditionalRecipe.CONSOLE + "End Stone" + AVA + ADDED);
//        }
    }

    public void oredic()
    {
        if (ARGetAnother("ExpBottle", false))
        {
            OreDictionary.registerOre("item_Fragment", Items.experience_bottle);
            if (ARGetAnother("ConsoleOut", true))
            {
                System.out.println(AdditionalRecipe.CONSOLE + "ExpBottle" + OREDIC + ADDED);
            }
        }
        else
        {
            if (ARGetAnother("ConsoleOut", true))
            {
                System.out.println(AdditionalRecipe.CONSOLE + "ExpBottle" + OREDIC + NOTADDED);
            }
        }

        OreDictionary.registerOre("dustNetherStar", ARItemHandler.ARGetItemRegister("dustnetherstar"));
        if (ARGetAnother("ConsoleOut", true))
        {
            System.out.println(AdditionalRecipe.CONSOLE + "DustNetherStar" + OREDIC + ADDED);
        }
        OreDictionary.registerOre("dustBedrock", ARItemHandler.ARGetItemRegister("dustbedrock"));
        if (ARGetAnother("ConsoleOut", true))
        {
            System.out.println(AdditionalRecipe.CONSOLE + "DustBedrock" + OREDIC + ADDED);
        }

        OreDictionary.registerOre("MortarTier01", ARItemHandler.ARGetItemRegister("bedrockmortar"));
        OreDictionary.registerOre("MortarTier02", ARItemHandler.ARGetItemRegister("bedrockmortar"));
        OreDictionary.registerOre("MortarTier03", ARItemHandler.ARGetItemRegister("bedrockmortar"));
        OreDictionary.registerOre("MortarOreTier03", ARItemHandler.ARGetItemRegister("bedrockmortar"));
        if (ARGetAnother("ConsoleOut", true))
        {
            System.out.println(AdditionalRecipe.CONSOLE + "BedrockMortar" + OREDIC + ADDED);
        }

        OreDictionary.registerOre("MortarTier01",
                new ItemStack(ARItemHandler.ARGetItemRegister("diamondmortar"), 1, 32767));
        OreDictionary.registerOre("MortarTier02",
                new ItemStack(ARItemHandler.ARGetItemRegister("diamondmortar"), 1, 32767));
        OreDictionary.registerOre("MortarOreTier02",
                new ItemStack(ARItemHandler.ARGetItemRegister("diamondmortar"), 1, 32767));
        if (ARGetAnother("ConsoleOut", true))
        {
            System.out.println(AdditionalRecipe.CONSOLE + "DiamondMortar" + OREDIC + ADDED);
        }

        OreDictionary.registerOre("MortarTier01",
                new ItemStack(ARItemHandler.ARGetItemRegister("ironmortar"), 1, 32767));
        OreDictionary.registerOre("MortarOreTier01",
                new ItemStack(ARItemHandler.ARGetItemRegister("ironmortar"), 1, 32767));
        if (ARGetAnother("ConsoleOut", true))
        {
            System.out.println(AdditionalRecipe.CONSOLE + "IronMortar" + OREDIC + ADDED);
        }

        OreDictionary.registerOre("ExchangeIgnition", ARItemHandler.ARGetItemRegister("exchangeiginiton"));
        if (ARGetAnother("ConsoleOut", true))
        {
            System.out.println(AdditionalRecipe.CONSOLE + "ExchangeIgnition" + OREDIC + ADDED);
        }
        OreDictionary.registerOre("ExchangeIgnition", ARItemHandler.ARGetItemRegister("ultimateexchangeiginiton"));
        if (ARGetAnother("ConsoleOut", true))
        {
            System.out.println(AdditionalRecipe.CONSOLE + "UltimateExchangeIgnition" + OREDIC + ADDED);
        }
        OreDictionary.registerOre("ExchangeIgnition",
                new ItemStack(ARItemHandler.ARGetItemRegister("cheaperexchangeiginiton"), 1, 32767));
        if (ARGetAnother("ConsoleOut", true))
        {
            System.out.println(AdditionalRecipe.CONSOLE + "CheaperExchangeIgnition" + OREDIC + ADDED);
        }
    }
}
