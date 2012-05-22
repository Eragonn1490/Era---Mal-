package net.minecraft.src.Reactioncraft;
import java.util.Random;

import net.minecraft.src.BlockDoor;
import net.minecraft.src.Item;
import net.minecraft.src.Material;
import net.minecraft.src.mod_ReactionCraft;
import net.minecraft.src.forge.ITextureProvider;


public class RcBlockDoor extends BlockDoor implements ITextureProvider
{
	public String getTextureFile()
	{
		return "/reactioncraft/Blocks.png";
	}
    public RcBlockDoor (int i, Material material)
    {
    	super(i, material);
        blockIndexInTexture = 151;
        float f = 0.5F;
        float f1 = 1.0F;
        setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f1, 0.5F + f);
    }
    
    public int getBlockTextureFromSideAndMetadata(int i, int j)
    {
        if (i == 0 || i == 1)
        {
            return blockIndexInTexture;
        }
        int k = getState(j);
        if ((k == 0 || k == 2) ^ (i <= 3))
        {
            return blockIndexInTexture;
        }
        int l = k / 2 + (i & 1 ^ k);
        l += (j & 4) / 4;
        int i1 = blockIndexInTexture - (j & 8) * 2;
        if ((l & 1) != 0)
        {
            i1 = -i1;
        }
        return i1;
    }

   
    private int getState(int j) {
		// TODO Auto-generated method stub
		return 0;
	}
    
	public int idDropped(int i, Random random, int j)
    {
        if ((i & 8) != 0)
        {
            return 0;
        }
        if(blockID == mod_ReactionCraft.Bookcasedoor.blockID)
    	{
            return mod_ReactionCraft.BookcasedoorItem.shiftedIndex;
        }
        if (blockMaterial == Material.iron)
        {
            return Item.doorSteel.shiftedIndex;
        }
        else
        {
            return Item.doorWood.shiftedIndex;
        }
    }
}