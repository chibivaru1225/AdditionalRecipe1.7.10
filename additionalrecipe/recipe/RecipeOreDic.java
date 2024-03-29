package chibivaru.additionalrecipe.recipe;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class RecipeOreDic {
	public void init()
	{
		//鉱石粉統一
		if(OreDictionary.getOres("dustCoal").size() > 1)
		{
			GameRegistry.addRecipe(
				new ShapelessOreRecipe(
					OreDictionary.getOres("dustCoal").get(0),
					new Object[]{"dustCoal"}));
		}
		if(OreDictionary.getOres("dustObsidian").size() > 1)
		{
			GameRegistry.addRecipe(
				new ShapelessOreRecipe(
					OreDictionary.getOres("dustObsidian").get(0),
					new Object[]{"dustObsidian"}));
		}
		if(OreDictionary.getOres("dustSulfur").size() > 1)
		{
			GameRegistry.addRecipe(
				new ShapelessOreRecipe(
					OreDictionary.getOres("dustSulfur").get(0),
					new Object[]{"dustSulfur"}));
		}
		if(OreDictionary.getOres("dustSaltpeter").size() > 1)
		{
			GameRegistry.addRecipe(
				new ShapelessOreRecipe(
					OreDictionary.getOres("dustSaltpeter").get(0),
					new Object[]{"dustSaltpeter"}));
		}
		if(OreDictionary.getOres("dustCopper").size() > 1)
		{
			GameRegistry.addRecipe(
				new ShapelessOreRecipe(
					OreDictionary.getOres("dustCopper").get(0),
					new Object[]{"dustCopper"}));
		}
		if(OreDictionary.getOres("dustTin").size() > 1)
		{
			GameRegistry.addRecipe(
				new ShapelessOreRecipe(
					OreDictionary.getOres("dustTin").get(0),
					new Object[]{"dustTin"}));
		}
		if(OreDictionary.getOres("dustIron").size() > 1)
		{
			GameRegistry.addRecipe(
				new ShapelessOreRecipe(
					OreDictionary.getOres("dustIron").get(0),
					new Object[]{"dustIron"}));
		}
		if(OreDictionary.getOres("dustGold").size() > 1)
		{
			GameRegistry.addRecipe(
				new ShapelessOreRecipe(
					OreDictionary.getOres("dustGold").get(0),
					new Object[]{"dustGold"}));
		}
		

//        if(OreDictionary.getOres("shardPrismarine").size() > 1)
//        {
//            GameRegistry.addRecipe(
//                new ShapelessOreRecipe(
//                    new ItemStack(OreDictionary.getOres("shardPrismarine").get(0).getItem(), 2, OreDictionary.getOres("shardPrismarine").get(0).getItemDamage()),
//                    new Object[]{Items.quartz, Items.quartz}));
//            ARLogger.logger.info("shardPrismarine" + RecipeHandler.RECIPE + RecipeHandler.ADDED);
//        }
//        else
//        {
//            ARLogger.logger.info("shardPrismarine" + RecipeHandler.RECIPE + RecipeHandler.NOTADDED);
//        }
//        if(OreDictionary.getOres("crystalPrismarine").size() > 1)
//        {
//            GameRegistry.addRecipe(
//                new ShapelessOreRecipe(
//                    new ItemStack(OreDictionary.getOres("crystalPrismarine").get(0).getItem(), 2, OreDictionary.getOres("crystalPrismarine").get(0).getItemDamage()),
//                    new Object[]{Items.quartz, Items.coal}));
//            ARLogger.logger.info("crystalPrismarine" + RecipeHandler.RECIPE + RecipeHandler.ADDED);
//        }
//        else
//        {
//            ARLogger.logger.info("crystalPrismarine" + RecipeHandler.RECIPE + RecipeHandler.NOTADDED);
//        }
	}
}
