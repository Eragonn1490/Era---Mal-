package net.minecraft.src.Reactioncraft;

import net.minecraft.src.BiomeGenBase;
import net.minecraft.src.mod_ReactionCraft;

public class BiomeGenOcean extends BiomeGenBase
{
    public BiomeGenOcean(int par1)
    {
        super(par1);
        this.spawnableCreatureList.clear();
        topBlock = (byte)mod_ReactionCraft.DarkSand.blockID;
    }
}
