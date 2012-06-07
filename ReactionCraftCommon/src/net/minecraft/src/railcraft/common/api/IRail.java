package net.minecraft.src.railcraft.common.api;

import net.minecraft.src.EntityMinecart;
import net.minecraft.src.IBlockAccess;
import net.minecraft.src.World;

/**
 * This interface defines a rail. Any block or tile entity that implements this interface will be treated like a rail.
 * @author CovertJaguar
 */
public interface IRail
{

    /**
     * Return the rail's metadata (without the power bit if the rail uses one).
     * Can be used to make the cart think the rail something other than it is,
     * for example when making diamond junctions or switches.
     * 
     * Valid rail metadata is defined as follows:
     * 0x0: flat track going North-South
     * 0x1: flat track going West-East
     * 0x2: track ascending to the East
     * 0x3: track ascending to the West
     * 0x4: track ascending to the North
     * 0x5: track ascending to the South
     * 0x6: WestNorth corner (connecting East and South)
     * 0x7: EastNorth corner (connecting West and South)
     * 0x8: EastSouth corner (connecting West and North)
     * 0x9: WestSouth corner (connecting East and North)
     * 
     * All directions are Notch defined.
     * In MC Beta 1.8.3 the Sun rises in the North.
     * In MC 1.0.0 the Sun rises in the East.
     * @param world The world.
     * @param cart The cart asking for the metadata, null if it is not called by EntityMinecart.
     * @param i The rail X coordinate.
     * @param j The rail Y coordinate.
     * @param k The rail Z coordinate.
     * @return The metadata.
     */
    public int getBasicRailMetadata(IBlockAccess world, EntityMinecart cart, int i, int j, int k);

    /**
     * Return true if the rail can make corners.
     * Used by placement logic.
     * @param world The world.
     * @param i The rail X coordinate.
     * @param j The rail Y coordinate.
     * @param k The rail Z coordinate.
     * @return true if the rail can make corners.
     */
    public boolean isFlexibleRail(World world, int i, int j, int k);

    /**
     * Returns true if the rail can make up and down slopes.
     * Used by placement logic.
     * @param world The world.
     * @param i The rail X coordinate.
     * @param j The rail Y coordinate.
     * @param k The rail Z coordinate.
     * @return true if the rail can make slopes.
     */
    public boolean canMakeSlopes(World world, int i, int j, int k);

    /**
     * Returns the max speed of the rail at [i, j, k].
     * @param world The world.
     * @param cart The cart on the rail, may be null.
     * @param i The rail X coordinate.
     * @param j The rail Y coordinate.
     * @param k The rail Z coordinate.
     * @return The max speed of the current rail.
     */
    public float getRailMaxSpeed(World world, EntityMinecart cart, int i, int j, int k);

    /**
     * This function is called by any minecart that passes over this rail.
     * It is called once per update tick that the minecart is on the rail.
     * @param world The world.
     * @param cart The cart on the rail.
     * @param i The rail X coordinate.
     * @param j The rail Y coordinate.
     * @param k The rail Z coordinate.
     */
    public void onMinecartPass(World world, EntityMinecart cart, int i, int j, int k);

    /**
     * Return true if this rail uses the 4th bit as a power bit.
     * Avoid using this function when getRailMetadataForCart() can be used instead.
     * The only reason to use this function is if you wish to change the rail's metadata.
     * @param world The world.
     * @param i The rail X coordinate.
     * @param j The rail Y coordinate.
     * @param k The rail Z coordinate.
     * @return true if the 4th bit is a power bit.
     */
    public boolean hasPowerBit(World world, int i, int j, int k);
}
