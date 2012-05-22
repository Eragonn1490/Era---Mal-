package net.minecraft.src.Reactioncraft;
import java.util.ArrayList;

import net.minecraft.src.ItemFood;
import net.minecraft.src.ItemStack;
import net.minecraft.src.forge.*;

public class ItemFoodRc extends ItemFood implements ITextureProvider
{
	public ItemFoodRc(int par1, int par2, float par3, boolean par4)
    {
        super(par1, par2, par4);
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
