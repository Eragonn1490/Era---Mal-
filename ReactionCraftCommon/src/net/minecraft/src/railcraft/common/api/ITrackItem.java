package net.minecraft.src.railcraft.common.api;

import net.minecraft.src.ItemStack;
import net.minecraft.src.World;

/**
 * Should be implemented by any rail item class that wishes to have
 * it's rails placed by for example the Tunnel Bore.
 * @author CovertJaguar <railcraft.wikispaces.com>
 */
public interface ITrackItem
{

    /**
     * Attempts to place a rail.
     *
     * @param world The World object
     * @param i x-Coord
     * @param j y-Coord
     * @param k z-Coord
     * @return true if successful
     */
    public boolean placeTrack(ItemStack stack, World world, int i, int j, int k);
}
