package net.minecraft.src.Reactioncraft;
import net.minecraft.src.Block;
import net.minecraft.src.Entity;
import net.minecraft.src.EntityLiving;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.EnumAction;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.World;
import net.minecraft.src.forge.*;

public class BloodStoneSword extends Item implements ITextureProvider
{

	private int weaponDamage;
    private final EnumRcToolMaterial field_40439_b;

    public BloodStoneSword(int i, EnumRcToolMaterial rcenumtoolmaterial)
    {
        super(i);
        field_40439_b = rcenumtoolmaterial;
        maxStackSize = 1;
        setMaxDamage(rcenumtoolmaterial.getMaxUses());
        weaponDamage = 4 + rcenumtoolmaterial.getDamageVsEntity();
    }

    public float getStrVsBlock(ItemStack itemstack, Block block)
    {
        return block.blockID != Block.web.blockID ? 1.5F : 15F;
    }

    public boolean hitEntity(ItemStack itemstack, EntityLiving entityliving, EntityLiving entityliving1)
    {
        itemstack.damageItem(1, entityliving1);
        return true;
    }

    public boolean onBlockDestroyed(ItemStack itemstack, int i, int j, int k, int l, EntityLiving entityliving)
    {
        itemstack.damageItem(2, entityliving);
        return true;
    }

    public int getDamageVsEntity(Entity entity)
    {
        return weaponDamage;
    }

    public boolean isFull3D()
    {
        return true;
    }

    public EnumAction getItemUseAction(ItemStack itemstack)
    {
        return EnumAction.block;
    }

    public int getMaxItemUseDuration(ItemStack itemstack)
    {
        return 0x11940;
    }

    public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entityplayer)
    {
        entityplayer.setItemInUse(itemstack, getMaxItemUseDuration(itemstack));
        return itemstack;
    }

    public boolean canHarvestBlock(Block block)
    {
        return block.blockID == Block.web.blockID;
    }

    public int getItemEnchantability()
    {
        return field_40439_b.getEnchantability();
    }
    public String getTextureFile()
	{
		return "/reactioncraft/Items.png";
	}
}