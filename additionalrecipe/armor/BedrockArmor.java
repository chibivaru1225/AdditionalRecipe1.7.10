package chibivaru.additionalrecipe.armor;

import chibivaru.additionalrecipe.AdditionalRecipe;

public class BedrockArmor extends InsaneArmorBase
{
    public BedrockArmor(ArmorMaterial par1EnumArmorMaterial, int par2, int par3, String par4type)
    {
        super(par1EnumArmorMaterial, par2, par3, par4type, ADRArmorTypes.Bedrock);
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
        return false;
    }

    @Override
    public boolean getAutoFireExtinguishing()
    {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public boolean getAutoEsuna()
    {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public boolean getEternalRegeneration()
    {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean getSovereignHAKI()
    {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean getGravityFunction()
    {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean getLooting()
    {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean getIgnoreInvincibleTime()
    {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean getPlayerInvincible()
    {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean getDamageReflection()
    {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean getFlying()
    {
        return AdditionalRecipe.Bedlock_Flying;
    }

    @Override
    public boolean getDeathCancel()
    {
        // TODO Auto-generated method stub
        return false;
    }
}

//public class BedrockArmor extends ItemArmor
//{
//	private String texturePath = AdditionalRecipe.MODID + ":" + "textures/armor/";
//	
//	public BedrockArmor(ArmorMaterial par2EnumArmorMaterial, int par3, int par4,String type)
//	{
//		super(par2EnumArmorMaterial, par3, par4);
//		this.setTextureName(type,par4);
//		this.setTextureName("additionalrecipe:" + this.getUnlocalizedName());
//		super.setMaxStackSize(1);
//		setMaxDamage(0);
//	}
//
//	@Override
//	public String getArmorTexture(ItemStack itemStack, Entity entity, int slot, String type)
//	{
//		if (this.armorType == 2)
//		{
//			return "additionalrecipe:textures/armor/bedrock_2.png";
//		}
//		return "additionalrecipe:textures/armor/bedrock_1.png";
//	}
//	
//	private void setTextureName(String type,int armorPart)
//	{
//		//head,body,boots
//		if(armorType == 0 || armorType == 1 || armorType == 3)
//		{
//			this.texturePath += type + "_1.png";
//		}
//		//legs
//		else
//		{
//			this.texturePath += type + "_2.png";
//		}
//	}
//	
//	@SideOnly(Side.CLIENT)
//	public void registerIcon(IIconRegister register)
//	{
//		this.itemIcon = register.registerIcon(AdditionalRecipe.MODID + ":" + this.getUnlocalizedName());
//	}
//	
//	public String getArmorTexture(ItemStack stack, Entity entity, int slot, int layer)
//	{
//		return this.texturePath;
//	}
//	
//	public boolean hasEffect(ItemStack par1ItemStack)
//	{
//		return true;
//	}
//}