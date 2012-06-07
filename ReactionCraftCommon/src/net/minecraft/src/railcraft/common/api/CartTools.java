package net.minecraft.src.railcraft.common.api;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.src.AxisAlignedBB;
import net.minecraft.src.BlockRail;
import net.minecraft.src.EntityMinecart;
import net.minecraft.src.ItemMinecart;
import net.minecraft.src.ItemStack;
import net.minecraft.src.MathHelper;
import net.minecraft.src.ModLoader;
import net.minecraft.src.TileEntity;
import net.minecraft.src.World;
import net.minecraft.src.forge.MinecraftForge;
import net.minecraft.src.forge.NetworkMod;

public abstract class CartTools
{

    private static ILinkageManager linkageManager;

    /**
     * Registers a subclass of EntityMinecart with the game engine.
     * @param mod The mod doing the registration
     * @param type The class of the cart
     * @param tag The String identifier
     * @param entityId The entity id
     * @param internalId The mods internal entity id
     */
    public static void registerMinecart(NetworkMod mod, Class<? extends EntityMinecart> type, String tag, int entityId, int internalId)
    {
        ModLoader.registerEntityID(type, tag, entityId);
        MinecraftForge.registerEntity(type, mod, internalId, 80, 2, true);
    }

    /**
     * Returns an instance of ILinkageManager.
     *
     * Will return null if Railcraft is not installed.
     *
     * @return an instance of ILinkageManager
     */
    public static ILinkageManager getLinkageManager()
    {
        if(linkageManager != null) {
            return linkageManager;
        }
        try {
            Class c = null;
            try {
                c = Class.forName("railcraft.common.carts.LinkageManager");
            } catch (Throwable e) {
                c = Class.forName("net.minecraft.src.railcraft.common.carts.LinkageManager");
            }
            Method m = c.getMethod("getInstance");
            linkageManager = (ILinkageManager)m.invoke(null, new Object[0]);
            return linkageManager;
        } catch (Throwable e) {
        }
        return null;
    }

    /**
     * Spawns a new cart entity using the provided item.
     *
     * The backing item must implement <code>IMinecartItem</code>
     * and/or extend <code>ItemMinecart</code>.
     *
     * Generally Forge requires all cart items to extend ItemMinecart.
     *
     * @param cart An ItemStack containing a cart item, will not be changed by the function
     * @param world The World object
     * @param i x-Coord
     * @param j y-Coord
     * @param k z-Coord
     * @return true if placed successfully, false if not
     * @see IMinecartItem, ItemMinecart
     */
    public static boolean placeCart(ItemStack cart, World world, int i, int j, int k)
    {
        if(cart == null) {
            return false;
        }
        cart = cart.copy();
        if(cart.getItem() instanceof IMinecartItem) {
            IMinecartItem mi = (IMinecartItem)cart.getItem();
            return mi.placeCart(cart, world, i, j, k);
        } else if(cart.getItem() instanceof ItemMinecart) {
            try {
                return cart.getItem().onItemUse(cart, null, world, i, j, k, 0);
            } catch (Exception e) {
                return false;
            }
        }

        return false;
    }

    public static boolean isMinecartOnRailAt(World world, int i, int j, int k, float sensitivity)
    {
        return isMinecartOnRailAt(world, i, j, k, sensitivity, null, true);
    }

    public static boolean isMinecartOnRailAt(World world, int i, int j, int k, float sensitivity, Class<? extends EntityMinecart> type, boolean subclass)
    {
        if(BlockRail.isRailBlockAt(world, i, j, k)) {
            return isMinecartAt(world, i, j, k, sensitivity, type, subclass);
        }
        return false;
    }

    public static boolean isMinecartOnAnySide(World world, int i, int j, int k, float sensitivity)
    {
        return isMinecartOnAnySide(world, i, j, k, sensitivity, null, true);
    }

    public static boolean isMinecartOnAnySide(World world, int i, int j, int k, float sensitivity, Class<? extends EntityMinecart> type, boolean subclass)
    {
        List<EntityMinecart> list = new ArrayList<EntityMinecart>();
        for(int side = 0; side < 6; side++) {
            list.addAll(getMinecartsOnSide(world, i, j, k, sensitivity, side));
        }

        if(type == null) {
            return !list.isEmpty();
        } else {
            for(EntityMinecart cart : list) {
                if((subclass && type.isInstance(cart)) || cart.getClass() == type) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isMinecartAt(World world, int i, int j, int k, float sensitivity)
    {
        return isMinecartAt(world, i, j, k, sensitivity, null, true);
    }

    public static boolean isMinecartAt(World world, int i, int j, int k, float sensitivity, Class<? extends EntityMinecart> type, boolean subclass)
    {
        List<EntityMinecart> list = getMinecartsAt(world, i, j, k, sensitivity);

        if(type == null) {
            return !list.isEmpty();
        } else {
            for(EntityMinecart cart : list) {
                if((subclass && type.isInstance(cart)) || cart.getClass() == type) {
                    return true;
                }
            }
        }
        return false;
    }

    public static List<EntityMinecart> getMinecartsOnAllSides(World world, int i, int j, int k, float sensitivity)
    {
        List<EntityMinecart> carts = new ArrayList<EntityMinecart>();
        for(int side = 0; side < 6; side++) {
            carts.addAll(getMinecartsOnSide(world, i, j, k, sensitivity, side));
        }

        return carts;
    }

    public static List<EntityMinecart> getMinecartsOnAllSides(World world, int i, int j, int k, float sensitivity, Class<? extends EntityMinecart> type, boolean subclass)
    {
        List<EntityMinecart> list = new ArrayList<EntityMinecart>();
        List<EntityMinecart> carts = new ArrayList<EntityMinecart>();
        for(int side = 0; side < 6; side++) {
            list.addAll(getMinecartsOnSide(world, i, j, k, sensitivity, side));
        }

        for(EntityMinecart cart : list) {
            if((subclass && type.isInstance(cart)) || cart.getClass() == type) {
                carts.add(cart);
            }
        }
        return carts;
    }

    public static List<EntityMinecart> getMinecartsOnSide(World world, int i, int j, int k, float sensitivity, int side)
    {
        return getMinecartsAt(world, GeneralTools.getXOnSide(i, side), GeneralTools.getYOnSide(j, side), GeneralTools.getZOnSide(k, side), sensitivity);
    }

    public static boolean isMinecartOnSide(World world, int i, int j, int k, float sensitivity, int side)
    {
        return getMinecartOnSide(world, i, j, k, sensitivity, side) != null;
    }

    public static EntityMinecart getMinecartOnSide(World world, int i, int j, int k, float sensitivity, int side)
    {
        for(EntityMinecart cart : getMinecartsOnSide(world, i, j, k, sensitivity, side)) {
            return cart;
        }
        return null;
    }

    public static boolean isMinecartOnSide(World world, int i, int j, int k, float sensitivity, int side, Class<? extends EntityMinecart> type, boolean subclass)
    {
        return getMinecartOnSide(world, i, j, k, sensitivity, side, type, subclass) != null;
    }

    public static EntityMinecart getMinecartOnSide(World world, int i, int j, int k, float sensitivity, int side, Class<? extends EntityMinecart> type, boolean subclass)
    {
        for(EntityMinecart cart : getMinecartsOnSide(world, i, j, k, sensitivity, side)) {
            if(type == null || (subclass && type.isInstance(cart)) || cart.getClass() == type) {
                return cart;
            }
        }
        return null;
    }

    /**
     *
     * @param world
     * @param i
     * @param j
     * @param k
     * @param sensitivity Controls the size of the search box, ranges from (-inf, 0.49].
     * @return
     */
    public static List<EntityMinecart> getMinecartsAt(World world, int i, int j, int k, float sensitivity)
    {
        sensitivity = Math.min(sensitivity, 0.49f);
        List entities = world.getEntitiesWithinAABB(net.minecraft.src.EntityMinecart.class, AxisAlignedBB.getBoundingBoxFromPool(i + sensitivity, j + sensitivity, k + sensitivity, i + 1 - sensitivity, j + 1 - sensitivity, k + 1 - sensitivity));
        List<EntityMinecart> carts = new ArrayList<EntityMinecart>();
        for(Object o : entities) {
            carts.add((EntityMinecart)o);
        }
        return carts;
    }

    public static List<EntityMinecart> getMinecartsIn(World world, int i1, int j1, int k1, int i2, int j2, int k2)
    {
        List entities = world.getEntitiesWithinAABB(net.minecraft.src.EntityMinecart.class, AxisAlignedBB.getBoundingBoxFromPool(i1, j1, k1, i2, j2, k2));
        List<EntityMinecart> carts = new ArrayList<EntityMinecart>();
        for(Object o : entities) {
            carts.add((EntityMinecart)o);
        }
        return carts;
    }

    /**
     * Returns the cart's "speed". It is not capped by the carts max speed,
     * it instead returns the cart's "potential" speed.
     * Used by collision and linkage logic.
     * Do not use this to determine how fast a cart is currently moving.
     * @param cart
     * @return speed
     */
    public static double getCartSpeedUncapped(EntityMinecart cart)
    {
        return Math.sqrt(cart.motionX * cart.motionX + cart.motionZ * cart.motionZ);
    }

    public static boolean cartVelocityIsLessThan(EntityMinecart cart, float vel)
    {
        return Math.abs(cart.motionX) < vel && Math.abs(cart.motionZ) < vel;
    }

    /**
     * Checks to see if a cart is being held by a ILockdownRail.
     * @param cart The cart to check
     * @return True if being held
     */
    public static boolean isCartLockedDown(EntityMinecart cart)
    {
        int x = MathHelper.floor_double(cart.posX);
        int y = MathHelper.floor_double(cart.posY);
        int z = MathHelper.floor_double(cart.posZ);

        if(BlockRail.isRailBlockAt(cart.worldObj, x, y - 1, z)) {
            y--;
        }

        TileEntity rail = cart.worldObj.getBlockTileEntity(x, y, z);
        return rail instanceof ILockdownRail && ((ILockdownRail)rail).isCartLockedDown(cart);
    }
}
