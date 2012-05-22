package net.minecraft.src.Reactioncraft;

import java.util.Random;

import net.minecraft.src.Block;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;
import net.minecraft.src.mod_ReactionCraft;
import net.minecraft.src.forge.*;

import java.util.ArrayList;
import java.util.Random;

public class RcOremulti extends Block implements ITextureProvider
{
    public RcOremulti(int i, Material material)
    {
        super(i, material);
    }
    
    
    public float getHardness(int md)
    {
    	switch(md)
    	{
    		case 0: return 1.0F;
    		case 1: return 3.0F;
    		case 2: return 3.0F;
    		case 3: return 1.0F;
    		case 4: return 1.0F;
    		case 5: return 1.0F;
    		case 6: return 1.0F;
    		case 7: return 1.0F;
    		case 8: return 1.0F;
    		case 9: return 1.0F;
    		case 10: return 1.0F;
    		case 11: return 1.0F;
    		case 12: return 1.0F;
    		case 13: return 1.0F;
    		case 14: return 1.0F;
    		default: return 3.0F;
    	}

    }
    
    public int idDropped(int i, Random random, int j)
    {
        switch(i)
            {
                case 0: return mod_ReactionCraft.OreMulti.blockID;
                case 1: return mod_ReactionCraft.IronDust.shiftedIndex;
                case 2: return mod_ReactionCraft.GoldClump.shiftedIndex;
                case 3: return mod_ReactionCraft.OreMulti.blockID;
                case 4: return mod_ReactionCraft.OreMulti.blockID;
                case 5: return mod_ReactionCraft.OreMulti.blockID;
                case 6: return mod_ReactionCraft.OreMulti.blockID;
                case 7: return mod_ReactionCraft.OreMulti.blockID;
                case 8: return mod_ReactionCraft.ZincDust.shiftedIndex;
                case 9: return mod_ReactionCraft.OreMulti.blockID;
                case 10: return mod_ReactionCraft.OreMulti.blockID;
                case 11: return mod_ReactionCraft.OreMulti.blockID;
                case 12: return mod_ReactionCraft.OreMulti.blockID;
                case 13: return mod_ReactionCraft.OreMulti.blockID;
                case 14: return mod_ReactionCraft.OreMulti.blockID;
                case 15: return mod_ReactionCraft.ManganeseDust.shiftedIndex;
                default: return mod_ReactionCraft.OreMulti.blockID;
            }
    }


    public int quantityDropped(int meta, int fortune, Random random)
{
   switch(meta)
        {
            case 0: return 1;
            case 1: return 3;
            case 2: return 3;
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
            case 15: return 3;
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
    
    public int getBlockTextureFromSideAndMetadata(int side, int meta)
    {
    	switch(meta)
    	{
        	case 0: return 192;
        	case 1: return 199;
        	case 2: return 205;
        	case 3: return 201;
        	case 4: return 203;
        	case 5: return 194;
        	case 6: return 195;
        	case 7: return 197;
        	case 8: return 198;
        	case 9: return 191;
        	case 10: return 200;
        	case 11: return 201;
        	case 12: return 204;
        	case 13: return 193;
        	case 14: return 202;
        	default: return 182;
        }
        
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