package net.minecraft.src.railcraft.common.api;

import net.minecraft.src.EntityPlayer;
import net.minecraft.src.IInventory;
import net.minecraft.src.ItemStack;

/**
 * Wrapper class used to specify part of an existing
 * inventory to be treated as a complete inventory.
 * Used primarily to map a side of an ISidedInventory,
 * but it is also helpful for complex inventories
 * such as the Tunnel Bore.
 *
 * @author CovertJaguar <railcraft.wikispaces.com>
 */
public class InventoryMapper implements IInventory {

	 private final IInventory inv;
	 private final int start;
	 private final int size;

     /**
      * Creates a new InventoryMapper
      * @param inv The backing inventory
      * @param start The starting index
      * @param size The size of the new inventory, take care not to exceed the end of the backing inventory
      */
     public InventoryMapper(IInventory inv, int start, int size) {
		  this.inv = inv;
		  this.start = start;
		  this.size = size;
	 }

	 @Override
	 public int getSizeInventory() {
		  return size;
	 }

	 @Override
	 public ItemStack getStackInSlot(int i) {
		  return inv.getStackInSlot(start + i);
	 }

	 @Override
	 public ItemStack decrStackSize(int i, int j) {
		  return inv.decrStackSize(start + i, j);
	 }

	 @Override
	 public void setInventorySlotContents(int i, ItemStack itemstack) {
		  inv.setInventorySlotContents(start + i, itemstack);
	 }

	 @Override
	 public String getInvName() {
		  return inv.getInvName();
	 }

	 @Override
	 public int getInventoryStackLimit() {
		  return inv.getInventoryStackLimit();
	 }

	 @Override
	 public void onInventoryChanged() {
		  inv.onInventoryChanged();
	 }

	 @Override
	 public boolean isUseableByPlayer(EntityPlayer entityplayer) {
		  return inv.isUseableByPlayer(entityplayer);
	 }

     @Override
	 public void openChest() {
		  inv.openChest();
	 }

     @Override
	 public void closeChest() {
		  inv.closeChest();
	 }

    @Override
    public ItemStack getStackInSlotOnClosing(int i)
    {
        return inv.getStackInSlotOnClosing(start + i);
    }
}
