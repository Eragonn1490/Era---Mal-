package net.minecraft.src.Reactioncraft;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.src.AxisAlignedBB;
import net.minecraft.src.Block;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;
import net.minecraft.src.MovingObjectPosition;
import net.minecraft.src.Vec3D;
import net.minecraft.src.World;
import net.minecraft.src.forge.ITextureProvider;

public class RcTorchBlock extends Block implements ITextureProvider
{
    protected RcTorchBlock(int i, int j)
    {
        super(i, j, Material.circuits);
        this.setTickRandomly(true);
    }

    public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int i, int j, int k)
    {
        return null;
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
        return 2;
    }

    private boolean canPlaceTorchOn(World world, int i, int j, int k)
    {
        if (world.isBlockSolidOnSide(i, j, k, 1))
        {
            return true;
        }
        else
        {
            int l = world.getBlockId(i, j, k);
            return l == Block.fence.blockID || l == Block.netherFence.blockID;
        }
    }

    public boolean canPlaceBlockAt(World world, int i, int j, int k)
    {
        if (world.isBlockSolidOnSide(i - 1, j, k, 5))
        {
            return true;
        }
        if (world.isBlockSolidOnSide(i + 1, j, k, 4))
        {
            return true;
        }
        if (world.isBlockSolidOnSide(i, j, k - 1, 3))
        {
            return true;
        }
        if (world.isBlockSolidOnSide(i, j, k + 1, 2))
        {
            return true;
        }
        return canPlaceTorchOn(world, i, j - 1, k);
    }

    public void onBlockPlaced(World world, int i, int j, int k, int l)
    {
        int i1 = world.getBlockMetadata(i, j, k);
        if (l == 1 && canPlaceTorchOn(world, i, j - 1, k))
        {
            i1 = 5;
        }
        if (l == 2 && world.isBlockSolidOnSide(i, j, k + 1, 2))
        {
            i1 = 4;
        }
        if (l == 3 && world.isBlockSolidOnSide(i, j, k - 1, 3))
        {
            i1 = 3;
        }
        if (l == 4 && world.isBlockSolidOnSide(i + 1, j, k, 4))
        {
            i1 = 2;
        }
        if (l == 5 && world.isBlockSolidOnSide(i - 1, j, k, 5))
        {
            i1 = 1;
        }
        world.setBlockMetadataWithNotify(i, j, k, i1);
    }

    public void updateTick(World world, int i, int j, int k, Random random)
    {
        super.updateTick(world, i, j, k, random);
        if (world.getBlockMetadata(i, j, k) == 0)
        {
            onBlockAdded(world, i, j, k);
        }
    }

    public void onBlockAdded(World world, int i, int j, int k)
    {
        if (world.isBlockSolidOnSide(i - 1, j, k, 5))
        {
            world.setBlockMetadataWithNotify(i, j, k, 1);
        }
        else if (world.isBlockSolidOnSide(i + 1, j, k, 4))
        {
            world.setBlockMetadataWithNotify(i, j, k, 2);
        }
        else if (world.isBlockSolidOnSide(i, j, k - 1, 3))
        {
            world.setBlockMetadataWithNotify(i, j, k, 3);
        }
        else if (world.isBlockSolidOnSide(i, j, k + 1, 2))
        {
            world.setBlockMetadataWithNotify(i, j, k, 4);
        }
        else if (canPlaceTorchOn(world, i, j - 1, k))
        {
            world.setBlockMetadataWithNotify(i, j, k, 5);
        }
        dropTorchIfCantStay(world, i, j, k);
    }

    public void onNeighborBlockChange(World world, int i, int j, int k, int l)
    {
        if (dropTorchIfCantStay(world, i, j, k))
        {
            int i1 = world.getBlockMetadata(i, j, k);
            boolean flag = false;
            if (!world.isBlockSolidOnSide(i - 1, j, k, 5) && i1 == 1)
            {
                flag = true;
            }
            if (!world.isBlockSolidOnSide(i + 1, j, k, 4) && i1 == 2)
            {
                flag = true;
            }
            if (!world.isBlockSolidOnSide(i, j, k - 1, 3) && i1 == 3)
            {
                flag = true;
            }
            if (!world.isBlockSolidOnSide(i, j, k + 1, 2) && i1 == 4)
            {
                flag = true;
            }
            if (!canPlaceTorchOn(world, i, j - 1, k) && i1 == 5)
            {
                flag = true;
            }
            if (flag)
            {
                dropBlockAsItem(world, i, j, k, world.getBlockMetadata(i, j, k), 0);
                world.setBlockWithNotify(i, j, k, 0);
            }
        }
    }

    private boolean dropTorchIfCantStay(World world, int i, int j, int k)
    {
        if (!canPlaceBlockAt(world, i, j, k))
        {
            if (world.getBlockId(i, j, k) == blockID)
            {
                dropBlockAsItem(world, i, j, k, world.getBlockMetadata(i, j, k), 0);
                world.setBlockWithNotify(i, j, k, 0);
            }
            return false;
        }
        else
        {
            return true;
        }
    }

    public MovingObjectPosition collisionRayTrace(World world, int i, int j, int k, Vec3D vec3d, Vec3D vec3d1)
    {
        int l = world.getBlockMetadata(i, j, k) & 7;
        float f = 0.15F;
        if (l == 1)
        {
            setBlockBounds(0.0F, 0.2F, 0.5F - f, f * 2.0F, 0.8F, 0.5F + f);
        }
        else if (l == 2)
        {
            setBlockBounds(1.0F - f * 2.0F, 0.2F, 0.5F - f, 1.0F, 0.8F, 0.5F + f);
        }
        else if (l == 3)
        {
            setBlockBounds(0.5F - f, 0.2F, 0.0F, 0.5F + f, 0.8F, f * 2.0F);
        }
        else if (l == 4)
        {
            setBlockBounds(0.5F - f, 0.2F, 1.0F - f * 2.0F, 0.5F + f, 0.8F, 1.0F);
        }
        else
        {
            float f1 = 0.1F;
            setBlockBounds(0.5F - f1, 0.0F, 0.5F - f1, 0.5F + f1, 0.6F, 0.5F + f1);
        }
        return super.collisionRayTrace(world, i, j, k, vec3d, vec3d1);
    }

    public void randomDisplayTick(World world, int i, int j, int k, Random random)
    {
        int l = world.getBlockMetadata(i, j, k);
        double d = (float)i + 0.5F;
        double d1 = (float)j + 0.7F;
        double d2 = (float)k + 0.5F;
        double d3 = 0.2199999988079071D;
        double d4 = 0.27000001072883606D;
        if (l == 1)
        {
            world.spawnParticle("smoke", d - d4, d1 + d3, d2, 0.0D, 0.0D, 0.0D);
        }
        else if (l == 2)
        {
            world.spawnParticle("smoke", d + d4, d1 + d3, d2, 0.0D, 0.0D, 0.0D);
        }
        else if (l == 3)
        {
            world.spawnParticle("smoke", d, d1 + d3, d2 - d4, 0.0D, 0.0D, 0.0D);
        }
        else if (l == 4)
        {
            world.spawnParticle("smoke", d, d1 + d3, d2 + d4, 0.0D, 0.0D, 0.0D);
        }
        else
        {
            world.spawnParticle("smoke", d, d1, d2, 0.0D, 0.0D, 0.0D);
        }
    }
    public int quantityDropped(Random random)
    {
            return 1;
    }
    public int idDropped(int i, Random random, int j)
    {
        {
                return blockID;
        }
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
