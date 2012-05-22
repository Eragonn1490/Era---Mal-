package net.minecraft.src.Reactioncraft;

import java.util.Random;

import net.minecraft.src.Block;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;
import net.minecraft.src.mod_ReactionCraft;
import net.minecraft.src.forge.*;

import java.util.ArrayList;
import java.util.Random;

public class BlockMulti extends Block implements ITextureProvider
{
    public BlockMulti(int i, Material material)
    {
        super(i, material);
    }
    
    /**
     * Return true if a player with SlikTouch can harvest this block directly, and not it's normal drops.
     */
    protected boolean canSilkHarvest()
    {
        return true;
    }
    public int getRenderBlockPass()
    {
        return 1;
    }
    public boolean isOpaqueCube()
    {
        return false;
    }

    public int idDropped(int i, Random random, int j)
    {
        switch(i)
            {
                case 0: return mod_ReactionCraft.Multi.blockID;
                case 1: return mod_ReactionCraft.Multi.blockID;
                case 2: return mod_ReactionCraft.Multi.blockID;
                case 3: return mod_ReactionCraft.Multi.blockID;
                case 4: return mod_ReactionCraft.Multi.blockID;
                case 5: return mod_ReactionCraft.Multi.blockID;
                case 6: return mod_ReactionCraft.Multi.blockID;
                case 7: return mod_ReactionCraft.Multi.blockID;
                case 8: return mod_ReactionCraft.Multi.blockID;
                case 9: return mod_ReactionCraft.Multi.blockID;
                case 10: return mod_ReactionCraft.Multi.blockID;
                case 11: return mod_ReactionCraft.Multi.blockID;
                case 12: return mod_ReactionCraft.Multi.blockID;
                case 13: return mod_ReactionCraft.Multi.blockID;
                case 14: return mod_ReactionCraft.Multi.blockID;
                case 15: return mod_ReactionCraft.Multi.blockID;
                default: return mod_ReactionCraft.Multi.blockID;
            }
    }
    


    public int quantityDropped(int meta, int fortune, Random random)
{
   switch(meta)
        {
            case 0: return 0;
            case 1: return 0;
            case 2: return 0;
            case 3: return 0;
            case 4: return 0;
            case 5: return 0;
            case 6: return 0;
            case 7: return 0;
            case 8: return 0;
            case 9: return 0;
            case 10: return 0;
            case 11: return 0;
            case 12: return 0;
            case 13: return 0;
            case 14: return 0;
            case 15: return 0;
            default: return 0;
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
            case 15: return 15;
            default: return 0;
        }
    }
    
    public int getBlockTextureFromSideAndMetadata(int i, int meta)
    {
    	switch(meta)
    	{
            case 0: return 224;
            case 1: return 221;
            case 2: return 225;
            case 3: return 226;
            case 4: return 227;
            case 5: return 228;
            case 6: return 229;
            case 7: return 230;
            case 8: return 231;
            case 9: return 232;
            case 10: return 233;
            case 11: return 234;
            case 12: return 235;
            case 13: return 236;
            case 14: return 237;
            case 15: return 219;
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