package net.minecraft.src.Reactioncraft;
import java.util.ArrayList;

import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.forge.*;

public class ItemForge extends Item implements ITextureProvider
{
	public ItemForge(int i)
	{
		super(i);
	}
	
	
	public void addCreativeItems(ArrayList itemList)
    {
        itemList.add(new ItemStack(this));
    }
	public String getTextureFile()
	{
		return "/reactioncraft/rcs/Items.png";
	}
}
