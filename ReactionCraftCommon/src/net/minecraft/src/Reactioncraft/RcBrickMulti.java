package net.minecraft.src.Reactioncraft;

import java.util.Random;

import net.minecraft.src.Block;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;
import net.minecraft.src.mod_ReactionCraft;
import net.minecraft.src.forge.*;

import java.util.ArrayList;
import java.util.Random;

public class RcBrickMulti extends Block implements ITextureProvider
{
    protected RcBrickMulti(int i, Material material)
    {
        super(i, material);
    }
    
    
    public float getHardness(int md)
    {
    	switch(md)
    	{
    		case 0: return 0.5F;
    		case 1: return 70.0F;
    		case 2: return 3.0F;
    		case 3: return 3.5F;
    		case 4: return 3.5F;
    		case 5: return 40.0F;
    		case 6: return 42.0F;
    		default: return 3.0F;
    	}

    }
    
    public int idDropped(int i, Random random, int j)
    {
        switch(i)
            {
        		//Ice Brick
	            case 0: return mod_ReactionCraft.BrickMulti.blockID;
	            
	            //BloodStoneBrick
	            case 1: return mod_ReactionCraft.BrickMulti.blockID;
	            
	            //Gold bricks
	            case 2: return mod_ReactionCraft.BrickMulti.blockID;
	            
	            //CastleBricks
	            case 3: return mod_ReactionCraft.BrickMulti.blockID;
	            
	            //CastleBricks+ Moss
	            case 4: return mod_ReactionCraft.BrickMulti.blockID;
	            
	            //Magma Stone
	            case 5: return mod_ReactionCraft.BrickMulti.blockID;
	            
	            //Magma Brick
	            case 6: return mod_ReactionCraft.BrickMulti.blockID;
	            
	            //BedRock
	            case 7: return mod_ReactionCraft.BrickMulti.blockID;

	            default: return mod_ReactionCraft.BrickMulti.blockID;
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
            default: return 0;
        }
    }
       
    public int getBlockTextureFromSideAndMetadata(int i, int meta)
    {
    	switch(meta)
    	{
    	case 0: return 217;
        case 1: return 208;
        case 2: return 209;
        case 3: return 210;
        case 4: return 211;
        case 5: return 213;
        case 6: return 216;
        case 7: return 206;
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