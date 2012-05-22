package net.minecraft.src.Reactioncraft;

import java.util.Random;

import net.minecraft.src.World;
import net.minecraft.src.WorldGenerator;
import net.minecraft.src.mod_ReactionCraft;

public class WorldGenLightBlueGem extends WorldGenerator
{

	@Override
	public boolean generate(World par1World, Random par2Random, int par3, int par4, int par5)
    {
        for (int var6 = 0; var6 < 2; ++var6)
        {
            int var7 = par3 + par2Random.nextInt(8) - par2Random.nextInt(8);
            int var8 = par4 + par2Random.nextInt(4) - par2Random.nextInt(4);
            int var9 = par5 + par2Random.nextInt(8) - par2Random.nextInt(8);

            if (par1World.isAirBlock(var7, var8, var9)&& mod_ReactionCraft.DesertOre.canPlaceBlockAt(par1World, var7, var8, var9))
            {
                par1World.setBlockAndMetadata(var7, var8, var9, mod_ReactionCraft.DesertOre.blockID, par2Random.nextInt(4));
            }
        }
		return true;
	}
	
	

}
