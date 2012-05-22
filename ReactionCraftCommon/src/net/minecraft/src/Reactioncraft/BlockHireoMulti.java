package net.minecraft.src.Reactioncraft;

import java.util.Random;

import net.minecraft.src.Block;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;
import net.minecraft.src.mod_ReactionCraft;
import net.minecraft.src.forge.*;

import java.util.ArrayList;
import java.util.Random;

public class BlockHireoMulti extends Block implements ITextureProvider
{
    public BlockHireoMulti(int i, Material material)
    {
        super(i, material);
    }
    
    
    
    public int idDropped(int i, Random random, int j)
    {
        switch(i)
            {
                case 0: return mod_ReactionCraft.HireoMulti.blockID;
                case 1: return mod_ReactionCraft.HireoMulti.blockID;
                case 2: return mod_ReactionCraft.HireoMulti.blockID;
                //
                case 3: return mod_ReactionCraft.HireoMulti.blockID;
                case 4: return mod_ReactionCraft.HireoMulti.blockID;
                case 5: return mod_ReactionCraft.HireoMulti.blockID;
                //
                case 6: return mod_ReactionCraft.HireoMulti.blockID;
                case 7: return mod_ReactionCraft.HireoMulti.blockID;
                case 8: return mod_ReactionCraft.HireoMulti.blockID;
                //Column Pieces
                case 9: return mod_ReactionCraft.HireoMulti.blockID;
                case 10: return mod_ReactionCraft.HireoMulti.blockID;
                // weathered hireoglyph
                case 11: return mod_ReactionCraft.HireoMulti.blockID;
                //Marble
                case 12: return mod_ReactionCraft.HireoMulti.blockID;
                //
                case 13: return mod_ReactionCraft.HireoMulti.blockID;
            }
        return mod_ReactionCraft.HireoMulti.blockID;
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
                default: return 1;
            }
    }
    
    protected int damageDropped(int i)
    {
        switch(i)
        {
            case 0: return 11;
            case 1: return 11;
            case 2: return 11;
            case 3: return 11;
            case 4: return 11;
            case 5: return 11;
            case 6: return 11;
            case 7: return 11;
            case 8: return 11;
            case 9: return 9;
            case 10: return 10;
            case 11: return 11;
            case 12: return 12;
            case 13: return 13;
	default: return 0;
        }
    }
    
    public int getBlockTextureFromSideAndMetadata(int i, int meta)
    {
    	switch(meta)
    	{
        case 0:
        	switch(i)
        	{
        	case 0: return 138;
        	case 1: return 138;
        	case 2: return 145;
        	case 3: return 145;
        	case 4: return 145;
        	case 5: return 145;
        	}
        case 1:
        	switch(i)
        	{
        	case 0: return 138;
        	case 1: return 138;
        	case 2: return 147;
        	case 3: return 147;
        	case 4: return 147;
        	case 5: return 147;
        	}
        case 2:
        	switch(i)
        	{
        	case 0: return 138;
        	case 1: return 138;
        	case 2: return 148;
        	case 3: return 148;
        	case 4: return 148;
        	case 5: return 148;
        	}
        	//light blue gem encrusted hireoglyphics
        case 3:
        	switch(i)
        	{
        	case 0: return 138;
        	case 1: return 138;
        	case 2: return 247;
        	case 3: return 247;
        	case 4: return 247;
        	case 5: return 247;
        	}
        case 4:
        	switch(i)
        	{
        	case 0: return 138;
        	case 1: return 138;
        	case 2: return 248;
        	case 3: return 248;
        	case 4: return 248;
        	case 5: return 248;
        	}
        case 5:
        	switch(i)
        	{
        	case 0: return 138;
        	case 1: return 138;
        	case 2: return 249;
        	case 3: return 249;
        	case 4: return 249;
        	case 5: return 249;
        	}
        	//Dark blue gem encrusted hireoglyphics
        case 6:
        	switch(i)
        	{
        	case 0: return 138;
        	case 1: return 138;
        	case 2: return 251;
        	case 3: return 251;
        	case 4: return 251;
        	case 5: return 251;
        	}
        case 7:
        	switch(i)
        	{
        	case 0: return 138;
        	case 1: return 138;
        	case 2: return 252;
        	case 3: return 252;
        	case 4: return 252;
        	case 5: return 252;
        	}
        case 8:
        	switch(i)
        	{
        	case 0: return 138;
        	case 1: return 138;
        	case 2: return 253;
        	case 3: return 253;
        	case 4: return 253;
        	case 5: return 253;
        	}
        	//roman column top/ bottom Blocks
        case 9:
        	switch(i)
        	{
        	case 0: return 164;
        	case 1: return 164;
        	case 2: return 171;
        	case 3: return 171;
        	case 4: return 171;
        	case 5: return 171;
        	}
        case 10:
        	switch(i)
        	{
        	case 0: return 164;
        	case 1: return 164;
        	case 2: return 163;
        	case 3: return 163;
        	case 4: return 163;
        	case 5: return 163;
        	}
        	//wathered hireoglyph Block
        case 11:
        	switch(i)
        	{
        	case 0: return 138;
        	case 1: return 138;
        	case 2: return 93;
        	case 3: return 93;
        	case 4: return 93;
        	case 5: return 93;
        	}
        	//Marble
        case 12: return 164;
        	
        	//scroll Shelf
        case 13:
    	switch(i)
    	{
    	case 0: return 101;
    	case 1: return 101;
    	case 2: return 120;
    	case 3: return 120;
    	case 4: return 120;
    	case 5: return 120;
    	}
    	//14
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