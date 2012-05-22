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

public class RcFlowerMulti extends Block implements ITextureProvider
{
    protected RcFlowerMulti(int i, Material material)
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
    	return par1 == Block.grass.blockID || par1 == Block.dirt.blockID || par1 == Block.tilledField.blockID || par1 == mod_ReactionCraft.PlantPot.blockID;
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
                case 0: return mod_ReactionCraft.FlowerMulti.blockID;
                case 1: return mod_ReactionCraft.FlowerMulti.blockID;
                case 2: return mod_ReactionCraft.FlowerMulti.blockID;
                case 3: return mod_ReactionCraft.FlowerMulti.blockID;
                case 4: return mod_ReactionCraft.FlowerMulti.blockID;
                case 5: return mod_ReactionCraft.FlowerMulti.blockID;
                case 6: return mod_ReactionCraft.FlowerMulti.blockID;
                case 7: return mod_ReactionCraft.FlowerMulti.blockID;
                case 8: return mod_ReactionCraft.FlowerMulti.blockID;
                case 9: return mod_ReactionCraft.FlowerMulti.blockID;
                case 10: return mod_ReactionCraft.FlowerMulti.blockID;
                case 11: return mod_ReactionCraft.FlowerMulti.blockID;
                case 12: return mod_ReactionCraft.FlowerMulti.blockID;
                case 13: return mod_ReactionCraft.FlowerMulti.blockID;
                case 14: return mod_ReactionCraft.FlowerMulti.blockID;
                default: return mod_ReactionCraft.FlowerMulti.blockID;
            }
    }


    public int quantityDropped(int meta, int fortune, Random random)
{
   switch(meta)
        {
            case 0: return 1;
            case 1: return 1;
            case 2: return 1;
            case 3: return 1;
            case 4: return 1;
            case 5: return 1;
            case 6: return 1;
            case 7: return 1;
            case 8: return 1;
            case 9: return 1;
            case 10: return 1;
            case 11: return 1;
            case 12: return 1;
            case 13: return 1;
            case 14: return 1;
            default: return 1;
        }
}
    
    
    protected int damageDropped(int i)
    {
        switch(i)
        {
            case 0: return 0;
            case 1: return 1;
            case 2: return 2;
            case 3: return 3;
            case 4: return 4;
            case 5: return 5;
            case 6: return 6;
            case 7: return 7;
            case 8: return 8;
            case 9: return 9;
            case 10: return 10;
            case 11: return 11;
            case 12: return 12;
            case 13: return 13;
            case 14: return 14;
            default: return 15;
        }
    }
    
    
    public int getBlockTextureFromSideAndMetadata(int i, int meta)
    {
    	switch(meta)
    	{
    	//Exodus poinsettia
    	case 0: return 22;
    	//Regular poinsettia
        case 1: return 59;
        //Lavender
        case 2: return 21;
        //Vanilla
        case 3: return 16;
        //Hibiscus
        case 4: return 20;
        //Genseng
        case 5: return 19;
        //Daisy
        case 6: return 18;
        //BlueHydrangea
        case 7: return 17;
        //Tulip- purple flower
        case 8: return 26;
        //Peony- Next to Purple flower
        case 9: return 29;
        //Orchid- limegreen flower
        case 10: return 25;
        //BlueBell- next to limegreen flower
        case 11: return 24;
        //WhiteFlower before blue bush 
        case 12: return 27;
        //pinkflower
        case 13: return 30;
        //Iris- by infront of poinsettias
        case 14: return 57;
        //Flowers-behind poinsettias
        case 15: return 60;
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