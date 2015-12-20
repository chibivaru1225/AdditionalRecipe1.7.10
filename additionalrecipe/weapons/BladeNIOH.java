package chibivaru.additionalrecipe.weapons;

import static chibivaru.additionalrecipe.common.ARConfiguration.*;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemSword;
import chibivaru.additionalrecipe.AdditionalRecipe;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BladeNIOH extends ItemSword
{
	private int weaponDamage;
	private ToolMaterial toolMaterial;
	public BladeNIOH(ToolMaterial par2ToolMaterial) {
		super(par2ToolMaterial);
		this.toolMaterial = par2ToolMaterial;
		this.setMaxStackSize(1);
		this.weaponDamage = (int) par2ToolMaterial.getDamageVsEntity();
		this.setTextureName("additionalrecipe:" + this.getUnlocalizedName());
		if(ARGetAnother("NIOHPreventDamage",true))
		{
			this.setMaxDamage(0);
		}
		else
		{
			this.setMaxDamage(ARGetCfgOther("NIOH",4));
		}
	}
	@SideOnly(Side.CLIENT)
	public void registerIcon(IIconRegister register)
	{
		this.itemIcon = register.registerIcon(AdditionalRecipe.MODID + ":" + this.getUnlocalizedName());
	}
}
