package net.minecraft.src.Reactioncraft;

import java.util.Random;
import java.util.ArrayList;
import net.minecraft.src.*;
import net.minecraft.src.forge.ITextureProvider;

public class BlockWildK extends BlockFlower implements ITextureProvider
{
    public BlockWildK(int par1, int par2)
    {
    	super(par1, par2);
        this.blockIndexInTexture = par2;
        this.setTickRandomly(true);
        float var4 = 0.2F;
        this.setBlockBounds(0.5F - var4, 0.0F, 0.5F - var4, 0.5F + var4, var4 * 3.0F, 0.5F + var4);
    }
    
    //Start Eragonn V2.0 code
    
    /**
     * Checks to see if its valid to put this block at the specified coordinates. Args: world, x, y, z
     */
    public boolean canPlaceBlockAt(World par1World, int par2, int par3, int par4)
    {
        return super.canPlaceBlockAt(par1World, par2, par3, par4) && this.canThisPlantGrowOnThisBlockID(par1World.getBlockId(par2, par3 - 1, par4));
    }

    /**
     * Gets passed in the blockID of the block below and supposed to return true if its allowed to grow on the type of
     * blockID passed in. Args: blockID
     */
    protected boolean canThisPlantGrowOnThisBlockID(int par1)
    {
        return par1 == Block.grass.blockID || par1 == Block.dirt.blockID || par1 == Block.tilledField.blockID || par1 == mod_ReactionCraft.PlantPot.blockID;
    }

    /**
     * Lets the block know when one of its neighbor changes. Doesn't know which neighbor changed (coordinates passed are
     * their own) Args: x, y, z, neighbor blockID
     */
    public void onNeighborBlockChange(World par1World, int par2, int par3, int par4, int par5)
    {
        super.onNeighborBlockChange(par1World, par2, par3, par4, par5);
        this.checkFlowerChange(par1World, par2, par3, par4);
    }

    /**
     * Ticks the block if it's been scheduled
     */
    public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random)
    {
        this.checkFlowerChange(par1World, par2, par3, par4);
    }

    /**
     * Can this block stay at this position.  Similar to canPlaceBlockAt except gets checked often with plants.
     */
    public boolean canBlockStay(World par1World, int par2, int par3, int par4)
    {
        return (par1World.getFullBlockLightValue(par2, par3, par4) >= 8 || par1World.canBlockSeeTheSky(par2, par3, par4)) && this.canThisPlantGrowOnThisBlockID(par1World.getBlockId(par2, par3 - 1, par4));
    }

    /**
     * Returns a bounding box from the pool of bounding boxes (this means this box can change after the pool has been
     * cleared to be reused)
     */
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4)
    {
        return null;
    }
    
    //end code :(
    
    
    //Start Eragonn Segment 2 code
    
    public boolean renderAsNormalBlock()
    {
        return false;
    }
    public boolean isOpaqueCube()
    {
        return false;
    }
    @Override
	public String getTextureFile() {
		// TODO Auto-generated method stub
		return "/reactioncraft/rcs/plants.png";
	}
    //End Eragonn Code segment 2
    
    /**
     * The type of render function that is called for this block
     */
    public int getRenderType()
    {
        return 1;
    }

    public int idDropped(int par1, Random par2Random, int par3)
    {
       
            int w = par2Random.nextInt(8);
            if (w == 0)
            {
                return mod_ReactionCraft.WildKSeed.shiftedIndex;
            }
            if (w == 1)
            {
                return mod_ReactionCraft.OKSeed.shiftedIndex;
            }
            if (w == 2)
            {
                return mod_ReactionCraft.LKSeed.shiftedIndex;
            }
            if (w == 3)
            {
                return mod_ReactionCraft.FireSeed.shiftedIndex;
            }
            if (w == 4)
            {
                return  mod_ReactionCraft.CrystalSeed.shiftedIndex;
            }
            if (w == 5)
            {
                return  mod_ReactionCraft.BYYSeed.shiftedIndex;
            }
            if (w == 6)
            {
                return  mod_ReactionCraft.BlueDreamSeed.shiftedIndex;
            }
            else
            {
                return mod_ReactionCraft.Toke.shiftedIndex;
            }         
    }

    public int quantityDroppedWithBonus(int par1, Random par2Random)
    {
        return quantityDropped(par2Random) + par2Random.nextInt(par1 + 1);
    }

    public int quantityDropped(Random par1Random)
    {
        return 1 + par1Random.nextInt(2); //replace 1 to a higher number if you want to drop more
    }
}
