package chibivaru.additionalrecipe.armor;

import chibivaru.additionalrecipe.AdditionalRecipe;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class AngelusArmor extends ItemArmor
{
    private String texturePath = AdditionalRecipe.MODID + ":" + "textures/armor/";

    public AngelusArmor(ArmorMaterial par2EnumArmorMaterial, int par3, int par4, String type)
    {
        super(par2EnumArmorMaterial, par3, par4);
        this.setTextureName(type, par4);
        this.setTextureName("additionalrecipe:" + this.getUnlocalizedName());
        super.setMaxStackSize(1);
        setMaxDamage(0);
    }

    @Override
    public String getArmorTexture(ItemStack itemStack, Entity entity, int slot, String type)
    {
        if (this.armorType == 2)
        {
            return "additionalrecipe:textures/armor/angelus_2.png";
        }
        return "additionalrecipe:textures/armor/angelus_1.png";
    }

    private void setTextureName(String type, int armorPart)
    {
        // head,body,boots
        if (armorType == 0 || armorType == 1 || armorType == 3)
        {
            this.texturePath += type + "_1.png";
        }
        // legs
        else
        {
            this.texturePath += type + "_2.png";
        }
    }

    @SideOnly(Side.CLIENT)
    public void registerIcon(IIconRegister register)
    {
        this.itemIcon = register.registerIcon("additionalrecipe:" + this.getUnlocalizedName());
    }

    public String getArmorTexture(ItemStack stack, Entity entity, int slot, int layer)
    {
        return this.texturePath;
    }

    public boolean hasEffect(ItemStack par1ItemStack)
    {
        return true;
    }
}
