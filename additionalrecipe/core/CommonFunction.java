package chibivaru.additionalrecipe.core;

import net.minecraft.item.Item;
import chibivaru.additionalrecipe.AdditionalRecipe;
import cpw.mods.fml.common.registry.GameRegistry;

public class CommonFunction
{
	public boolean itemRegister(Item par1Item,String par2String)
	{
		if(par1Item != null && par2String != null)
		{
			GameRegistry.registerItem(par1Item, par2String);
			AdditionalRecipe.ARItems.put(par2String, par1Item);
			return true;
		}
		else
		{
			return false;
		}
	}
}
