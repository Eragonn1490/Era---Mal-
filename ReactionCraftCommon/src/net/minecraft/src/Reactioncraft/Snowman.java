package net.minecraft.src.Reactioncraft;
import net.minecraft.src.*;
import java.util.ArrayList;
import java.util.Random;

import net.minecraft.src.Block;
import net.minecraft.src.BlockContainer;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.EnumSkyBlock;
import net.minecraft.src.IBlockAccess;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;
import net.minecraft.src.TileEntity;
import net.minecraft.src.World;
import net.minecraft.src.forge.ITextureProvider;

public class Snowman extends BlockContainer implements ITextureProvider
{
	
	private Class SnowmanEntityClass;
	
	
        public Snowman(int i,int j, Class tClass)
        {
                super(i, j, Material.ice);
                SnowmanEntityClass = tClass;
                this.slipperiness = 0.98F;
                this.setTickRandomly(true);
                this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F);
        }
        
        //Start Eragonn Code From Block Ice

        /**
         * Returns true if the given side of this block type should be rendered, if the adjacent block is at the given
         * coordinates.  Args: blockAccess, x, y, z, side
         */
        public boolean shouldSideBeRendered(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5)
        {
            return super.shouldSideBeRendered(par1IBlockAccess, par2, par3, par4, 1 - par5);
        }

        /**
         * Called when the player destroys a block with an item that can harvest it. (i, j, k) are the coordinates of the
         * block and l is the block's subtype/damage.
         */
        public void harvestBlock(World par1World, EntityPlayer par2EntityPlayer, int par3, int par4, int par5, int par6)
        {
            super.harvestBlock(par1World, par2EntityPlayer, par3, par4, par5, par6);
            Material var7 = par1World.getBlockMaterial(par3, par4 - 1, par5);

            if (var7.blocksMovement() || var7.isLiquid())
            {
                par1World.setBlockWithNotify(par3, par4, par5, Block.waterMoving.blockID);
            }
        }

        /**
         * Returns the quantity of items to drop on block destruction.
         */
        public int quantityDropped(Random par1Random)
        {
            return 0;
        }
        
        /**
         * Ticks the block if it's been scheduled
         */
        public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random)
        {
            if (par1World.getSavedLightValue(EnumSkyBlock.Block, par2, par3, par4) > 11 - Block.lightOpacity[this.blockID])
            {
                this.dropBlockAsItem(par1World, par2, par3, par4, par1World.getBlockMetadata(par2, par3, par4), 0);
                par1World.setBlockWithNotify(par2, par3, par4, Block.waterStill.blockID);
            }
        }

        /**
         * Returns the mobility information of the block, 0 = free, 1 = can't push but can move over, 2 = total immobility
         * and stop pistons
         */
        public int getMobilityFlag()
        {
            return 0;
        }

        /**
         * Returns an item stack containing a single instance of the current block type. 'i' is the block's subtype/damage
         * and is ignored for blocks which do not support subtypes. Blocks which cannot be harvested should return null.
         */
        protected ItemStack createStackedBlock(int par1)
        {
            return null;
        }
        
        //End Eragonn Code
        
        
        public TileEntity getBlockEntity()
        {
        	try
        	{
        		return (TileEntity)SnowmanEntityClass.newInstance();
        		
        	}
        	catch(Exception exception)
        	{
        		throw new RuntimeException(exception);
        	}
  
        }
        public int idDropped(int i, Random random, int j)
        {
        	return blockID;
        }
        
        //Removed By Eragonn to help assist block.ice code
//        public int quantityDropped(Random random)
//        {
//        	return 1;
//        }
        //end removal
        
        public int getRenderType()
        {
        	return -1;
        }
        
        public boolean isOpaqueCube()
        {
        	return false;
        }
 
        public boolean renderAsNormalBlock()
        {
        	return false;
        }        
        
        public String getTextureFile()
        {
                return "/reactioncraft/rcs/creeperstatue.png";
        }          

}