package net.minecraft.src.Reactioncraft;

import java.util.Random;

import net.minecraft.src.Block;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;
import net.minecraft.src.mod_ReactionCraft;
import net.minecraft.src.forge.*;

import java.util.ArrayList;
import java.util.Random;

public class BlockSkinnyCMulti extends Block implements ITextureProvider
{
    public BlockSkinnyCMulti(int i, Material material)
    {
        super(i, material);
        float f = 0.2F;
        setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, 1.0F, 0.5F + f);
    }
    
    public float getHardness(int md)
    {
    	switch(md)
    	{
    		default: return 3.0F;
    		case 1: return 3.0F;
    		case 2: return 70.0F;
    		case 3: return 1.5F;
    		case 4: return 2.0F;
    		case 5: return 3.0F;
    		case 6: return 0.8F;
    	}

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
        		//ReactionCraft SandStone Column
                default: return mod_ReactionCraft.SkinnyColumnMulti.blockID;
                
                //Marble Column
                case 1: return mod_ReactionCraft.SkinnyColumnMulti.blockID;
                
                //BloodStone Column
                case 2: return mod_ReactionCraft.SkinnyColumnMulti.blockID;
                
                //Stone Column
                case 3: return mod_ReactionCraft.SkinnyColumnMulti.blockID;
                //Cobblestone Column
                case 4: return mod_ReactionCraft.SkinnyColumnMulti.blockID;
                //Gold Column
                case 5: return mod_ReactionCraft.SkinnyColumnMulti.blockID;
                //Sandstone Column
                case 6: return mod_ReactionCraft.SkinnyColumnMulti.blockID;
            }
    }


    public int quantityDropped(int meta, int fortune, Random random)
{
   switch(meta)
        {
            default: return 1;
            case 1: return 1;
            case 2: return 1;
            case 3: return 1;
            case 4: return 1;
            case 5: return 1;
            case 6: return 1;
        }
}
    
    protected int damageDropped(int i)
    {
        switch(i)
        {
            default: return 0;
            case 1: return 1;
            case 2: return 2;
            case 3: return Block.cobblestone.blockID;
            case 4: return Block.cobblestone.blockID;
            case 5: return 5;
            case 6: return Block.sandStone.blockID;
        }
    }
    
    public int getBlockTextureFromSideAndMetadata(int i, int meta)
    {
    	switch(meta)
    	{
    	case 0: return 92;
        case 1: return 164;
        case 2: return 84;
        case 3: return 53;
        case 4: return 54;
        case 5: return 214;
        case 6: return 215;
        case 7: return 55;
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