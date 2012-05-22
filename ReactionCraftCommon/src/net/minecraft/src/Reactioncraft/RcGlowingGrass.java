package net.minecraft.src.Reactioncraft;
import java.util.ArrayList;
import java.util.Random;
 
import net.minecraft.src.Block;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;
import net.minecraft.src.forge.*;
 
public class RcGlowingGrass extends Block implements ITextureProvider
{
        public RcGlowingGrass(int i, int j)
        {
                super(i, j, Material.rock);
        }
       
        public String getTextureFile()
        {
                return "/reactioncraft/Blocks.png";
        }
        
        @Override
        public int getBlockTextureFromSide(int i)
        {
        	switch(i)
        	{
        	case 0: return 173;
        	case 1: return blockIndexInTexture;
        	case 2: return 124;
        	case 3: return 124;
        	case 4: return 124;
        	case 5: return 124;
        	default: return 15;
        	}
        }
        
        public int idDropped(int i, Random random)
        {
                return Block.dirt.blockID;
        }
       
        public int quantityDropped(Random random)
        {
                return 1;
        }
       
        public void addCreativeItems(ArrayList itemList)
        {
                itemList.add(new ItemStack(this));
        }
}
