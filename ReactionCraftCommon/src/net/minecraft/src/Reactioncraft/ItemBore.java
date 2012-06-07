package net.minecraft.src.Reactioncraft;

import net.minecraft.src.Item;

public abstract class ItemBore extends Item implements net.minecraft.src.forge.ITextureProvider, net.minecraft.src.railcraft.common.api.IBoreHead
{
    protected ItemBore(int var1)
    {
        super(var1);
        this.maxStackSize = 1;
    }

    public String getTextureFile()
    {
        return "/reactioncraft/rcs/Items.png";
    }
}