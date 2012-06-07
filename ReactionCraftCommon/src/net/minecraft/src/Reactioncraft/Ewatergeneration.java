package net.minecraft.src.Reactioncraft;

import java.util.Random;

import net.minecraft.src.Block;
import net.minecraft.src.Material;
import net.minecraft.src.World;
import net.minecraft.src.WorldGenerator;

public class Ewatergeneration extends WorldGenerator
{
	
	/** The block ID of the ore to be placed using this generator. */
    private int minableBlockId;
    
    /** The Meta Value of the block **/
    private int metadata;
    
    public Ewatergeneration(int i, int meta)
    {
    	minableBlockId = i;
        metadata = meta;
    }
    
    //Corosus code
  	public boolean isBlockWater(int id) 
  	{
  		return ((Block.blocksList[8] != null && Block.blocksList[8].blockMaterial == Material.water));
  	}  		
  	//End
  	
  	//Start Eragonn V2.0 Code!
    public boolean generate(World world, Random random, int i, int j, int k)
    {
    	
    	
    	//Area for meta / non meta blocks //
    	{
            world.setBlock(i, j, k, this.minableBlockId);
        }
    	{
            world.setBlockAndMetadata(i, j, k, minableBlockId, metadata);
        }
    	return true;
    }
    //End Eragonn code :(
}