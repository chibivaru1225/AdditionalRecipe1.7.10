package chibivaru.additionalrecipe.recipe;

import static chibivaru.additionalrecipe.common.ARConfiguration.*;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import chibivaru.additionalrecipe.AdditionalRecipe;
import chibivaru.additionalrecipe.common.ARItemHandler;
import cpw.mods.fml.common.registry.GameRegistry;

public class RecipeHandler {
	RecipeARItems         recipeadditionalitems;
	RecipeAnotherMod      recipeanothermod;
	RecipeCrystal         recipecrystal;
	RecipeDusts           recipedusts;
	RecipeItems           recipeitems;
	RecipeMortar          recipemortar;
	RecipeOreDic          recipeoredic;
	RecipeOres            recipeores;
	RecipeSmelting        recipesmelting;
	public final static String RECIPE   = " crafting recipe";
	public final static String OREDIC   = " oredictionary";
	public final static String ADDED    = " was added.";
	public final static String NOTADDED = " was not added.";
	public void init()
	{
		recipeadditionalitems = new RecipeARItems();
		recipeanothermod      = new RecipeAnotherMod();
		recipecrystal         = new RecipeCrystal();
		recipedusts           = new RecipeDusts();
		recipeitems           = new RecipeItems();
		recipemortar          = new RecipeMortar();
		recipeoredic          = new RecipeOreDic();
		recipeores            = new RecipeOres();
		recipesmelting        = new RecipeSmelting();

		recipeadditionalitems.init();
		recipeanothermod.init();
		recipecrystal.init();
		recipedusts.init();
		recipeitems.init();
		recipemortar.init();
		recipeoredic.init();
		recipeores.init();
		recipesmelting.init();

		ItemStack PinkSlime = new ItemStack(GameRegistry.findItem("MineFactoryReloaded","pinkslime"));
		if(PinkSlime != null)
		{
			GameRegistry.addRecipe(
				new ShapedOreRecipe(
					PinkSlime,
					new Object[]{"XXX","XYX","XXX",
						Character.valueOf('X'),Items.rotten_flesh,
						Character.valueOf('Y'),Items.slime_ball}));
		}
		ItemStack PureCertus = new ItemStack(GameRegistry.findItem("appliedenergistics2","item.ItemMultiMaterial"),1,10);
		ItemStack SeedCertus = new ItemStack(GameRegistry.findItem("appliedenergistics2","item.ItemCrystalSeed"),1,0);
		if((PureCertus != null)&&(SeedCertus != null))
		{
			GameRegistry.addRecipe(
				new ShapelessOreRecipe(
					PureCertus,
					new Object[]{SeedCertus,Blocks.sand}));
		}
		ItemStack PureNether = new ItemStack(GameRegistry.findItem("appliedenergistics2","item.ItemMultiMaterial"),1,11);
		ItemStack SeedNether = new ItemStack(GameRegistry.findItem("appliedenergistics2","item.ItemCrystalSeed"),1,600);
		if((PureNether != null)&&(SeedNether != null))
		{
			GameRegistry.addRecipe(
				new ShapelessOreRecipe(
					PureNether,
					new Object[]{SeedNether,Blocks.sand}));
		}
		ItemStack PureFluix = new ItemStack(GameRegistry.findItem("appliedenergistics2","item.ItemMultiMaterial"),1,12);
		ItemStack SeedFluix = new ItemStack(GameRegistry.findItem("appliedenergistics2","item.ItemCrystalSeed"),1,1200);
		if((PureFluix != null)&&(SeedFluix != null))
		{
			GameRegistry.addRecipe(
				new ShapelessOreRecipe(
					PureFluix,
					new Object[]{SeedFluix,Blocks.sand}));
		}
		ItemStack Certus = new ItemStack(GameRegistry.findItem("appliedenergistics2","item.ItemMultiMaterial"),1,0);
		ItemStack Fluix = new ItemStack(GameRegistry.findItem("appliedenergistics2","item.ItemMultiMaterial"),2,7);
		if((Certus != null)&&(Fluix != null))
		{
			GameRegistry.addRecipe(
				new ShapelessOreRecipe(
					Fluix,
					new Object[]{Certus,Items.quartz,Items.redstone}));
		}
	}
	public void oredic()
	{
		if(ARGetAnother("ExpBottle",false))
		{
			OreDictionary.registerOre("item_Fragment",Items.experience_bottle);
			if(ARGetAnother("ConsoleOut",true))
			{
				System.out.println(AdditionalRecipe.CONSOLE + "ExpBottle" + OREDIC + ADDED);
			}
		}
		else
		{
			if(ARGetAnother("ConsoleOut",true))
			{
				System.out.println(AdditionalRecipe.CONSOLE + "ExpBottle" + OREDIC + NOTADDED);
			}
		}

		OreDictionary.registerOre("dustNetherStar",ARItemHandler.ARGetItemRegister("dustnetherstar"));
		if(ARGetAnother("ConsoleOut",true))
		{
			System.out.println(AdditionalRecipe.CONSOLE + "DustNetherStar" + OREDIC + ADDED);
		}
		OreDictionary.registerOre("dustBedrock",ARItemHandler.ARGetItemRegister("dustbedrock"));
		if(ARGetAnother("ConsoleOut",true))
		{
			System.out.println(AdditionalRecipe.CONSOLE + "DustBedrock" + OREDIC + ADDED);
		}

		OreDictionary.registerOre("MortarTier01",ARItemHandler.ARGetItemRegister("bedrockmortar"));
		OreDictionary.registerOre("MortarTier02",ARItemHandler.ARGetItemRegister("bedrockmortar"));
		OreDictionary.registerOre("MortarTier03",ARItemHandler.ARGetItemRegister("bedrockmortar"));
		OreDictionary.registerOre("MortarOreTier03",ARItemHandler.ARGetItemRegister("bedrockmortar"));
		if(ARGetAnother("ConsoleOut",true))
		{
			System.out.println(AdditionalRecipe.CONSOLE + "BedrockMortar" + OREDIC + ADDED);
		}

		OreDictionary.registerOre("MortarTier01",new ItemStack(ARItemHandler.ARGetItemRegister("diamondmortar"),1,32767));
		OreDictionary.registerOre("MortarTier02",new ItemStack(ARItemHandler.ARGetItemRegister("diamondmortar"),1,32767));
		OreDictionary.registerOre("MortarOreTier02",new ItemStack(ARItemHandler.ARGetItemRegister("diamondmortar"),1,32767));
		if(ARGetAnother("ConsoleOut",true))
		{
			System.out.println(AdditionalRecipe.CONSOLE + "DiamondMortar" + OREDIC + ADDED);
		}

		OreDictionary.registerOre("MortarTier01",new ItemStack(ARItemHandler.ARGetItemRegister("ironmortar"),1,32767));
		OreDictionary.registerOre("MortarOreTier01",new ItemStack(ARItemHandler.ARGetItemRegister("ironmortar"),1,32767));
		if(ARGetAnother("ConsoleOut",true))
		{
			System.out.println(AdditionalRecipe.CONSOLE + "IronMortar" + OREDIC + ADDED);
		}

		OreDictionary.registerOre("ExchangeIgnition",ARItemHandler.ARGetItemRegister("exchangeiginiton"));
		if(ARGetAnother("ConsoleOut",true))
		{
			System.out.println(AdditionalRecipe.CONSOLE + "ExchangeIgnition" + OREDIC + ADDED);
		}
		OreDictionary.registerOre("ExchangeIgnition",ARItemHandler.ARGetItemRegister("ultimateexchangeiginiton"));
		if(ARGetAnother("ConsoleOut",true))
		{
			System.out.println(AdditionalRecipe.CONSOLE + "UltimateExchangeIgnition" + OREDIC + ADDED);
		}
		OreDictionary.registerOre("ExchangeIgnition",new ItemStack(ARItemHandler.ARGetItemRegister("cheaperexchangeiginiton"),1,32767));
		if(ARGetAnother("ConsoleOut",true))
		{
			System.out.println(AdditionalRecipe.CONSOLE + "CheaperExchangeIgnition" + OREDIC + ADDED);
		}
	}
}
