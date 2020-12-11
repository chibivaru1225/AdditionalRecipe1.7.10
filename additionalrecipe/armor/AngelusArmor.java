package chibivaru.additionalrecipe.armor;

public class AngelusArmor extends InsaneArmorBase
{
    public AngelusArmor(ArmorMaterial par1EnumArmorMaterial, int par2, int par3, String par4type)
    {
        super(par1EnumArmorMaterial, par2, par3, par4type, ADRArmorTypes.Angelus);
    }

    @Override
    public boolean getRespiration()
    {
        return true;
    }

    @Override
    public boolean getFeatherFalling()
    {
        return true;
    }

    @Override
    public boolean getFoodMeal()
    {
        return true;
    }

    @Override
    public boolean getAutoFireExtinguishing()
    {
        return true;
    }

    @Override
    public boolean getAutoEsuna()
    {
        return true;
    }

    @Override
    public boolean getEternalRegeneration()
    {
        return true;
    }

    @Override
    public boolean getSovereignHAKI()
    {
        return true;
    }

    @Override
    public boolean getGravityFunction()
    {
        return true;
    }

    @Override
    public boolean getLooting()
    {
        return true;
    }

    @Override
    public boolean getIgnoreInvincibleTime()
    {
        return true;
    }

    @Override
    public boolean getPlayerInvincible()
    {
        return true;
    }

    @Override
    public boolean getDamageReflection()
    {
        return true;
    }

    @Override
    public boolean getFlying()
    {
        return true;
    }

    @Override
    public boolean getDeathCancel()
    {
        // TODO Auto-generated method stub
        return true;
    }
}
//{
//    private String texturePath = AdditionalRecipe.MODID + ":" + "textures/armor/";
//
//    public AngelusArmor(ArmorMaterial par2EnumArmorMaterial, int par3, int par4, String type)
//    {
//        super(par2EnumArmorMaterial, par3, par4);
//        this.setTextureName(type, par4);
//        this.setTextureName("additionalrecipe:" + this.getUnlocalizedName());
//        super.setMaxStackSize(1);
//        setMaxDamage(0);
//    }
//
//    @Override
//    public String getArmorTexture(ItemStack itemStack, Entity entity, int slot, String type)
//    {
//        if (this.armorType == 2)
//        {
//            return "additionalrecipe:textures/armor/angelus_2.png";
//        }
//        return "additionalrecipe:textures/armor/angelus_1.png";
//    }
//
//    private void setTextureName(String type, int armorPart)
//    {
//        // head,body,boots
//        if (armorType == 0 || armorType == 1 || armorType == 3)
//        {
//            this.texturePath += type + "_1.png";
//        }
//        // legs
//        else
//        {
//            this.texturePath += type + "_2.png";
//        }
//    }
//
//    @SideOnly(Side.CLIENT)
//    public void registerIcon(IIconRegister register)
//    {
//        this.itemIcon = register.registerIcon("additionalrecipe:" + this.getUnlocalizedName());
//    }
//
//    public String getArmorTexture(ItemStack stack, Entity entity, int slot, int layer)
//    {
//        return this.texturePath;
//    }
//
//    public boolean hasEffect(ItemStack par1ItemStack)
//    {
//        return true;
//    }
//}
