package net.minecraft.src.railcraft.common.api;

import net.minecraft.src.EntityMinecart;

/**
 * Any rail tile entity that can completely halt
 * all cart movement should implement this interface.
 * @author CovertJaguar <railcraft.wikispaces.com>
 */
public interface ILockdownRail extends IRail
{

    public boolean isCartLockedDown(EntityMinecart cart);
}
