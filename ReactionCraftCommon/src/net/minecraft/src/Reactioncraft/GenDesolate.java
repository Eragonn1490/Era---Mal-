package net.minecraft.src.Reactioncraft;

import net.minecraft.src.BiomeGenBase;
import net.minecraft.src.Block;
import net.minecraft.src.mod_ReactionCraft;

public class GenDesolate extends BiomeGenBase
{
    public GenDesolate(int par1)
    {
        super(par1);
        spawnableCreatureList.clear();
        topBlock = (byte)Block.stone.blockID;
        fillerBlock = (byte)mod_ReactionCraft.BloodStone.blockID;
    }
}
