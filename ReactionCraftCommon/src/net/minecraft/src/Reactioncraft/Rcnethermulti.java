package net.minecraft.src.Reactioncraft;

import java.util.Random;

import net.minecraft.src.Block;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;
import net.minecraft.src.mod_ReactionCraft;
import net.minecraft.src.forge.*;

import java.util.ArrayList;
import java.util.Random;

public class Rcnethermulti extends Block implements ITextureProvider
{
    protected Rcnethermulti(int i, Material material)
    {
        super(i, material);
    }
    
    
    public float getHardness(int md)
    {
    	switch(md)
    	{
    		case 0: return 5.0F;
    		case 1: return 60.0F;
    		case 2: return 70.0F;
    		case 3: return 5.0F;
    		case 4: return 5.0F;
    		case 5: return 6.0F;
    		case 6: return 3.0F;
    		case 7: return 3.0F;
    		case 8: return 3.0F;
    		default: return 3.0F;
    	}

    }
    
    
    public int idDropped(int i, Random random, int j)
    {
        switch(i)
            {
                case 1: return mod_ReactionCraft.BloodStoneDust.shiftedIndex;
                case 2: return mod_ReactionCraft.DragonStoneShard.shiftedIndex;
                case 4: return mod_ReactionCraft.BlackDiamondShard.shiftedIndex;
                case 7: return Item.redstone.shiftedIndex;
                case 8: return Item.coal.shiftedIndex;
                default: return mod_ReactionCraft.NetherMulti.blockID;
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
            case 9: return 5;
            case 10: return 2;
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
            default: return 0;
        }
    }
    
    
    public int getBlockTextureFromSideAndMetadata(int i, int meta)
    {
    	switch(meta)
    	{
    	case 0: return 80;
        case 1: return 81;
        case 2: return 81;
        case 3: return 84;
        case 4: return 82;
        case 5: return 83;
        case 6: return 190;
        case 7: return 89;
        case 8: return 90;
        case 9: return 91;
        case 10: return 86;
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