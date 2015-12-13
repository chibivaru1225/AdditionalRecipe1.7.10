package chibivaru.additionalrecipe;

import java.util.HashMap;

import net.minecraft.item.Item;
import chibivaru.additionalrecipe.core.ModInfo;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Metadata;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.event.FMLInitializationEvent;

@Mod(
		modid   = AdditionalRecipe.MODID,
		name    = AdditionalRecipe.MODNAME,
		version = AdditionalRecipe.VERSION,
		dependencies="after:AppliedEnergistics;"
				+ "after:MineFactoryReloaded;"
				+ "after:ThermalExpansion;"
				+ "after:BuildCraftCore;"
				+ "after:Railcraft;"
				+ "after:DCsAppleMilk"
	)

public class AdditionalRecipe
{
	public static final String MODID   = "AdditionalRecipe";
	public static final String MODNAME = "AdditionalRecipe";
	public static final String VERSION = "0.01";

	@Metadata(MODID)
	public static ModMetadata meta;

	HashMap<String,Item> ARItems;

	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		ModInfo.loadInfo(meta);
	}
}
