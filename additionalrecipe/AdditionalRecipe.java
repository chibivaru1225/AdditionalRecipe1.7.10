package chibivaru.additionalrecipe;

import static chibivaru.additionalrecipe.common.ARItemHandler.*;

import java.util.HashMap;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import chibivaru.additionalrecipe.common.ARConfiguration;
import chibivaru.additionalrecipe.common.ARCreativeTab;
import chibivaru.additionalrecipe.common.ARLogger;
import chibivaru.additionalrecipe.common.ARModInfo;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Metadata;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.util.EnumHelper;

@Mod(
		modid        = AdditionalRecipe.MODID,
		name         = AdditionalRecipe.MODNAME,
		version      = AdditionalRecipe.VERSION,
		dependencies = "after:appliedenergistics2;"
				+ "after:MineFactoryReloaded;"
				+ "after:ThermalExpansion;"
				+ "after:BuildCraftCore;"
				+ "after:Railcraft;"
				+ "after:DCsAppleMilk;"
				+ "required-after:FML"
	)

public class AdditionalRecipe
{
	public static final String MODID   = "additionalrecipe";
	public static final String MODNAME = "AdditionalRecipe";
	public static final String VERSION = "0.01";

	public static final CreativeTabs ARTabs = new ARCreativeTab("AdditionalRecipe");

	@Metadata(MODID)
	public static ModMetadata meta;

	public static HashMap<String,Item>    ARItem       = new HashMap<String,Item>();
	public static HashMap<String,Boolean> ARSmelting   = new HashMap<String,Boolean>();
	public static HashMap<String,Boolean> ARCrafting   = new HashMap<String,Boolean>();
	public static HashMap<String,Integer> ARCfgOther   = new HashMap<String,Integer>();
	public static HashMap<String,Boolean> ARAnother    = new HashMap<String,Boolean>();

	public static ArmorMaterial ARMOR_BEDROCK,ARMOR_PRIDE,ARMOR_WRATH,ARMOR_ENVY,ARMOR_SLOTH,ARMOR_AVARICE,ARMOR_GLUTTONY,ARMOR_LUST,ARMOR_ANGELUS;
	public static ToolMaterial WEAPON_ULTIMATE,WEAPON_BASIC,WEAPON_POOR,WEAPON_PHANTASM;
	public static String BEDROCK          = "bedrock";
	public static String PRIDE            = "pride";
	public static String WRATH            = "wrath";
	public static String ENVY             = "envy";
	public static String SLOTH            = "sloth";
	public static String AVARICE          = "avarice";
	public static String GLUTTONY         = "gluttony";
	public static String LUST             = "lust";
	public static String ANGELUS          = "angelus";
	public static final int ARMOR_DEFAULT = 0;
	public static final int ARMOR_HELMET  = 0;
	public static final int ARMOR_PLATE   = 1;
	public static final int ARMOR_LEGS    = 2;
	public static final int ARMOR_BOOTS   = 3;

	//@Mod.Instance("AdditionalRecipe")
	//public static AdditionalRecipe instance;

	@Mod.EventHandler
	public void preinit(FMLPreInitializationEvent event)
	{
		ARMOR_BEDROCK  = EnumHelper.addArmorMaterial("BEDROCK" , 1, new int[] {10,10,10,10},20);
		ARMOR_PRIDE    = EnumHelper.addArmorMaterial("PRIDE"   , 1, new int[] {15,15,15,15},30);
		ARMOR_WRATH    = EnumHelper.addArmorMaterial("WRATH"   , 1, new int[] {15,15,15,15},30);
		ARMOR_ENVY     = EnumHelper.addArmorMaterial("ENVY"    , 1, new int[] {15,15,15,15},30);
		ARMOR_SLOTH    = EnumHelper.addArmorMaterial("SLOTH"   , 1, new int[] {15,15,15,15},30);
		ARMOR_AVARICE  = EnumHelper.addArmorMaterial("AVARICE" , 1, new int[] {15,15,15,15},30);
		ARMOR_GLUTTONY = EnumHelper.addArmorMaterial("GLUTTONY", 1, new int[] {15,15,15,15},30);
		ARMOR_LUST     = EnumHelper.addArmorMaterial("LUST"    , 1, new int[] {15,15,15,15},30);
		ARMOR_ANGELUS  = EnumHelper.addArmorMaterial("ANGELUS" , 1, new int[] {20,20,20,20},40);

		WEAPON_POOR     = EnumHelper.addToolMaterial("POOR"     , 2, 1, 6.0f, 0,  100);
		WEAPON_BASIC    = EnumHelper.addToolMaterial("BASIC"    , 3, 1, 6.0f, 5,  100);
		WEAPON_ULTIMATE = EnumHelper.addToolMaterial("ULTIMATE" , 4, 1, 6.0f, 15, 100);
		WEAPON_PHANTASM = EnumHelper.addToolMaterial("PHANTASM" , 4, 1, 6.0f, 95, 100);

		ARModInfo.loadInfo(meta);
		ARLogger.init(MODNAME);
		ARConfiguration.init(event);
		ARItemRegister();
	}

	@Mod.EventHandler
	public void load(FMLInitializationEvent event)
	{
		//ItemStack PureCertus = new ItemStack(GameRegistry.findItem("appliedenergistics2", "item.ItemMultiMaterial"), 1, 10);
	}
}
