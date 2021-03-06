package net.minecraft.src.Reactioncraft;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.src.AxisAlignedBB;
import net.minecraft.src.Block;
import net.minecraft.src.BlockFence;
import net.minecraft.src.IBlockAccess;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;
import net.minecraft.src.World;
import net.minecraft.src.forge.ITextureProvider;

public class BlockFenceRc1 extends BlockFence implements ITextureProvider
{
    public BlockFenceRc1(int i, int j)
    {
        super(i, j, Material.wood);
    }

    public BlockFenceRc1(int i, int j, Material material)
    {
        super(i, j, material);
    }

    public boolean canPlaceBlockAt(World world, int i, int j, int k)
    {
        return super.canPlaceBlockAt(world, i, j, k);
    }

    public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int i, int j, int k)
    {
        boolean flag = canConnectFenceTo(world, i, j, k - 1);
        boolean flag1 = canConnectFenceTo(world, i, j, k + 1);
        boolean flag2 = canConnectFenceTo(world, i - 1, j, k);
        boolean flag3 = canConnectFenceTo(world, i + 1, j, k);
        float f = 0.375F;
        float f1 = 0.625F;
        float f2 = 0.375F;
        float f3 = 0.625F;
        if (flag)
        {
            f2 = 0.0F;
        }
        if (flag1)
        {
            f3 = 1.0F;
        }
        if (flag2)
        {
            f = 0.0F;
        }
        if (flag3)
        {
            f1 = 1.0F;
        }
        return AxisAlignedBB.getBoundingBoxFromPool((float)i + f, j, (float)k + f2, (float)i + f1, (float)j + 1.5F, (float)k + f3);
    }

    public void setBlockBoundsBasedOnState(IBlockAccess iblockaccess, int i, int j, int k)
    {
        boolean flag = canConnectFenceTo(iblockaccess, i, j, k - 1);
        boolean flag1 = canConnectFenceTo(iblockaccess, i, j, k + 1);
        boolean flag2 = canConnectFenceTo(iblockaccess, i - 1, j, k);
        boolean flag3 = canConnectFenceTo(iblockaccess, i + 1, j, k);
        float f = 0.375F;
        float f1 = 0.625F;
        float f2 = 0.375F;
        float f3 = 0.625F;
        if (flag)
        {
            f2 = 0.0F;
        }
        if (flag1)
        {
            f3 = 1.0F;
        }
        if (flag2)
        {
            f = 0.0F;
        }
        if (flag3)
        {
            f1 = 1.0F;
        }
        setBlockBounds(f, 0.0F, f2, f1, 1.0F, f3);
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
        return 11;
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
    
    public boolean canConnectFenceTo(IBlockAccess iblockaccess, int i, int j, int k)
    {
        int l = iblockaccess.getBlockId(i, j, k);
        if (l == blockID || l == Block.fenceGate.blockID)
        {
            return true;
        }
        Block block = Block.blocksList[l];
        if (block != null && block.blockMaterial.isOpaque() && block.renderAsNormalBlock())
        {
            return block.blockMaterial != Material.pumpkin;
        }
        else
        {
            return false;
        }
    }

	@Override
	public String getTextureFile() {
		// TODO Auto-generated method stub
		return "/reactioncraft/rcs/extendedcolumn.png";
	}
}
