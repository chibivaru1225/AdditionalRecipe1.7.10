package chibivaru.additionalrecipe.core;

import cpw.mods.fml.common.ModMetadata;
import chibivaru.additionalrecipe.AdditionalRecipe;

public class ModInfo
{
	public static void loadInfo(ModMetadata meta)
	{
		meta.modId = AdditionalRecipe.MODID;
		meta.name = AdditionalRecipe.MODNAME;
		meta.description ="This mod adds New Recipe for Minecraft.";
		meta.version = AdditionalRecipe.VERSION ;
		meta.url = "http://chaostcg31.blog.fc2.com/";
		meta.authorList.add("chibivaru");
		meta.credits = "schr0,defeatedcrow,a1lic";
		//meta.logoFile ="assets/aluminiummod/logo.png";
		meta.logoFile = "";
		meta.autogenerated = false;
	}
}
