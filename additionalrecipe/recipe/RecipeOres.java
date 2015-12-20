package chibivaru.additionalrecipe.recipe;

import static chibivaru.additionalrecipe.common.ARConfiguration.*;
import static chibivaru.additionalrecipe.common.ARItemHandler.*;
import net.minecraft.init.Blocks;
import net.minecraftforge.oredict.ShapedOreRecipe;
import cpw.mods.fml.common.registry.GameRegistry;

public class RecipeOres {
	public void init()
	{
		if(ARGetCrafting("Ore",true))
		{
			//鉱石増殖
			GameRegistry.addRecipe(
				new ShapedOreRecipe(
					Blocks.iron_ore,
					new Object[]{"X  "," X ","   ",
						Character.valueOf('X'),ARGetItemRegister("ultimateexchangeiginiton")}));
			GameRegistry.addRecipe(
				new ShapedOreRecipe(
					Blocks.gold_ore,
					new Object[]{" X "," X ","   ",
						Character.valueOf('X'),ARGetItemRegister("ultimateexchangeiginiton")}));
			GameRegistry.addRecipe(
				new ShapedOreRecipe(
					Blocks.coal_ore,
					new Object[]{"  X"," X ","   ",
						Character.valueOf('X'),ARGetItemRegister("ultimateexchangeiginiton")}));
			GameRegistry.addRecipe(
				new ShapedOreRecipe(
					Blocks.diamond_ore,
					new Object[]{"   ","XX ","   ",
						Character.valueOf('X'),ARGetItemRegister("ultimateexchangeiginiton")}));
			GameRegistry.addRecipe(
				new ShapedOreRecipe(
					Blocks.emerald_ore,
					new Object[]{"   "," XX","   ",
						Character.valueOf('X'),ARGetItemRegister("ultimateexchangeiginiton")}));
			GameRegistry.addRecipe(
				new ShapedOreRecipe(
					Blocks.lapis_ore,
					new Object[]{"   "," X ","X  ",
						Character.valueOf('X'),ARGetItemRegister("ultimateexchangeiginiton")}));
			GameRegistry.addRecipe(
				new ShapedOreRecipe(
					Blocks.quartz_ore,
					new Object[]{"   "," X "," X ",
						Character.valueOf('X'),ARGetItemRegister("ultimateexchangeiginiton")}));
			GameRegistry.addRecipe(
				new ShapedOreRecipe(
					Blocks.redstone_ore,
					new Object[]{"   "," X ","  X",
						Character.valueOf('X'),ARGetItemRegister("ultimateexchangeiginiton")}));
		}
	}

}
