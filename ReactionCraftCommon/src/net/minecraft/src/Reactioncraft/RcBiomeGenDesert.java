package net.minecraft.src.Reactioncraft;
 
import java.util.List;

import net.minecraft.src.BiomeGenBase;
import net.minecraft.src.mod_ReactionCraft;

public class RcBiomeGenDesert extends BiomeGenBase
{
	
	RcBiomeDecoratorDesertGems customBiomeDecorator;	
	
    public RcBiomeGenDesert(int par1)
    {
        super(par1); 
        this.spawnableCreatureList.clear();
        topBlock = (byte)mod_ReactionCraft.DarkSand.blockID;
        fillerBlock = (byte)mod_ReactionCraft.DarkSand.blockID;
       
        biomeDecorator = new RcBiomeDecoratorDesertGems(this);
        customBiomeDecorator = (RcBiomeDecoratorDesertGems)biomeDecorator;
        customBiomeDecorator.DesertOrePerChunk = 1;
        customBiomeDecorator.DesertOre1PerChunk = 1;
        customBiomeDecorator.LimestonePerChunk = 1;
        customBiomeDecorator.DesertGoldPerChunk = 1;
    }
 
    /**
     * takes temperature, returns color
     */
}

