package chibivaru.additionalrecipe.recipe;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import cpw.mods.fml.common.registry.GameRegistry;

public class RecipeMortar {
	public void init()
	{
		//粉砕
		GameRegistry.addRecipe(
			new ShapelessOreRecipe(
				Items.string,
				new Object[]{new ItemStack(Blocks.sapling,1,32767),"MortarTier01"}));
		GameRegistry.addRecipe(
			new ShapelessOreRecipe(
				Items.string,
				new Object[]{new ItemStack(Blocks.leaves,1,32767),"MortarTier01"}));
		GameRegistry.addRecipe(
			new ShapelessOreRecipe(
				Items.string,
				new Object[]{"treeSapling","MortarTier01"}));
		GameRegistry.addRecipe(
			new ShapelessOreRecipe(
				Items.string,
				new Object[]{"treeLeaves","MortarTier01"}));
		GameRegistry.addRecipe(
			new ShapelessOreRecipe(
				new ItemStack(Items.dye,8,15),
				new Object[]{Items.bone,"MortarTier01"}));
		GameRegistry.addRecipe(
			new ShapelessOreRecipe(
				Blocks.sand,
				new Object[]{Blocks.cobblestone,"MortarTier01"}));
		GameRegistry.addRecipe(
				new ShapelessOreRecipe(
					Blocks.sand,
					new Object[]{"cobblestone","MortarTier01"}));
		GameRegistry.addRecipe(
				new ShapelessOreRecipe(
					new ItemStack(Items.string,8),
					new Object[]{Blocks.web,"MortarTier01"}));
		GameRegistry.addRecipe(
			new ShapelessOreRecipe(
				new ItemStack(Items.string,1),
				new Object[]{new ItemStack(Items.string,1,1)}));
		GameRegistry.addRecipe(
				new ShapelessOreRecipe(
					Blocks.web,
					new Object[]{Items.string,Items.string,Items.string,Items.string,Items.string,Items.string,Items.string,Items.string}));;
		GameRegistry.addRecipe(
			new ShapelessOreRecipe(
				Blocks.cobblestone,
				new Object[]{Blocks.stone,"MortarTier01"}));
		GameRegistry.addRecipe(
				new ShapelessOreRecipe(
					Blocks.cobblestone,
					new Object[]{"stone","MortarTier01"}));
		GameRegistry.addRecipe(
			new ShapelessOreRecipe(
				new ItemStack(Items.flint,4),
				new Object[]{Blocks.gravel,"MortarTier01"}));
		GameRegistry.addRecipe(
			new ShapelessOreRecipe(
				Blocks.netherrack,
				new Object[]{Blocks.nether_brick,"MortarTier02"}));
		GameRegistry.addRecipe(
			new ShapelessOreRecipe(
				Blocks.soul_sand,
				new Object[]{Blocks.netherrack,"MortarTier02"}));
		GameRegistry.addRecipe(
			new ShapelessOreRecipe(
				new ItemStack(Items.blaze_powder,4),
				new Object[]{Items.blaze_rod,"MortarTier02"}));
		GameRegistry.addRecipe(
			new ShapelessOreRecipe(
				new ItemStack(Items.feather,8),
				new Object[]{new ItemStack(Blocks.wool,1,32767),"MortarTier01"}));
		GameRegistry.addRecipe(
			new ShapelessOreRecipe(
				new ItemStack(Items.redstone,4),
				new Object[]{Items.poisonous_potato,"MortarTier01"}));
		GameRegistry.addRecipe(
			new ShapelessOreRecipe(
				Blocks.gravel,
				new Object[]{Blocks.cobblestone,Blocks.sand,Items.bowl}));
	}
}
