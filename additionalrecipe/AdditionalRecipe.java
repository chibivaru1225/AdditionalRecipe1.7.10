package chibivaru.additionalrecipe;

import static chibivaru.additionalrecipe.common.ARConfiguration.*;
import static chibivaru.additionalrecipe.common.ARItemHandler.*;

import java.util.HashMap;

import baubles.api.BaublesApi;
import chibivaru.additionalrecipe.common.ARConfiguration;
import chibivaru.additionalrecipe.common.ARCreativeTab;
import chibivaru.additionalrecipe.common.ARModInfo;
import chibivaru.additionalrecipe.common.PotionHelper;
import chibivaru.additionalrecipe.event.ARAddChestGenHooks;
import chibivaru.additionalrecipe.event.ARFlyingEventHooks;
import chibivaru.additionalrecipe.event.ARNoFallDamageEventHooksServer;
import chibivaru.additionalrecipe.event.AngelusArmorLivingEventHooks;
import chibivaru.additionalrecipe.event.BedrockArmorLivingEventHooks;
import chibivaru.additionalrecipe.event.CharmOfGuardianEventHooks;
import chibivaru.additionalrecipe.event.K2ArmorLivingEventHooks;
import chibivaru.additionalrecipe.recipe.RecipeHandler;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Metadata;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.relauncher.Side;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
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
	public static final String VERSION = "0.01-15";

	public static final String CONSOLE = "[AdditionalRecipe]:";
	public static final String ADDID = " added ID ";

	public static final CreativeTabs ARTabs = new ARCreativeTab("AdditionalRecipe");

	@Metadata(MODID)
	public static ModMetadata meta;

	public static HashMap<String,Item>    ARItem       = new HashMap<String,Item>();
	public static HashMap<String,Boolean> ARSmelting   = new HashMap<String,Boolean>();
	public static HashMap<String,Boolean> ARCrafting   = new HashMap<String,Boolean>();
	public static HashMap<String,Integer> ARCfgOther   = new HashMap<String,Integer>();
	public static HashMap<String,Boolean> ARAnother    = new HashMap<String,Boolean>();
	public static int craftingDifficulty;
	public static RecipeHandler recipehandler;
	public static ARAddChestGenHooks addchestgenhooks;
	public static ArmorMaterial ARMOR_BEDROCK,ARMOR_PRIDE,ARMOR_WRATH,ARMOR_ENVY,ARMOR_SLOTH,ARMOR_AVARICE,ARMOR_GLUTTONY,ARMOR_LUST,ARMOR_ANGELUS,ARMOR_K2;
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
	public static String K2               = "k2";
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
		ARMOR_K2       = EnumHelper.addArmorMaterial("K2"      , 1, new int[] {40,40,40,40},40);

		WEAPON_POOR     = EnumHelper.addToolMaterial("POOR"     , 2, 1, 6.0f, 0,  100);
		WEAPON_BASIC    = EnumHelper.addToolMaterial("BASIC"    , 3, 1, 6.0f, 5,  100);
		WEAPON_ULTIMATE = EnumHelper.addToolMaterial("ULTIMATE" , 4, 1, 6.0f, 15, 100);
		WEAPON_PHANTASM = EnumHelper.addToolMaterial("PHANTASM" , 4, 1, 6.0f, 95, 100);

		ARModInfo.loadInfo(meta);
		//ARLogger.init(MODNAME);
		ARConfiguration.init(event);
		
		craftingDifficulty = ARGetCfgOther("Difficulty",0);
		if((craftingDifficulty < 0) && (4 < craftingDifficulty))
		{
			craftingDifficulty = 0;
		}
		ARItemRegister();
	}

	@Mod.EventHandler
	public void load(FMLInitializationEvent event)
	{
		addchestgenhooks = new ARAddChestGenHooks();
		addchestgenhooks.AddChestItems();
		
		MinecraftForge.EVENT_BUS.register(new ARNoFallDamageEventHooksServer());
		MinecraftForge.EVENT_BUS.register(new AngelusArmorLivingEventHooks());
		MinecraftForge.EVENT_BUS.register(new BedrockArmorLivingEventHooks());
		MinecraftForge.EVENT_BUS.register(new CharmOfGuardianEventHooks());
		MinecraftForge.EVENT_BUS.register(new K2ArmorLivingEventHooks());
		if(event.getSide() == Side.CLIENT)
		{
			MinecraftForge.EVENT_BUS.register(new ARFlyingEventHooks());
			//MinecraftForge.EVENT_BUS.register(new CirceForceEventHooks());
			//MinecraftForge.EVENT_BUS.register(new TearOfCorpelEventHooks());
			//MinecraftForge.EVENT_BUS.register(new ARNoFallDamageEventHooks());
			//MinecraftForge.EVENT_BUS.register(new ReplaceBlock());
			//MinecraftForge.EVENT_BUS.register(new WeaponsEventHooks());
		}
		else if(event.getSide() == Side.SERVER)
		{
		}

		if(ARGetAnother("EndPortal",true))
		{
			Blocks.end_portal_frame.setHardness(60F);
		}
	}

	@Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
	{
		PotionHelper.healthInspection();
		recipehandler = new RecipeHandler();
		recipehandler.oredic();
		recipehandler.init();
    }
	public static boolean equipArmor(Item armor,EntityPlayer player,int armorType)
	{
		switch(armorType)
		{
			case ARMOR_HELMET:
			{
				return player.inventory.armorItemInSlot(3) != null && player.inventory.armorItemInSlot(3).getItem() == armor;
			}
			case ARMOR_PLATE:
			{
				return player.inventory.armorItemInSlot(2) != null && player.inventory.armorItemInSlot(2).getItem() == armor;
			}
			case ARMOR_LEGS:
			{
				return player.inventory.armorItemInSlot(1) != null && player.inventory.armorItemInSlot(1).getItem() == armor;
			}
			case ARMOR_BOOTS:
			{
				return player.inventory.armorItemInSlot(0) != null && player.inventory.armorItemInSlot(0).getItem() == armor;
			}
		}
		return false;
	}
	public static boolean equipArmor(Item par1Head,Item par2Plate,Item par3Leg,Item par4Boots,EntityPlayer player)
	{
		if(player.inventory.armorItemInSlot(3) != null && player.inventory.armorItemInSlot(3).getItem() == par1Head)
		{
			if(player.inventory.armorItemInSlot(2) != null && player.inventory.armorItemInSlot(2).getItem() == par2Plate)
			{
				if(player.inventory.armorItemInSlot(1) != null && player.inventory.armorItemInSlot(1).getItem() == par3Leg)
				{
					if(player.inventory.armorItemInSlot(0) != null && player.inventory.armorItemInSlot(0).getItem() == par4Boots)
					{
						return true;
					}
				}
			}
		}
		return false;
	}
	public static boolean equipArmor(Item par1Head,Item par2Plate,Item par3Leg,Item par4Boots,EntityPlayer par5Player,boolean par6Mode)
	{
		if((par5Player.inventory.armorItemInSlot(3) != null && par5Player.inventory.armorItemInSlot(3).getItem() == par1Head))
		{
			return true;
		}
		else if((par5Player.inventory.armorItemInSlot(2) != null && par5Player.inventory.armorItemInSlot(2).getItem() == par2Plate))
		{
			return true;
		}
		else if((par5Player.inventory.armorItemInSlot(1) != null && par5Player.inventory.armorItemInSlot(1).getItem() == par3Leg))
		{
			return true;
		}
		else if((par5Player.inventory.armorItemInSlot(0) != null && par5Player.inventory.armorItemInSlot(0).getItem() == par4Boots))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static boolean hasBaubles(Item par1Item,EntityPlayer player)
	{
		if(Loader.isModLoaded("Baubles"))
		{
			IInventory baubles  = BaublesApi.getBaubles(player);
			boolean bauble      = false;
			if(baubles != null)
			{
				for(int i = 0; i < baubles.getSizeInventory(); i++)
				{
					ItemStack itemstack = baubles.getStackInSlot(i);
					if(itemstack != null)
					{
						if(par1Item == baubles.getStackInSlot(i).getItem())
						{
							return true;
						}
					}
				}
			}
		}
		return false;
	}
	public static boolean hasItem(Item item,EntityPlayer player)
	{
		return player.inventory.hasItem(item);
	}
	public static boolean searchItem(Item item,EntityPlayer player)
	{
		return hasBaubles(item,player)||hasItem(item,player);
	}
}
