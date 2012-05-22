package net.minecraft.src.Reactioncraft;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.src.BlockFlower;
import net.minecraft.src.ItemStack;
import net.minecraft.src.World;
import net.minecraft.src.forge.IBonemealHandler;
import net.minecraft.src.forge.ITextureProvider;

public class BlockCherrySapling extends BlockFlower implements ITextureProvider, IBonemealHandler
{
    protected BlockCherrySapling(int par1, int par2)
    {
        super(par1, par2);
        float var3 = 0.4F;
        this.setBlockBounds(0.5F - var3, 0.0F, 0.5F - var3, 0.5F + var3, var3 * 2.0F, 0.5F + var3);
    }
    
    
    //Start Eragonn Code
    public void addCreativeItems(ArrayList itemList)
    {
            itemList.add(new ItemStack(this));
    }
    
	@Override
	public String getTextureFile() 
	{
		// TODO Auto-generated method stub
		return "/reactioncraft/Blocks.png";
	}
    //End Eragonn Code
	
    /**
     * Ticks the block if it's been scheduled
     */
    public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random)
    {
        if (!par1World.isRemote)
        {
            super.updateTick(par1World, par2, par3, par4, par5Random);

            if (par1World.getBlockLightValue(par2, par3 + 1, par4) >= 9 && par5Random.nextInt(7) == 0)
            {
                int var6 = par1World.getBlockMetadata(par2, par3, par4);

                if ((var6 & 8) == 0)
                {
                    par1World.setBlockMetadataWithNotify(par2, par3, par4, var6 | 8);
                }
                else
                {
                    this.growTree(par1World, par2, par3, par4, par5Random);
                }
            }
        }
    }

    /**
     * From the specified side and block metadata retrieves the blocks texture. Args: side, metadata
     */
    public int getBlockTextureFromSideAndMetadata(int par1, int par2)
    {
        par2 &= 3;
        return par2 == 1 ? 63 : (par2 == 2 ? 79 : (par2 == 3 ? 30 : super.getBlockTextureFromSideAndMetadata(par1, par2)));
    }

    /**
     * Attempts to grow a sapling into a tree
     */
    public void growTree(World par1World, int par2, int par3, int par4, Random par5Random)
    {
    	 int var6 = par1World.getBlockMetadata(par2, par3, par4) & 3;
         //world.setBlock(i, j, k, 0);
         Object obj = null;
         obj = new WorldGenReactionCraftTree();

            {
                par1World.setBlockAndMetadata(par2, par3, par4, this.blockID, var6);
            }
     }

    public boolean func_50076_f(World par1World, int par2, int par3, int par4, int par5)
    {
        return par1World.getBlockId(par2, par3, par4) == this.blockID && (par1World.getBlockMetadata(par2, par3, par4) & 3) == par5;
    }

    /**
     * Determines the damage on the item the block drops. Used in cloth and wood.
     */
    protected int damageDropped(int par1)
    {
        return par1 & 3;
    }


	@Override
	public boolean onUseBonemeal(World world, int blockID, int X, int Y, int Z) {
		// TODO Auto-generated method stub
		return false;
	}
}




//// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
//// Jad home page: http://www.kpdus.com/jad.html
//// Decompiler options: packimports(3) braces deadcode fieldsfirst 
//
//package net.minecraft.src;
//
//import java.util.ArrayList;
//import java.util.Random;
//
//import net.minecraft.src.forge.IBonemealHandler;
//import net.minecraft.src.forge.ITextureProvider;
//
//// Referenced classes of package net.minecraft.src:
////            BlockFlower, World, WorldGenTaiga2, WorldGenForest, 
////            WorldGenTrees, WorldGenBigTree, WorldGenerator
//
//public class RcCherrySapling extends BlockFlower implements ITextureProvider, IBonemealHandler
//{
//
//    protected RcCherrySapling(int i, int j)
//    {
//        super(i, j);
//        float f = 0.4F;
//        setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f * 2.0F, 0.5F + f);
//    }
//    
//    protected boolean canThisPlantGrowOnThisBlockID(int i)
//    {
//        return i == Block.sand.blockID;
//    }
//    
//    
//    public void updateTick(World world, int i, int j, int k, Random random)
//    {
//        
//        
//        super.updateTick(world, i, j, k, random);
//        
//        if(world.getBlockLightValue(i, j + 1, k) >= 9 && random.nextInt(7) == 0)
//        {
//            int l = world.getBlockMetadata(i, j, k);
//            if((l & 8) == 0)
//            {
//                world.setBlockMetadataWithNotify(i, j, k, l | 8);
//            } else
//            {
//                growTree(world, i, j, k, random);
//            }
//        }
//    }
//
//    public int getBlockTextureFromSideAndMetadata(int i, int j)
//    {
//        j &= 3;
//        if(j == 1)
//        {
//            return blockIndexInTexture;  //63
//        }
//        if(j == 2)
//        {
//            return blockIndexInTexture; //79
//        } else
//        {
//            //return super.getBlockTextureFromSideAndMetadata(i, j);
//        	return blockIndexInTexture;
//        }
//    }
//
//    public void growTree(World world, int i, int j, int k, Random random)
//    {
//        int l = world.getBlockMetadata(i, j, k) & 3;
//        world.setBlock(i, j, k, 0);
//        Object obj = null;
//        obj = new WorldGenReactionCraftTree();
//        /*if(l == 1)
//        {
//            obj = new WorldGenTaiga2(true);
//        } else
//        if(l == 2)
//        {
//            obj = new WorldGenForest(true);
//        } else
//        {
//            obj = new WorldGenTrees(true);
//            if(random.nextInt(10) == 0)
//            {
//                obj = new WorldGenBigTree(true);
//            }
//        }*/
//        if(!((WorldGenerator) (obj)).generate(world, random, i, j, k))
//        {
//            world.setBlockAndMetadata(i, j, k, blockID, l);
//        }
//    }
//
//    protected int damageDropped(int i)
//    {
//        return i & 3;
//    }
//    
//    public void fertilize(World par1World, int par2, int par3, int par4)
//    {
//        par1World.setBlockMetadataWithNotify(par2, par3, par4, 7);
//    }
//    
//    @Override
//    public void addCreativeItems(ArrayList itemList)
//    {
//        itemList.add(new ItemStack(this));
//    }
//    
//	@Override
//	public String getTextureFile() {
//		// TODO Auto-generated method stub
//		return "/reactioncraft/Blocks.png";
//	}
//
//	@Override
//	public boolean onUseBonemeal(World world, int blockID, int X, int Y, int Z) {
//		// TODO Auto-generated method stub
//		return true;
//	}
//}
