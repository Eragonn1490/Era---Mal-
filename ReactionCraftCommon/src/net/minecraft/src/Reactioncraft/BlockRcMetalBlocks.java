package net.minecraft.src.Reactioncraft;

import java.util.Random;

import net.minecraft.src.Block;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;
import net.minecraft.src.mod_ReactionCraft;
import net.minecraft.src.forge.*;

import java.util.ArrayList;
import java.util.Random;

public class BlockRcMetalBlocks extends Block implements ITextureProvider
{
    public BlockRcMetalBlocks(int i, Material material)
    {
        super(i, material);
    }
    
    
    
    public int idDropped(int i, Random random, int j)
    {
        switch(i)
            {
                case 0: return mod_ReactionCraft.MetalBlockMulti.blockID;
                case 1: return mod_ReactionCraft.MetalBlockMulti.blockID;
                case 2: return mod_ReactionCraft.MetalBlockMulti.blockID;
                case 3: return mod_ReactionCraft.MetalBlockMulti.blockID;
                case 4: return mod_ReactionCraft.MetalBlockMulti.blockID;
                case 5: return mod_ReactionCraft.MetalBlockMulti.blockID;
                case 6: return mod_ReactionCraft.MetalBlockMulti.blockID;
                case 7: return mod_ReactionCraft.MetalBlockMulti.blockID;
                case 8: return mod_ReactionCraft.MetalBlockMulti.blockID;
                case 9: return mod_ReactionCraft.MetalBlockMulti.blockID;
                case 10: return mod_ReactionCraft.MetalBlockMulti.blockID;
                case 11: return mod_ReactionCraft.MetalBlockMulti.blockID;
                case 12: return mod_ReactionCraft.MetalBlockMulti.blockID;
                case 13: return mod_ReactionCraft.MetalBlockMulti.blockID;
                default: return mod_ReactionCraft.MetalBlockMulti.blockID;
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
        case 7: return 216;
        case 8: return 223;
        case 9: return 65;
        case 10: return 220;
        case 11: return 50;
        case 12: return 65;
        case 13: return 220;
        }
        return meta;
    }
    
    public void addCreativeItems(ArrayList itemList)
    {
            itemList.add(new ItemStack(this));
    }
    
    public String getTextureFile()
    {
        return "/reactioncraft/rcs/Blocks.png";
    }
}