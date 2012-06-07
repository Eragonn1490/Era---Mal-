package net.minecraft.src.railcraft.common.api;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import net.minecraft.src.Block;
import net.minecraft.src.EntityLiving;
import net.minecraft.src.IBlockAccess;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;
import net.minecraft.src.MathHelper;
import net.minecraft.src.ModLoader;
import net.minecraft.src.TileEntity;
import net.minecraft.src.World;
import net.minecraft.src.forge.ForgeHooks;

public abstract class GeneralTools
{

    private static Random rand = new Random();
    public static final int BUCKET_VOLUME = 1000;

    /**
     * Returns a Random instance.
     * @return Random
     */
    public static Random getRand()
    {
        return rand;
    }

    /**
     * Wrapper function for Buildcraft API to allow Railcraft to work with
     * either Buildcraft API. Only functional if Buildcraft API is avaliable.
     * @param bucket An ItemStack representing a filled bucket, can, etc...
     * @return The liquid id for the item.
     */
    public static int getLiquidForBucket(ItemStack bucket)
    {
        try {
            Class api = Class.forName("buildcraft.api.API");

            Method[] methods = api.getMethods();
            for(Method m : methods) {
                if(m.getName().equals("getLiquidForBucket")) {
                    return (Integer)m.invoke(null, bucket.itemID);
                }
            }
        } catch (Exception ex) {
        }
        try {
            Class api = Class.forName("buildcraft.api.BuildCraftAPI");

            Method[] methods = api.getMethods();
            for(Method m : methods) {
                if(m.getName().equals("getLiquidForFilledItem")) {
                    return (Integer)m.invoke(null, bucket);
                }
            }
        } catch (Exception ex) {
        }
        return 0;
    }

    /**
     * Helper function to retrieve the list of registered Liquids from the Buildcraft API.
     * @return A List of LiquidData object, version of LiquidData may vary.
     */
    public static List getLiquidData()
    {
        try {
            Class api = Class.forName("buildcraft.api.BuildCraftAPI");

            if(api == null) {
                api = Class.forName("buildcraft.api.API");
            }

            if(api != null) {
                Field[] fields = api.getFields();
                for(Field f : fields) {
                    if(f.getName().equals("liquids")) {
                        Object obj = f.get(null);
                        if(obj instanceof List) {
                            return (List)obj;
                        }
                    }
                }
            }
        } catch (Exception ex) {
        }
        return new LinkedList();
    }

    /**
     * Wrapper function for Buildcraft API to allow Railcraft to work with
     * either Buildcraft API. Only functional if Buildcraft API is avaliable.
     *
     * @param id the id of the liquid in question
     * @return a filled bucket ItemStack
     */
    public static ItemStack getBucketForLiquid(int id)
    {
        try {
            List liquids = getLiquidData();

            for(Object lq : liquids) {
                Field liquidId = lq.getClass().getField("liquidId");
                Object li = liquidId.get(lq);
                if(li instanceof Integer) {
                    Integer intId = (Integer)li;
                    if(intId.intValue() == id) {
                        try {
                            Field container = lq.getClass().getField("container");
                            Object c = container.get(lq);
                            if(c instanceof ItemStack) {
                                ItemStack emtpy = (ItemStack)c;
                                if(emtpy.itemID == Item.bucketEmpty.shiftedIndex) {
                                    Field filled = lq.getClass().getField("filled");
                                    Object f = filled.get(lq);
                                    if(f instanceof ItemStack) {
                                        return (ItemStack)f;
                                    }
                                }
                            }
                        } catch (Exception ex) {
                        }

                        try {
                            Field filledBucketId = lq.getClass().getField("filledBucketId");
                            Object fb = filledBucketId.get(lq);
                            if(fb instanceof Integer) {
                                Integer intFB = (Integer)fb;
                                return new ItemStack(intFB, 1, 0);
                            }
                        } catch (Exception ex) {
                        }
                    }
                }
            }
        } catch (Exception ex) {
        }
        return null;
    }

    /**
     * Replacement function for fuel values
     * since most users seem to overwrite TileEntityFurnace.
     * @param stack The item to test
     * @return The fuel value
     */
    public static int getItemBurnTime(ItemStack stack)
    {
        if(stack == null) {
            return 0;
        } else {
            int id = stack.getItem().shiftedIndex;
            if(id < 256 && Block.blocksList[id].blockMaterial == Material.wood) {
                return 300;
            }
            if(id == Item.stick.shiftedIndex) {
                return 100;
            }
            if(id == Item.coal.shiftedIndex) {
                return 1600;
            }
            if(id == Item.bucketLava.shiftedIndex) {
                return 20000;
            }
            if(id == Block.sapling.blockID) {
                return 100;
            }
            if(id == Item.blazeRod.shiftedIndex) {
                return 2400;
            }
            int ret = ForgeHooks.getItemBurnTime(stack);
            return (ret > 0 ? ret : ModLoader.addAllFuel(stack.itemID, stack.getItemDamage()));
        }
    }

    /**
     * Returns the side closest to the player. Used in placement logic for blocks.
     * @param world
     * @param i
     * @param j
     * @param k
     * @param entityplayer
     * @return a side
     */
    public static byte getDirectionPlaced(World world, int i, int j, int k, EntityLiving entityplayer)
    {
        if(MathHelper.abs((float)entityplayer.posX - (float)i) < 2.0F && MathHelper.abs((float)entityplayer.posZ - (float)k) < 2.0F) {
            double d = (entityplayer.posY + 1.8200000000000001D) - (double)entityplayer.yOffset;
            if(d - (double)j > 2D) {
                return EnumDirection.UP.getValue();
            }
            if((double)j - d > 0.0D) {
                return EnumDirection.DOWN.getValue();
            }
        }
        int l = MathHelper.floor_double((double)((entityplayer.rotationYaw * 4F) / 360F) + 0.5D) & 3;
        if(l == 0) {
            return EnumDirection.NORTH.getValue();
        }
        if(l == 1) {
            return EnumDirection.EAST.getValue();
        }
        if(l == 2) {
            return EnumDirection.SOUTH.getValue();
        }
        return l != 3 ? EnumDirection.DOWN.getValue() : EnumDirection.WEST.getValue();
    }

    /**
     * This function unlike getDirectionPlaced can only return north, south, east, west.
     * @param world
     * @param x
     * @param y
     * @param z
     * @param player
     * @return a side
     */
    public static byte getFacingPlaced(World world, int i, int j, int k, EntityLiving player)
    {
        EnumDirection facing = EnumDirection.NORTH;
        int dir = MathHelper.floor_double((double)((player.rotationYaw * 4.0F) / 360.0F) + 0.5) & 3;
        if(dir == 0) {
            facing = EnumDirection.NORTH;
        }
        if(dir == 1) {
            facing = EnumDirection.EAST;
        }
        if(dir == 2) {
            facing = EnumDirection.SOUTH;
        }
        if(dir == 3) {
            facing = EnumDirection.WEST;
        }
        return facing.getValue();
    }

    // Helper functions to simplify logic involving adjecent blocks.
    public static byte getOppositeSide(int side)
    {
        return (byte)(side % 2 == 0 ? side + 1 : side - 1);
    }

    public static int getYOnSide(int j, int side)
    {
        if(side == 0) {
            return j - 1;
        } else if(side == 1) {
            return j + 1;
        }
        return j;
    }

    public static int getXOnSide(int i, int side)
    {
        if(side == 4) {
            return i - 1;
        } else if(side == 5) {
            return i + 1;
        }
        return i;
    }

    public static int getZOnSide(int k, int side)
    {
        if(side == 2) {
            return k - 1;
        } else if(side == 3) {
            return k + 1;
        }
        return k;
    }

    public static int getBlockMetadataFromSide(World world, int i, int j, int k, int side)
    {
        return world.getBlockMetadata(getXOnSide(i, side), getYOnSide(j, side), getZOnSide(k, side));
    }

    public static int getBlockIdOnSide(IBlockAccess world, int i, int j, int k, int side)
    {
        return world.getBlockId(getXOnSide(i, side), getYOnSide(j, side), getZOnSide(k, side));
    }

    public static TileEntity getBlockTileEntityFromSide(World world, int i, int j, int k, int side)
    {
        return world.getBlockTileEntity(getXOnSide(i, side), getYOnSide(j, side), getZOnSide(k, side));
    }

    public static void notifyBlocksOfNeighborChangeOnSide(World world, int i, int j, int k, int blockID, int side)
    {
        world.notifyBlocksOfNeighborChange(getXOnSide(i, side), getYOnSide(j, side), getZOnSide(k, side), blockID);
    }
}