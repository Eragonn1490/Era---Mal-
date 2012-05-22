package net.minecraft.src.Reactioncraft;

import net.minecraft.src.BiomeGenBase;
import net.minecraft.src.Block;

public class GenWasteland extends BiomeGenBase
{
    public GenWasteland(int par1)
    {
        super(par1);
        spawnableCreatureList.clear();
        topBlock = (byte)Block.stone.blockID;
        fillerBlock = (byte)Block.stone.blockID;
    }
}

