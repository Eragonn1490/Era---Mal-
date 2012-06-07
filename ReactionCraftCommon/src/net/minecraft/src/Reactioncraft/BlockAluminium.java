package net.minecraft.src.Reactioncraft;

import java.util.Random;

import net.minecraft.src.Block;
import net.minecraft.src.BlockContainer;
import net.minecraft.src.Material;
import net.minecraft.src.TileEntity;
import net.minecraft.src.World;
import net.minecraft.src.mod_ReactionCraft;
import net.minecraft.src.forge.ITextureProvider;

public class BlockAluminium extends BlockContainer implements ITextureProvider
{
	
	private Class BlockAluminiumEntityClass;
	
	
        public BlockAluminium(int i,int j, Class tClass)
        {
                super(i, j, Material.wood);
                BlockAluminiumEntityClass = tClass;
        }
        public TileEntity getBlockEntity()
        {
        	try
        	{
        		return (TileEntity)BlockAluminiumEntityClass.newInstance();
        		
        	}
        	catch(Exception exception)
        	{
        		throw new RuntimeException(exception);
        	}
  
        }
        public int idDropped(int i, Random random, int j)
        {
        	return blockID;
        	//return mod_ReactionCraft.GoldBarsItem.shiftedIndex;
        }
        public int quantityDropped(Random random)
        {
        	return 1;
        }
    
        public int getRenderTyp()
        {
        	return -1;
        }
        
        public boolean isOpaqueCube()
        {
        	return false;
        }
 
        public boolean renderAsNormalBlock()
        {
        	return false;
        }
               
        public String getTextureFile()
        {
                return "betterworld/textures/terrain.png";
        }          

}