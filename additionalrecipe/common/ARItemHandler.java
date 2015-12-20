package chibivaru.additionalrecipe.common;

import static chibivaru.additionalrecipe.AdditionalRecipe.*;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.EnumChatFormatting;
import chibivaru.additionalrecipe.armor.AngelusArmor;
import chibivaru.additionalrecipe.armor.BedrockArmor;
import chibivaru.additionalrecipe.dust.DustBedrock;
import chibivaru.additionalrecipe.dust.DustExchangeIgnition;
import chibivaru.additionalrecipe.dust.DustNetherStar;
import chibivaru.additionalrecipe.item.BlackRottenFlesh;
import chibivaru.additionalrecipe.item.CirceForce;
import chibivaru.additionalrecipe.item.ForceBall;
import chibivaru.additionalrecipe.item.GravitationFeather;
import chibivaru.additionalrecipe.item.NightVisionTorch;
import chibivaru.additionalrecipe.item.SuperGravitationFeather;
import chibivaru.additionalrecipe.tools.BedrockMortar;
import chibivaru.additionalrecipe.tools.CheaperExchangeIgnition;
import chibivaru.additionalrecipe.tools.DiamondMortar;
import chibivaru.additionalrecipe.tools.ExchangeIgnition;
import chibivaru.additionalrecipe.tools.IronMortar;
import chibivaru.additionalrecipe.tools.UltimateExchangeIgnition;
import chibivaru.additionalrecipe.weapons.BladeNIOH;
import chibivaru.additionalrecipe.weapons.MultiK2;
import chibivaru.additionalrecipe.weapons.SwordExelector;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ARItemHandler
{
	public static void ARItemRegister()
	{
		ARNewItemRegister(new BedrockMortar(), "bedrockmortar", ARTabs, "BedrockMortar");
		ARNewItemRegister(new DiamondMortar(), "diamondmortar", ARTabs, "DiamondMortar");
		ARNewItemRegister(new IronMortar(), "ironmortar", ARTabs, "IronMortar");
		ARNewItemRegister(new ExchangeIgnition(), "exchangeiginiton", ARTabs, "ExchangeIgnition");
		ARNewItemRegister(new UltimateExchangeIgnition(), "ultimateexchangeiginiton", ARTabs, "UltimateExchangeIgnition");
		ARNewItemRegister(new CheaperExchangeIgnition(), "cheaperexchangeiginiton", ARTabs, "CheaperExchangeIgnition",true);
		ARNewItemRegister(new GravitationFeather(), "gravitationfeather", ARTabs, "GravitationFeather");
		ARNewItemRegister(new SuperGravitationFeather(), "supergravitationfeather" , ARTabs, "SuperGravitationFeather");
		ARNewItemRegister(new BlackRottenFlesh(), "blackrottenflesh", ARTabs, "BlackRottenFlesh");
		ARNewItemRegister(new NightVisionTorch(), "nightvisiontorch", ARTabs, "NightVisionTorch");
		ARNewItemRegister(new ForceBall(), "forceball", ARTabs, "ForceBall");
		ARNewItemRegister(new CirceForce(), "circeforce", ARTabs, "CirceForce");

		ARNewItemRegister(new SwordExelector(WEAPON_POOR), "exelector", ARTabs, "Exelector",new StringBuilder().append(EnumChatFormatting.WHITE).append("Exelector").toString());
		ARNewItemRegister(new BladeNIOH(WEAPON_PHANTASM), "nioh", ARTabs, "NIOH");
		//ARNewItemRegister(new SwordYORU(WEAPON_ULTIMATE), "yoru", ARTabs, "Villainy Sword 'YORU'","ja_JP","邪剣「夜」");
		//ARNewItemRegister(new SpearDAYO(WEAPON_ULTIMATE), "dayo", ARTabs, "Evil Spear 'DAYO'","ja_JP","悪槍「堕那」");
		ARNewItemRegister(new MultiK2(WEAPON_POOR), "toolk2", ARTabs, "K2",new StringBuilder().append(EnumChatFormatting.LIGHT_PURPLE).append("K2's Multi-Weapon").toString());

		ARNewItemRegister(new BedrockArmor(ARMOR_BEDROCK, ARMOR_DEFAULT, ARMOR_HELMET, BEDROCK), "bedrockhelmet", ARTabs, "BedrockHelmet", "additionalrecipe:BedrockHelmet" ,ARMOR_HELMET);
		ARNewItemRegister(new BedrockArmor(ARMOR_BEDROCK, ARMOR_DEFAULT, ARMOR_PLATE, BEDROCK), "bedrockplate", ARTabs, "BedrockChestplate", "additionalrecipe:BedrockPlate" ,ARMOR_PLATE);
		ARNewItemRegister(new BedrockArmor(ARMOR_BEDROCK, ARMOR_DEFAULT, ARMOR_LEGS, BEDROCK), "bedrocklegs", ARTabs, "BedrockLeggings", "additionalrecipe:BedrockLegs" ,ARMOR_LEGS);
		ARNewItemRegister(new BedrockArmor(ARMOR_BEDROCK, ARMOR_DEFAULT, ARMOR_BOOTS, BEDROCK), "bedrockboots", ARTabs, "BedrockBoots", "additionalrecipe:BedrockBoots" ,ARMOR_BOOTS);
		ARNewItemRegister(new AngelusArmor(ARMOR_BEDROCK, ARMOR_DEFAULT, ARMOR_HELMET, ANGELUS), "angelushood", ARTabs, "AngelusHood", "additionalrecipe:AngelusHood" ,ARMOR_HELMET);
		ARNewItemRegister(new AngelusArmor(ARMOR_BEDROCK, ARMOR_DEFAULT, ARMOR_PLATE, ANGELUS), "angelusvestment", ARTabs, "AngelusVestment", "additionalrecipe:AngelusVestment" ,ARMOR_PLATE);
		ARNewItemRegister(new AngelusArmor(ARMOR_BEDROCK, ARMOR_DEFAULT, ARMOR_LEGS, ANGELUS), "angelusskirt", ARTabs, "AngelusSkirt", "additionalrecipe:AngelusSkirt" ,ARMOR_LEGS);
		ARNewItemRegister(new AngelusArmor(ARMOR_BEDROCK, ARMOR_DEFAULT, ARMOR_BOOTS, ANGELUS), "angelusboots", ARTabs, "AngelusBoots", "additionalrecipe:AngelusBoots" ,ARMOR_BOOTS);

		ARNewItemRegister(new DustNetherStar(), "dustnetherstar", ARTabs, "DustNetherStar");
		ARNewItemRegister(new DustBedrock(), "dustbedrock", ARTabs, "DustBedrock");
		ARNewItemRegister(new DustExchangeIgnition(), "dustexchangeignition", ARTabs, "DustExchangeIgnition");
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
