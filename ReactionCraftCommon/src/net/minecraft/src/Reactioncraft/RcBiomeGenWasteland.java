package net.minecraft.src.Reactioncraft;

import net.minecraft.src.BiomeGenBase;
import net.minecraft.src.Block;

public class RcBiomeGenWasteland extends BiomeGenBase
{
    public RcBiomeGenWasteland(int par1)
    {
        super(par1);
        spawnableCreatureList.clear();
        topBlock = (byte)Block.stone.blockID;
        fillerBlock = (byte)Block.stone.blockID;
    }
}

