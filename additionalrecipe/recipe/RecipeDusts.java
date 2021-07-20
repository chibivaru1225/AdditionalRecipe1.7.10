package chibivaru.additionalrecipe.recipe;

import static chibivaru.additionalrecipe.common.ARConfiguration.*;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class RecipeDusts {
	public void init()
	{
		//鉱石粉クラフト
		if(OreDictionary.getOres("dustCoal").size() > 0)
		{
			GameRegistry.addRecipe(
				new ShapelessOreRecipe(
					OreDictionary.getOres("dustCoal").get(0),
					new Object[]{Items.coal,"MortarTier01"}));
		}
		if(ARGetCrafting("DustNetherStar",true))
		{
			if(OreDictionary.getOres("dustNetherStar").size() > 0)
			{
				GameRegistry.addRecipe(
					new ShapelessOreRecipe(
						OreDictionary.getOres("dustNetherStar").get(0),
						new Object[]{Items.nether_star,"MortarTier03"}));
				GameRegistry.addRecipe(
					new ShapelessOreRecipe(
						Items.nether_star,
						new Object[]{"dustNetherStar"}));
			}
		}
		if(ARGetCrafting("DustBedrock",true))
		{
			if(OreDictionary.getOres("dustBedrock").size() > 0)
			{
				GameRegistry.addRecipe(
					new ShapelessOreRecipe(
						OreDictionary.getOres("dustBedrock").get(0),
						new Object[]{Blocks.bedrock,"MortarTier03"}));
				GameRegistry.addRecipe(
					new ShapelessOreRecipe(
						new ItemStack(Blocks.bedrock,1),
						new Object[]{"dustBedrock"}));
			}
		}
		GameRegistry.addRecipe(
			new ShapelessOreRecipe(
				new ItemStack(Items.coal,ARGetCfgOther("IronMortarDust",2)),
				new Object[]{"MortarOreTier01",Blocks.coal_ore}));
		GameRegistry.addRecipe(
			new ShapelessOreRecipe(
				new ItemStack(Items.diamond,ARGetCfgOther("IronMortarDust",2)),
				new Object[]{"MortarOreTier01",Blocks.diamond_ore}));
		GameRegistry.addRecipe(
			new ShapelessOreRecipe(
				new ItemStack(Items.emerald,ARGetCfgOther("IronMortarDust",2)),
				new Object[]{"MortarOreTier01",Blocks.emerald_ore}));
		GameRegistry.addRecipe(
			new ShapelessOreRecipe(
				new ItemStack(Items.coal,ARGetCfgOther("DiamondMortarDust",4)),
				new Object[]{"MortarOreTier02",Blocks.coal_ore}));
		GameRegistry.addRecipe(
			new ShapelessOreRecipe(
				new ItemStack(Items.diamond,ARGetCfgOther("DiamondMortarDust",4)),
				new Object[]{"MortarOreTier02",Blocks.diamond_ore}));
		GameRegistry.addRecipe(
			new ShapelessOreRecipe(
				new ItemStack(Items.emerald,ARGetCfgOther("DiamondMortarDust",4)),
				new Object[]{"MortarOreTier02",Blocks.emerald_ore}));
		GameRegistry.addRecipe(
			new ShapelessOreRecipe(
				new ItemStack(Items.coal,ARGetCfgOther("BedrockMortarDust",8)),
				new Object[]{"MortarOreTier03",Blocks.coal_ore}));
		GameRegistry.addRecipe(
			new ShapelessOreRecipe(
				new ItemStack(Items.diamond,ARGetCfgOther("BedrockMortarDust",8)),
				new Object[]{"MortarOreTier03",Blocks.diamond_ore}));
		GameRegistry.addRecipe(
			new ShapelessOreRecipe(
				new ItemStack(Items.emerald,ARGetCfgOther("BedrockMortarDust",8)),
				new Object[]{"MortarOreTier03",Blocks.emerald_ore}));
        GameRegistry.addRecipe(
            new ShapelessOreRecipe(
                new ItemStack(Items.paper, 2),
                new Object[]{"dustWood", "dustWood"}));
        GameRegistry.addRecipe(
                new ShapelessOreRecipe(
                    new ItemStack(Items.paper, 2),
                    new Object[]{"pulpWood", "pulpWood"}));
        
        for(int i = 1; i <= 8; i++)
        {
            Object[] recipe = new Object[i + 1];
            
            for(int l = 1; l <= i; l++)
            {
                recipe[l - 1] = "dustWood";
            }
            
            recipe[i] = "ExchangeIgnition";
            
            GameRegistry.addRecipe(
                    new ShapelessOreRecipe(
                        new ItemStack(Items.paper, i),
                        recipe));
        }
        GameRegistry.addRecipe(
                new ShapelessOreRecipe(
                    Items.paper,
                    new Object[]{"dustWood", "ExchangeIgnition"}));

        for(int i = 1; i <= 8; i++)
        {
            Object[] recipe = new Object[i + 1];
            
            for(int l = 1; l <= i; l++)
            {
                recipe[l - 1] = "pulpWood";
            }
            
            recipe[i] = "ExchangeIgnition";
            
            GameRegistry.addRecipe(
                    new ShapelessOreRecipe(
                        new ItemStack(Items.paper, i),
                        recipe));
        }
        GameRegistry.addRecipe(
                new ShapelessOreRecipe(
                    Items.paper,
                    new Object[]{"pulpWood", "ExchangeIgnition"}));
        
		//Mod鉱石+バニラ鉱石粉
		if(ARGetCrafting("CraftingOreDust",true))
		{
			if(OreDictionary.getOres("dustIron").size() > 0)
			{
				GameRegistry.addRecipe(
					new ShapelessOreRecipe(
						new ItemStack(OreDictionary.getOres("dustIron").get(0).getItem(),ARGetCfgOther("IronMortarDust",2),OreDictionary.getOres("dustIron").get(0).getItemDamage()),
						new Object[]{Blocks.iron_ore,"MortarOreTier01"}));
			}
			if(OreDictionary.getOres("dustGold").size() > 0)
			{
				GameRegistry.addRecipe(
					new ShapelessOreRecipe(
						new ItemStack(OreDictionary.getOres("dustGold").get(0).getItem(),ARGetCfgOther("IronMortarDust",2),OreDictionary.getOres("dustGold").get(0).getItemDamage()),
						new Object[]{Blocks.gold_ore,"MortarOreTier01"}));
			}
			if((OreDictionary.getOres("dustCopper").size() > 0) && (OreDictionary.getOres("oreCopper").size() > 0))
			{
				GameRegistry.addRecipe(
					new ShapelessOreRecipe(
						new ItemStack(OreDictionary.getOres("dustCopper").get(0).getItem(),ARGetCfgOther("IronMortarDust",2),OreDictionary.getOres("dustCopper").get(0).getItemDamage()),
						new Object[]{"oreCopper","MortarOreTier01"}));
			}
			if((OreDictionary.getOres("dustTin").size() > 0) && (OreDictionary.getOres("oreTin").size() > 0))
			{
				GameRegistry.addRecipe(
					new ShapelessOreRecipe(
						new ItemStack(OreDictionary.getOres("dustTin").get(0).getItem(),ARGetCfgOther("IronMortarDust",2),OreDictionary.getOres("dustTin").get(0).getItemDamage()),
						new Object[]{"oreTin","MortarOreTier01"}));
			}
			if((OreDictionary.getOres("dustSilver").size() > 0) && (OreDictionary.getOres("oreSilver").size() > 0))
			{
				GameRegistry.addRecipe(
					new ShapelessOreRecipe(
						new ItemStack(OreDictionary.getOres("dustSilver").get(0).getItem(),ARGetCfgOther("IronMortarDust",2),OreDictionary.getOres("dustSilver").get(0).getItemDamage()),
						new Object[]{"oreSilver","MortarOreTier01"}));
			}
			if((OreDictionary.getOres("dustLead").size() > 0) && (OreDictionary.getOres("oreLead").size() > 0))
			{
				GameRegistry.addRecipe(
					new ShapelessOreRecipe(
						new ItemStack(OreDictionary.getOres("dustLead").get(0).getItem(),ARGetCfgOther("IronMortarDust",2),OreDictionary.getOres("dustLead").get(0).getItemDamage()),
						new Object[]{"oreLead","MortarOreTier01"}));
			}

			if(OreDictionary.getOres("dustIron").size() > 0)
			{
				GameRegistry.addRecipe(
					new ShapelessOreRecipe(
						new ItemStack(OreDictionary.getOres("dustIron").get(0).getItem(),ARGetCfgOther("DiamondMortarDust",4),OreDictionary.getOres("dustIron").get(0).getItemDamage()),
						new Object[]{Blocks.iron_ore,"MortarOreTier02"}));
			}
			if(OreDictionary.getOres("dustGold").size() > 0)
			{
				GameRegistry.addRecipe(
					new ShapelessOreRecipe(
						new ItemStack(OreDictionary.getOres("dustGold").get(0).getItem(),ARGetCfgOther("DiamondMortarDust",4),OreDictionary.getOres("dustGold").get(0).getItemDamage()),
						new Object[]{Blocks.gold_ore,"MortarOreTier02"}));
			}
			if((OreDictionary.getOres("dustCopper").size() > 0) && (OreDictionary.getOres("oreCopper").size() > 0))
			{
				GameRegistry.addRecipe(
					new ShapelessOreRecipe(
						new ItemStack(OreDictionary.getOres("dustCopper").get(0).getItem(),ARGetCfgOther("DiamondMortarDust",4),OreDictionary.getOres("dustCopper").get(0).getItemDamage()),
						new Object[]{"oreCopper","MortarOreTier02"}));
			}
			if((OreDictionary.getOres("dustTin").size() > 0) && (OreDictionary.getOres("oreTin").size() > 0))
			{
				GameRegistry.addRecipe(
					new ShapelessOreRecipe(
						new ItemStack(OreDictionary.getOres("dustTin").get(0).getItem(),ARGetCfgOther("DiamondMortarDust",4),OreDictionary.getOres("dustTin").get(0).getItemDamage()),
						new Object[]{"oreTin","MortarOreTier02"}));
			}
			if((OreDictionary.getOres("dustSilver").size() > 0) && (OreDictionary.getOres("oreSilver").size() > 0))
			{
				GameRegistry.addRecipe(
					new ShapelessOreRecipe(
						new ItemStack(OreDictionary.getOres("dustSilver").get(0).getItem(),ARGetCfgOther("DiamondMortarDust",4),OreDictionary.getOres("dustSilver").get(0).getItemDamage()),
						new Object[]{"oreSilver","MortarOreTier02"}));
			}
			if((OreDictionary.getOres("dustLead").size() > 0) && (OreDictionary.getOres("oreLead").size() > 0))
			{
				GameRegistry.addRecipe(
					new ShapelessOreRecipe(
						new ItemStack(OreDictionary.getOres("dustLead").get(0).getItem(),ARGetCfgOther("DiamondMortarDust",4),OreDictionary.getOres("dustLead").get(0).getItemDamage()),
						new Object[]{"oreLead","MortarOreTier02"}));
			}

			if(OreDictionary.getOres("dustIron").size() > 0)
			{
				GameRegistry.addRecipe(
					new ShapelessOreRecipe(
						new ItemStack(OreDictionary.getOres("dustIron").get(0).getItem(),ARGetCfgOther("BedrockMortarDust",8),OreDictionary.getOres("dustIron").get(0).getItemDamage()),
						new Object[]{Blocks.iron_ore,"MortarOreTier03"}));
			}
			if(OreDictionary.getOres("dustGold").size() > 0)
			{
				GameRegistry.addRecipe(
					new ShapelessOreRecipe(
						new ItemStack(OreDictionary.getOres("dustGold").get(0).getItem(),ARGetCfgOther("BedrockMortarDust",8),OreDictionary.getOres("dustGold").get(0).getItemDamage()),
						new Object[]{Blocks.gold_ore,"MortarOreTier03"}));
			}
			if((OreDictionary.getOres("dustCopper").size() > 0) && (OreDictionary.getOres("oreCopper").size() > 0))
			{
				GameRegistry.addRecipe(
					new ShapelessOreRecipe(
						new ItemStack(OreDictionary.getOres("dustCopper").get(0).getItem(),ARGetCfgOther("BedrockMortarDust",8),OreDictionary.getOres("dustCopper").get(0).getItemDamage()),
						new Object[]{"oreCopper","MortarOreTier03"}));
			}
			if((OreDictionary.getOres("dustTin").size() > 0) && (OreDictionary.getOres("oreTin").size() > 0))
			{
				GameRegistry.addRecipe(
					new ShapelessOreRecipe(
						new ItemStack(OreDictionary.getOres("dustTin").get(0).getItem(),ARGetCfgOther("BedrockMortarDust",8),OreDictionary.getOres("dustTin").get(0).getItemDamage()),
						new Object[]{"oreTin","MortarOreTier03"}));
			}
			if((OreDictionary.getOres("dustSilver").size() > 0) && (OreDictionary.getOres("oreSilver").size() > 0))
			{
				GameRegistry.addRecipe(
					new ShapelessOreRecipe(
						new ItemStack(OreDictionary.getOres("dustSilver").get(0).getItem(),ARGetCfgOther("BedrockMortarDust",8),OreDictionary.getOres("dustSilver").get(0).getItemDamage()),
						new Object[]{"oreSilver","MortarOreTier03"}));
			}
			if((OreDictionary.getOres("dustLead").size() > 0) && (OreDictionary.getOres("oreLead").size() > 0))
			{
				GameRegistry.addRecipe(
					new ShapelessOreRecipe(
						new ItemStack(OreDictionary.getOres("dustLead").get(0).getItem(),ARGetCfgOther("BedrockMortarDust",8),OreDictionary.getOres("dustLead").get(0).getItemDamage()),
						new Object[]{"oreLead","MortarOreTier03"}));
			}
		}
		if(ARGetCrafting("CraftingIngotDust",true))
		{
			if(OreDictionary.getOres("dustIron").size() > 0)
			{
				GameRegistry.addRecipe(
					new ShapelessOreRecipe(
						new ItemStack(OreDictionary.getOres("dustIron").get(0).getItem(),1,OreDictionary.getOres("dustIron").get(0).getItemDamage()),
						new Object[]{Items.iron_ingot,"MortarTier01"}));
			}
			if(OreDictionary.getOres("dustGold").size() > 0)
			{
				GameRegistry.addRecipe(
					new ShapelessOreRecipe(
						new ItemStack(OreDictionary.getOres("dustGold").get(0).getItem(),1,OreDictionary.getOres("dustGold").get(0).getItemDamage()),
						new Object[]{Items.gold_ingot,"MortarTier01"}));
			}
			if((OreDictionary.getOres("dustCopper").size() > 0) && (OreDictionary.getOres("ingotCopper").size() > 0))
			{
				GameRegistry.addRecipe(
					new ShapelessOreRecipe(
						new ItemStack(OreDictionary.getOres("dustCopper").get(0).getItem(),1,OreDictionary.getOres("dustCopper").get(0).getItemDamage()),
						new Object[]{"ingotCopper","MortarTier01"}));
			}
			if((OreDictionary.getOres("dustTin").size() > 0) && (OreDictionary.getOres("ingotTin").size() > 0))
			{
				GameRegistry.addRecipe(
					new ShapelessOreRecipe(
						new ItemStack(OreDictionary.getOres("dustTin").get(0).getItem(),1,OreDictionary.getOres("dustTin").get(0).getItemDamage()),
						new Object[]{"ingotTin","MortarTier01"}));
			}
			if((OreDictionary.getOres("dustSilver").size() > 0) && (OreDictionary.getOres("ingotSilver").size() > 0))
			{
				GameRegistry.addRecipe(
					new ShapelessOreRecipe(
						new ItemStack(OreDictionary.getOres("dustSilver").get(0).getItem(),1,OreDictionary.getOres("dustSilver").get(0).getItemDamage()),
						new Object[]{"ingotSilver","MortarTier01"}));
			}
			if((OreDictionary.getOres("dustLead").size() > 0) && (OreDictionary.getOres("ingotLead").size() > 0))
			{
				GameRegistry.addRecipe(
					new ShapelessOreRecipe(
						new ItemStack(OreDictionary.getOres("dustLead").get(0).getItem(),1,OreDictionary.getOres("dustLead").get(0).getItemDamage()),
						new Object[]{"ingotLead","MortarTier01"}));
			}
			if((OreDictionary.getOres("dustNickel").size() > 0) && (OreDictionary.getOres("ingotNickel").size() > 0))
			{
				GameRegistry.addRecipe(
					new ShapelessOreRecipe(
						new ItemStack(OreDictionary.getOres("dustNickel").get(0).getItem(),1,OreDictionary.getOres("dustNickel").get(0).getItemDamage()),
						new Object[]{"ingotNickel","MortarTier01"}));
			}
			if((OreDictionary.getOres("dustPlatinum").size() > 0) && (OreDictionary.getOres("ingotPlatinum").size() > 0))
			{
				GameRegistry.addRecipe(
					new ShapelessOreRecipe(
						new ItemStack(OreDictionary.getOres("dustPlatinum").get(0).getItem(),1,OreDictionary.getOres("dustPlatinum").get(0).getItemDamage()),
						new Object[]{"ingotPlatinum","MortarTier01"}));
			}
			if((OreDictionary.getOres("dustInvar").size() > 0) && (OreDictionary.getOres("ingotInvar").size() > 0))
			{
				GameRegistry.addRecipe(
					new ShapelessOreRecipe(
						new ItemStack(OreDictionary.getOres("dustInvar").get(0).getItem(),1,OreDictionary.getOres("dustInvar").get(0).getItemDamage()),
						new Object[]{"ingotInvar","MortarTier01"}));
			}
			if((OreDictionary.getOres("dustBronse").size() > 0) && (OreDictionary.getOres("ingotBronse").size() > 0))
			{
				GameRegistry.addRecipe(
					new ShapelessOreRecipe(
						new ItemStack(OreDictionary.getOres("dustBronse").get(0).getItem(),1,OreDictionary.getOres("dustBronse").get(0).getItemDamage()),
						new Object[]{"ingotBronse","MortarTier01"}));
			}
		}
	}
}
