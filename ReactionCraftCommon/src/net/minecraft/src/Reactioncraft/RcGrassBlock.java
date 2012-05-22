package net.minecraft.src.Reactioncraft;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.src.Block;
import net.minecraft.src.BlockFlower;
import net.minecraft.src.ColorizerGrass;
import net.minecraft.src.IBlockAccess;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;
import net.minecraft.src.World;
import net.minecraft.src.mod_ReactionCraft;
import net.minecraft.src.forge.ITextureProvider;

public class RcGrassBlock extends BlockFlower implements ITextureProvider
{
    public RcGrassBlock(int par1)
    {
        super(par1, par1, Material.grass);
        this.blockIndexInTexture = 34;
        this.setTickRandomly(true);
        float f = 0.2F;
        setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f * 3F, 0.5F + f);
    }

    public boolean renderAsNormalBlock()
    {
        return false;
    }
    
    public int getBlockColor()
    {
        double var1 = 0.5D;
        double var3 = 1.0D;
        return ColorizerGrass.getGrassColor(var1, var3);
    }

    public int getRenderColor(int par1)
    {
        return this.getBlockColor();
    }

    public int colorMultiplier(IBlockAccess par1IBlockAccess, int par2, int par3, int par4)
    {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;

        for (int var8 = -1; var8 <= 1; ++var8)
        {
            for (int var9 = -1; var9 <= 1; ++var9)
            {
                int var10 = par1IBlockAccess.getBiomeGenForCoords(par2 + var9, par4 + var8).getBiomeGrassColor();
                var5 += (var10 & 16711680) >> 16;
                var6 += (var10 & 65280) >> 8;
                var7 += var10 & 255;
            }
        }

        return (var5 / 9 & 255) << 16 | (var6 / 9 & 255) << 8 | var7 / 9 & 255;
    }
    
    public boolean canPlaceBlockAt(World world, int i, int j, int k)
    {
        return super.canPlaceBlockAt(world, i, j, k) && canThisPlantGrowOnThisBlockID(world.getBlockId(i, j - 1, k));
    }

    protected boolean canThisPlantGrowOnThisBlockID(int i)
    {
        return i == Block.grass.blockID || i == Block.dirt.blockID || i == Block.tilledField.blockID || i == mod_ReactionCraft.PlantPot.blockID;
    }
    
    
    public int idDropped(int i, Random random, int j)
    {
//    	int rondomNum = random.nextInt(10) == 0)
//    			if (random.nextInt = (1) return mod_ReactionCraft.RcTallGrass.blockID;
//    			else if (rondomNum <= 8) return Item.seeds.shiftedIndex;
//    			else return null;
    			
    	if(random.nextInt(5) == 0)
    		return mod_ReactionCraft.RcTallGrass.blockID;
    		return Item.seeds.shiftedIndex;   
    }
    
    public boolean isOpaqueCube()
    {
        return false;
    }

    public void addCreativeItems(ArrayList itemList)
    {
            itemList.add(new ItemStack(this));
    }
    
	@Override
	public String getTextureFile() {
		// TODO Auto-generated method stub
		return "/reactioncraft/Blocks.png";
	}
}
