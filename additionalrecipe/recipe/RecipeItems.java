package chibivaru.additionalrecipe.recipe;

import static chibivaru.additionalrecipe.common.ARConfiguration.*;

import chibivaru.additionalrecipe.AdditionalRecipe;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class RecipeItems {
	public void init()
	{
		if(ARGetCrafting("Skull",true))
		{
			for(int var1 = 0;var1 < 5;++var1)
			{
				GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.skull,1,1),new Object[]{new ItemStack(Items.skull,1,var1)}));
			}
			GameRegistry.addRecipe(
				new ShapedOreRecipe(
					new ItemStack(Items.skull,1,1),
					new Object[]{"XXX","XYX","XXX",
						Character.valueOf('X'),Items.ender_pearl,
						Character.valueOf('Y'),"ExchangeIgnition"}));
			GameRegistry.addRecipe(
				new ShapelessOreRecipe(
					new ItemStack(Items.bone,64,0),
					new Object[]{
						new ItemStack(Items.skull,1,0),
						"MortarTier01"}));
			GameRegistry.addRecipe(
				new ShapelessOreRecipe(
					new ItemStack(Items.bone,64,0),
					new Object[]{
						new ItemStack(Items.skull,1,1),
						"MortarTier01"}));
			GameRegistry.addRecipe(
				new ShapelessOreRecipe(
					new ItemStack(Items.rotten_flesh,64,0),
					new Object[]{
						new ItemStack(Items.skull,1,2),
						"MortarTier01"}));
			GameRegistry.addRecipe(
				new ShapelessOreRecipe(
					new ItemStack(Items.gunpowder,64,0),
					new Object[]{
						new ItemStack(Items.skull,1,4),
						"MortarTier01"}));
		}
		if(ARGetCrafting("DragonEgg",true))
		{
			GameRegistry.addRecipe(
				new ShapedOreRecipe(
					Blocks.dragon_egg,
					new Object[]{"XXX","XYX","XXX",
						Character.valueOf('X'),Items.nether_star,
						Character.valueOf('Y'),"ExchangeIgnition"}));
		}
		if(ARGetCrafting("Bedrock",true))
		{
			GameRegistry.addRecipe(
				new ShapedOreRecipe(
					Blocks.bedrock,
					new Object[]{"XYX","YZY","XYX",
						Character.valueOf('X'),Items.nether_star,
						Character.valueOf('Y'),Blocks.obsidian,
						Character.valueOf('Z'),"ExchangeIgnition"}));
		}
		if(ARGetCrafting("NetherStar",true))
		{
			switch(AdditionalRecipe.craftingDifficulty)
			{
				case 0:
				{
					GameRegistry.addRecipe(
						new ShapelessOreRecipe(
							Items.nether_star,
							new Object[]{new ItemStack(Items.skull,1,1),"ExchangeIgnition"}));
					break;
				}
				case 1:
				{
					GameRegistry.addRecipe(
						new ShapelessOreRecipe(
							Items.nether_star,
							new Object[]{new ItemStack(Items.skull,1,1),new ItemStack(Items.skull,1,1),new ItemStack(Items.skull,1,1),"ExchangeIgnition"}));
					break;
				}
				case 2:
				{
					GameRegistry.addRecipe(
						new ShapelessOreRecipe(
							Items.nether_star,
							new Object[]{new ItemStack(Items.skull,1,1),new ItemStack(Items.skull,1,1),new ItemStack(Items.skull,1,1),new ItemStack(Items.skull,1,1),"ExchangeIgnition"}));
					break;
				}
				case 3:
				{
					GameRegistry.addRecipe(
						new ShapelessOreRecipe(
							new ItemStack(Items.nether_star,2),
							new Object[]{new ItemStack(Items.skull,1,1),new ItemStack(Items.skull,1,1),new ItemStack(Items.skull,1,1),Items.nether_star,"ExchangeIgnition"}));
					break;
				}
				case 4:
				{
					GameRegistry.addRecipe(
						new ShapelessOreRecipe(
							new ItemStack(Items.nether_star,2),
							new Object[]{new ItemStack(Items.skull,1,1),new ItemStack(Items.skull,1,1),new ItemStack(Items.skull,1,1),new ItemStack(Items.skull,1,1),new ItemStack(Items.skull,1,1),new ItemStack(Items.skull,1,1),Items.nether_star,"ExchangeIgnition"}));
					break;
				}
			}
		}
		if(ARGetCrafting("Jewel",true))
		{
			GameRegistry.addRecipe(
				new ShapelessOreRecipe(
					Items.emerald,
					new Object[]{Items.diamond,"ExchangeIgnition"}));
			GameRegistry.addRecipe(
				new ShapelessOreRecipe(
					Items.diamond,
					new Object[]{Items.emerald,"ExchangeIgnition"}));
		}
		if(ARGetCrafting("NetherStar",true))
		{
			GameRegistry.addRecipe(
				new ShapedOreRecipe(
					Items.ender_pearl,
					new Object[]{"XXX","XYX","XXX",
						Character.valueOf('X'),Items.rotten_flesh,
						Character.valueOf('Y'),"ExchangeIgnition"}));
			GameRegistry.addRecipe(
				new ShapedOreRecipe(
					Items.ender_pearl,
					new Object[]{"XXX","XYX","XXX",
						Character.valueOf('X'),Items.bone,
						Character.valueOf('Y'),"ExchangeIgnition"}));
			GameRegistry.addRecipe(
				new ShapedOreRecipe(
					Items.ender_pearl,
					new Object[]{"XXX","XYX","XXX",
						Character.valueOf('X'),Items.gunpowder,
						Character.valueOf('Y'),"ExchangeIgnition"}));
			if(AdditionalRecipe.craftingDifficulty == 0)
			{
				GameRegistry.addRecipe(
					new ShapedOreRecipe(
						Items.ender_pearl,
						new Object[]{"XXX","XYX","XXX",
							Character.valueOf('X'),new ItemStack(Blocks.sapling,1,32767),
							Character.valueOf('Y'),Items.slime_ball}));
				GameRegistry.addRecipe(
					new ShapedOreRecipe(
						Items.ender_pearl,
						new Object[]{"XXX","XYX","XXX",
							Character.valueOf('X'),"treeSapling",
							Character.valueOf('Y'),Items.slime_ball}));
			}
		}
		if(ARGetCrafting("PowerStone",true))
		{
			GameRegistry.addRecipe(
				new ShapelessOreRecipe(
					Items.glowstone_dust,
					new Object[]{"ExchangeIgnition",Items.redstone}));
			GameRegistry.addRecipe(
				new ShapelessOreRecipe(
					Items.redstone,
					new Object[]{"ExchangeIgnition",Items.glowstone_dust}));
		}
		if(ARGetCrafting("Obsidian",true))
		{
			GameRegistry.addRecipe(
				new ShapelessOreRecipe(
					new ItemStack(Blocks.obsidian,8,0),
					new Object[]{Items.lava_bucket,Items.water_bucket,"ExchangeIgnition"}));
		}
		if(ARGetCrafting("Grass",true))
		{
			GameRegistry.addRecipe(
				new ShapelessOreRecipe(
					Blocks.grass,
					new Object[]{Items.wheat_seeds,Blocks.dirt}));
		}
		if(ARGetCrafting("Cactus",true))
		{
			GameRegistry.addRecipe(
				new ShapedOreRecipe(
					Blocks.cactus,
					new Object[]{"XXX","XYX","XXX",
						Character.valueOf('X'),Items.wheat_seeds,
						Character.valueOf('Y'),Blocks.sand}));
		}
		if(ARGetCrafting("BlazeRod",true))
		{
			GameRegistry.addRecipe(
				new ShapedOreRecipe(
					Items.blaze_rod,
					new Object[]{"XYX","XYX","XYX",
						Character.valueOf('X'),Items.glowstone_dust,
						Character.valueOf('Y'),Items.stick}));
			if(AdditionalRecipe.craftingDifficulty == 0)
			{
				GameRegistry.addRecipe(
					new ShapelessOreRecipe(
						Items.blaze_rod,
						new Object[]{Items.blaze_powder,Items.blaze_powder}));
			}
		}
		if(ARGetCrafting("BookOld",true))
		{
			GameRegistry.addRecipe(
				new ShapedOreRecipe(
					Items.book,
					new Object[]{"XXX",
						Character.valueOf('X'),Items.paper}));
		}
		if(ARGetCrafting("Cray",true))
		{
			GameRegistry.addRecipe(
				new ShapedOreRecipe(
					new ItemStack(Items.clay_ball,8),
					new Object[]{"XXX","XYX","XXX",
						Character.valueOf('X'),Blocks.sand,
						Character.valueOf('Y'),Blocks.gravel}));
		}
		if(ARGetCrafting("Piston",true))
		{
			GameRegistry.addRecipe(
				new ShapedOreRecipe(
					Blocks.piston,
					new Object[]{"XXX","YZY","YWY",
						Character.valueOf('X'),"plankWood",
						Character.valueOf('Y'),"cobblestone",
						Character.valueOf('Z'),"ingotBronze",
						Character.valueOf('W'),Items.redstone}));
			GameRegistry.addRecipe(
				new ShapedOreRecipe(
					Blocks.piston,
					new Object[]{"XXX","YZY","YWY",
						Character.valueOf('X'),"plankWood",
						Character.valueOf('Y'),"cobblestone",
						Character.valueOf('Z'),"ingotSteel",
						Character.valueOf('W'),Items.redstone}));
			GameRegistry.addRecipe(
				new ShapedOreRecipe(
					Blocks.piston,
					new Object[]{"XXX","YZY","YWY",
						Character.valueOf('X'),"plankWood",
						Character.valueOf('Y'),"cobblestone",
						Character.valueOf('Z'),"ingotInvar",
						Character.valueOf('W'),Items.redstone}));
		}
		if(ARGetCrafting("ExpBottle",true))
		{
			GameRegistry.addRecipe(
				new ShapelessOreRecipe(
					new ItemStack(Items.experience_bottle,3),
					new Object[]{Items.glass_bottle,Items.glass_bottle,Items.glass_bottle,Items.ender_eye}));
		}
		if(ARGetCrafting("SlimeBall",true))
		{
			GameRegistry.addRecipe(
				new ShapelessOreRecipe(
					Items.slime_ball,
					new Object[]{Items.wheat_seeds,Items.wheat_seeds,Items.wheat_seeds,Items.wheat_seeds}));
		}
		if(ARGetCrafting("Mushroom",true))
		{
			GameRegistry.addRecipe(
				new ShapelessOreRecipe(
					Blocks.red_mushroom,
					new Object[]{Blocks.brown_mushroom}));
			GameRegistry.addRecipe(
				new ShapelessOreRecipe(
					Blocks.brown_mushroom,
					new Object[]{Blocks.red_mushroom}));
		}
		if(ARGetCrafting("EndPortal",true))
		{
			GameRegistry.addRecipe(
				new ShapedOreRecipe(
					Blocks.end_portal_frame,
					new Object[]{" X ","YZY","WVW",
						Character.valueOf('X'),Items.ender_eye,
						Character.valueOf('Y'),Blocks.emerald_block,
						Character.valueOf('Z'),Items.cauldron,
						Character.valueOf('W'),Blocks.obsidian,
						Character.valueOf('V'),Blocks.diamond_block}));
		}
		if(ARGetCrafting("GlowStoneDust",true))
		{
			GameRegistry.addRecipe(
				new ShapelessOreRecipe(
					new ItemStack(Items.glowstone_dust,2),
					new Object[]{"dustGold",Items.redstone}));
			GameRegistry.addRecipe(
				new ShapelessOreRecipe(
					new ItemStack(Items.glowstone_dust,4),
					new Object[]{"dustGold",Items.redstone,Items.redstone,"dustGold"}));
			GameRegistry.addRecipe(
				new ShapelessOreRecipe(
					new ItemStack(Items.glowstone_dust,6),
					new Object[]{"dustGold",Items.redstone,"dustGold",Items.redstone,"dustGold",Items.redstone}));
			GameRegistry.addRecipe(
				new ShapelessOreRecipe(
					new ItemStack(Items.glowstone_dust,8),
					new Object[]{"dustGold",Items.redstone,"dustGold",Items.redstone,"dustGold",Items.redstone,"dustGold",Items.redstone}));
			GameRegistry.addRecipe(
				new ShapelessOreRecipe(
					new ItemStack(Items.glowstone_dust,4),
					new Object[]{"dustElectrum",Items.redstone}));
			GameRegistry.addRecipe(
				new ShapelessOreRecipe(
					new ItemStack(Items.glowstone_dust,8),
					new Object[]{"dustElectrum",Items.redstone,Items.redstone,"dustElectrum"}));
			GameRegistry.addRecipe(
				new ShapelessOreRecipe(
					new ItemStack(Items.glowstone_dust,12),
					new Object[]{"dustElectrum",Items.redstone,"dustElectrum",Items.redstone,"dustElectrum",Items.redstone}));
			GameRegistry.addRecipe(
				new ShapelessOreRecipe(
					new ItemStack(Items.glowstone_dust,16),
					new Object[]{"dustElectrum",Items.redstone,"dustElectrum",Items.redstone,"dustElectrum",Items.redstone,"dustElectrum",Items.redstone}));
		}
		if(ARGetCrafting("Button",true))
		{
			GameRegistry.addRecipe(
				new ShapelessOreRecipe(
					Blocks.planks,
					new Object[]{Blocks.wooden_button}));
			GameRegistry.addRecipe(
				new ShapelessOreRecipe(
					Blocks.stone,
					new Object[]{Blocks.stone_button}));
		}
		if(ARGetCrafting("Clay",true))
		{
			GameRegistry.addRecipe(
				new ShapelessOreRecipe(
					new ItemStack(Items.clay_ball,4),
					new Object[]{Blocks.clay}));
			for(int var = 0; var < 16; var ++)
			{
				GameRegistry.addRecipe(
					new ShapelessOreRecipe(
						new ItemStack(Blocks.clay),
						new Object[]{new ItemStack(Blocks.stained_hardened_clay,1,var),"ExchangeIgnition"}));
			}
			GameRegistry.addRecipe(
					new ShapelessOreRecipe(
						new ItemStack(Blocks.clay),
						new Object[]{Blocks.hardened_clay,"ExchangeIgnition"}));
		}
		if(ARGetCrafting("Flint",true))
		{
			GameRegistry.addRecipe(
				new ShapelessOreRecipe(
					new ItemStack(Items.flint,1),
					new Object[]{Blocks.gravel,Blocks.gravel,Blocks.gravel,Blocks.gravel}));
		}
		if(ARGetCrafting("Leather",true))
		{
			GameRegistry.addRecipe(
				new ShapedOreRecipe(
					new ItemStack(Items.rotten_flesh,1),
					new Object[]{"XXX","X X","XXX",
						Character.valueOf('X'),Items.string}));
		}
        if(ARGetCrafting("Wood", true))
        {
            GameRegistry.addRecipe(
                new ShapelessOreRecipe(
                    new ItemStack(Blocks.sapling, 1, 0),
                    new Object[]{"ExchangeIgnition", Blocks.dirt}));
            GameRegistry.addRecipe(
                    new ShapelessOreRecipe(
                        new ItemStack(Blocks.sapling, 1, 1),
                        new Object[]{"ExchangeIgnition", new ItemStack(Blocks.sapling, 1, 0)}));
            GameRegistry.addRecipe(
                    new ShapelessOreRecipe(
                        new ItemStack(Blocks.sapling, 1, 2),
                        new Object[]{"ExchangeIgnition", new ItemStack(Blocks.sapling, 1, 1)}));
            GameRegistry.addRecipe(
                    new ShapelessOreRecipe(
                        new ItemStack(Blocks.sapling, 1, 3),
                        new Object[]{"ExchangeIgnition", new ItemStack(Blocks.sapling, 1, 2)}));
            GameRegistry.addRecipe(
                    new ShapelessOreRecipe(
                        new ItemStack(Blocks.sapling, 1, 4),
                        new Object[]{"ExchangeIgnition", new ItemStack(Blocks.sapling, 1, 3)}));
            GameRegistry.addRecipe(
                    new ShapelessOreRecipe(
                        new ItemStack(Blocks.sapling, 1, 5),
                        new Object[]{"ExchangeIgnition", new ItemStack(Blocks.sapling, 1, 4)}));
            GameRegistry.addRecipe(
                    new ShapelessOreRecipe(
                        new ItemStack(Blocks.sapling, 1, 0),
                        new Object[]{"ExchangeIgnition", new ItemStack(Blocks.sapling, 1, 5)}));
            GameRegistry.addRecipe(
                    new ShapelessOreRecipe(
                        new ItemStack(Blocks.log, 64, 0),
                        new Object[]{"ExchangeIgnition", new ItemStack(Blocks.sapling, 1, 0), new ItemStack(Items.dye, 1, 15)}));
            GameRegistry.addRecipe(
                    new ShapelessOreRecipe(
                        new ItemStack(Blocks.log, 64, 1),
                        new Object[]{"ExchangeIgnition", new ItemStack(Blocks.sapling, 1, 1), new ItemStack(Items.dye, 1, 15)}));
            GameRegistry.addRecipe(
                    new ShapelessOreRecipe(
                        new ItemStack(Blocks.log, 64, 2),
                        new Object[]{"ExchangeIgnition", new ItemStack(Blocks.sapling, 1, 2), new ItemStack(Items.dye, 1, 15)}));
            GameRegistry.addRecipe(
                    new ShapelessOreRecipe(
                        new ItemStack(Blocks.log, 64, 3),
                        new Object[]{"ExchangeIgnition", new ItemStack(Blocks.sapling, 1, 3), new ItemStack(Items.dye, 1, 15)}));
            GameRegistry.addRecipe(
                    new ShapelessOreRecipe(
                        new ItemStack(Blocks.log, 64, 4),
                        new Object[]{"ExchangeIgnition", new ItemStack(Blocks.sapling, 1, 4), new ItemStack(Items.dye, 1, 15)}));
            GameRegistry.addRecipe(
                    new ShapelessOreRecipe(
                        new ItemStack(Blocks.log, 64, 5),
                        new Object[]{"ExchangeIgnition", new ItemStack(Blocks.sapling, 1, 5), new ItemStack(Items.dye, 1, 15)}));
        }
	}
}
