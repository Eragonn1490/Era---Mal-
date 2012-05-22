package net.minecraft.src.Reactioncraft;
import java.util.ArrayList;

import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.forge.*;

public class RcForgeItem extends Item implements ITextureProvider
{
	public RcForgeItem(int i)
	{
		super(i);
	}
	
	
	public void addCreativeItems(ArrayList itemList)
    {
        itemList.add(new ItemStack(this));
    }
	public String getTextureFile()
	{
		return "/reactioncraft/Items.png";
	}
}
