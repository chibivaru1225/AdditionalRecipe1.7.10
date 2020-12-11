package chibivaru.additionalrecipe.armor;

import chibivaru.additionalrecipe.AdditionalRecipe;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public abstract class InsaneArmorBase extends ItemArmor
{
    private String texturePath = AdditionalRecipe.MODID + ":" + "textures/armor/";
    private ADRArmorTypes armortype;
    
    public InsaneArmorBase(ArmorMaterial par1EnumArmorMaterial, int par2, int par3, String par4type, ADRArmorTypes par5type)
    {
        super(par1EnumArmorMaterial, par2, par3);
        this.setTextureName(par4type,par3);
        this.setTextureName("additionalrecipe:" + this.getUnlocalizedName());
        this.armortype = par5type;
        super.setMaxStackSize(1);
        setMaxDamage(0);
    }

    @Override
    public String getArmorTexture(ItemStack itemStack, Entity entity, int slot, String type)
    {
        if (this.armorType == 2)
        {
            return "additionalrecipe:textures/armor/" + getADRArmorStrings() + "_2.png";
        }
        return "additionalrecipe:textures/armor/" + getADRArmorStrings() + "_1.png";
    }
    
    private void setTextureName(String type, int armorPart)
    {
        //head,body,boots
        if(armorType == 0 || armorType == 1 || armorType == 3)
        {
            this.texturePath += type + "_1.png";
        }
        //legs
        else
        {
            this.texturePath += type + "_2.png";
        }
    }
    
    @SideOnly(Side.CLIENT)
    public void registerIcon(IIconRegister register)
    {
        this.itemIcon = register.registerIcon(AdditionalRecipe.MODID + ":" + this.getUnlocalizedName());
    }
    
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, int layer)
    {
        return this.texturePath;
    }
    
    public boolean hasEffect(ItemStack par1ItemStack)
    {
        return true;
    }
    
    //水中呼吸
    public abstract boolean getRespiration();
    
    //落下ダメージ無効
    public abstract boolean getFeatherFalling();
    
    //満腹度自動回復
    public abstract boolean getFoodMeal();
    
    //自動消火
    public abstract boolean getAutoFireExtinguishing();
    
    //自動エスナ
    public abstract boolean getAutoEsuna();
    
    //永久リジェネ
    public abstract boolean getEternalRegeneration();
    
    //覇王色の覇気
    public abstract boolean getSovereignHAKI();
    
    //グラビティ機能
    public abstract boolean getGravityFunction();
    
    //ドロップ増加
    public abstract boolean getLooting();
    
    //無敵時間無視
    public abstract boolean getIgnoreInvincibleTime();
    
    //無敵
    public abstract boolean getPlayerInvincible();
    
    //ダメージ反射
    public abstract boolean getDamageReflection();
    
    //クリエイティブ飛行
    public abstract boolean getFlying();
    
    //死亡しない
    public abstract boolean getDeathCancel();
    
    private String getADRArmorStrings()
    {
        switch(this.armortype)
        {
            case Bedrock: return "bedrock";
            case Angelus: return "angelus";
            case K2: return "k2";
            case Shion: return "shion";
            default: return "";
        }
    }
    
    public ADRArmorTypes getADRArmorType()
    {
        return this.armortype;
    }
    
    public enum ADRArmorTypes
    {
        Bedrock,
        Angelus,
        K2,
        Shion,
    }
}
