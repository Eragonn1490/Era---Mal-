package net.minecraft.src.railcraft.common.api;

import net.minecraft.src.EntityPlayer;
import net.minecraft.src.World;

/**
 * This interface is to be implemented by any block or tile entity class that wishes
 * to interact with the crowbar.
 * @author CovertJaguar
 */
public interface ICrowbarTarget
{

    /**
     * This is called by the Crowbar item. First on the Tile Entity if it exists,
     * otherwise on the block.
     * @param player The Player entity.
     * @param world The World object.
     * @param i X-Coord
     * @param j Y-Coord
     * @param k Z-Coord
     * @param side The side of the block clicked on.
     * @return True if the Crowbar was "used", causing damage to the item.
     */
    public boolean onCrowbarClick(EntityPlayer player, World world, int i, int j, int k, byte side);
}
