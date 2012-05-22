package net.minecraft.src.Reactioncraft;

import java.util.Random;

import net.minecraft.src.AxisAlignedBB;
import net.minecraft.src.Block;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;
import net.minecraft.src.World;
import net.minecraft.src.mod_ReactionCraft;
import net.minecraft.src.forge.*;

import java.util.ArrayList;
import java.util.Random;

public class BlockGlowShroomMulti extends Block implements ITextureProvider
{
    public BlockGlowShroomMulti(int i, Material material)
    {
        super(i, material);
        this.setTickRandomly(true);
        float var4 = 0.2F;
        this.setBlockBounds(0.5F - var4, 0.0F, 0.5F - var4, 0.5F + var4, var4 * 3.0F, 0.5F + var4);
    }
    
    
    //Start V2.0 Code
    /**
     * Gets passed in the blockID of the block below and supposed to return true if its allowed to grow on the type of
     * blockID passed in. Args: blockID
     */
    protected boolean canThisPlantGrowOnThisBlockID(int par1)
    {
    	return par1 == Block.netherrack.blockID || par1 == mod_ReactionCraft.PlantPot.blockID;
    }
    /**
     * Returns a bounding box from the pool of bounding boxes (this means this box can change after the pool has been
     * cleared to be reused)
     */
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4)
    {
        return null;
    }
    /**
     * Is this block (a) opaque and (b) a full 1m cube?  This determines whether or not to render the shared face of two
     * adjacent blocks and also whether the player can attach torches, redstone wire, etc to this block.
     */
    public boolean isOpaqueCube()
    {
        return false;
    }

    /**
     * If this block doesn't render as an ordinary block it will return False (examples: signs, buttons, stairs, etc)
     */
    public boolean renderAsNormalBlock()
    {
        return false;
    }

    /**
     * The type of render function that is called for this block
     */
    public int getRenderType()
    {
        return 1;
    }
    //
    
    
    public float getHardness(int md)
    {
    	switch(md)
    	{
    		case 0: return 0.0F;
    		case 1: return 0.0F;
    		case 2: return 0.0F;
    		case 3: return 0.0F;
    		case 4: return 0.0F;
    		case 5: return 0.0F;
    		case 6: return 0.0F;
    		case 7: return 0.0F;
    		case 8: return 0.0F;
    		case 9: return 0.0F;
    		default: return 0.0F;
    	}

    }
    
    
    public int idDropped(int i, Random random, int j)
    {
        switch(i)
            {
                default: return mod_ReactionCraft.GlowShroomMulti.blockID;
                case 1: return mod_ReactionCraft.GlowShroomMulti.blockID;
            }
    }


    public int quantityDropped(int meta, int fortune, Random random)
{
   switch(meta)
        {
            default: return 1;
            case 1: return 1;
        }
}
    
    
    protected int damageDropped(int i)
    {
        switch(i)
        {
            default: return 0;
            case 1: return 1;
        }
    }
    
    
    public int getBlockTextureFromSideAndMetadata(int i, int meta)
    {
    	switch(meta)
    	{
    	//Exodus poinsettia
    	case 0: return 32;
    	//Purple GlowShroom
        case 1: return 33;
        }
        return meta;
    }
    
    
    public void addCreativeItems(ArrayList itemList)
    {
            itemList.add(new ItemStack(this));
    }
    
    
    public String getTextureFile()
    {
        return "/reactioncraft/Blocks.png";
    }
}