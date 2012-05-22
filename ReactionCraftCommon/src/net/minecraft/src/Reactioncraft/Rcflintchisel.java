package net.minecraft.src.Reactioncraft;
import java.util.ArrayList;

import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.forge.*;

public class Rcflintchisel extends Item implements ITextureProvider
{
	private int maxDamage = 5;
	
	public Rcflintchisel(int i)
	{
		super(i);
		maxStackSize = 1;
	}
	
	
	//start rc v2.0 code
	public boolean getHasSubtypes()
    {
        return this.hasSubtypes;
    }

    protected Item setHasSubtypes(boolean par1)
    {
        this.hasSubtypes = par1;
        return this;
    }
	
	/**
     * Returns the maximum damage an item can take.
     */
    public int getMaxDamage()
    {
        return this.maxDamage;
    }

    /**
     * set max damage of an Item
     */
    protected Item setMaxDamage(int par1)
    {
        this.maxDamage = par1;
        return this;
    }

    public boolean isDamageable()
    {
        return this.maxDamage > 0 && !this.hasSubtypes;
    }
	
	/**
     * Checks isDamagable and if it cannot be stacked
     */
    public boolean isItemTool(ItemStack par1ItemStack)
    {
        return this.getItemStackLimit() == 1 && this.isDamageable();
    }
    
	public Item setNoRepair() 
    {
        canRepair = false;
        return this;
    }
	
	//end rcv2.0 code
	
	public void addCreativeItems(ArrayList itemList)
    {
        itemList.add(new ItemStack(this));
    }
	public String getTextureFile()
	{
		return "/reactioncraft/Items.png";
	}
}
