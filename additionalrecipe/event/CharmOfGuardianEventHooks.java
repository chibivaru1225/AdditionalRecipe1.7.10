package chibivaru.additionalrecipe.event;

import static chibivaru.additionalrecipe.AdditionalRecipe.*;
import static chibivaru.additionalrecipe.common.ARItemHandler.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import chibivaru.additionalrecipe.common.PotionHelper;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;

public class CharmOfGuardianEventHooks
{
	private char timer = 0;
	public boolean timer(boolean mode)
	{
		if(mode)
		{
			if(timer == 0)
			{
				timer++;
				return true;
			}
			else if(timer == 5)
			{
				timer = 0;
				return false;
			}
			else
			{
				timer++;
				return false;
			}
		}
		else
		{
			if(timer == 0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
	}
	private int getlevel(EntityPlayer player)
	{
		return player.experienceLevel;
	}
	private int getlevel(EntityPlayer player,boolean mode,int defaultlevel)
	{
		if((mode)&&(getlevel(player) > defaultlevel))
		{
			return defaultlevel;
		}
		else
		{
			return getlevel(player);
		}
	}
	@SubscribeEvent//(1.6までは@ForgeSubscribe)
	public void LivingUpdate(LivingUpdateEvent event)
	{
		EntityLivingBase livingBase = ((LivingEvent) (event)).entityLiving;
		if(livingBase != null && (livingBase instanceof EntityPlayer))
		{
			EntityPlayer player = (EntityPlayer) event.entityLiving;
			Guardian(player);
			timer(true);
		}
	}
	private void Guardian(EntityPlayer player)
	{
		boolean guardian = searchItem(ARGetItemRegister("charmofguardian"), player);
		if(guardian)
		{
			if(player.isInsideOfMaterial(Material.water))
			{
				player.setAir(300);
			}
			if(timer(false))
			{
				player.getFoodStats().addStats(1,0.5F);
			}
			for(int i = 0; i < Potion.potionTypes.length; i++)
			{
				if(Potion.potionTypes[i] != null && player.isPotionActive(i) && PotionHelper.badPotion(Potion.potionTypes[i]))
				{
					player.removePotionEffect(i);
				}
			}
			if(player.isBurning())
			{
				player.extinguish();
			}
			if(player.shouldHeal() && (((Entity) (player)).ticksExisted % 20) * 12 == 0)
			{
				((Entity) (player)).worldObj.playSoundAtEntity(player, "random.pop", 1.0F, 1.0F);
				player.heal(1.0F);
			}
			List list = player.worldObj.getEntitiesWithinAABBExcludingEntity(player, player.boundingBox.expand(getlevel(player,true,6) * getlevel(player,true,6), 1.5D, getlevel(player,true,6) * getlevel(player,true,6)));
			Entity entity = null;
			if(list != null && list.size() > 0)
			{
				for(int j1 = 0; j1 < list.size(); j1++)
				{
					entity = (Entity)list.get(j1);
					if(!(entity instanceof EntityLiving) || !(entity instanceof IMob))
					{
						continue;
					}
					EntityLiving target = (EntityLiving)entity;
					target.addPotionEffect(new PotionEffect(Potion.weakness.id, 20, 1));
					target.addPotionEffect(new PotionEffect(Potion.confusion.id, 20, 9));
					target.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 20, 9));
				}
			}
		}
	}
	@SubscribeEvent
	public void onAttackedEntityEvent(AttackEntityEvent event)
	{
		EntityPlayer player = ((PlayerEvent)(event)).entityPlayer;
		Entity entity       = event.target;
		boolean guardian = searchItem(ARGetItemRegister("charmofguardian"), player);
		if(guardian && (entity instanceof EntityLivingBase))
		{
			EntityLivingBase target = (EntityLivingBase)entity;
			target.hurtResistantTime = 0;
		}
	}
	@SubscribeEvent
	public void onDropEvent(LivingDropsEvent event)
	{
		EntityLivingBase LivingBase = ((LivingEvent) (event)).entityLiving;
		Entity entity               = event.source.getEntity();
		World world                 = ((Entity) (((LivingEvent) (event)).entityLiving)).worldObj;
		if(LivingBase instanceof EntityLiving)
		{
			EntityLiving target = (EntityLiving)LivingBase;
			if(entity instanceof EntityPlayer)
			{
				EntityPlayer player = (EntityPlayer)entity;
				boolean guardian = searchItem(ARGetItemRegister("charmofguardian"), player);
				if(guardian)
				{
					Iterator i$ = event.drops.iterator();
					do
					{
						if(!i$.hasNext())
						{
							break;
						}
						EntityItem input = (EntityItem)i$.next();
						ItemStack resultStack = input.getEntityItem();
						if(1 < resultStack.stackSize)
						{
							EntityItem dropItem = new EntityItem(world, ((Entity) (target)).posX, ((Entity) (target)).posY, ((Entity) (target)).posZ, new ItemStack(resultStack.getItem(), resultStack.stackSize * getlevel(player,true,8) * getlevel(player,true,8), resultStack.getItemDamage()));
							if(!world.isRemote)
							{
								world.spawnEntityInWorld(dropItem);
							}
						}
					}
					while(true);
					if(!world.isRemote)
					{
						world.spawnEntityInWorld(new EntityXPOrb(world, ((Entity) (target)).posX, ((Entity) (target)).posY, ((Entity) (target)).posZ, player.experienceLevel * player.experienceLevel));
					}
					world.playSoundAtEntity(target, "random.pop", 0.5F, 1.0F);
				}
			}
		}
	}
	/*
	@SubscribeEvent
	public void onAttackedEvent(LivingAttackEvent event)
	{
		EntityLivingBase livingBase = ((LivingEvent) (event)).entityLiving;
		DamageSource source         = event.source;
		if(livingBase instanceof EntityPlayer)
		{
			EntityPlayer player = (EntityPlayer)livingBase;
			boolean guardian     = searchItem(ARGetItemRegister("charmofguardian"), player);
			if(guardian && source != DamageSource.starve)
			{
					event.setCanceled(true);
			}
		}
	}
	*/
	@SubscribeEvent
	public void onDeath(LivingDeathEvent event)
	{
		if(event.entityLiving instanceof EntityPlayer)
		{
			EntityPlayer player = (EntityPlayer)event.entityLiving;
			if(searchItem(ARGetItemRegister("charmofguardian"),player))
			{
				event.setCanceled(true);
				player.setHealth(player.getMaxHealth());
			}
		}
	}
	@SubscribeEvent
	public void onLivingHurt(LivingHurtEvent event)
	{
		EntityLivingBase livingBase = ((LivingEvent) (event)).entityLiving;
		DamageSource source         = event.source;
		if(livingBase instanceof EntityPlayer)
		{
			EntityPlayer player = (EntityPlayer)livingBase;
			boolean guardian     = searchItem(ARGetItemRegister("charmofguardian"), player);
			if(guardian && source != DamageSource.starve)
			{
				event.ammount = 0;
			}
		}
	}
	@SubscribeEvent
	public void onCounterEvent(LivingAttackEvent event)
	{
		EntityLivingBase livingBase = ((LivingEvent) (event)).entityLiving;
		DamageSource source = event.source;
		float damageAmount = event.ammount;
		World world = ((Entity) (livingBase)).worldObj;
		if(livingBase instanceof EntityPlayer)
		{
			EntityPlayer player = (EntityPlayer)livingBase;
			boolean guardian     = searchItem(ARGetItemRegister("charmofguardian"), player);
			if(guardian && source != DamageSource.starve)
			{
					event.setCanceled(true);
			}
			if(guardian && (source.getEntity() instanceof EntityLivingBase))
			{
				float reflectDamage = damageAmount * damageAmount;
				double width = getlevel(player,true,6) * getlevel(player,true,6);
				if(player == source.getEntity())
				{
					return;
				}
				source.getEntity().attackEntityFrom(DamageSource.causeMobDamage(player), reflectDamage);
				List list = source.getEntity().worldObj.getEntitiesWithinAABBExcludingEntity(source.getEntity(), source.getEntity().boundingBox.expand(width, width, width));
				ArrayList arraylist = new ArrayList();
				Iterator iterator = list.iterator();
				do
				{
					if(!iterator.hasNext())
					{
						break;
					}
					Entity entity = (Entity)iterator.next();
					if(entity instanceof EntityMob)
					{
						arraylist.add((EntityMob)entity);
					}
				}
				while(true);
				if(arraylist.size() < 2)
				{
					return;
				}
				for(int i = 0; i < arraylist.size(); i++)
				{
					EntityMob mob = (EntityMob)arraylist.get(i);
					EntityMob otherMob = (EntityMob)arraylist.get(i == 0 ? arraylist.size() - 1 : i - 1);
					mob.attackEntityFrom(DamageSource.causeMobDamage(otherMob), reflectDamage);
					otherMob.setTarget(mob);
				}
				world.playSoundAtEntity(player, "random.anvil_land", 1.0F, 1.0F);
			}
		}
	}
}
