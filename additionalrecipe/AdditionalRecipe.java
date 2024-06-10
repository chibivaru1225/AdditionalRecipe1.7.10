package chibivaru.additionalrecipe;

import static chibivaru.additionalrecipe.common.ARConfiguration.*;
import static chibivaru.additionalrecipe.common.ARItemHandler.*;

import java.util.HashMap;

import baubles.api.BaublesApi;
import chibivaru.additionalrecipe.armor.InsaneArmorBase;
import chibivaru.additionalrecipe.common.ARConfiguration;
import chibivaru.additionalrecipe.common.ARCreativeTab;
import chibivaru.additionalrecipe.common.ARModInfo;
import chibivaru.additionalrecipe.common.ClassHelper;
import chibivaru.additionalrecipe.event.ARAddChestGenHooks;
import chibivaru.additionalrecipe.event.ARFlyingEventHooks;
import chibivaru.additionalrecipe.event.ARNoFallDamageEventHooksServer;
import chibivaru.additionalrecipe.event.CharmOfGuardianEventHooks;
import chibivaru.additionalrecipe.event.InsaneArmorBaseLivingEventHooks;
import chibivaru.additionalrecipe.event.MobExlieEventHooks;
import chibivaru.additionalrecipe.event.ReplaceBlock;
import chibivaru.additionalrecipe.recipe.RecipeHandler;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Metadata;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.relauncher.Side;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;

@Mod(modid = AdditionalRecipe.MODID, name = AdditionalRecipe.MODNAME, version = AdditionalRecipe.VERSION, dependencies = "after:appliedenergistics2;"
        + "after:MineFactoryReloaded;" + "after:ThermalExpansion;" + "after:BuildCraftCore;" + "after:Railcraft;"
        + "after:TConstruct;"
        + "after:DCsAppleMilk;" + "after:Et Futurum;" + "after:GregTech;" + "required-after:FML")

public class AdditionalRecipe {
    public static final String MODID = "additionalrecipe";
    public static final String MODNAME = "AdditionalRecipe";
    public static final String VERSION = "0.01-18-c";

    public static final String CONSOLE = "[AdditionalRecipe]:";
    public static final String ADDID = " added ID ";

    public static final CreativeTabs ARTabs = new ARCreativeTab("AdditionalRecipe");

    @Metadata(MODID)
    public static ModMetadata meta;

    public static HashMap<String, Item> ARItem = new HashMap<String, Item>();
    public static HashMap<String, Boolean> ARSmelting = new HashMap<String, Boolean>();
    public static HashMap<String, Boolean> ARCrafting = new HashMap<String, Boolean>();
    public static HashMap<String, Integer> ARCfgOther = new HashMap<String, Integer>();
    public static HashMap<String, Boolean> ARAnother = new HashMap<String, Boolean>();
    public static int craftingDifficulty;
    public static RecipeHandler recipehandler;
    public static ARAddChestGenHooks addchestgenhooks;
    public static ArmorMaterial ARMOR_BEDROCK, ARMOR_ANGELUS, ARMOR_K2, ARMOR_SHION;
    public static ToolMaterial WEAPON_ULTIMATE, WEAPON_BASIC, WEAPON_POOR, WEAPON_PHANTASM;
    public static String BEDROCK = "bedrock";
    public static String ANGELUS = "angelus";
    public static String K2 = "k2";
    public static String SHION = "shion";
    public static final int ARMOR_DEFAULT = 0;
    public static final int ARMOR_HELMET = 0;
    public static final int ARMOR_PLATE = 1;
    public static final int ARMOR_LEGS = 2;
    public static final int ARMOR_BOOTS = 3;
    public static boolean Bedlock_Flying;

    // @Mod.Instance("AdditionalRecipe")
    // public static AdditionalRecipe instance;

    @Mod.EventHandler
    public void preinit(FMLPreInitializationEvent event) {
        ARMOR_BEDROCK = EnumHelper.addArmorMaterial("BEDROCK", 1, new int[] { 20, 20, 20, 20 }, 20);
        ARMOR_ANGELUS = EnumHelper.addArmorMaterial("ANGELUS", 1, new int[] { 40, 40, 40, 40 }, 40);
        ARMOR_K2 = EnumHelper.addArmorMaterial("K2", 1, new int[] { 40, 40, 40, 40 }, 40);
        ARMOR_SHION = EnumHelper.addArmorMaterial("SHION", 1, new int[] { 40, 40, 40, 40 }, 40);

        WEAPON_POOR = EnumHelper.addToolMaterial("POOR", 2, 1, 6.0f, 0, 100);
        WEAPON_BASIC = EnumHelper.addToolMaterial("BASIC", 3, 1, 6.0f, 5, 100);
        WEAPON_ULTIMATE = EnumHelper.addToolMaterial("ULTIMATE", 4, 1, 6.0f, 15, 100);
        WEAPON_PHANTASM = EnumHelper.addToolMaterial("PHANTASM", 4, 1, 6.0f, 95, 100);

        ARModInfo.loadInfo(meta);
        // ARLogger.init(MODNAME);
        ARConfiguration.init(event);
        Bedlock_Flying = ARGetAnother("BedrockArmorFlying", false);

        craftingDifficulty = ARGetCfgOther("Difficulty", 0);
        if ((craftingDifficulty < 0) && (4 < craftingDifficulty)) {
            craftingDifficulty = 0;
        }
        ARItemRegister();
    }

    @Mod.EventHandler
    public void load(FMLInitializationEvent event) {
        addchestgenhooks = new ARAddChestGenHooks();
        addchestgenhooks.AddChestItems();

        Side side = event.getSide();

        MinecraftForge.EVENT_BUS.register(new ARNoFallDamageEventHooksServer());
        // MinecraftForge.EVENT_BUS.register(new AngelusArmorLivingEventHooks());
        // MinecraftForge.EVENT_BUS.register(new BedrockArmorLivingEventHooks());
        MinecraftForge.EVENT_BUS.register(new CharmOfGuardianEventHooks());
        // MinecraftForge.EVENT_BUS.register(new K2ArmorLivingEventHooks());
        MinecraftForge.EVENT_BUS.register(new InsaneArmorBaseLivingEventHooks());
        MinecraftForge.EVENT_BUS.register(new ReplaceBlock());
        MinecraftForge.EVENT_BUS.register(new MobExlieEventHooks());

        switch (side) {
            case CLIENT:
                MinecraftForge.EVENT_BUS.register(new ARFlyingEventHooks());
                // MinecraftForge.EVENT_BUS.register(new CirceForceEventHooks());
                // MinecraftForge.EVENT_BUS.register(new TearOfCorpelEventHooks());
                // MinecraftForge.EVENT_BUS.register(new
                // ARNoFallDamageEventHooks());
                // MinecraftForge.EVENT_BUS.register(new WeaponsEventHooks());
                break;
            case SERVER:
                break;
        }

        if (ARGetAnother("EndPortal", true)) {
            Blocks.end_portal_frame.setHardness(60F);
        }
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        ClassHelper.healthInspection();
        ClassHelper.endermanInspection();

        recipehandler = new RecipeHandler();
        recipehandler.oredic();
        recipehandler.init();

        ARConfiguration.postinit(event);

        if (ARGetAnother("Enderman", true)) {
            for (Block keyblock : ClassHelper.endermanCarriable().keySet()) {
                if (ClassHelper.endermanCarriable().get(keyblock) == true
                        && ARGetAnother("Enderman:" + keyblock.getUnlocalizedName(), false) == false) {
                    EntityEnderman.setCarriable(keyblock, false);
                }
            }
        }
    }

    public static boolean equipArmor(Item armor, EntityPlayer player, int armorType) {
        switch (armorType) {
            case ARMOR_HELMET: {
                return player.inventory.armorItemInSlot(3) != null
                        && player.inventory.armorItemInSlot(3).getItem() == armor;
            }
            case ARMOR_PLATE: {
                return player.inventory.armorItemInSlot(2) != null
                        && player.inventory.armorItemInSlot(2).getItem() == armor;
            }
            case ARMOR_LEGS: {
                return player.inventory.armorItemInSlot(1) != null
                        && player.inventory.armorItemInSlot(1).getItem() == armor;
            }
            case ARMOR_BOOTS: {
                return player.inventory.armorItemInSlot(0) != null
                        && player.inventory.armorItemInSlot(0).getItem() == armor;
            }
        }
        return false;
    }

    public static boolean equipInsaneFullArmor(EntityPlayer player, InsaneArmorBase.ADRArmorTypes armortype) {
        InsaneArmorBase iabHelmet = getEquippingInsaneArmor(player, ARMOR_HELMET);
        InsaneArmorBase iabPlate = getEquippingInsaneArmor(player, ARMOR_PLATE);
        InsaneArmorBase iabLegs = getEquippingInsaneArmor(player, ARMOR_LEGS);
        InsaneArmorBase iabBoots = getEquippingInsaneArmor(player, ARMOR_BOOTS);

        return iabHelmet != null && iabHelmet.getADRArmorType() == armortype &&
                iabPlate != null && iabPlate.getADRArmorType() == armortype &&
                iabLegs != null && iabLegs.getADRArmorType() == armortype &&
                iabBoots != null && iabBoots.getADRArmorType() == armortype;
    }

    public static boolean equipInsaneAnyArmor(EntityPlayer player, InsaneArmorBase.ADRArmorTypes armortype) {
        InsaneArmorBase iabHelmet = getEquippingInsaneArmor(player, ARMOR_HELMET);
        InsaneArmorBase iabPlate = getEquippingInsaneArmor(player, ARMOR_PLATE);
        InsaneArmorBase iabLegs = getEquippingInsaneArmor(player, ARMOR_LEGS);
        InsaneArmorBase iabBoots = getEquippingInsaneArmor(player, ARMOR_BOOTS);

        return (iabHelmet != null && iabHelmet.getADRArmorType() == armortype) ||
                (iabPlate != null && iabPlate.getADRArmorType() == armortype) ||
                (iabLegs != null && iabLegs.getADRArmorType() == armortype) ||
                (iabBoots != null && iabBoots.getADRArmorType() == armortype);
    }

    public static boolean equipInsaneArmor(EntityPlayer player, int armorType) {
        switch (armorType) {
            case ARMOR_HELMET: {
                return player.inventory.armorItemInSlot(3) != null
                        && player.inventory.armorItemInSlot(3).getItem() instanceof InsaneArmorBase;
            }
            case ARMOR_PLATE: {
                return player.inventory.armorItemInSlot(2) != null
                        && player.inventory.armorItemInSlot(2).getItem() instanceof InsaneArmorBase;
            }
            case ARMOR_LEGS: {
                return player.inventory.armorItemInSlot(1) != null
                        && player.inventory.armorItemInSlot(1).getItem() instanceof InsaneArmorBase;
            }
            case ARMOR_BOOTS: {
                return player.inventory.armorItemInSlot(0) != null
                        && player.inventory.armorItemInSlot(0).getItem() instanceof InsaneArmorBase;
            }
        }
        return false;
    }

    public static InsaneArmorBase getEquippingInsaneArmor(EntityPlayer player, int armorType) {
        switch (armorType) {
            case ARMOR_HELMET: {
                return (InsaneArmorBase) (player.inventory.armorItemInSlot(3) != null
                        && player.inventory.armorItemInSlot(3).getItem() instanceof InsaneArmorBase
                                ? player.inventory.armorItemInSlot(3).getItem()
                                : null);
            }
            case ARMOR_PLATE: {
                return (InsaneArmorBase) (player.inventory.armorItemInSlot(2) != null
                        && player.inventory.armorItemInSlot(2).getItem() instanceof InsaneArmorBase
                                ? player.inventory.armorItemInSlot(2).getItem()
                                : null);
            }
            case ARMOR_LEGS: {
                return (InsaneArmorBase) (player.inventory.armorItemInSlot(1) != null
                        && player.inventory.armorItemInSlot(1).getItem() instanceof InsaneArmorBase
                                ? player.inventory.armorItemInSlot(1).getItem()
                                : null);
            }
            case ARMOR_BOOTS: {
                return (InsaneArmorBase) (player.inventory.armorItemInSlot(0) != null
                        && player.inventory.armorItemInSlot(0).getItem() instanceof InsaneArmorBase
                                ? player.inventory.armorItemInSlot(0).getItem()
                                : null);
            }
        }
        return null;
    }

    public static boolean equipArmor(Item par1Head, Item par2Plate, Item par3Leg, Item par4Boots, EntityPlayer player) {
        if (player.inventory.armorItemInSlot(3) != null && player.inventory.armorItemInSlot(3).getItem() == par1Head) {
            if (player.inventory.armorItemInSlot(2) != null
                    && player.inventory.armorItemInSlot(2).getItem() == par2Plate) {
                if (player.inventory.armorItemInSlot(1) != null
                        && player.inventory.armorItemInSlot(1).getItem() == par3Leg) {
                    if (player.inventory.armorItemInSlot(0) != null
                            && player.inventory.armorItemInSlot(0).getItem() == par4Boots) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean equipArmor(Item par1Head, Item par2Plate, Item par3Leg, Item par4Boots,
            EntityPlayer par5Player, boolean par6Mode) {
        if ((par5Player.inventory.armorItemInSlot(3) != null
                && par5Player.inventory.armorItemInSlot(3).getItem() == par1Head)) {
            return true;
        } else if ((par5Player.inventory.armorItemInSlot(2) != null
                && par5Player.inventory.armorItemInSlot(2).getItem() == par2Plate)) {
            return true;
        } else if ((par5Player.inventory.armorItemInSlot(1) != null
                && par5Player.inventory.armorItemInSlot(1).getItem() == par3Leg)) {
            return true;
        } else if ((par5Player.inventory.armorItemInSlot(0) != null
                && par5Player.inventory.armorItemInSlot(0).getItem() == par4Boots)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean hasBaubles(Item par1Item, EntityPlayer player) {
        if (Loader.isModLoaded("Baubles")) {
            IInventory baubles = BaublesApi.getBaubles(player);
            boolean bauble = false;
            if (baubles != null) {
                for (int i = 0; i < baubles.getSizeInventory(); i++) {
                    ItemStack itemstack = baubles.getStackInSlot(i);
                    if (itemstack != null) {
                        if (par1Item == baubles.getStackInSlot(i).getItem()) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static boolean hasItem(Item item, EntityPlayer player) {
        return player.inventory.hasItem(item);
    }

    public static boolean searchItem(Item item, EntityPlayer player) {
        return hasBaubles(item, player) || hasItem(item, player);
    }
}
