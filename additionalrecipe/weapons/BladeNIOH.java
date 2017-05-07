package chibivaru.additionalrecipe.weapons;

import static chibivaru.additionalrecipe.common.ARConfiguration.*;

import chibivaru.additionalrecipe.AdditionalRecipe;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemSword;

public class BladeNIOH extends ItemSword
{
	private int weaponDamage;
	private ToolMaterial toolMaterial;
	public BladeNIOH(ToolMaterial par2ToolMaterial) {
		super(par2ToolMaterial);
		toolMaterial = par2ToolMaterial;
		setMaxStackSize(1);
		weaponDamage = (int) par2ToolMaterial.getDamageVsEntity();
		setTextureName("additionalrecipe:" + getUnlocalizedName());
		setMaxDamage(ARGetAnother("NIOHPreventDamage",true) ? 0 : ARGetCfgOther("NIOH",4));
	}
	@SideOnly(Side.CLIENT)
	public void registerIcon(IIconRegister register)
	{
		this.itemIcon = register.registerIcon(AdditionalRecipe.MODID + ":nioh");
	}
}
