package chibivaru.additionalrecipe.recipe;

import static chibivaru.additionalrecipe.common.ARConfiguration.*;
import static chibivaru.additionalrecipe.common.ARItemHandler.*;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import cpw.mods.fml.common.registry.GameRegistry;

public class RecipeSmelting {
	public void init()
	{
		if(ARGetSmelting("NetherBrick",true))
		{
			GameRegistry.addSmelting(Blocks.stonebrick,new ItemStack(Blocks.nether_brick,1),0.0f);
		}
		if(ARGetSmelting("Netherrack",true))
		{
			GameRegistry.addSmelting(Blocks.dirt,new ItemStack(Blocks.netherrack,1),0.0f);
		}
		if(ARGetSmelting("Leather",true))
		{
			GameRegistry.addSmelting(Items.rotten_flesh,new ItemStack(Items.leather,1),0.0f);
		}
		if(ARGetSmelting("GlowStoneDust",true))
		{
			GameRegistry.addSmelting(Items.redstone,new ItemStack(Items.glowstone_dust,1),0.0f);
		}
		if(ARGetSmelting("MinecartEmpty",true))
		{
			GameRegistry.addSmelting(Items.minecart,new ItemStack(Items.iron_ingot,5),0.0f);
		}
		if(ARGetSmelting("IronDoor",true))
		{
			GameRegistry.addSmelting(Items.iron_door,new ItemStack(Items.iron_ingot,6),0.0f);
		}
		if(ARGetSmelting("WoodDoor",true))
		{
			GameRegistry.addSmelting(Items.wooden_door,new ItemStack(Items.coal,2,1),0.0f);
		}
		if(ARGetSmelting("RecycleTool",true))
		{
			if(ARGetSmelting("WoodTool",true))
			{
				GameRegistry.addSmelting(Items.wooden_axe,new ItemStack(Items.coal,1,1),0.0f);
				GameRegistry.addSmelting(Items.wooden_hoe,new ItemStack(Items.coal,1,1),0.0f);
				GameRegistry.addSmelting(Items.wooden_pickaxe,new ItemStack(Items.coal,1,1),0.0f);
				GameRegistry.addSmelting(Items.wooden_sword,new ItemStack(Items.coal,1,1),0.0f);
				GameRegistry.addSmelting(Items.wooden_shovel,new ItemStack(Items.coal,1,1),0.0f);
			}
			if(ARGetSmelting("StoneTool",true))
			{
				GameRegistry.addSmelting(Items.stone_axe,new ItemStack(Blocks.stone,3,0),0.0f);
				GameRegistry.addSmelting(Items.stone_hoe,new ItemStack(Blocks.stone,2,0),0.0f);
				GameRegistry.addSmelting(Items.stone_pickaxe,new ItemStack(Blocks.stone,3,0),0.0f);
				GameRegistry.addSmelting(Items.stone_sword,new ItemStack(Blocks.stone,2,0),0.0f);
				GameRegistry.addSmelting(Items.stone_shovel,new ItemStack(Blocks.stone,1,0),0.0f);
			}
			if(ARGetSmelting("IronTool",true))
			{
				GameRegistry.addSmelting(Items.iron_axe,new ItemStack(Items.iron_ingot,3,0),0.0f);
				GameRegistry.addSmelting(Items.iron_hoe,new ItemStack(Items.iron_ingot,2,0),0.0f);
				GameRegistry.addSmelting(Items.iron_pickaxe,new ItemStack(Items.iron_ingot,3,0),0.0f);
				GameRegistry.addSmelting(Items.iron_sword,new ItemStack(Items.iron_ingot,2,0),0.0f);
				GameRegistry.addSmelting(Items.iron_shovel,new ItemStack(Items.iron_ingot,1,0),0.0f);
			}
			if(ARGetSmelting("GoldTool",true))
			{
				GameRegistry.addSmelting(Items.golden_axe,new ItemStack(Items.gold_ingot,3,0),0.0f);
				GameRegistry.addSmelting(Items.golden_hoe,new ItemStack(Items.gold_ingot,2,0),0.0f);
				GameRegistry.addSmelting(Items.golden_pickaxe,new ItemStack(Items.gold_ingot,3,0),0.0f);
				GameRegistry.addSmelting(Items.golden_sword,new ItemStack(Items.gold_ingot,2,0),0.0f);
				GameRegistry.addSmelting(Items.golden_shovel,new ItemStack(Items.gold_ingot,1,0),0.0f);
			}
			if(ARGetSmelting("DiamondTool",true))
			{
				GameRegistry.addSmelting(Items.diamond_axe,new ItemStack(Items.diamond,3,0),0.0f);
				GameRegistry.addSmelting(Items.diamond_hoe,new ItemStack(Items.diamond,2,0),0.0f);
				GameRegistry.addSmelting(Items.diamond_pickaxe,new ItemStack(Items.diamond,3,0),0.0f);
				GameRegistry.addSmelting(Items.diamond_sword,new ItemStack(Items.diamond,2,0),0.0f);
				GameRegistry.addSmelting(Items.diamond_shovel,new ItemStack(Items.diamond,1,0),0.0f);
			}
			if(ARGetSmelting("Bow",true))
			{
				GameRegistry.addSmelting(Items.bow,new ItemStack(Items.string,3,0),0.0f);
			}
		}
		if(ARGetSmelting("RecycleArmor",true))
		{
			if(ARGetSmelting("ChainArmor",true))
			{
				GameRegistry.addSmelting(Items.chainmail_helmet,new ItemStack(Items.iron_ingot,5,0),0.0f);
				GameRegistry.addSmelting(Items.chainmail_chestplate,new ItemStack(Items.iron_ingot,8,0),0.0f);
				GameRegistry.addSmelting(Items.chainmail_leggings,new ItemStack(Items.iron_ingot,7,0),0.0f);
				GameRegistry.addSmelting(Items.chainmail_boots,new ItemStack(Items.iron_ingot,4,0),0.0f);
			}
			if(ARGetSmelting("IronArmor",true))
			{
				GameRegistry.addSmelting(Items.iron_helmet,new ItemStack(Items.iron_ingot,5,0),0.0f);
				GameRegistry.addSmelting(Items.iron_chestplate,new ItemStack(Items.iron_ingot,8,0),0.0f);
				GameRegistry.addSmelting(Items.iron_leggings,new ItemStack(Items.iron_ingot,7,0),0.0f);
				GameRegistry.addSmelting(Items.iron_boots,new ItemStack(Items.iron_ingot,4,0),0.0f);
			}
			if(ARGetSmelting("IronArmor",true))
			{
				GameRegistry.addSmelting(Items.golden_helmet,new ItemStack(Items.gold_ingot,5,0),0.0f);
				GameRegistry.addSmelting(Items.golden_chestplate,new ItemStack(Items.gold_ingot,8,0),0.0f);
				GameRegistry.addSmelting(Items.golden_leggings,new ItemStack(Items.gold_ingot,7,0),0.0f);
				GameRegistry.addSmelting(Items.golden_boots,new ItemStack(Items.gold_ingot,4,0),0.0f);
			}
			if(ARGetSmelting("DiamondArmor",true))
			{
				GameRegistry.addSmelting(Items.diamond_helmet,new ItemStack(Items.diamond,5,0),0.0f);
				GameRegistry.addSmelting(Items.diamond_chestplate,new ItemStack(Items.diamond,8,0),0.0f);
				GameRegistry.addSmelting(Items.diamond_leggings,new ItemStack(Items.diamond,7,0),0.0f);
				GameRegistry.addSmelting(Items.diamond_boots,new ItemStack(Items.diamond,4,0),0.0f);
			}
			if(ARGetSmelting("LeatherArmor",true))
			{
				GameRegistry.addSmelting(Items.leather_helmet,new ItemStack(Items.leather,5,0),0.0f);
				GameRegistry.addSmelting(Items.leather_chestplate,new ItemStack(Items.leather,8,0),0.0f);
				GameRegistry.addSmelting(Items.leather_leggings,new ItemStack(Items.leather,7,0),0.0f);
				GameRegistry.addSmelting(Items.leather_boots,new ItemStack(Items.leather,4,0),0.0f);
			}
		}
		if((ARGetCrafting("DustIngot",true))&&(ARGetCrafting("CraftingFurnace",true)))
		{
			if(OreDictionary.getOres("dustIron").size() > 0)
			{
				GameRegistry.addRecipe(
					new ShapelessOreRecipe(
						Items.iron_ingot,
						new Object[]{"dustIron",ARGetItemRegister("craftingfurnace")}));
			}
			if(OreDictionary.getOres("dustGold").size() > 0)
			{
				GameRegistry.addRecipe(
					new ShapelessOreRecipe(
						Items.gold_ingot,
						new Object[]{"dustGold",ARGetItemRegister("craftingfurnace")}));
			}
			if((OreDictionary.getOres("dustCopper").size() > 0) && (OreDictionary.getOres("ingotCopper").size() > 0))
			{
				GameRegistry.addRecipe(
					new ShapelessOreRecipe(
						new ItemStack(OreDictionary.getOres("ingotCopper").get(0).getItem(),1,OreDictionary.getOres("ingotCopper").get(0).getItemDamage()),
						new Object[]{"dustCopper",ARGetItemRegister("craftingfurnace")}));
			}
			if((OreDictionary.getOres("dustTin").size() > 0) && (OreDictionary.getOres("ingotTin").size() > 0))
			{
				GameRegistry.addRecipe(
					new ShapelessOreRecipe(
						new ItemStack(OreDictionary.getOres("ingotTin").get(0).getItem(),1,OreDictionary.getOres("ingotTin").get(0).getItemDamage()),
						new Object[]{"dustTin",ARGetItemRegister("craftingfurnace")}));
			}
			if((OreDictionary.getOres("dustSilver").size() > 0) && (OreDictionary.getOres("ingotSilver").size() > 0))
			{
				GameRegistry.addRecipe(
					new ShapelessOreRecipe(
						new ItemStack(OreDictionary.getOres("ingotSilver").get(0).getItem(),1,OreDictionary.getOres("ingotSilver").get(0).getItemDamage()),
						new Object[]{"dustSilver",ARGetItemRegister("craftingfurnace")}));
			}
			if((OreDictionary.getOres("dustLead").size() > 0) && (OreDictionary.getOres("ingotLead").size() > 0))
			{
				GameRegistry.addRecipe(
					new ShapelessOreRecipe(
						new ItemStack(OreDictionary.getOres("ingotLead").get(0).getItem(),1,OreDictionary.getOres("ingotLead").get(0).getItemDamage()),
						new Object[]{"dustLead",ARGetItemRegister("craftingfurnace")}));
			}
			if((OreDictionary.getOres("dustNickel").size() > 0) && (OreDictionary.getOres("ingotNickel").size() > 0))
			{
				GameRegistry.addRecipe(
					new ShapelessOreRecipe(
						new ItemStack(OreDictionary.getOres("ingotNickel").get(0).getItem(),1,OreDictionary.getOres("ingotNickel").get(0).getItemDamage()),
						new Object[]{"dustNickel",ARGetItemRegister("craftingfurnace")}));
			}
			if((OreDictionary.getOres("dustPlatinum").size() > 0) && (OreDictionary.getOres("ingotPlatinum").size() > 0))
			{
				GameRegistry.addRecipe(
					new ShapelessOreRecipe(
						new ItemStack(OreDictionary.getOres("ingotPlatinum").get(0).getItem(),1,OreDictionary.getOres("ingotPlatinum").get(0).getItemDamage()),
						new Object[]{"dustPlatinum",ARGetItemRegister("craftingfurnace")}));
			}
		}
	}
}
