package chibivaru.additionalrecipe;

import java.util.HashMap;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import chibivaru.additionalrecipe.core.ModInfo;
import chibivaru.additionalrecipe.tool.CheaperExchangeIgnition;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Metadata;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(
		modid        = AdditionalRecipe.MODID,
		name         = AdditionalRecipe.MODNAME,
		version      = AdditionalRecipe.VERSION,
		dependencies = "after:AppliedEnergistics;"
				+ "after:MineFactoryReloaded;"
				+ "after:ThermalExpansion;"
				+ "after:BuildCraftCore;"
				+ "after:Railcraft;"
				+ "after:DCsAppleMilk;"
				+ "required-after:FML"
	)

public class AdditionalRecipe
{
	public static final String MODID   = "AdditionalRecipe";
	public static final String MODNAME = "AdditionalRecipe";
	public static final String VERSION = "0.01";

	@Metadata(MODID)
	public static ModMetadata meta;

	HashMap<String,Item> ARItems;

	//@Mod.Instance("AdditionalRecipe")
	//public static AdditionalRecipe instance;
	public static CheaperExchangeIgnition cheaperExchangeIgnition;

	@Mod.EventHandler
	public void preinit(FMLPreInitializationEvent event)
	{
		ModInfo.loadInfo(meta);

		cheaperExchangeIgnition = (CheaperExchangeIgnition)(new CheaperExchangeIgnition()).setUnlocalizedName("cheaperexchangeignition").setCreativeTab(CreativeTabs.tabTools);

		GameRegistry.registerItem(cheaperExchangeIgnition, "CheaperExchangeIgnition");
	}

	@Mod.EventHandler
	public void load(FMLInitializationEvent event)
	{
		FMLCommonHandler.instance().bus().register(cheaperExchangeIgnition);

		LanguageRegistry.addName(cheaperExchangeIgnition, "CheaperExchangeIgnition");
	}
}
