package net.minecraft.src.Reactioncraft;
import java.util.ArrayList;
import java.util.Random;
 
import net.minecraft.src.AxisAlignedBB;
import net.minecraft.src.Block;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;
import net.minecraft.src.World;
import net.minecraft.src.forge.*;
 
public class RcGhostBlock extends Block implements ITextureProvider
{
        public RcGhostBlock(int i, int j)
        {
                super(i, j, Material.rock);
        }
       
        public String getTextureFile()
        {
                return "/reactioncraft/RcFalseBlocks.png";
        }
       
        public int idDropped(int i, Random random)
        {
                return blockID;
        }
       
        public int quantityDropped(Random random)
        {
                return 1;
        }
       
        public void addCreativeItems(ArrayList itemList)
        {
                itemList.add(new ItemStack(this));
        }
        
        // added this, still didn't work.
        public boolean isOpaqueCube()
        {
            return false;
        }
        
        
        // THIS MATTERED. adding this part fixed it.
        // it seems that the "suffocating failsafe", to make sure players don't get stuck in walls, made the player slide out.
        // so you would go kinda 1/2 way through, but you be forced to slide out.
        // adding this part, makes it act like everything else with no annoying side-effects.
        public boolean renderAsNormalBlock()
        {
            return false;
        }
        
        // Makes sure that this Block, when it is first put down, is completely solid.
        public void onBlockAdded(World world, int i, int j, int k)
    	{
    		world.setBlockMetadata(i, j, k, 0);
    	}

        
        // THIS IS REQUIRED
        //it ensures that the updateTick method below is called.
    	public void onNeighborBlockChange(World world, int i, int j, int k, int l)
    	{
    		if(l > 0 && Block.blocksList[l].canProvidePower())
    		{
    			world.scheduleBlockUpdate(i, j, k, blockID, 0);
    		}
    	}
    	
    	
    	public void updateTick(World world, int i, int j, int k, Random random)
    	{
    		boolean flag = !world.isRemote && (world.isBlockIndirectlyGettingPowered(i, j, k) || world.isBlockIndirectlyGettingPowered(i, j + 1, k));
    		
    		// if its powered.
    		if(flag)
    		{
    			// sets the jetadata so that it is completely walk-through
    			world.setBlockMetadataWithNotify(i, j, k, 1);
    		}
    		else
    		{
    			// otherwise its solid
    			world.setBlockMetadataWithNotify(i, j, k, 0);
    		}
    	}
    	
    	@Override
    	public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int i, int j, int k)
        {
        	// gets the metadata for this lock at this coordinates.
        	int metadata = world.getBlockMetadata(i, j, k);
        	
        	// if the metadata = 1, or if its set to GHOST
        	if (metadata == 1)
        	{
        		return null;
        	}
        	// otherwise, set teh default full collison box.
        	// that was stolen from Block.java
        	else
        		return AxisAlignedBB.getBoundingBoxFromPool((double)i + this.minX, (double)j + this.minY, (double)k + this.minZ, (double)i + this.maxX, (double)j + this.maxY, (double)k + this.maxZ);
        }
}