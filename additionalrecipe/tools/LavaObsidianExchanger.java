package chibivaru.additionalrecipe.tools;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class LavaObsidianExchanger extends Item
{
    public LavaObsidianExchanger()
    {
        super();
        setMaxStackSize(1);
    }
    
    @Override
    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
        par3EntityPlayer.swingItem();
        int posx = (int) par3EntityPlayer.posX;
        int posy = (int) par3EntityPlayer.posY;
        int posz = (int) par3EntityPlayer.posZ;
        
        for(int i = -32; i <= 32; i++)
        {
            for(int l = 0; l <= 128; l++)
            {
                for(int j = -32; j <= 32; j++)
                {
                    if (par2World.getBlock(posx + i, l, posz + j).getMaterial() == Material.lava)
                    {
                        if (par2World.getBlockMetadata(posx + i, l, posz + j) != 0) {
                            par2World.setBlockToAir(posx + i, l, posz + j);
                        } else if (l > 32){
                            par2World.setBlock(posx + i, l, posz + j, Blocks.obsidian);
                        }
                    }
                }
            }
        }
        
        return par1ItemStack;
    }
    
    //1.5.2のテクスチャ指定
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister par1IconRegister)
    {
        this.itemIcon = Items.redstone.getIconFromDamage(0);
    }
    @SideOnly(Side.CLIENT)
    public boolean hasEffect(ItemStack par1ItemStack)
    {
        return true;
    }
}
