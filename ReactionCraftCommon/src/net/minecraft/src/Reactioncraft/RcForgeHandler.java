package net.minecraft.src.Reactioncraft;

import net.minecraft.src.World;
import net.minecraft.src.mod_ReactionCraft;
import net.minecraft.src.forge.*;

public class RcForgeHandler implements IBonemealHandler
{
    public boolean onUseBonemeal(World world, int blockID, int i, int j, int k)
    {
        if(blockID == mod_ReactionCraft.AncientPlant.blockID)
        {
        	((AncientPlant)mod_ReactionCraft.AncientPlant).fertilize(world, i, j, k);   
        	return true;
        }
        else if(blockID == mod_ReactionCraft.CherrySapling.blockID)
        {
            ((BlockCherrySapling)mod_ReactionCraft.CherrySapling).growTree(world, i, j, k, world.rand);   
        	return true;
        }
        return false;
    }
}