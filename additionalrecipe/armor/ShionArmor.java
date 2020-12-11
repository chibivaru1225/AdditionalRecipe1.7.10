package chibivaru.additionalrecipe.armor;

public class ShionArmor extends InsaneArmorBase
{
    public ShionArmor(ArmorMaterial par2EnumArmorMaterial, int par3, int par4, String type)
    {
        super(par2EnumArmorMaterial, par3, par4, type, ADRArmorTypes.Shion);
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
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public boolean getDeathCancel()
    {
        // TODO Auto-generated method stub
        return true;
    }
}
