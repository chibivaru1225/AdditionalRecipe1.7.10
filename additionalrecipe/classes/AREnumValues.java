package chibivaru.additionalrecipe.classes;

import net.minecraft.util.EnumChatFormatting;

public class AREnumValues
{ 
	public static enum ARItems
	{
		BlackRottenFlesh,
		ForceBall,
		Empty
	}
	public static String GetConfirmStr(ARItems item) throws IllegalArgumentException
	{
		switch(item)
		{
			case BlackRottenFlesh: return "blackrottenflesh";
			case ForceBall: return "forceball";
			default: throw new IllegalArgumentException();
		}
	}
	public static String GetNameStr(ARItems item) throws IllegalArgumentException
	{
		switch(item)
		{
			case BlackRottenFlesh: return "BlackRottenFlesh";
			case ForceBall: return "ForceBall";
			default: throw new IllegalArgumentException();
		}
	}
	
	public static enum ARArmors
	{
		BedrockHelmet,
		BedrockChestPlate,
		BedrockLeggings,
		BedrockBoots,
		AngelusHood,
		AngelusVestment,
		AngelusSkirt,
		AngelusBoots,
		K2Helmet,
		K2ChestPlate,
		K2Leggings,
		K2Boots,
		Empty
	}
	public static String GetConfirmStr(ARArmors item) throws IllegalArgumentException
	{
		switch(item)
		{
			case BedrockHelmet: return "bedrockhelmet";
			case BedrockChestPlate: return "bedrockplate";
			case BedrockLeggings: return "bedrocklegs";
			case BedrockBoots: return "bedrockboots";
			case AngelusHood: return "angelushood";
			case AngelusVestment: return "angelusvestment";
			case AngelusSkirt: return "angelusskirt";
			case AngelusBoots: return "angelusboots";
			case K2Helmet: return "k2helmet";
			case K2ChestPlate: return "k2plate";
			case K2Leggings: return "k2legs";
			case K2Boots: return "k2boots";
			default: throw new IllegalArgumentException();
		}
	}
	public static String GetNameStr(ARArmors item) throws IllegalArgumentException
	{
		switch(item)
		{
			case BedrockHelmet: return "BedrockHelmet";
			case BedrockChestPlate: return "BedrockChestPlate";
			case BedrockLeggings: return "BedrockLeggings";
			case BedrockBoots: return "BedrockBoots";
			case AngelusHood: return "AngelusHood";
			case AngelusVestment: return "AngelusVestment";
			case AngelusSkirt: return "AngelusSkirt";
			case AngelusBoots: return "AngelusBoots";
			case K2Helmet: return "K2Helmet";
			case K2ChestPlate: return "K2ChestPlate";
			case K2Leggings: return "K2Leggings";
			case K2Boots: return "K2Boots";
			default: throw new IllegalArgumentException();
		}
	}
	
	public static enum ARTools
	{
		IronMortar,
		DiamondMortar,
		BedrockMortar,
		CheaperExchangeIgnition,
		ExchangeIgnition,
		UltimateExchangeIgnition,
		HandStamp,
		Empty
	}
	public static String GetConfirmStr(ARTools item) throws IllegalArgumentException
	{
		switch(item)
		{
			case IronMortar: return "ironmortar";
			case DiamondMortar: return "diamondmortar";
			case BedrockMortar: return "bedrockmortar";
			case CheaperExchangeIgnition: return "cheaperexchangeiginiton";
			case ExchangeIgnition: return "exchangeiginiton";
			case UltimateExchangeIgnition: return "ultimateexchangeiginiton";
			case HandStamp: return "handstamp";
			default: throw new IllegalArgumentException();
		}
	}
	public static String GetNameStr(ARTools item) throws IllegalArgumentException
	{
		switch(item)
		{
			case IronMortar: return "IronMortar";
			case DiamondMortar: return "DiamondMortar";
			case BedrockMortar: return "BedrockMortar";
			case CheaperExchangeIgnition: return "CheaperExchangeIgnition";
			case ExchangeIgnition: return "ExchangeIgnition";
			case UltimateExchangeIgnition: return "UltimateExchangeIgnition";
			case HandStamp: return "HandStamp";
			default: throw new IllegalArgumentException();
		}
	}
	
	public static enum ARDusts
	{
		DustBedrock,
		DustExchangeIgnition,
		DustNetherStar,
		Empty
	}
	public static String GetConfirmStr(ARDusts item) throws IllegalArgumentException
	{
		switch(item)
		{
			case DustBedrock: return "blackrottenflesh";
			case DustExchangeIgnition: return "forceball";
			case DustNetherStar: return "forceball";
			default: throw new IllegalArgumentException();
		}
	}
	public static String GetNameStr(ARDusts item) throws IllegalArgumentException
	{
		switch(item)
		{
			case DustBedrock: return "blackrottenflesh";
			case DustExchangeIgnition: return "forceball";
			case DustNetherStar: return "forceball";
			default: throw new IllegalArgumentException();
		}
	}
	
	public static enum ARWeapons
	{
		SwordExelector,
		MultiK2,
		Empty
	}
	public static String GetConfirmStr(ARWeapons item) throws IllegalArgumentException
	{
		switch(item)
		{
			case SwordExelector: return "exelector";
			case MultiK2: return "toolk2";
			default: throw new IllegalArgumentException();
		}
	}
	public static String GetNameStr(ARWeapons item) throws IllegalArgumentException
	{
		switch(item)
		{
			case SwordExelector: return "Exelector";
			case MultiK2: return "K2";
			default: throw new IllegalArgumentException();
		}
	}
	public static String GetSuperNameStr(ARWeapons item) throws IllegalArgumentException
	{
		switch(item)
		{
			case SwordExelector: return new StringBuilder().append(EnumChatFormatting.WHITE).append("Exelector").toString();
			case MultiK2: return new StringBuilder().append(EnumChatFormatting.LIGHT_PURPLE).append("K2's Multi-Weapon").toString();
			default: throw new IllegalArgumentException();
		}
	}
	
	public static enum ARBaubles
	{
		GravitationFeather,
		NightVisionTorch,
		SuperGravitationFeather,
		TearOfCompel,
		CirceForce,
		CharmOfGuardian,
		Empty
	}
	public static String GetConfirmStr(ARBaubles item) throws IllegalArgumentException
	{
		switch(item)
		{
			case GravitationFeather: return "gravitationfeather";
			case NightVisionTorch: return "nightvisiontorch";
			case SuperGravitationFeather: return "supergravitationfeather";
			case TearOfCompel: return "tearofcompel";
			case CirceForce: return "circeforce";
			case CharmOfGuardian: return "charmofguardian";
			default: throw new IllegalArgumentException();
		}
	}
	public static String GetNameStr(ARBaubles item) throws IllegalArgumentException
	{
		switch(item)
		{
			case GravitationFeather: return "GravitationFeather";
			case NightVisionTorch: return "NightVisionTorch";
			case SuperGravitationFeather: return "SuperGravitationFeather";
			case TearOfCompel: return "TearOfCompel";
			case CirceForce: return "CirceForce";
			case CharmOfGuardian: return "CharmOfGuardian";
			default: throw new IllegalArgumentException();
		}
	}
	
}
