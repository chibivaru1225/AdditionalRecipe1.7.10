package chibivaru.additionalrecipe.common;

import static chibivaru.additionalrecipe.AdditionalRecipe.*;

import chibivaru.additionalrecipe.armor.AngelusArmor;
import chibivaru.additionalrecipe.armor.BedrockArmor;
import chibivaru.additionalrecipe.armor.K2Armor;
import chibivaru.additionalrecipe.armor.ShionArmor;
import chibivaru.additionalrecipe.baubles.CharmOfGuardian;
import chibivaru.additionalrecipe.baubles.CirceForce;
import chibivaru.additionalrecipe.baubles.GravitationFeather;
import chibivaru.additionalrecipe.baubles.NightVisionTorch;
import chibivaru.additionalrecipe.baubles.SuperGravitationFeather;
import chibivaru.additionalrecipe.baubles.TearOfCompel;
import chibivaru.additionalrecipe.classes.AREnumValues;
import chibivaru.additionalrecipe.classes.AREnumValues.ARItems;
import chibivaru.additionalrecipe.dust.DustBedrock;
import chibivaru.additionalrecipe.dust.DustExchangeIgnition;
import chibivaru.additionalrecipe.dust.DustNetherStar;
import chibivaru.additionalrecipe.item.BlackRottenFlesh;
import chibivaru.additionalrecipe.item.ForceBall;
import chibivaru.additionalrecipe.item.IngotNetherQuartzite;
import chibivaru.additionalrecipe.tools.BedrockMortar;
import chibivaru.additionalrecipe.tools.CheaperExchangeIgnition;
import chibivaru.additionalrecipe.tools.DiamondMortar;
import chibivaru.additionalrecipe.tools.ExchangeIgnition;
import chibivaru.additionalrecipe.tools.HandStamp;
import chibivaru.additionalrecipe.tools.IronMortar;
import chibivaru.additionalrecipe.tools.UltimateExchangeIgnition;
import chibivaru.additionalrecipe.weapons.MultiK2;
import chibivaru.additionalrecipe.weapons.SwordExelector;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.EnumChatFormatting;

public class ARItemHandler
{
	public static void ARItemRegister()
	{
		ARNewItemRegister(new BedrockMortar(), "bedrockmortar", ARTabs, "Bedrock Mortar");
		ARNewItemRegister(new DiamondMortar(), "diamondmortar", ARTabs, "Diamond Mortar");
		ARNewItemRegister(new IronMortar(), "ironmortar", ARTabs, "Iron Mortar");
		ARNewItemRegister(new ExchangeIgnition(), "exchangeiginiton", ARTabs, "Exchange Ignition");
		ARNewItemRegister(new UltimateExchangeIgnition(), "ultimateexchangeiginiton", ARTabs, "Ultimate Exchange Ignition");
		ARNewItemRegister(new CheaperExchangeIgnition(), "cheaperexchangeiginiton", ARTabs, "Cheaper Exchange Ignition",true);
		
		ARNewItemRegister(new GravitationFeather(), "gravitationfeather", ARTabs, "Gravitation Feather");
		ARNewItemRegister(new SuperGravitationFeather(), "supergravitationfeather" , ARTabs, "Super Gravitation Feather");
		ARNewItemRegister(new NightVisionTorch(), "nightvisiontorch", ARTabs, "NightVision Torch");
		ARNewItemRegister(new CirceForce(), "circeforce", ARTabs, "Circe Force");
		ARNewItemRegister(new HandStamp(), "handstamp", ARTabs, "Hand Stamp");
		ARNewItemRegister(new TearOfCompel(),"tearofcompel",ARTabs,"Tear Of Compel");
		ARNewItemRegister(new CharmOfGuardian(),"charmofguardian",ARTabs,"Charm Of Guardian");

		ARNewItemRegister(new BlackRottenFlesh(), "blackrottenflesh", ARTabs, "Black RottenFlesh");
		ARNewItemRegister(new ForceBall(), "forceball", ARTabs, "Force Ball");
		
		ARNewItemRegister(new SwordExelector(WEAPON_POOR), "exelector", ARTabs, "Exelector",new StringBuilder().append(EnumChatFormatting.WHITE).append("Exelector").toString());
		//ARNewItemRegister(new BladeNIOH(WEAPON_PHANTASM), "nioh", ARTabs, "NIOH");
		//ARNewItemRegister(new SwordYORU(WEAPON_ULTIMATE), "yoru", ARTabs, "Villainy Sword 'YORU'","ja_JP","邪剣「夜」");
		//ARNewItemRegister(new SpearDAYO(WEAPON_ULTIMATE), "dayo", ARTabs, "Evil Spear 'DAYO'","ja_JP","悪槍「堕那」");
		ARNewItemRegister(new MultiK2(WEAPON_POOR), "toolk2", ARTabs, "K2",new StringBuilder().append(EnumChatFormatting.LIGHT_PURPLE).append("K2's Multi-Weapon").toString());

		ARNewItemRegister(new BedrockArmor(ARMOR_BEDROCK, ARMOR_DEFAULT, ARMOR_HELMET, BEDROCK), "bedrockhelmet", ARTabs, "Bedrock Helmet", "additionalrecipe:bedrockhelmet" ,ARMOR_HELMET);
		ARNewItemRegister(new BedrockArmor(ARMOR_BEDROCK, ARMOR_DEFAULT, ARMOR_PLATE, BEDROCK), "bedrockplate", ARTabs, "Bedrock Chestplate", "additionalrecipe:bedrockplate" ,ARMOR_PLATE);
		ARNewItemRegister(new BedrockArmor(ARMOR_BEDROCK, ARMOR_DEFAULT, ARMOR_LEGS, BEDROCK), "bedrocklegs", ARTabs, "Bedrock Leggings", "additionalrecipe:bedrocklegs" ,ARMOR_LEGS);
		ARNewItemRegister(new BedrockArmor(ARMOR_BEDROCK, ARMOR_DEFAULT, ARMOR_BOOTS, BEDROCK), "bedrockboots", ARTabs, "Bedrock Boots", "additionalrecipe:bedrockboots" ,ARMOR_BOOTS);
		ARNewItemRegister(new AngelusArmor(ARMOR_BEDROCK, ARMOR_DEFAULT, ARMOR_HELMET, ANGELUS), "angelushood", ARTabs, "Angelus Hood", "additionalrecipe:angelushood" ,ARMOR_HELMET);
		ARNewItemRegister(new AngelusArmor(ARMOR_BEDROCK, ARMOR_DEFAULT, ARMOR_PLATE, ANGELUS), "angelusvestment", ARTabs, "Angelus Vestment", "additionalrecipe:angelusvestment" ,ARMOR_PLATE);
		ARNewItemRegister(new AngelusArmor(ARMOR_BEDROCK, ARMOR_DEFAULT, ARMOR_LEGS, ANGELUS), "angelusskirt", ARTabs, "Angelus Skirt", "additionalrecipe:angelusskirt" ,ARMOR_LEGS);
		ARNewItemRegister(new AngelusArmor(ARMOR_BEDROCK, ARMOR_DEFAULT, ARMOR_BOOTS, ANGELUS), "angelusboots", ARTabs, "Angelus Boots", "additionalrecipe:angelusboots" ,ARMOR_BOOTS);
		ARNewItemRegister(new K2Armor(ARMOR_BEDROCK, ARMOR_DEFAULT, ARMOR_HELMET, K2), "k2helmet", ARTabs, "K2 Helmet", "additionalrecipe:k2helmet" ,ARMOR_HELMET);
		ARNewItemRegister(new K2Armor(ARMOR_BEDROCK, ARMOR_DEFAULT, ARMOR_PLATE, K2), "k2plate", ARTabs, "K2 ChestPlate", "additionalrecipe:k2plate" ,ARMOR_PLATE);
		ARNewItemRegister(new K2Armor(ARMOR_BEDROCK, ARMOR_DEFAULT, ARMOR_LEGS, K2), "k2legs", ARTabs, "K2 Leggings", "additionalrecipe:k2legs" ,ARMOR_LEGS);
		ARNewItemRegister(new K2Armor(ARMOR_BEDROCK, ARMOR_DEFAULT, ARMOR_BOOTS, K2), "k2boots", ARTabs, "K2 Boots", "additionalrecipe:k2boots" ,ARMOR_BOOTS);
        ARNewItemRegister(new ShionArmor(ARMOR_BEDROCK, ARMOR_DEFAULT, ARMOR_HELMET, SHION), "shionhood", ARTabs, "Shion's Hood", "additionalrecipe:shionhood" ,ARMOR_HELMET);
        ARNewItemRegister(new ShionArmor(ARMOR_BEDROCK, ARMOR_DEFAULT, ARMOR_PLATE, SHION), "shionvestment", ARTabs, "Shion's Vestment", "additionalrecipe:shionvestment" ,ARMOR_PLATE);
        ARNewItemRegister(new ShionArmor(ARMOR_BEDROCK, ARMOR_DEFAULT, ARMOR_LEGS, SHION), "shionskirt", ARTabs, "Shion's Skirt", "additionalrecipe:shionskirt" ,ARMOR_LEGS);
        ARNewItemRegister(new ShionArmor(ARMOR_BEDROCK, ARMOR_DEFAULT, ARMOR_BOOTS, SHION), "shionboots", ARTabs, "Shion's Boots", "additionalrecipe:shionboots" ,ARMOR_BOOTS);

		ARNewItemRegister(new DustNetherStar(), "dustnetherstar", ARTabs, "NetherStar Dust");
		ARNewItemRegister(new DustBedrock(), "dustbedrock", ARTabs, "Bedrock Dust");
		ARNewItemRegister(new DustExchangeIgnition(), "dustexchangeignition", ARTabs, "ExchangeIgnition Dust");
		
		ARNewItemRegister(new IngotNetherQuartzite(), "ingotnetherquartzite", ARTabs, "NetherQuartzite Ingot");
	}
	public static void ARNewItemRegister(Item par1Item,String par2UnlocalizedName,CreativeTabs par3CreativeTab,String par4Name)
	{
		par1Item.setUnlocalizedName(par2UnlocalizedName);
		par1Item.setCreativeTab(par3CreativeTab);
		ARItem.put(par2UnlocalizedName, par1Item);
		GameRegistry.registerItem(par1Item, par4Name);
		LanguageRegistry.addName(par1Item, par4Name);
	}
	public static void ARNewItemRegister(Item par1Item,String par2UnlocalizedName,CreativeTabs par3CreativeTab,String par4Name,Boolean par5CraftingRegister)
	{
		par1Item.setUnlocalizedName(par2UnlocalizedName);
		par1Item.setCreativeTab(par3CreativeTab);
		ARItem.put(par2UnlocalizedName, par1Item);
		GameRegistry.registerItem(par1Item, par4Name);
		LanguageRegistry.addName(par1Item, par4Name);
		if(par5CraftingRegister)
		{
			FMLCommonHandler.instance().bus().register(par1Item);
		}
	}
	public static void ARNewItemRegister(Item par1Item,String par2UnlocalizedName,CreativeTabs par3CreativeTab,String par4Name,String par5SuperName)
	{
		par1Item.setUnlocalizedName(par2UnlocalizedName);
		par1Item.setCreativeTab(par3CreativeTab);
		ARItem.put(par2UnlocalizedName, par1Item);
		GameRegistry.registerItem(par1Item, par4Name);
		LanguageRegistry.addName(par1Item, par5SuperName);
	}
	public static void ARNewItemRegister(Item par1Item,String par2UnlocalizedName,CreativeTabs par3CreativeTab,String par4Name,String par5TextureName,int par6ArmorType)
	{
		par1Item.setUnlocalizedName(par2UnlocalizedName);
		par1Item.setCreativeTab(par3CreativeTab);
		par1Item.setTextureName(par5TextureName);
		ARItem.put(par2UnlocalizedName, par1Item);
		GameRegistry.registerItem(par1Item, par4Name);
		LanguageRegistry.addName(par1Item, par4Name);
	}
	public static void ARNewItemRegister(Item par1Item,String par2UnlocalizedName,CreativeTabs par3CreativeTab,String par4Name,String par5Lang,String par6OtherName)
	{
		par1Item.setUnlocalizedName(par2UnlocalizedName);
		par1Item.setCreativeTab(par3CreativeTab);
		ARItem.put(par2UnlocalizedName, par1Item);
		GameRegistry.registerItem(par1Item, par4Name);
		LanguageRegistry.addName(par1Item, par4Name);
		LanguageRegistry.instance().addNameForObject(par1Item, par5Lang, par6OtherName);
	}
	public static void ARNewItemRegister(Item par1Item,CreativeTabs par2CreativeTab,ARItems par3ARItems)
	{
		par1Item.setUnlocalizedName(AREnumValues.GetConfirmStr(par3ARItems));
		par1Item.setCreativeTab(par2CreativeTab);
		ARItem.put(AREnumValues.GetConfirmStr(par3ARItems), par1Item);
		GameRegistry.registerItem(par1Item, AREnumValues.GetNameStr(par3ARItems));
		LanguageRegistry.addName(par1Item, AREnumValues.GetNameStr(par3ARItems));
	}
	public static void ARNewItemRegister(Item par1Item,CreativeTabs par2CreativeTab,ARItems par3ARItems,Boolean par4CraftingRegister)
	{
		par1Item.setUnlocalizedName(AREnumValues.GetConfirmStr(par3ARItems));
		par1Item.setCreativeTab(par2CreativeTab);
		ARItem.put(AREnumValues.GetConfirmStr(par3ARItems), par1Item);
		GameRegistry.registerItem(par1Item, AREnumValues.GetNameStr(par3ARItems));
		LanguageRegistry.addName(par1Item, AREnumValues.GetNameStr(par3ARItems));
		if(par4CraftingRegister)
		{
			FMLCommonHandler.instance().bus().register(par1Item);
		}
	}
	public static Item ARGetItemRegister(String par1Name)
	{
		if(ARItem.containsKey(par1Name))
		{
			return ARItem.get(par1Name);
		}
		else
		{
			return null;
		}
	}
}
