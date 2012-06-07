package net.minecraft.src.Reactioncraft;

import net.minecraft.src.Item;
import net.minecraft.src.forge.ITextureProvider;
import net.minecraft.src.railcraft.common.api.IBoreHead;


public class IBlackDiamondBH extends ItemBore implements IBoreHead
{
    public IBlackDiamondBH(int var1)
    {
        super(var1);
        maxStackSize = 1;
        this.setMaxDamage(6500);
    }
 
    public String getBoreTexture()
    {
        return "/reactioncraft/rcs/tunnel_bore_bloodstone.png";
    }

    public int getHarvestLevel()
    {
        return 3;
    }

    public float getDigModifier()
    {
        return 1.4F;
    }

}
