package chibivaru.additionalrecipe.event;

import static chibivaru.additionalrecipe.common.ARConfiguration.*;
import static chibivaru.additionalrecipe.common.ARItemHandler.*;

import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;

public class ARAddChestGenHooks
{
    ChestGenHooks mineshaft  = ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR);
    ChestGenHooks stronghold = ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING);
    ChestGenHooks pyramid    = ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST);
    ChestGenHooks dungeon    = ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST);
    ChestGenHooks bonus      = ChestGenHooks.getInfo(ChestGenHooks.BONUS_CHEST);

    public void AddChestItems()
    {
        // WeightRandomChestContent(ItemStack,MaxValue,MinValue,Rarity)

        if (ARGetAnother("Mineshaft", true))
        {
            // mineshaft
            mineshaft.addItem(new WeightedRandomChestContent(new ItemStack(ARGetItemRegister("exchangeiginiton")), 1, 1, 1));
            mineshaft.addItem(new WeightedRandomChestContent(new ItemStack(ARGetItemRegister("cheaperexchangeiginiton")), 1, 1, 10));
            mineshaft.addItem(new WeightedRandomChestContent(new ItemStack(ARGetItemRegister("ironmortar")), 1, 1, 50));
        }

        if (ARGetAnother("Stronghold", true))
        {
            // stronghold
            stronghold.addItem(new WeightedRandomChestContent(new ItemStack(ARGetItemRegister("exchangeiginiton")), 1, 1, 1));
            stronghold.addItem(new WeightedRandomChestContent(new ItemStack(ARGetItemRegister("cheaperexchangeiginiton")), 1, 1, 10));
            stronghold.addItem(new WeightedRandomChestContent(new ItemStack(ARGetItemRegister("diamondmortar")), 1, 1, 50));
        }

        if (ARGetAnother("Pyramid", true))
        {
            // pyramid
            pyramid.addItem(new WeightedRandomChestContent(new ItemStack(ARGetItemRegister("exchangeiginiton")), 1, 1, 1));
            pyramid.addItem(new WeightedRandomChestContent(new ItemStack(ARGetItemRegister("cheaperexchangeiginiton")), 1, 1, 10));
            pyramid.addItem(new WeightedRandomChestContent(new ItemStack(ARGetItemRegister("diamondmortar")), 1, 1, 50));
        }

        if (ARGetAnother("Dungeon", true))
        {
            // dungeon
            dungeon.addItem(new WeightedRandomChestContent(new ItemStack(ARGetItemRegister("exchangeiginiton")), 1, 1, 1));
            dungeon.addItem(new WeightedRandomChestContent(new ItemStack(ARGetItemRegister("cheaperexchangeiginiton")), 1, 1, 10));
            dungeon.addItem(new WeightedRandomChestContent(new ItemStack(ARGetItemRegister("ironmortar")), 1, 1, 50));
        }

        if (ARGetAnother("Bonus", true))
        {
            // bonus
            dungeon.addItem(new WeightedRandomChestContent(new ItemStack(ARGetItemRegister("ironmortar")), 1, 1, 100));
        }
    }
}
