package net.minecraft.src.Reactioncraft;

import net.minecraft.src.Block;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;
import net.minecraft.src.forge.ITextureProvider;

public class RcBloodStonePicaxe extends RcItemTool implements ITextureProvider
{

    private static Block blocksEffectiveAgainst[];
    private int weaponDamage;
    private final RcEnumToolMaterial field_40439_b;

    public RcBloodStonePicaxe(int i, RcEnumToolMaterial rcenumtoolmaterial)
    {
        super(i, 2, rcenumtoolmaterial, blocksEffectiveAgainst);
        field_40439_b = rcenumtoolmaterial;
        maxStackSize = 1;
        setMaxDamage(rcenumtoolmaterial.getMaxUses());
        weaponDamage = 4 + rcenumtoolmaterial.getDamageVsEntity();
    }

    public boolean canHarvestBlock(Block block)
    {
        if(block == Block.obsidian)
        {
            return toolMaterial.getHarvestLevel() == 3;
        }
        if(block == Block.blockDiamond || block == Block.oreDiamond)
        {
            return toolMaterial.getHarvestLevel() >= 2;
        }
        if(block == Block.blockGold || block == Block.oreGold)
        {
            return toolMaterial.getHarvestLevel() >= 2;
        }
        if(block == Block.blockSteel || block == Block.oreIron)
        {
            return toolMaterial.getHarvestLevel() >= 1;
        }
        if(block == Block.blockLapis || block == Block.oreLapis)
        {
            return toolMaterial.getHarvestLevel() >= 1;
        }
        if(block == Block.oreRedstone || block == Block.oreRedstoneGlowing)
        {
            return toolMaterial.getHarvestLevel() >= 2;
        }
        if(block.blockMaterial == Material.rock)
        {
            return true;
        }
        return block.blockMaterial == Material.iron;
    }

    public float getStrVsBlock(ItemStack itemstack, Block block)
    {
        if(block != null && (block.blockMaterial == Material.iron || block.blockMaterial == Material.rock))
        {
            return efficiencyOnProperMaterial;
        } else
        {
            return super.getStrVsBlock(itemstack, block);
        }
    }

    static 
    {
        blocksEffectiveAgainst = (new Block[] {
            Block.cobblestone, Block.stairDouble, Block.stairSingle, Block.stone, Block.sandStone, Block.cobblestoneMossy, Block.oreIron, Block.blockSteel, Block.oreCoal, Block.blockGold, 
            Block.oreGold, Block.oreDiamond, Block.blockDiamond, Block.ice, Block.netherrack, Block.oreLapis, Block.blockLapis, Block.oreRedstone, Block.oreRedstoneGlowing, Block.rail, 
            Block.railDetector, Block.railPowered
        });
    }
    
    public String getTextureFile()
	{
		return "/reactioncraft/Items.png";
	}
}