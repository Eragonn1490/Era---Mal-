package net.minecraft.src.Reactioncraft;

import java.util.Random;

import net.minecraft.src.Block;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;
import net.minecraft.src.mod_ReactionCraft;
import net.minecraft.src.forge.*;

import java.util.ArrayList;
import java.util.Random;

public class BlockLanternMulti extends Block implements ITextureProvider
{
    public BlockLanternMulti(int i, Material material)
    {
        super(i, material);
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
                default: return mod_ReactionCraft.LanternMulti.blockID;
                case 1: return mod_ReactionCraft.LanternMulti.blockID;
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
            case 0: return 152;
            case 1: return 61;
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