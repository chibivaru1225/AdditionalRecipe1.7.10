package chibivaru.additionalrecipe.recipe;

import static chibivaru.additionalrecipe.common.ARConfiguration.*;
import static chibivaru.additionalrecipe.common.ARItemHandler.*;

import chibivaru.additionalrecipe.common.ARLogger;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class RecipeARItems {
	public void init()
	{
        GameRegistry.addRecipe(
                new ShapelessOreRecipe(
                    ARGetItemRegister("ingotnetherquartzite"),
                    new Object[]{Items.gold_ingot,
                                 Items.gold_ingot,
                                 Items.gold_ingot,
                                 Items.gold_ingot,
                                 Items.quartz,
                                 Items.quartz,
                                 Items.quartz,
                                 Items.quartz}));
		if(ARGetCrafting("AlchemicItem",true))
		{
			if(ARGetCrafting("ExchangeIgnition",true))
			{
				if(ARGetCrafting("Exelector",true))
				{
					GameRegistry.addRecipe(
							new ShapedOreRecipe(
								ARGetItemRegister("exchangeiginiton"),
								new Object[]{" X ","XYX"," X ",
									Character.valueOf('X'),Items.nether_star,
									Character.valueOf('Y'),ARGetItemRegister("forceball")}));
                    GameRegistry.addRecipe(
                            new ShapedOreRecipe(
                                ARGetItemRegister("exchangeiginiton"),
                                new Object[]{"XXX","XYX","XXX",
                                    Character.valueOf('X'),ARGetItemRegister("ingotnetherquartzite"),
                                    Character.valueOf('Y'),ARGetItemRegister("forceball")}));
				}
				GameRegistry.addRecipe(
					new ShapedOreRecipe(
						ARGetItemRegister("exchangeiginiton"),
						new Object[]{" X ","XYX"," X ",
							Character.valueOf('X'),Items.nether_star,
							Character.valueOf('Y'),Blocks.dragon_egg}));
				if(ARGetAnother("ConsoleOut",true))
				{
					ARLogger.logger.info("ExchangeIgnition" + RecipeHandler.RECIPE + RecipeHandler.ADDED);
					//System.out.println(AdditionalRecipe.CONSOLE + "ExchangeIgnition" + RecipeHandler.RECIPE + RecipeHandler.ADDED);
				}
			}
			else
			{
				if(ARGetAnother("ConsoleOut",true))
				{
					ARLogger.logger.info("ExchangeIgnition" + RecipeHandler.RECIPE + RecipeHandler.NOTADDED);
					//System.out.println(AdditionalRecipe.CONSOLE + "ExchangeIgnition" + RecipeHandler.RECIPE + RecipeHandler.NOTADDED);
				}
			}
			if(ARGetCrafting("DustExchangeIgnition",true))
			{
				GameRegistry.addSmelting(ARGetItemRegister("exchangeiginiton"),new ItemStack(ARGetItemRegister("dustexchangeignition"),1,0),0.0f);
				if(ARGetAnother("ConsoleOut",true))
				{
					ARLogger.logger.info("DustExchangeIgnition" + RecipeHandler.RECIPE + RecipeHandler.ADDED);
					//System.out.println(AdditionalRecipe.CONSOLE + "DustExchangeIgnition" + RecipeHandler.RECIPE + RecipeHandler.ADDED);
				}
			}
			else
			{
				if(ARGetAnother("ConsoleOut",true))
				{
					ARLogger.logger.info("DustExchangeIgnition" + RecipeHandler.RECIPE + RecipeHandler.NOTADDED);
					//System.out.println(AdditionalRecipe.CONSOLE + "DustExchangeIgnition" + RecipeHandler.RECIPE + RecipeHandler.NOTADDED);
				}
			}
			if(ARGetCrafting("UltimateExchangeIgnition",true))
			{
				GameRegistry.addRecipe(
					new ShapedOreRecipe(
						ARGetItemRegister("ultimateexchangeiginiton"),
						new Object[]{"XYX","YZY","XYX",
							Character.valueOf('X'),ARGetItemRegister("dustexchangeignition"),
							Character.valueOf('Y'),Blocks.dragon_egg,
							Character.valueOf('Z'),ARGetItemRegister("supergravitationfeather")}));
				if(ARGetAnother("ConsoleOut",true))
				{
					ARLogger.logger.info("UltimateExchangeIgnition" + RecipeHandler.RECIPE + RecipeHandler.ADDED);
					//System.out.println(AdditionalRecipe.CONSOLE + "UltimateExchangeIgnition" + RecipeHandler.RECIPE + RecipeHandler.ADDED);
				}
			}
			else
			{
				if(ARGetAnother("ConsoleOut",true))
				{
					ARLogger.logger.info("UltimateExchangeIgnition" + RecipeHandler.RECIPE + RecipeHandler.NOTADDED);
					//System.out.println(AdditionalRecipe.CONSOLE + "UltimateExchangeIgnition" + RecipeHandler.RECIPE + RecipeHandler.NOTADDED);
				}
			}
			if(ARGetCrafting("CheaperExchangeIgnition",true))
			{
				if(ARGetCrafting("Exelector",true))
				{
					GameRegistry.addRecipe(
						new ShapedOreRecipe(
							ARGetItemRegister("cheaperexchangeiginiton"),
							new Object[]{"XXX","XYX","XXX",
								Character.valueOf('X'),ARGetItemRegister("blackrottenflesh"),
								Character.valueOf('Y'),ARGetItemRegister("forceball")}));
				}
				else
				{
					GameRegistry.addRecipe(
						new ShapedOreRecipe(
							ARGetItemRegister("cheaperexchangeiginiton"),
							new Object[]{"XXX","XYX","XXX",
								Character.valueOf('X'),ARGetItemRegister("blackrottenflesh"),
								Character.valueOf('Y'),Blocks.diamond_block}));
				}
				if(ARGetAnother("ConsoleOut",true))
				{
					ARLogger.logger.info("CheaperExchangeIgnition" + RecipeHandler.RECIPE + RecipeHandler.ADDED);
					//System.out.println(AdditionalRecipe.CONSOLE + "CheaperExchangeIgnition" + RecipeHandler.RECIPE + RecipeHandler.ADDED);
				}
			}
			else
			{
				if(ARGetAnother("ConsoleOut",true))
				{
					ARLogger.logger.info("CheaperExchangeIgnition" + RecipeHandler.RECIPE + RecipeHandler.NOTADDED);
					//System.out.println(AdditionalRecipe.CONSOLE + "CheaperExchangeIgnition" + RecipeHandler.RECIPE + RecipeHandler.NOTADDED);
				}
			}
			if(ARGetCrafting("CirceForce",true))
			{
				GameRegistry.addRecipe(
					new ShapedOreRecipe(
						ARGetItemRegister("circeforce"),
						new Object[]{"XYX","YZY","XYX",
							Character.valueOf('X'),Blocks.diamond_block,
							Character.valueOf('Y'),Items.water_bucket,
							Character.valueOf('Z'),"ExchangeIgnition"}));
				if(ARGetAnother("ConsoleOut",true))
				{
					ARLogger.logger.info("CirceForce" + RecipeHandler.RECIPE + RecipeHandler.ADDED);
					//System.out.println(AdditionalRecipe.CONSOLE + "CirceForce" + RecipeHandler.RECIPE + RecipeHandler.ADDED);
				}
			}
			else
			{
				if(ARGetAnother("ConsoleOut",true))
				{
					ARLogger.logger.info("CirceForce" + RecipeHandler.RECIPE + RecipeHandler.NOTADDED);
					//System.out.println(AdditionalRecipe.CONSOLE + "CirceForce" + RecipeHandler.RECIPE + RecipeHandler.NOTADDED);
				}
			}
		}
		else
		{
			if(ARGetAnother("ConsoleOut",true))
			{
				ARLogger.logger.info("AlchemicItems" + RecipeHandler.RECIPE + RecipeHandler.NOTADDED);
				//System.out.println(AdditionalRecipe.CONSOLE + "AlchemicItems" + RecipeHandler.RECIPE + RecipeHandler.NOTADDED);
			}
		}
		if(ARGetCrafting("BlackRottenFlesh",true))
		{
			GameRegistry.addRecipe(
				new ShapedOreRecipe(
					ARGetItemRegister("blackrottenflesh"),
					new Object[]{"XXX","X X","XXX",
						Character.valueOf('X'),Items.rotten_flesh}));
			if(ARGetAnother("ConsoleOut",true))
			{
				ARLogger.logger.info("BlackRottenFlesh" + RecipeHandler.RECIPE + RecipeHandler.ADDED);
				//System.out.println(AdditionalRecipe.CONSOLE + "BlackRottenFlesh" + RecipeHandler.RECIPE + RecipeHandler.ADDED);
			}
		}
		else
		{
			if(ARGetAnother("ConsoleOut",true))
			{
				ARLogger.logger.info("BlackRottenFlesh" + RecipeHandler.RECIPE + RecipeHandler.NOTADDED);
				//System.out.println(AdditionalRecipe.CONSOLE + "BlackRottenFlesh" + RecipeHandler.RECIPE + RecipeHandler.NOTADDED);
			}
		}
		if(ARGetCrafting("Mortar",true))
		{
			if(ARGetCrafting("BedrockMortar",true))
			{
				GameRegistry.addRecipe(
					new ShapedOreRecipe(
						ARGetItemRegister("bedrockmortar"),
						new Object[]{"XYX"," X ",
							Character.valueOf('X'),Items.nether_star,
							Character.valueOf('Y'),Blocks.dragon_egg}));
				if(ARGetAnother("ConsoleOut",true))
				{
					ARLogger.logger.info("BedrockMortar" + RecipeHandler.RECIPE + RecipeHandler.ADDED);
					//System.out.println(AdditionalRecipe.CONSOLE + "BedrockMortar" + RecipeHandler.RECIPE + RecipeHandler.ADDED);
				}
			}
			else
			{
				if(ARGetAnother("ConsoleOut",true))
				{
					ARLogger.logger.info("BedrockMortar" + RecipeHandler.RECIPE + RecipeHandler.NOTADDED);
					//System.out.println(AdditionalRecipe.CONSOLE + "BedrockMortar" + RecipeHandler.RECIPE + RecipeHandler.NOTADDED);
				}
			}
			if(ARGetCrafting("DiamondMortar",true))
			{
				GameRegistry.addRecipe(
					new ShapedOreRecipe(
						ARGetItemRegister("diamondmortar"),
						new Object[]{"XYX"," X ",
							Character.valueOf('X'),Items.diamond,
							Character.valueOf('Y'),Items.iron_ingot}));
				GameRegistry.addRecipe(
					new ShapedOreRecipe(
						ARGetItemRegister("diamondmortar"),
						new Object[]{"XYX"," X ",
							Character.valueOf('X'),"ingotElectrum",
							Character.valueOf('Y'),Items.iron_ingot}));
				if(ARGetAnother("ConsoleOut",true))
				{
					ARLogger.logger.info("DiamondMortar" + RecipeHandler.RECIPE + RecipeHandler.ADDED);
					//System.out.println(AdditionalRecipe.CONSOLE + "DiamondMortar" + RecipeHandler.RECIPE + RecipeHandler.ADDED);
				}
			}
			else
			{
				if(ARGetAnother("ConsoleOut",true))
				{
					ARLogger.logger.info("DiamondMortar" + RecipeHandler.RECIPE + RecipeHandler.NOTADDED);
					//System.out.println(AdditionalRecipe.CONSOLE + "DiamondMortar" + RecipeHandler.RECIPE + RecipeHandler.NOTADDED);
				}
			}
			if(ARGetCrafting("IronMortar",true))
			{
				GameRegistry.addRecipe(
					new ShapedOreRecipe(
						ARGetItemRegister("ironmortar"),
						new Object[]{"XYX"," X ",
							Character.valueOf('X'),Items.iron_ingot,
							Character.valueOf('Y'),Items.flint}));
				GameRegistry.addRecipe(
					new ShapedOreRecipe(
						ARGetItemRegister("ironmortar"),
						new Object[]{"XYX"," X ",
							Character.valueOf('X'),"ingotCopper",
							Character.valueOf('Y'),Items.flint}));
				GameRegistry.addRecipe(
					new ShapedOreRecipe(
						ARGetItemRegister("ironmortar"),
						new Object[]{"XYX"," X ",
							Character.valueOf('X'),"ingotTin",
							Character.valueOf('Y'),Items.flint}));
				GameRegistry.addRecipe(
					new ShapedOreRecipe(
						ARGetItemRegister("ironmortar"),
						new Object[]{"XYX"," X ",
							Character.valueOf('X'),"ingotBronse",
							Character.valueOf('Y'),Items.flint}));
				if(ARGetAnother("ConsoleOut",true))
				{
					ARLogger.logger.info("IronMortar" + RecipeHandler.RECIPE + RecipeHandler.NOTADDED);
					//System.out.println(AdditionalRecipe.CONSOLE + "IronMortar" + RecipeHandler.RECIPE + RecipeHandler.ADDED);
				}
			}
			else
			{
				if(ARGetAnother("ConsoleOut",true))
				{
					ARLogger.logger.info("IronMortar" + RecipeHandler.RECIPE + RecipeHandler.NOTADDED);
					//System.out.println(AdditionalRecipe.CONSOLE + "IronMortar" + RecipeHandler.RECIPE + RecipeHandler.NOTADDED);
				}
			}
		}
		else
		{
			if(ARGetAnother("ConsoleOut",true))
			{
				ARLogger.logger.info("Mortars" + RecipeHandler.RECIPE + RecipeHandler.NOTADDED);
				//System.out.println(AdditionalRecipe.CONSOLE + "Mortars" + RecipeHandler.RECIPE + RecipeHandler.NOTADDED);
			}
		}
		if(ARGetCrafting("GravitationFeather",true))
		{
			GameRegistry.addRecipe(
				new ShapedOreRecipe(
					ARGetItemRegister("gravitationfeather"),
					new Object[]{" X ","XYX"," X ",
						Character.valueOf('X'),Items.feather,
						Character.valueOf('Y'),Items.diamond}));
			if(ARGetAnother("ConsoleOut",true))
			{
				ARLogger.logger.info("GravitationFeather" + RecipeHandler.RECIPE + RecipeHandler.ADDED);
				//System.out.println(AdditionalRecipe.CONSOLE + "GravitationFeather" + RecipeHandler.RECIPE + RecipeHandler.ADDED);
			}
		}
		else
		{
			if(ARGetAnother("ConsoleOut",true))
			{
				ARLogger.logger.info("GravitationFeather" + RecipeHandler.RECIPE + RecipeHandler.NOTADDED);
				//System.out.println(AdditionalRecipe.CONSOLE + "GravitationFeather" + RecipeHandler.RECIPE + RecipeHandler.NOTADDED);
			}
		}
		if(ARGetCrafting("NightVisionTorch",true))
		{
			GameRegistry.addRecipe(
				new ShapedOreRecipe(
					ARGetItemRegister("nightvisiontorch"),
					new Object[]{"XXX","XYX","XXX",
						Character.valueOf('X'),Blocks.glowstone,
						Character.valueOf('Y'),Items.blaze_rod}));
			if(ARGetAnother("ConsoleOut",true))
			{
				ARLogger.logger.info("NightVisionTorch" + RecipeHandler.RECIPE + RecipeHandler.ADDED);
				//System.out.println(AdditionalRecipe.CONSOLE + "NightVisionTorch" + RecipeHandler.RECIPE + RecipeHandler.ADDED);
			}
		}
		else
		{
			if(ARGetAnother("ConsoleOut",true))
			{
				ARLogger.logger.info("NightVisionTorch" + RecipeHandler.RECIPE + RecipeHandler.NOTADDED);
				//System.out.println(AdditionalRecipe.CONSOLE + "NightVisionTorch" + RecipeHandler.RECIPE + RecipeHandler.NOTADDED);
			}
		}
		if(ARGetCrafting("SuperGravitationFeather",true))
		{
			GameRegistry.addRecipe(
				new ShapedOreRecipe(
					ARGetItemRegister("supergravitationfeather"),
					new Object[]{"ZXZ","XYX","ZXZ",
						Character.valueOf('X'),Blocks.diamond_block,
						Character.valueOf('Y'),ARGetItemRegister("gravitationfeather"),
						Character.valueOf('Z'),ARGetItemRegister("nightvisiontorch")}));
			if(ARGetAnother("ConsoleOut",true))
			{
				ARLogger.logger.info("SuperGravitationFeather" + RecipeHandler.RECIPE + RecipeHandler.ADDED);
				//System.out.println(AdditionalRecipe.CONSOLE + "SuperGravitationFeather" + RecipeHandler.RECIPE + RecipeHandler.ADDED);
			}
		}
		else
		{
			if(ARGetAnother("ConsoleOut",true))
			{
				ARLogger.logger.info("SuperGravitationFeather" + RecipeHandler.RECIPE + RecipeHandler.NOTADDED);
				//System.out.println(AdditionalRecipe.CONSOLE + "SuperGravitationFeather" + RecipeHandler.RECIPE + RecipeHandler.NOTADDED);
			}
		}
		if(ARGetCrafting("BedrockArmor",true))
		{
			GameRegistry.addRecipe(
				new ShapedOreRecipe(
					ARGetItemRegister("bedrockhelmet"),
					new Object[]{"XXX","XYX","   ",
						Character.valueOf('X'),Blocks.bedrock,
						Character.valueOf('Y'),ARGetItemRegister("dustexchangeignition")}));
			GameRegistry.addRecipe(
				new ShapedOreRecipe(
					ARGetItemRegister("bedrockplate"),
					new Object[]{"XYX","XXX","XXX",
						Character.valueOf('X'),Blocks.bedrock,
						Character.valueOf('Y'),ARGetItemRegister("dustexchangeignition")}));
			GameRegistry.addRecipe(
				new ShapedOreRecipe(
					ARGetItemRegister("bedrocklegs"),
					new Object[]{"XXX","XYX","X X",
						Character.valueOf('X'),Blocks.bedrock,
						Character.valueOf('Y'),ARGetItemRegister("dustexchangeignition")}));
			GameRegistry.addRecipe(
				new ShapedOreRecipe(
					ARGetItemRegister("bedrockboots"),
					new Object[]{"   ","XYX","X X",
						Character.valueOf('X'),Blocks.bedrock,
						Character.valueOf('Y'),ARGetItemRegister("dustexchangeignition")}));
			GameRegistry.addRecipe(
				new ShapedOreRecipe(
					ARGetItemRegister("bedrockhelmet"),
					new Object[]{"XXX","X X","   ",
						Character.valueOf('X'),"ingotBedrockium"}));
			GameRegistry.addRecipe(
				new ShapedOreRecipe(
					ARGetItemRegister("bedrockplate"),
					new Object[]{"X X","XXX","XXX",
						Character.valueOf('X'),"ingotBedrockium"}));
			GameRegistry.addRecipe(
				new ShapedOreRecipe(
					ARGetItemRegister("bedrocklegs"),
					new Object[]{"XXX","X X","X X",
						Character.valueOf('X'),"ingotBedrockium"}));
			GameRegistry.addRecipe(
				new ShapedOreRecipe(
					ARGetItemRegister("bedrockboots"),
					new Object[]{"   ","X X","X X",
						Character.valueOf('X'),"ingotBedrockium"}));
			if(ARGetAnother("ConsoleOut",true))
			{
				ARLogger.logger.info("BedrockArmor" + RecipeHandler.RECIPE + RecipeHandler.ADDED);
				//System.out.println(AdditionalRecipe.CONSOLE + "BedrockArmor" + RecipeHandler.RECIPE + RecipeHandler.ADDED);
			}
		}
		else
		{
			if(ARGetAnother("ConsoleOut",true))
			{
				ARLogger.logger.info("BedrockArmor" + RecipeHandler.RECIPE + RecipeHandler.NOTADDED);
				//System.out.println(AdditionalRecipe.CONSOLE + "BedrockArmor" + RecipeHandler.RECIPE + RecipeHandler.NOTADDED);
			}
		}
		if(ARGetCrafting("AngelusArmor",true))
		{
			GameRegistry.addRecipe(
				new ShapedOreRecipe(
					ARGetItemRegister("angelushood"),
					new Object[]{"ZYZ","ZXZ","ZWZ",
						Character.valueOf('X'),ARGetItemRegister("bedrockhelmet"),
						Character.valueOf('Y'),ARGetItemRegister("dustexchangeignition"),
						Character.valueOf('Z'),ARGetItemRegister("ingotnetherquartzite"),
						Character.valueOf('W'),ARGetItemRegister("ultimateexchangeiginiton")}));
			GameRegistry.addRecipe(
				new ShapedOreRecipe(
					ARGetItemRegister("angelusvestment"),
					new Object[]{"ZYZ","ZXZ","ZWZ",
						Character.valueOf('X'),ARGetItemRegister("bedrockplate"),
						Character.valueOf('Y'),ARGetItemRegister("dustexchangeignition"),
						Character.valueOf('Z'),ARGetItemRegister("ingotnetherquartzite"),
						Character.valueOf('W'),ARGetItemRegister("ultimateexchangeiginiton")}));
			GameRegistry.addRecipe(
				new ShapedOreRecipe(
					ARGetItemRegister("angelusskirt"),
					new Object[]{"ZYZ","ZXZ","ZWZ",
						Character.valueOf('X'),ARGetItemRegister("bedrocklegs"),
						Character.valueOf('Y'),ARGetItemRegister("dustexchangeignition"),
						Character.valueOf('Z'),ARGetItemRegister("ingotnetherquartzite"),
						Character.valueOf('W'),ARGetItemRegister("ultimateexchangeiginiton")}));
			GameRegistry.addRecipe(
				new ShapedOreRecipe(
					ARGetItemRegister("angelusboots"),
					new Object[]{"ZYZ","ZXZ","ZWZ",
						Character.valueOf('X'),ARGetItemRegister("bedrockboots"),
						Character.valueOf('Y'),ARGetItemRegister("dustexchangeignition"),
						Character.valueOf('Z'),ARGetItemRegister("ingotnetherquartzite"),
						Character.valueOf('W'),ARGetItemRegister("ultimateexchangeiginiton")}));
			if(ARGetAnother("ConsoleOut",true))
			{
				ARLogger.logger.info("AngelusArmor" + RecipeHandler.RECIPE + RecipeHandler.ADDED);
				//System.out.println(AdditionalRecipe.CONSOLE + "AngelusArmor" + RecipeHandler.RECIPE + RecipeHandler.ADDED);
			}
		}
		else
		{
			if(ARGetAnother("ConsoleOut",true))
			{
				ARLogger.logger.info("AngelusArmor" + RecipeHandler.RECIPE + RecipeHandler.NOTADDED);
				//System.out.println(AdditionalRecipe.CONSOLE + "AngelusArmor" + RecipeHandler.RECIPE + RecipeHandler.NOTADDED);
			}
		}
		if(ARGetCrafting("Weapons",true))
		{
			if(ARGetCrafting("Exelector",true))
			{
				GameRegistry.addRecipe(
					new ShapedOreRecipe(
						new ItemStack(ARGetItemRegister("exelector"),1,4),
						new Object[]{" XX","ZVX","YZ ",
							Character.valueOf('X'),Items.quartz,
							Character.valueOf('Y'),Items.stick,
							Character.valueOf('Z'),Items.diamond,
							Character.valueOf('V'),Items.redstone}));
				GameRegistry.addRecipe(
						new ShapedOreRecipe(
							new ItemStack(ARGetItemRegister("exelector"),1,4),
							new Object[]{" XX","ZVX","YZ ",
								Character.valueOf('X'),"crystalCertusQuartz",
								Character.valueOf('Y'),Items.stick,
								Character.valueOf('Z'),Items.diamond,
								Character.valueOf('V'),Items.redstone}));
				GameRegistry.addRecipe(
					new ShapelessOreRecipe(
						ARGetItemRegister("forceball"),
						new Object[]{new ItemStack(ARGetItemRegister("exelector"),1,0)}));
				if(ARGetAnother("ConsoleOut",true))
				{
					ARLogger.logger.info("Exelector" + RecipeHandler.RECIPE + RecipeHandler.ADDED);
					ARLogger.logger.info("ForceBall" + RecipeHandler.RECIPE + RecipeHandler.ADDED);
					//System.out.println(AdditionalRecipe.CONSOLE + "Exelector" + RecipeHandler.RECIPE + RecipeHandler.ADDED);
					//System.out.println(AdditionalRecipe.CONSOLE + "ForceBall" + RecipeHandler.RECIPE + RecipeHandler.ADDED);
				}
			}
			else
			{
				if(ARGetAnother("ConsoleOut",true))
				{
					ARLogger.logger.info("Exelector" + RecipeHandler.RECIPE + RecipeHandler.NOTADDED);
					ARLogger.logger.info("ForceBall" + RecipeHandler.RECIPE + RecipeHandler.NOTADDED);
					//System.out.println(AdditionalRecipe.CONSOLE + "Exelector" + RecipeHandler.RECIPE + RecipeHandler.NOTADDED);
					//System.out.println(AdditionalRecipe.CONSOLE + "ForceBall" + RecipeHandler.RECIPE + RecipeHandler.NOTADDED);
				}
			}
			/*
			if(ARGetCrafting("NIOH",true))
			{
				GameRegistry.addRecipe(
					new ShapedOreRecipe(
						ARGetItemRegister("nioh"),
						new Object[]{"X X","YZY","VZV",
							Character.valueOf('X'),Items.iron_sword,
							Character.valueOf('Y'),Items.gunpowder,
							Character.valueOf('Z'),Blocks.iron_block,
							Character.valueOf('V'),Blocks.bedrock}));;
				if(ARGetAnother("ConsoleOut",true))
				{
					ARLogger.logger.info("NIOH" + RecipeHandler.RECIPE + RecipeHandler.NOTADDED);
					//System.out.println(AdditionalRecipe.CONSOLE + "NIOH" + RecipeHandler.RECIPE + RecipeHandler.ADDED);
				}
			}
			else
			{
				if(ARGetAnother("ConsoleOut",true))
				{
					ARLogger.logger.info("NIOH" + RecipeHandler.RECIPE + RecipeHandler.NOTADDED);
					//System.out.println(AdditionalRecipe.CONSOLE + "NIOH" + RecipeHandler.RECIPE + RecipeHandler.NOTADDED);
				}
			}
			if(ARGetCrafting("Evil Spear DAYO",true))
			{
				GameRegistry.addRecipe(
					new ShapedOreRecipe(
						ARGetItemRegister("dayo"),
						new Object[]{"XX ","XYZ"," ZV",
							Character.valueOf('X'),Items.iron_sword,
							Character.valueOf('Y'),"ExchangeIgnition",
							Character.valueOf('Z'),Blocks.gold_block,
							Character.valueOf('V'),Blocks.bedrock}));
				if(ARGetAnother("ConsoleOut",true))
				{
					//System.out.println(AdditionalRecipe.CONSOLE + "Evil Spear 'DAYO'" + RecipeHandler.RECIPE + RecipeHandler.ADDED);
				}
			}
			else
			{
				if(ARGetAnother("ConsoleOut",true))
				{
					//System.out.println(AdditionalRecipe.CONSOLE + "Evil Spear 'DAYO'" + RecipeHandler.RECIPE + RecipeHandler.NOTADDED);
				}
			}
			if(ARGetCrafting("Villany Sword YORU",true))
			{
				GameRegistry.addRecipe(
					new ShapedOreRecipe(
						ARGetItemRegister("yoru"),
						new Object[]{" X ","YXY","ZVZ",
							Character.valueOf('X'),Blocks.iron_block,
							Character.valueOf('Y'),Blocks.bedrock,
							Character.valueOf('Z'),Blocks.diamond_block,
							Character.valueOf('V'),"ExchangeIgnition"}));
				if(ARGetAnother("ConsoleOut",true))
				{
					//System.out.println(AdditionalRecipe.CONSOLE + "Villany Sword 'YORU'" + RecipeHandler.RECIPE + RecipeHandler.ADDED);
				}
			}
			else
			{
				if(ARGetAnother("ConsoleOut",true))
				{
					//System.out.println(AdditionalRecipe.CONSOLE + "Villany Sword 'YORU'" + RecipeHandler.RECIPE + RecipeHandler.NOTADDED);
				}
			}
			*/
		}
		if(ARGetCrafting("K2 Items",true))
		{
			if(ARGetCrafting("Multi-Tool K2",true))
			{
				GameRegistry.addRecipe(
					new ShapedOreRecipe(
						ARGetItemRegister("toolk2"),
						new Object[]{"XYX","ZVZ","YWY",
							Character.valueOf('X'),Blocks.gold_block,
							Character.valueOf('Y'),Blocks.redstone_block,
							Character.valueOf('Z'),Blocks.iron_block,
							Character.valueOf('V'),"ExchangeIgnition",
							Character.valueOf('W'),Blocks.obsidian}));
				if(ARGetAnother("ConsoleOut",true))
				{
					ARLogger.logger.info("K2's Multi-Weapon" + RecipeHandler.RECIPE + RecipeHandler.ADDED);
					//System.out.println(AdditionalRecipe.CONSOLE + "K2's Multi-Weapon" + RecipeHandler.RECIPE + RecipeHandler.ADDED);
				}
			}
			else
			{
				if(ARGetAnother("ConsoleOut",true))
				{
					ARLogger.logger.info("K2's Multi-Weapon" + RecipeHandler.RECIPE + RecipeHandler.NOTADDED);
					//System.out.println(AdditionalRecipe.CONSOLE + "K2's Multi-Weapon" + RecipeHandler.RECIPE + RecipeHandler.NOTADDED);
				}
			}
			if(ARGetCrafting("K2Armor",true))
			{
				GameRegistry.addRecipe(
					new ShapelessOreRecipe(
						ARGetItemRegister("k2helmet"),
						new Object[]{ARGetItemRegister("angelushood")}));
				GameRegistry.addRecipe(
					new ShapelessOreRecipe(
						ARGetItemRegister("k2plate"),
						new Object[]{ARGetItemRegister("angelusvestment")}));
				GameRegistry.addRecipe(
					new ShapelessOreRecipe(
						ARGetItemRegister("k2legs"),
						new Object[]{ARGetItemRegister("angelusskirt")}));
				GameRegistry.addRecipe(
					new ShapelessOreRecipe(
						ARGetItemRegister("k2boots"),
						new Object[]{ARGetItemRegister("angelusboots")}));
				if(ARGetAnother("ConsoleOut",true))
				{
					ARLogger.logger.info("K2Armor" + RecipeHandler.RECIPE + RecipeHandler.ADDED);
					//System.out.println(AdditionalRecipe.CONSOLE + "K2's Multi-Weapon" + RecipeHandler.RECIPE + RecipeHandler.ADDED);
				}
			}
			else
			{
				if(ARGetAnother("ConsoleOut",true))
				{
					ARLogger.logger.info("K2Armor" + RecipeHandler.RECIPE + RecipeHandler.NOTADDED);
					//System.out.println(AdditionalRecipe.CONSOLE + "K2's Multi-Weapon" + RecipeHandler.RECIPE + RecipeHandler.NOTADDED);
				}
			}
	        if((Loader.isModLoaded("ShionOnlyWins") || Loader.isModLoaded("shiononlywins")) && ARGetCrafting("ShionArmor", true))
	        {
                GameRegistry.addRecipe(
                        new ShapelessOreRecipe(
                            ARGetItemRegister("shionhood"),
                            new Object[]{
                                    ARGetItemRegister("angelushood"),
                                    "shionsClairvoyance"}));
                    GameRegistry.addRecipe(
                        new ShapelessOreRecipe(
                            ARGetItemRegister("shionvestment"),
                            new Object[]{
                                    ARGetItemRegister("angelusvestment"),
                                    "shionsClairvoyance"}));
                    GameRegistry.addRecipe(
                        new ShapelessOreRecipe(
                            ARGetItemRegister("shionskirt"),
                            new Object[]{
                                    ARGetItemRegister("angelusskirt"),
                                    "shionsClairvoyance"}));
                    GameRegistry.addRecipe(
                        new ShapelessOreRecipe(
                            ARGetItemRegister("shionboots"),
                            new Object[]{
                                    ARGetItemRegister("angelusboots"),
                                    "shionsClairvoyance"}));
                    
                    if(ARGetAnother("ConsoleOut",true))
                    {
                        ARLogger.logger.info("ShionArmor" + RecipeHandler.RECIPE + RecipeHandler.ADDED);
                        //System.out.println(AdditionalRecipe.CONSOLE + "K2's Multi-Weapon" + RecipeHandler.RECIPE + RecipeHandler.ADDED);
                    }
	        }
            else
            {
                if(ARGetAnother("ConsoleOut",true))
                {
                    ARLogger.logger.info("ShionArmor" + RecipeHandler.RECIPE + RecipeHandler.NOTADDED);
                    //System.out.println(AdditionalRecipe.CONSOLE + "K2's Multi-Weapon" + RecipeHandler.RECIPE + RecipeHandler.NOTADDED);
                }
            }
			if(ARGetCrafting("Charm Of Guardian",true))
			{
				GameRegistry.addRecipe(
					new ShapelessOreRecipe(
						ARGetItemRegister("charmofguardian"),
						new Object[]{ARGetItemRegister("k2helmet"),ARGetItemRegister("k2plate"),ARGetItemRegister("k2legs"),ARGetItemRegister("k2boots")}));
				if(ARGetAnother("ConsoleOut",true))
				{
					ARLogger.logger.info("Charm Of Guardian" + RecipeHandler.RECIPE + RecipeHandler.ADDED);
					//System.out.println(AdditionalRecipe.CONSOLE + "K2's Multi-Weapon" + RecipeHandler.RECIPE + RecipeHandler.ADDED);
				}
				else
				{
					if(ARGetAnother("ConsoleOut",true))
					{
						ARLogger.logger.info("Charm Of Guardian" + RecipeHandler.RECIPE + RecipeHandler.NOTADDED);
						//System.out.println(AdditionalRecipe.CONSOLE + "K2's Multi-Weapon" + RecipeHandler.RECIPE + RecipeHandler.NOTADDED);
					}
				}
			}
                GameRegistry.addRecipe(
                    new ShapelessOreRecipe(
                        ARGetItemRegister("lavastreamremover"),
                        new Object[]{Items.emerald,Items.ender_pearl}));
                GameRegistry.addRecipe(
                        new ShapelessOreRecipe(
                            ARGetItemRegister("lavaobsidianexchanger"),
                            new Object[]{ARGetItemRegister("lavastreamremover"), Items.nether_star}));
		}
	}
}
