package net.minecraft.src.Reactioncraft;
import java.util.ArrayList;
import java.util.Random;
 
import net.minecraft.src.Block;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;
import net.minecraft.src.forge.*;
 
public class RcPlantPot extends Block implements ITextureProvider
{
        public RcPlantPot(int i, int j)
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
        	case 0: return 101;
        	case 1: return blockIndexInTexture;
        	case 2: return 101;
        	case 3: return 101;
        	case 4: return 101;
        	case 5: return 101;
        	default: return 15;
        	}
        }
        
        public int idDropped(int i, Random random)
        {
                return blockID;
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
