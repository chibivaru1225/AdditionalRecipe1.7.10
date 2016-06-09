package chibivaru.additionalrecipe.recipe;

import static chibivaru.additionalrecipe.common.ARConfiguration.*;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import chibivaru.additionalrecipe.AdditionalRecipe;
import cpw.mods.fml.common.registry.GameRegistry;

public class RecipeCrystal {
	ItemStack CertusQuartz,CertusDust,NetherDust;
	ItemStack BlackShard,BlackCrystal;
	ItemStack RedShard,RedCrystal;
	ItemStack GreenShard,GreenCrystal;
	ItemStack BrownShard,BrownCrystal;
	ItemStack BlueShard,BlueCrystal;
	ItemStack PurpleShard,PurpleCrystal;
	ItemStack CyanShard,CyanCrystal;
	ItemStack LightGrayShard,LightGrayCrystal;
	ItemStack GrayShard,GrayCrystal;
	ItemStack PinkShard,PinkCrystal;
	ItemStack LimeShard,LimeCrystal;
	ItemStack YellowShard,YellowCrystal;
	ItemStack LightBlueShard,LightBlueCrystal;
	ItemStack MagentaShard,MagentaCrystal;
	ItemStack OrangeShard,OrangeCrystal;
	ItemStack WhiteShard,WhiteCrystal;
	public void init()
	{
		if((OreDictionary.getOres("crystalCertusQuartz").size() != 0) && (OreDictionary.getOres("dustCertusQuartz").size() != 0) && (OreDictionary.getOres("dustNetherQuartz").size() != 0))
		{
			CertusQuartz = OreDictionary.getOres("crystalCertusQuartz").get(0);
			CertusDust   = OreDictionary.getOres("dustCertusQuartz").get(0);
			NetherDust   = OreDictionary.getOres("dustNetherQuartz").get(0);
			//GameRegistry.addSmelting(Blocks.end_stone, new ItemStack(CertusDust.getItem(),4,7), 0.0f);
			//GameRegistry.addShapelessRecipe(CertusQuartz,new Object[]{CertusDust,Blocks.sand});
			//GameRegistry.addShapelessRecipe(new ItemStack(Items.quartz,1,0),new Object[]{NetherDust,Blocks.sand});
			if(ARGetAnother("ConsoleOut",true))
			{
				System.out.println(AdditionalRecipe.CONSOLE + "CertusQuartz" + RecipeHandler.RECIPE + RecipeHandler.ADDED);
				System.out.println(AdditionalRecipe.CONSOLE + "NetherQuartz" + RecipeHandler.RECIPE + RecipeHandler.ADDED);
			}
			if(ARGetCrafting("Crystal",true))
			{
				if((OreDictionary.getOres("dyeBlackCrystalShard").size() != 0) && (OreDictionary.getOres("dyeBlackCrystal").size() != 0))
				{
					BlackShard = OreDictionary.getOres("dyeBlackCrystalShard").get(0);
					BlackCrystal = OreDictionary.getOres("dyeBlackCrystal").get(0);
					GameRegistry.addShapelessRecipe(BlackShard,new Object[]{CertusQuartz,new ItemStack(Items.dye,1,0)});
					GameRegistry.addShapelessRecipe(BlackCrystal,new Object[]{BlackShard,BlackShard,BlackShard,BlackShard});
					GameRegistry.addSmelting(BlackCrystal.getItem(),new ItemStack(BlackShard.getItem(),4,0), 0.0f);
				}
				if((OreDictionary.getOres("dyeRedCrystalShard").size() != 0) && (OreDictionary.getOres("dyeRedCrystal").size() != 0))
				{
					RedShard = OreDictionary.getOres("dyeRedCrystalShard").get(0);
					RedCrystal = OreDictionary.getOres("dyeRedCrystal").get(0);
					GameRegistry.addShapelessRecipe(RedShard,new Object[]{CertusQuartz,new ItemStack(Items.dye,1,1)});
					GameRegistry.addShapelessRecipe(RedCrystal,new Object[]{RedShard,RedShard,RedShard,RedShard});
					GameRegistry.addSmelting(RedCrystal.getItem(),new ItemStack(RedShard.getItem(),4,1), 0.0f);
				}
				if((OreDictionary.getOres("dyeGreenCrystalShard").size() != 0) && (OreDictionary.getOres("dyeGreenCrystal").size() != 0))
				{
					GreenShard = OreDictionary.getOres("dyeGreenCrystalShard").get(0);
					GreenCrystal = OreDictionary.getOres("dyeGreenCrystal").get(0);
					GameRegistry.addShapelessRecipe(GreenShard,new Object[]{CertusQuartz,new ItemStack(Items.dye,1,2)});
					GameRegistry.addShapelessRecipe(GreenCrystal,new Object[]{GreenShard,GreenShard,GreenShard,GreenShard});
					GameRegistry.addSmelting(GreenCrystal.getItem(),new ItemStack(GreenShard.getItem(),4,2), 0.0f);
				}
				if((OreDictionary.getOres("dyeBrownCrystalShard").size() != 0) && (OreDictionary.getOres("dyeBrownCrystal").size() != 0))
				{
					BrownShard = OreDictionary.getOres("dyeBrownCrystalShard").get(0);
					BrownCrystal = OreDictionary.getOres("dyeBrownCrystal").get(0);
					GameRegistry.addShapelessRecipe(BrownShard,new Object[]{CertusQuartz,new ItemStack(Items.dye,1,3)});
					GameRegistry.addShapelessRecipe(BrownCrystal,new Object[]{BrownShard,BrownShard,BrownShard,BrownShard});
					GameRegistry.addSmelting(BrownCrystal.getItem(),new ItemStack(BrownShard.getItem(),4,3), 0.0f);
				}
				if((OreDictionary.getOres("dyeBlueCrystalShard").size() != 0) && (OreDictionary.getOres("dyeBlueCrystal").size() != 0))
				{
					BlueShard = OreDictionary.getOres("dyeBlueCrystalShard").get(0);
					BlueCrystal = OreDictionary.getOres("dyeBlueCrystal").get(0);
					GameRegistry.addShapelessRecipe(BlueShard,new Object[]{CertusQuartz,new ItemStack(Items.dye,1,4)});
					GameRegistry.addShapelessRecipe(BlueCrystal,new Object[]{BlueShard,BlueShard,BlueShard,BlueShard});
					GameRegistry.addSmelting(BlueCrystal.getItem(),new ItemStack(BlueShard.getItem(),4,4), 0.0f);
				}
				if((OreDictionary.getOres("dyePurpleCrystalShard").size() != 0) && (OreDictionary.getOres("dyePurpleCrystal").size() != 0))
				{
					PurpleShard = OreDictionary.getOres("dyePurpleCrystalShard").get(0);
					PurpleCrystal = OreDictionary.getOres("dyePurpleCrystal").get(0);
					GameRegistry.addShapelessRecipe(PurpleShard,new Object[]{CertusQuartz,new ItemStack(Items.dye,1,5)});
					GameRegistry.addShapelessRecipe(PurpleCrystal,new Object[]{PurpleShard,PurpleShard,PurpleShard,PurpleShard});
					GameRegistry.addSmelting(PurpleCrystal.getItem(),new ItemStack(PurpleShard.getItem(),4,5), 0.0f);
				}
				if((OreDictionary.getOres("dyeCyanCrystalShard").size() != 0) && (OreDictionary.getOres("dyeCyanCrystal").size() != 0))
				{
					CyanShard = OreDictionary.getOres("dyeCyanCrystalShard").get(0);
					CyanCrystal = OreDictionary.getOres("dyeCyanCrystal").get(0);
					GameRegistry.addShapelessRecipe(CyanShard,new Object[]{CertusQuartz,new ItemStack(Items.dye,1,6)});
					GameRegistry.addShapelessRecipe(CyanCrystal,new Object[]{CyanShard,CyanShard,CyanShard,CyanShard});
					GameRegistry.addSmelting(CyanCrystal.getItem(),new ItemStack(CyanShard.getItem(),4,6), 0.0f);
				}
				if((OreDictionary.getOres("dyeLightGrayCrystalShard").size() != 0) && (OreDictionary.getOres("dyeLightGrayCrystal").size() != 0))
				{
					LightGrayShard = OreDictionary.getOres("dyeLightGrayCrystalShard").get(0);
					LightGrayCrystal = OreDictionary.getOres("dyeLightGrayCrystal").get(0);
					GameRegistry.addShapelessRecipe(LightGrayShard,new Object[]{CertusQuartz,new ItemStack(Items.dye,1,7)});
					GameRegistry.addShapelessRecipe(LightGrayCrystal,new Object[]{LightGrayShard,LightGrayShard,LightGrayShard,LightGrayShard});
					GameRegistry.addSmelting(LightGrayCrystal.getItem(),new ItemStack(LightGrayShard.getItem(),4,7), 0.0f);
				}
				if((OreDictionary.getOres("dyeGrayCrystalShard").size() != 0) && (OreDictionary.getOres("dyeGrayCrystal").size() != 0))
				{
					GrayShard = OreDictionary.getOres("dyeGrayCrystalShard").get(0);
					GrayCrystal = OreDictionary.getOres("dyeGrayCrystal").get(0);
					GameRegistry.addShapelessRecipe(GrayShard,new Object[]{CertusQuartz,new ItemStack(Items.dye,1,8)});
					GameRegistry.addShapelessRecipe(GrayCrystal,new Object[]{GrayShard,GrayShard,GrayShard,GrayShard});
					GameRegistry.addSmelting(GrayCrystal.getItem(),new ItemStack(GrayShard.getItem(),4,8), 0.0f);
				}
				if((OreDictionary.getOres("dyePinkCrystalShard").size() != 0) && (OreDictionary.getOres("dyePinkCrystal").size() != 0))
				{
					PinkShard = OreDictionary.getOres("dyePinkCrystalShard").get(0);
					PinkCrystal = OreDictionary.getOres("dyePinkCrystal").get(0);
					GameRegistry.addShapelessRecipe(PinkShard,new Object[]{CertusQuartz,new ItemStack(Items.dye,1,9)});
					GameRegistry.addShapelessRecipe(PinkCrystal,new Object[]{PinkShard,PinkShard,PinkShard,PinkShard});
					GameRegistry.addSmelting(PinkCrystal.getItem(),new ItemStack(PinkShard.getItem(),4,9), 0.0f);
				}
				if((OreDictionary.getOres("dyeLimeCrystalShard").size() != 0) && (OreDictionary.getOres("dyeLimeCrystal").size() != 0))
				{
					LimeShard = OreDictionary.getOres("dyeLimeCrystalShard").get(0);
					LimeCrystal = OreDictionary.getOres("dyeLimeCrystal").get(0);
					GameRegistry.addShapelessRecipe(LimeShard,new Object[]{CertusQuartz,new ItemStack(Items.dye,1,10)});
					GameRegistry.addShapelessRecipe(LimeCrystal,new Object[]{LimeShard,LimeShard,LimeShard,LimeShard});
					GameRegistry.addSmelting(LimeCrystal.getItem(),new ItemStack(LimeShard.getItem(),4,10), 0.0f);
				}
				if((OreDictionary.getOres("dyeYellowCrystalShard").size() != 0) && (OreDictionary.getOres("dyeYellowCrystal").size() != 0))
				{
					YellowShard = OreDictionary.getOres("dyeYellowCrystalShard").get(0);
					YellowCrystal = OreDictionary.getOres("dyeYellowCrystal").get(0);
					GameRegistry.addShapelessRecipe(YellowShard,new Object[]{CertusQuartz,new ItemStack(Items.dye,1,11)});
					GameRegistry.addShapelessRecipe(YellowCrystal,new Object[]{YellowShard,YellowShard,YellowShard,YellowShard});
					GameRegistry.addSmelting(YellowCrystal.getItem(),new ItemStack(YellowShard.getItem(),4,11), 0.0f);
				}
				if((OreDictionary.getOres("dyeLightBlueCrystalShard").size() != 0) && (OreDictionary.getOres("dyeLightBlueCrystal").size() != 0))
				{
					LightBlueShard = OreDictionary.getOres("dyeLightBlueCrystalShard").get(0);
					LightBlueCrystal = OreDictionary.getOres("dyeLightBlueCrystal").get(0);
					GameRegistry.addShapelessRecipe(LightBlueShard,new Object[]{CertusQuartz,new ItemStack(Items.dye,1,12)});
					GameRegistry.addShapelessRecipe(LightBlueCrystal,new Object[]{LightBlueShard,LightBlueShard,LightBlueShard,LightBlueShard});
					GameRegistry.addSmelting(LightBlueCrystal.getItem(),new ItemStack(LightBlueShard.getItem(),4,12), 0.0f);
				}
				if((OreDictionary.getOres("dyeMagentaCrystalShard").size() != 0) && (OreDictionary.getOres("dyeMagentaCrystal").size() != 0))
				{
					MagentaShard = OreDictionary.getOres("dyeMagentaCrystalShard").get(0);
					MagentaCrystal = OreDictionary.getOres("dyeMagentaCrystal").get(0);
					GameRegistry.addShapelessRecipe(MagentaShard,new Object[]{CertusQuartz,new ItemStack(Items.dye,1,13)});
					GameRegistry.addShapelessRecipe(MagentaCrystal,new Object[]{MagentaShard,MagentaShard,MagentaShard,MagentaShard});
					GameRegistry.addSmelting(MagentaCrystal.getItem(),new ItemStack(MagentaShard.getItem(),4,13), 0.0f);
				}
				if((OreDictionary.getOres("dyeOrangeCrystalShard").size() != 0) && (OreDictionary.getOres("dyeOrangeCrystal").size() != 0))
				{
					OrangeShard = OreDictionary.getOres("dyeOrangeCrystalShard").get(0);
					OrangeCrystal = OreDictionary.getOres("dyeOrangeCrystal").get(0);
					GameRegistry.addShapelessRecipe(OrangeShard,new Object[]{CertusQuartz,new ItemStack(Items.dye,1,14)});
					GameRegistry.addShapelessRecipe(OrangeCrystal,new Object[]{OrangeShard,OrangeShard,OrangeShard,OrangeShard});
					GameRegistry.addSmelting(OrangeCrystal.getItem(),new ItemStack(OrangeShard.getItem(),4,14), 0.0f);
				}
				if((OreDictionary.getOres("dyeWhiteCrystalShard").size() != 0) && (OreDictionary.getOres("dyeWhiteCrystal").size() != 0))
				{
					WhiteShard = OreDictionary.getOres("dyeWhiteCrystalShard").get(0);
					WhiteCrystal = OreDictionary.getOres("dyeWhiteCrystal").get(0);
					GameRegistry.addShapelessRecipe(WhiteShard,new Object[]{CertusQuartz,new ItemStack(Items.dye,1,15)});
					GameRegistry.addShapelessRecipe(WhiteCrystal,new Object[]{WhiteShard,WhiteShard,WhiteShard,WhiteShard});
					GameRegistry.addSmelting(WhiteCrystal.getItem(),new ItemStack(WhiteShard.getItem(),4,15), 0.0f);
				}
				if(ARGetAnother("ConsoleOut",true))
				{
					System.out.println(AdditionalRecipe.CONSOLE + "Crystals" + RecipeHandler.RECIPE + RecipeHandler.ADDED);
				}
			}
			else
			{
				if(ARGetAnother("ConsoleOut",true))
				{
					System.out.println(AdditionalRecipe.CONSOLE + "Crystals" + RecipeHandler.RECIPE + RecipeHandler.NOTADDED);
				}
			}
		}
	}
}
