package net.minecraft.src.railcraft.common.api;

import net.minecraft.src.Block;
import net.minecraft.src.BlockRail;
import net.minecraft.src.ItemBlock;
import net.minecraft.src.ItemStack;
import net.minecraft.src.TileEntity;
import net.minecraft.src.World;

/**
 * A number of utility functions related to rails.
 * @author CovertJaguar <railcraft.wikispaces.com>
 */
public abstract class RailTools
{

    /**
     * Attempts to place a rail of the type provided.
     * There is no need to verify that the ItemStack contains a valid rail
     * prior to calling this function.
     *
     * The function takes care of that and will return false if the ItemStack
     * is not a valid ITrackItem or an ItemBlock who's id
     * will return true when passed to BlockRail.isRailBlock(itemID).
     *
     * That means this function can place any Railcraft or vanilla rail
     * and has at least a decent chance of being able to place
     * most third party rails.
     *
     * @param stack The ItemStack containing the rail
     * @param world The World object
     * @param i x-Coord
     * @param j y-Coord
     * @param k z-Coord
     * @return true if successful
     * @see ITrackItem
     */
    public static boolean placeRailAt(ItemStack stack, World world, int i, int j, int k)
    {
        if(stack == null) {
            return false;
        }
        if(stack.getItem() instanceof ITrackItem) {
            return ((ITrackItem)stack.getItem()).placeTrack(stack.copy(), world, i, j, k);
        }
        if(stack.getItem() instanceof ItemBlock && stack.itemID < Block.blocksList.length && BlockRail.isRailBlock(stack.itemID)) {
            boolean success = world.setBlockWithNotify(i, j, k, stack.itemID);
            if(success) {
                world.playSoundEffect((float)i + 0.5F, (float)j + 0.5F, (float)k + 0.5F, Block.rail.stepSound.getStepSound(), (Block.rail.stepSound.getVolume() + 1.0F) / 2.0F, Block.rail.stepSound.getPitch() * 0.8F);
            }
            return success;
        }
        return false;
    }

    /**
     * Returns true if the ItemStack contains a valid Railcraft Track item.
     *
     * Will return false is passed a vanilla rail.
     *
     * @param stack The ItemStack to test
     * @return true if rail
     * @see ITrackItem
     */
    public static boolean isTrackItem(ItemStack stack)
    {
        return stack != null && stack.getItem() instanceof ITrackItem;
    }

    /**
     *
     * @param world
     * @param i
     * @param j
     * @param k
     * @return
     */
    public static boolean isSpeedRailAt(World world, int i, int j, int k)
    {
        int id = world.getBlockId(i, j, k);
        Block block = Block.blocksList[id];
        if(block instanceof IRailSpeed) {
            return true;
        }
        TileEntity tile = world.getBlockTileEntity(i, j, k);
        return tile instanceof IRailSpeed;
    }

    /**
     * Returns true if there is a rail sloping upward from this location.
     * @param world The World object
     * @param i x-Coord
     * @param j y-Coord
     * @param k z-Coord
     * @return true if the is a slope
     */
    public static boolean isNeighborRailUpSlope(World world, int i, int j, int k)
    {
        for(int side = 2; side < 6; side++) {
            int jj = j;
            int id = GeneralTools.getBlockIdOnSide(world, i, jj, k, side);
            if(!BlockRail.isRailBlock(id)) {
                j++;
                id = GeneralTools.getBlockIdOnSide(world, i, jj, k, side);
                if(!BlockRail.isRailBlock(id)) {
                    continue;
                }
            }
            int meta = GeneralTools.getBlockMetadataFromSide(world, i, jj, k, side);
            if(meta == 2 || meta == 3 || meta == 4 || meta == 5) {
                return true;
            }
        }
        return false;
    }

    /**
     * Verifies that two rails are connected to each other
     * along a straight line with no gaps or wanderings.
     * @param world The World object
     * @param i1 x-Coord of Rail #1
     * @param j1 y-Coord of Rail #1
     * @param k1 z-Coord of Rail #1
     * @param i2 x-Coord of Rail #2
     * @param j2 y-Coord of Rail #2
     * @param k2 z-Coord of Rail #2
     * @return true if they are connected
     */
    public static boolean areDistantRailsConnectedAlongAxis(World world, int i1, int j1, int k1, int i2, int j2, int k2)
    {
        if(j1 < 0 || j2 < 0) {
            return false;
        }
        if(i1 != i2 && k1 != k2) {
            return false;
        }
        if(i1 != i2) {
            int min = 0;
            int max = 0;
            int jj = 0;
            if(i1 < i2) {
                min = i1;
                max = i2;
                jj = j1;
            } else {
                min = i2;
                max = i1;
                jj = j2;
            }
            for(int ii = min; ii <= max; ii++) {
                if(world.blockExists(ii, jj, k1)) {
                    if(BlockRail.isRailBlockAt(world, ii, jj, k1)) {
                        continue;
                    } else if(BlockRail.isRailBlockAt(world, ii, jj - 1, k1)) {
                        jj--;
                        continue;
                    } else if(BlockRail.isRailBlockAt(world, ii, jj + 1, k1)) {
                        jj++;
                        continue;
                    } else {
                        return false;
                    }
                }
            }
        } else if(k1 != k2) {
            int min = 0;
            int max = 0;
            int jj = 0;
            if(k1 < k2) {
                min = k1;
                max = k2;
                jj = j1;
            } else {
                min = k2;
                max = k1;
                jj = j2;
            }
            for(int kk = min; kk <= max; kk++) {
                if(world.blockExists(i1, jj, kk)) {
                    if(BlockRail.isRailBlockAt(world, i1, jj, kk)) {
                        continue;
                    } else if(BlockRail.isRailBlockAt(world, i1, jj - 1, kk)) {
                        jj--;
                        continue;
                    } else if(BlockRail.isRailBlockAt(world, i1, jj + 1, kk)) {
                        jj++;
                        continue;
                    } else {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
