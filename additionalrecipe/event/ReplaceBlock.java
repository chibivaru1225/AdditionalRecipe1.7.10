package chibivaru.additionalrecipe.event;

import static chibivaru.additionalrecipe.common.ARConfiguration.*;

import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.init.Blocks;
import net.minecraft.world.ChunkCoordIntPair;
import net.minecraft.world.World;
import net.minecraft.world.chunk.Chunk;
import net.minecraftforge.event.terraingen.PopulateChunkEvent;
import net.minecraftforge.event.world.ChunkEvent;

public class ReplaceBlock
{
    @SubscribeEvent(priority = EventPriority.HIGHEST)
    public void onChunkLoad(ChunkEvent.Load event)
    {
        World world = event.world;

        if (world.isRemote)
        {
            return;
        }

        Chunk chunk = event.getChunk();
        long chunkSeed = ChunkCoordIntPair.chunkXZ2Int(chunk.xPosition, chunk.zPosition) ^ world.provider.dimensionId;

        if (chunk.isChunkLoaded)
        {
            flatten(chunk);
        }
    }

    @SubscribeEvent(priority = EventPriority.HIGHEST)
    public void onPrePopulateChunk(PopulateChunkEvent.Pre event)
    {
        World world = event.world;

        if (world.isRemote)
        {
            return;
        }

        Chunk chunk = world.getChunkFromChunkCoords(event.chunkX, event.chunkZ);

        if (chunk.isChunkLoaded)
        {
            flatten(chunk);
        }
    }

    public boolean flatten(Chunk chunk)
    {
        switch(chunk.worldObj.provider.dimensionId)
        {
            case 0:
            {
                if(ARGetAnother("ReplaceOverworldSpring",true))
                {
                    for (int x = 0; x < 16; ++x)
                    {
                        for (int z = 0; z < 16; ++z)
                        {
                            if (chunk.getBlock(x, 0, z) != Blocks.bedrock && chunk.getBlock(x, 0, z) != Blocks.air)
                            {
                                chunk.func_150807_a(x, 0, z, Blocks.bedrock, 0);
                            }
                        }
                    }
                }
                break;
            }
            default:
            {
                break;
            }
        }
        return true;
    }
}
