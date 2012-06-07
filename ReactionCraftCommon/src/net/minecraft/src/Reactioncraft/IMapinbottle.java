package net.minecraft.src.Reactioncraft;
import java.util.ArrayList;
import java.util.Random;

import net.minecraft.src.*;
import net.minecraft.src.forge.ITextureProvider;

public class IMapinbottle extends Item implements ITextureProvider
{
	public IMapinbottle(int i)
	{
		super(i);
	}
	
	
	public int idDropped(int i, Random random)
	{
	        return Item.map.shiftedIndex;
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
