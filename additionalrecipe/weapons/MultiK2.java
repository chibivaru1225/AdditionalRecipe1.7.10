package chibivaru.additionalrecipe.weapons;

import static chibivaru.additionalrecipe.common.ARItemHandler.*;

import java.util.List;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import chibivaru.additionalrecipe.AdditionalRecipe;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class MultiK2 extends ItemSword
{
	private float weaponDamage = 10.0f;
    private boolean effect;
    public int mode;
    private ToolMaterial toolMaterial;
    private IIcon[] icons = new IIcon[3];
    private String[] str = {"Great Sword","Long Sword","Wand"};
    private float[] dmg = {toolMaterial.EMERALD.getDamageVsEntity() * 4.0f,toolMaterial.IRON.getDamageVsEntity() * 2.0f,toolMaterial.WOOD.getDamageVsEntity()};
    public MultiK2(ToolMaterial par2toolMaterial)
	{
		super(par2toolMaterial);
		this.setMaxStackSize(1);
		this.setMaxDamage(0);
		this.setTextureName("additionalrecipe:K2GS");
		this.mode = 0;//0 = Great Sword,1 = Long Sword,2 = Wand
	}
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister register)
	{
		super.registerIcons(register);
		icons[0] = register.registerIcon(AdditionalRecipe.MODID + ":K2GS");
		icons[1] = register.registerIcon(AdditionalRecipe.MODID + ":K2LS");
		icons[2] = register.registerIcon(AdditionalRecipe.MODID + ":K2WA");
	}
	@Override
	public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer entityPlayer)
	{
		NBTTagCompound nbttagcompound = itemStack.getTagCompound();
		int mk2;
		if(nbttagcompound == null)
		{
			System.out.println();
			nbttagcompound = new NBTTagCompound();
			itemStack.setTagCompound(nbttagcompound);
			mk2 = 0;
		}
		else
		{
			mk2 = nbttagcompound.getInteger("adr.mk2");
		}
		mk2 = mk2 + 1;
		if(mk2 > 2)
		{
			mk2 = 0;
		}
		this.weaponDamage = dmg[mk2];
		nbttagcompound.setInteger("adr.mk2",mk2);
		if(!world.isRemote)
		{
			entityPlayer.addChatMessage(new ChatComponentTranslation(new StringBuilder().append(EnumChatFormatting.LIGHT_PURPLE).append("K2's Multi-Weapon : ").append(EnumChatFormatting.RED).append("Mode ").append(EnumChatFormatting.BLUE).append(str[mk2]).toString()));
		}
		entityPlayer.swingItem();
		entityPlayer.worldObj.playSoundAtEntity(entityPlayer, "random.orb", 0.2F, 0.6F);
		return itemStack;
	}
	@Override
	public boolean onLeftClickEntity(ItemStack itemStack, EntityPlayer player, Entity entity)
	{
		NBTTagCompound nbttagcompound = itemStack.getTagCompound();
		int mk2;
		if(nbttagcompound == null)
		{
			nbttagcompound = new NBTTagCompound();
			itemStack.setTagCompound(nbttagcompound);
			mk2 = 0;
		}
		else
		{
			mk2 = nbttagcompound.getInteger("adr.mk2");
		}
		if(mk2 == 1)
		{
			entity.hurtResistantTime = 0;
		}
		return entity.attackEntityFrom(DamageSource.causePlayerDamage(player),4.0F + dmg[mk2]);
	}
	@Override
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
	{
		NBTTagCompound nbttagcompound = par1ItemStack.getTagCompound();
		int mk2;
		if(nbttagcompound == null)
		{
			nbttagcompound = new NBTTagCompound();
			par1ItemStack.setTagCompound(nbttagcompound);
			mk2 = 0;
		}
		else
		{
			mk2 = nbttagcompound.getInteger("adr.mk2");
		}
		par3List.add((new StringBuilder()).append(EnumChatFormatting.YELLOW).append("Mode ").append(EnumChatFormatting.LIGHT_PURPLE).append(str[mk2]).toString());
		par3List.add((new StringBuilder()).append(EnumChatFormatting.BLUE).append((int)dmg[mk2] + 4).append(EnumChatFormatting.RED).append(" Attack Power").toString());
	}
	@Override
	public void onUpdate(ItemStack stack, World world, Entity entity, int slot, boolean held)
	{
		if(entity instanceof EntityPlayer)
		{
			EntityPlayer player = (EntityPlayer)entity;
			if(player.inventory.hasItem(ARGetItemRegister("toolk2")))
			{
				NBTTagCompound nbttagcompound = stack.getTagCompound();
				int mk2;
				if(nbttagcompound == null)
				{
					nbttagcompound = new NBTTagCompound();
					stack.setTagCompound(nbttagcompound);
					mk2 = 0;
				}
				else
				{
					mk2 = nbttagcompound.getInteger("adr.mk2");
				}
				switch(mk2)
				{
					case 0:
					{
						if(!player.isPotionActive(Potion.moveSlowdown.id))
						{
							player.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id,20*2,1));
						}
						if(!player.isPotionActive(Potion.digSlowdown.id))
						{
							player.addPotionEffect(new PotionEffect(Potion.digSlowdown.id,20*2,1));
						}
						break;
					}
					case 1:
					{
						if(!player.isPotionActive(Potion.moveSpeed.id))
						{
							player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id,20*2,1));
						}
						break;
					}
					case 2:
					{
						if(player.shouldHeal())
						{
							player.heal(1.0f);
						}
						break;
					}
				}
			}
		}
	}
	@Override
	public IIcon getIconIndex(ItemStack itemStack)
	{
		if(itemStack.hasTagCompound())
		{
			NBTTagCompound nbttagcompound = itemStack.getTagCompound();
			int mk2 = nbttagcompound.getInteger("adr.mk2");
			return this.icons[mk2];
		}
		else
		{
			return this.icons[0];
		}
	}
	@Override
	public IIcon getIcon(ItemStack itemStack, int pass)
	{
		if(itemStack.hasTagCompound())
		{
			NBTTagCompound nbttagcompound = itemStack.getTagCompound();
			int mk2 = nbttagcompound.getInteger("adr.mk2");
			return this.icons[mk2];
		}
		else
		{
			return this.icons[0];
		}
	}
	public IIcon[] getIcons()
	{
		return icons;
	}
}