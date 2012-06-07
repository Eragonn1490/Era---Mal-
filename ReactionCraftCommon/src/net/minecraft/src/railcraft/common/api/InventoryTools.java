package net.minecraft.src.railcraft.common.api;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import net.minecraft.src.BlockRail;
import net.minecraft.src.IInventory;
import net.minecraft.src.InventoryLargeChest;
import net.minecraft.src.ItemBlock;
import net.minecraft.src.ItemStack;
import net.minecraft.src.TileEntity;
import net.minecraft.src.TileEntityChest;
import net.minecraft.src.World;
import net.minecraft.src.buildcraft.api.ISpecialInventory;
import net.minecraft.src.buildcraft.api.Orientations;
import net.minecraft.src.forge.ISidedInventory;
import net.minecraft.src.forge.MinecraftForge;

public abstract class InventoryTools
{

    public static List<IInventory> getAdjacentInventories(World world, int i, int j, int k)
    {
        return getAdjacentInventories(world, i, j, k, null);
    }

    public static List<IInventory> getAdjacentInventories(World world, int i, int j, int k, Class<? extends IInventory> type)
    {
        List<IInventory> list = new ArrayList<IInventory>(5);
        for(int side = 0; side < 6; side++) {
            IInventory inv = getInventoryFromSide(world, i, j, k, side, type);
            if(inv != null) {
                list.add(inv);
            }
        }
        return list;
    }

    public static IInventory getInventoryFromSide(World world, int i, int j, int k, int side, Class<? extends IInventory> type)
    {
        i = GeneralTools.getXOnSide(i, side);
        j = GeneralTools.getYOnSide(j, side);
        k = GeneralTools.getZOnSide(k, side);

        TileEntity tile = world.getBlockTileEntity(i, j, k);
        if(tile == null || !(tile instanceof IInventory) || (type != null && !type.isAssignableFrom(tile.getClass()))) {
            return null;
        }
        IInventory inv = (IInventory)tile;
        if(inv instanceof ISpecialInventory) {
        } else if(inv instanceof ISidedInventory) {
            int s = GeneralTools.getOppositeSide(side);
            ISidedInventory sinv = (ISidedInventory)inv;
            inv = new InventoryMapper(inv, sinv.getStartInventorySide(s), sinv.getSizeInventorySide(s));
        } else if(inv instanceof TileEntityChest) {
            for(int s = 2; s < 6; s++) {
                tile = GeneralTools.getBlockTileEntityFromSide(world, i, j, k, s);
                if(tile instanceof TileEntityChest) {
                    IInventory inv2 = (IInventory)tile;
                    return new InventoryLargeChest("Large Chest", inv, inv2);
                }
            }
        }
        return inv;
    }

    public static boolean isInventoryEmpty(IInventory inv)
    {
        ItemStack stack = null;
        for(int slot = 0; slot < inv.getSizeInventory(); slot++) {
            stack = inv.getStackInSlot(slot);
            if(stack != null) {
                break;
            }
        }
        return stack == null;
    }

    public static boolean isInventoryFull(IInventory inv)
    {
        ItemStack stack = null;
        for(int slot = 0; slot < inv.getSizeInventory(); slot++) {
            stack = inv.getStackInSlot(slot);
            if(stack == null) {
                break;
            }
        }
        return stack != null;
    }

    public static int countItems(IInventory inv)
    {
        if(inv instanceof ISpecialInventory) {
            return 0;
        }
        int count = 0;
        ItemStack stack = null;
        for(int slot = 0; slot < inv.getSizeInventory(); slot++) {
            stack = inv.getStackInSlot(slot);
            if(stack != null) {
                count += stack.stackSize;
            }
        }
        return count;
    }

    public static int countItems(IInventory inv, ItemStack... filters)
    {
        if(inv instanceof ISpecialInventory) {
            return 0;
        }
        boolean hasFilter = false;
        for(ItemStack filter : filters) {
            if(filter != null) {
                hasFilter = true;
                break;
            }
        }

        if(!hasFilter) {
            return countItems(inv);
        }

        int count = 0;
        ItemStack stack = null;
        for(int slot = 0; slot < inv.getSizeInventory(); slot++) {
            stack = inv.getStackInSlot(slot);
            if(stack != null) {
                for(ItemStack filter : filters) {
                    if(filter != null && isItemEqual(stack, filter)) {
                        count += stack.stackSize;
                        break;
                    }
                }
            }
        }
        return count;
    }

    /**
     * Returns true if the inventory contains the specified item.
     *
     * @param inv The IIinventory to check
     * @param item The ItemStack to look for
     * @return true is exists
     */
    public static boolean containsItem(IInventory inv, ItemStack item)
    {
        return countItems(inv, item) > 0;
    }

    /**
     * Returns a map backed by an <code>ItemStackMap</code> that lists the total number
     * of each type of item in the inventory.
     *
     * @param inv The <code>IInventory</code> to generate the manifest for
     * @return A <code>Map</code> that lists how many of each item is in the <code>IInventory</code>
     * @see ItemStackMap
     */
    public static Map<ItemStack, Integer> getManifest(IInventory inv)
    {
        Map<ItemStack, Integer> manifest = new ItemStackMap<Integer>();
        for(int i = 0; i < inv.getSizeInventory(); i++) {
            ItemStack slot = inv.getStackInSlot(i);
            if(slot != null) {
                Integer count = manifest.get(slot);
                if(count == null) {
                    count = 0;
                }
                count += slot.stackSize;
                manifest.put(slot, count);
            }
        }
        return manifest;
    }

    /**
     * Attempts to move a single item from one inventory to another.
     * If the input inventory is an instance of ISpecialInventory,
     * it is possible that this function will move more than one item.
     * @param input
     * @param output
     * @return true if the operation was successful, false if it was not.
     */
    public static boolean moveOneItem(IInventory input, IInventory output)
    {
        if(input instanceof ISpecialInventory) {
            ItemStack inputStack = ((ISpecialInventory)input).extractItem(true, Orientations.Unknown);
            if(inputStack != null) {
                int size = inputStack.stackSize;
                ItemStack result = moveItemStack(inputStack, output);
                if(result == null || result.stackSize != size) {
                    return true;
                }
            }
            return false;
        }
        for(int inputSlot = 0; inputSlot < input.getSizeInventory(); inputSlot++) {
            ItemStack inputStack = input.getStackInSlot(inputSlot);
            if(inputStack == null) {
                continue;
            }
            ItemStack tempStack = inputStack.copy();
            tempStack.stackSize = 1;
            ItemStack result = moveItemStack(tempStack, output);
            if(result == null) {
                input.decrStackSize(inputSlot, 1);
                return true;
            }
        }
        return false;
    }

    /**
     * Attempts to move a single item from one inventory to another,
     * but only if it matches the provided filter.
     * If either inventory is an instance of ISpecialInventory,
     * this function will not move anything.
     * @param input
     * @param output
     * @param filer an ItemStack to match against
     * @return true if the operation was successful, false if it was not.
     */
    public static boolean moveOneItem(IInventory input, IInventory output, ItemStack filter)
    {
        if(input instanceof ISpecialInventory || output instanceof ISpecialInventory) {
            return false;
        }
        for(int inputSlot = 0; inputSlot < input.getSizeInventory(); inputSlot++) {
            ItemStack inputStack = input.getStackInSlot(inputSlot);
            if(inputStack == null || !isItemEqual(filter, inputStack)) {
                continue;
            }
            ItemStack tempStack = inputStack.copy();
            tempStack.stackSize = 1;
            ItemStack result = moveItemStack(tempStack, output);
            if(result == null) {
                input.decrStackSize(inputSlot, 1);
                return true;
            }
        }
        return false;
    }

    /**
     * A more robust item comparison function. Supports items with damage = -1
     * matching any sub-type.
     * @param a An ItemStack
     * @param b An ItemStack
     * @return True if equal
     */
    public static boolean isItemEqual(ItemStack a, ItemStack b)
    {
        if(a == null || b == null) {
            return false;
        }
        if(a.itemID != b.itemID) {
            return false;
        }
        if(a.getHasSubtypes() && (a.getItemDamage() == -1 || b.getItemDamage() == -1)) {
            return true;
        }
        if(a.getHasSubtypes() && a.getItemDamage() != b.getItemDamage()) {
            return false;
        }
        return true;
    }

    /**
     * Returns true if the item matches the passed item type.
     * @param stack An ItemStack
     * @param filter The type of item
     * @return True if the item is the correct type
     */
    public static boolean isItemType(ItemStack stack, EnumItemType filter)
    {
        if(stack == null || filter == null) {
            return false;
        }
        switch (filter) {
            case FUEL:
                return GeneralTools.getItemBurnTime(stack) > 0;
            case RAIL:
                return RailTools.isTrackItem(stack) || (stack.getItem() instanceof ItemBlock && BlockRail.isRailBlock(stack.itemID));
            case MINECART:
                return MinecraftForge.getCartClassForItem(stack) != null;
            default:
                return false;
        }
    }

    /**
     * Places an ItemStack in a destination IInventory. Will attempt to move as
     * much of the stack as possible, returning any remainder.
     * @param stack The ItemStack to put in the inventory.
     * @param dest The destination IInventory.
     * @return Null if itemStack was completely moved, the itemStack with remaining stackSize if part or none of the stack was moved.
     */
    public static ItemStack moveItemStack(ItemStack stack, IInventory dest)
    {
        if(stack == null) {
            return null;
        }
        stack = stack.copy();
        if(dest == null) {
            return stack;
        }
        if(dest instanceof ISpecialInventory) {
            ((ISpecialInventory)dest).addItem(stack, true, Orientations.Unknown);
            if(stack.stackSize <= 0) {
                return null;
            } else {
                return stack;
            }
        }
        boolean movedItem = false;
        do {
            movedItem = false;
            ItemStack destStack = null;
            for(int ii = 0; ii < dest.getSizeInventory(); ii++) {
                destStack = dest.getStackInSlot(ii);
                if(destStack != null && destStack.isItemEqual(stack)) {
                    int maxStack = Math.min(destStack.getMaxStackSize(), dest.getInventoryStackLimit());
                    int room = maxStack - destStack.stackSize;
                    if(room > 0) {
                        int move = Math.min(room, stack.stackSize);
                        destStack.stackSize += move;
                        stack.stackSize -= move;
                        if(stack.stackSize <= 0) {
                            return null;
                        }
                        movedItem = true;
                    }
                }
            }
            if(!movedItem) {
                for(int ii = 0; ii < dest.getSizeInventory(); ii++) {
                    destStack = dest.getStackInSlot(ii);
                    if(destStack == null) {
                        if(stack.stackSize > dest.getInventoryStackLimit()) {
                            dest.setInventorySlotContents(ii, stack.splitStack(dest.getInventoryStackLimit()));
                        } else {
                            dest.setInventorySlotContents(ii, stack);
                            return null;
                        }
                        movedItem = true;
                    }
                }
            }
        } while(movedItem);
        return stack;
    }

    /**
     * Checks if there is room for the ItemStack in the inventory.
     *
     * @param stack The ItemStack
     * @param dest The IInventory
     * @return true if room for stack
     */
    public static boolean isRoomForStack(ItemStack stack, IInventory dest)
    {
        if(stack == null) {
            return false;
        }
        if(dest == null) {
            return false;
        }
        if(dest instanceof ISpecialInventory) {
           return ((ISpecialInventory)dest).addItem(stack, false, Orientations.Unknown);
        }

        for(int ii = 0; ii < dest.getSizeInventory(); ii++) {
            ItemStack slot = dest.getStackInSlot(ii);
            if(slot == null) {
                return true;
            } else if(slot.isItemEqual(stack)) {
                int maxStack = Math.min(slot.getMaxStackSize(), dest.getInventoryStackLimit());
                int room = maxStack - slot.stackSize;
                if(room >= stack.stackSize) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Removes and returns a single item from the inventory.
     * @param inv The inventory
     * @return An ItemStack
     */
    public static ItemStack removeOneItem(IInventory inv)
    {
        for(int i = 0; i < inv.getSizeInventory(); i++) {
            ItemStack slot = inv.getStackInSlot(i);
            if(slot != null) {
                return inv.decrStackSize(i, 1);
            }
        }
        return null;
    }

    /**
     * Removes and returns a single item from the inventory that matches the filter.
     * @param inv The inventory
     * @param filter ItemStack to match against
     * @return An ItemStack
     */
    public static ItemStack removeOneItem(IInventory inv, ItemStack filter)
    {
        for(int i = 0; i < inv.getSizeInventory(); i++) {
            ItemStack slot = inv.getStackInSlot(i);
            if(slot != null && isItemEqual(slot, filter)) {
                return inv.decrStackSize(i, 1);
            }
        }
        return null;
    }

    /**
     * Removes and returns a single item from the inventory that matches the filter.
     * @param inv The inventory
     * @param filter EnumItemType to match against
     * @return An ItemStack
     */
    public static ItemStack removeOneItem(IInventory inv, EnumItemType filter)
    {
        for(int i = 0; i < inv.getSizeInventory(); i++) {
            ItemStack slot = inv.getStackInSlot(i);
            if(slot != null && isItemType(slot, filter)) {
                return inv.decrStackSize(i, 1);
            }
        }
        return null;
    }
}
