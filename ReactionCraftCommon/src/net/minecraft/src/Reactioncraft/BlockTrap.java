package net.minecraft.src.Reactioncraft;
import java.util.ArrayList;
import java.util.Random;
 
import net.minecraft.src.Block;
import net.minecraft.src.DamageSource;
import net.minecraft.src.Entity;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;
import net.minecraft.src.World;
import net.minecraft.src.forge.*;
 
public class BlockTrap extends Block implements ITextureProvider
{
        public BlockTrap(int i, int j)
        {
                super(i, j, Material.rock);
                float f = 0.375F;
                setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, 1.0F, 0.5F + f);
        }
       
        public String getTextureFile()
        {
                return "/reactioncraft/Blocks.png";
        }
        
        public void onEntityCollidedWithBlock(World par1World, int par2, int par3, int par4, Entity par5Entity)
        {
            par5Entity.attackEntityFrom(DamageSource.cactus, 1);
        }
        public boolean isOpaqueCube()
        {
            return false;
        }

        public boolean renderAsNormalBlock()
        {
            return false;
        }

        public int getRenderType()
        {
            return 1;
        }
        public int idDropped(int i, Random random, int j)
        {
            {
                    return blockID;
            }	
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
