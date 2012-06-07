package net.minecraft.src.Reactioncraft;
import net.minecraft.src.*;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.src.Block;
import net.minecraft.src.BlockContainer;
import net.minecraft.src.Material;
import net.minecraft.src.TileEntity;
import net.minecraft.src.World;
import net.minecraft.src.forge.ITextureProvider;

public class IronGStatue extends BlockContainer implements ITextureProvider
{
	
	private Class IronGolemStatueEntityClass;
	
	
        public IronGStatue(int i,int j, Class tClass)
        {
                super(i, j, Material.wood);
                IronGolemStatueEntityClass = tClass;
                this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F);
        }
        
        
        public TileEntity getBlockEntity()
        {
        	try
        	{
        		return (TileEntity)IronGolemStatueEntityClass.newInstance();
        		
        	}
        	catch(Exception exception)
        	{
        		throw new RuntimeException(exception);
        	}
  
        }
        public int idDropped(int i, Random random, int j)
        {
        	return blockID;
        }
        public int quantityDropped(Random random)
        {
        	return 1;
        }
    
        public int getRenderType()
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
        
        public void addCreativeItems(ArrayList itemList)
        {
                itemList.add(new ItemStack(this));
        }
        
        public String getTextureFile()
        {
                return "/reactioncraft/rcs/creeperstatue.png";
        }          

}