package net.minecraft.src.Reactioncraft;

import java.util.Random;

import net.minecraft.src.Block;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;
import net.minecraft.src.mod_ReactionCraft;
import net.minecraft.src.forge.*;

import java.util.ArrayList;
import java.util.Random;

public class BlockShellMulti extends Block implements ITextureProvider
{
    public BlockShellMulti(int i, Material material)
    {
        super(i, material);
        float f = 0.0625F;
        setBlockBounds(f, 0.0F, f, 1.0F - f, 0.031F, 1.0F - f);
    }
    
    
        
    public boolean renderAsNormalBlock()
    {
        return false;
    } 

    public boolean isOpaqueCube()
    {
        return false;
    }

    public int idDropped(int i, Random random, int j)
    {
        switch(i)
            {
                default: return mod_ReactionCraft.Multi.blockID;
                case 1: return mod_ReactionCraft.Multi.blockID;
                case 2: return mod_ReactionCraft.Multi.blockID;
            }
    }
    


    public int quantityDropped(int meta, int fortune, Random random)
{
   switch(meta)
        {
            case 0: return 1;
            case 1: return 1;
            default: return 1;
        }
}
    
    protected int damageDropped(int i)
    {
        switch(i)
        {
            case 0: return 0;
            case 1: return 1;
            default: return 0;
        }
    }
    
    public int getBlockTextureFromSideAndMetadata(int i, int meta)
    {
    	switch(meta)
    	{
            case 0: return 157;
            case 1: return 158;
            case 2: return 159;
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