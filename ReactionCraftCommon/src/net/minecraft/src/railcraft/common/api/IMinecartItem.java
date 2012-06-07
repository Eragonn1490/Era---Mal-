package net.minecraft.src.railcraft.common.api;

import net.minecraft.src.EntityMinecart;
import net.minecraft.src.ItemStack;
import net.minecraft.src.World;

/**
 * This interface should be implemented by any cart item,
 * but it is generally optional.
 *
 * @author CovertJaguar <railcraft.wikispaces.com>
 */
public interface IMinecartItem
{

    /**
     * Controls whether this cart item can be placed by the Cart and Train Dispensers.
     *
     * Generally, you can ignore the placeCart() function if this returns false.
     *
     * @return true if it can be placed, false otherwise
     */
    public boolean canBePlacedByNonPlayer(ItemStack cart);

    /**
     * Places a cart at the specified location.
     *
     * Implementing this function is optional.
     *
     * @param cart An ItemStack that contains the cart
     * @param world The World
     * @param i x-Coord
     * @param j y-Coord
     * @param k z-Coord
     * @return true if the cart was placed, false otherwise
     */
    public boolean placeCart(ItemStack cart, World world, int i, int j, int k);

    /**
     * Returns the entity class associated with this item.
     *
     * @param cart An ItemStack that contains the cart
     * @return the cart class
     */
    public Class<? extends EntityMinecart> getCartClass(ItemStack cart);

    /**
     * Returns the minecartType associated with this cart item.
     *
     * @param cart An ItemStack that contains the cart
     * @return minecartType
     */
    public int getCartType(ItemStack cart);
}
