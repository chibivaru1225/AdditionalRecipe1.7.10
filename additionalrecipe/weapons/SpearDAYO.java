package chibivaru.additionalrecipe.weapons;

import java.util.List;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.EnumChatFormatting;
import chibivaru.additionalrecipe.AdditionalRecipe;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class SpearDAYO  extends ItemSword
{
	private int weaponDamage;
	private ToolMaterial toolMaterial;
    private boolean effect;
	public SpearDAYO(ToolMaterial par2EnumToolMaterial) {
		super(par2EnumToolMaterial);
		this.toolMaterial = par2EnumToolMaterial;
		this.setMaxStackSize(1);
		this.weaponDamage = (int) par2EnumToolMaterial.getDamageVsEntity();
		this.setMaxDamage(0);
	}
	@SideOnly(Side.CLIENT)
	public void registerIcon(IIconRegister register)
	{
		this.itemIcon = register.registerIcon(AdditionalRecipe.MODID + ":" + this.getUnlocalizedName());
	}
	@Override
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
	{
		par3List.add((new StringBuilder()).append(EnumChatFormatting.DARK_PURPLE).append("Spear Curse ").append(EnumChatFormatting.RED).append("V").toString());
	}
    @SideOnly(Side.CLIENT)
    public boolean hasEffect(ItemStack par1ItemStack)
    {
        return !this.effect;
    }
}