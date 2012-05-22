package net.minecraft.src.Reactioncraft;
import java.util.ArrayList;
import java.util.Random;
 
import net.minecraft.src.Block;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;
import net.minecraft.src.forge.*;
 
public class RcForgeBlock extends Block implements ITextureProvider
{
        public RcForgeBlock(int i, int j)
        {
                super(i, j, Material.rock);
        }
       
        public String getTextureFile()
        {
                return "/reactioncraft/Blocks.png";
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