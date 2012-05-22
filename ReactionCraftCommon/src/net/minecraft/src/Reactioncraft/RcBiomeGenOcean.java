package net.minecraft.src.Reactioncraft;

import net.minecraft.src.BiomeGenBase;
import net.minecraft.src.mod_ReactionCraft;

public class RcBiomeGenOcean extends BiomeGenBase
{
    public RcBiomeGenOcean(int par1)
    {
        super(par1);
        this.spawnableCreatureList.clear();
        topBlock = (byte)mod_ReactionCraft.DarkSand.blockID;
    }
}
