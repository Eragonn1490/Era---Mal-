package net.minecraft.src.Reactioncraft;
import java.util.ArrayList;
import java.util.Random;
 
import net.minecraft.src.Block;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;
import net.minecraft.src.forge.*;
 
public class Chain extends Block implements ITextureProvider
{
        public Chain(int i, int j)
        {
                super(i, j, Material.rock);
                //float f = 0.375F;
                //setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f * 3F, 0.5F + f);
                float f = 0.2F;
                setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, 1.0F, 0.5F + f);
                //first deals with "how thin or position"
                //second deals with "floating position"
                //third deals with "not sure just dosent show up if messed with"
                //fourth deals with "tilt"
                //5th deals with height
                //6th deals with position i assume 
                //setBlockBounds(0.5F, 0.0F, 0.5F, 1.0F, 1.0F, 1.0F);
        }
        
        public boolean renderAsNormalBlock()
        {
            return false;
        }
        public boolean isOpaqueCube()
        {
            return false;
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