package net.minecraft.src.railcraft.common.api;

import net.minecraft.src.forge.MinecraftForge;

/**
 * This interface it used to define an item that can
 * be used as a bore head for the Tunnel Bore.
 * @author CovertJaguar <railcraft.wikispaces.com>
 */
public interface IBoreHead
{

    /**
     * Return the texture file used for this bore head.
     * @return The texture file path
     */
    public String getBoreTexture();

    /**
     * Return the harvest level of this bore head.
     *
     * This value is compared against the tool classes
     * "pickaxe", "axe", and "shovel" to determine if the
     * block is harvestable by the bore head.
     *
     * @return The harvest level
     * @see MinecraftForge
     */
    public int getHarvestLevel();

    /**
     * Return the dig speed modifier of this bore head.
     *
     * This value controls how much faster or slow this bore head
     * mines each layer compared to the default time.
     *
     * @return The dig speed modifier
     */
    public float getDigModifier();
}
