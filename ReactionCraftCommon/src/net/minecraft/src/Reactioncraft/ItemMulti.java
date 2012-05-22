package net.minecraft.src.Reactioncraft;

import net.minecraft.src.ItemBlock;
import net.minecraft.src.ItemStack;

public class ItemMulti extends ItemBlock
{
	public ItemMulti(int i) 
	{
		super(i);
		setMaxDamage(0);
		setHasSubtypes(true);
	}
	public String[] blockNames =
		{
			"Block Name", "Block Name 1", "Block Name 2", "Block Name 3", "Block Name 4", "Block Name 5", "Block Name 6", "Block Name 7", "Block Name 8", "Block Name 9", "Block Name 10", "Block Name 11", "Block Name 12", "Block Name 13", "Block Name 14", "Block Name 15"
		};
	public String getItemNameIS(ItemStack itemstack)
	{
		return(new StringBuilder()).append(super.getItemName()).append(".").append(blockNames[itemstack.getItemDamage()]).toString();
	}
	
	public int getMetadata(int i)
    {
        return i;
    }
	
	public int getPlacedBlockMetadata(int i)
	{
		return i;
	}
	
}