package net.minecraft.src;

import java.util.Arrays;
import java.util.List;

public class WorldType
{
    /** List of world types. */
    public static final WorldType[] worldTypes = new WorldType[16];

    /** Default world type. */
    public static final WorldType DEFAULT = (new WorldType(0, "default", 1)).func_48448_d();

    /** Flat world type. */
    public static final WorldType FLAT = new WorldType(1, "flat");

    /** Default (1.1) world type. */
    public static final WorldType DEFAULT_1_1 = (new WorldType(8, "default_1_1", 0)).setCanBeCreated(false);
    private final String worldType;

    /** The int version of the ChunkProvider that generated this world. */
    private final int generatorVersion;

    /**
     * Whether this world type can be generated. Normally true; set to false for out-of-date generator versions.
     */
    private boolean canBeCreated;
    private boolean field_48460_h;

    private BiomeGenBase[] biomesForWorldType;
    
    private WorldType(int par1, String par2Str)
    {
        this(par1, par2Str, 0);
    }

    private WorldType(int par1, String par2Str, int par3)
    {
        this.worldType = par2Str;
        this.generatorVersion = par3;
        this.canBeCreated = true;
        worldTypes[par1] = this;
        switch (par1) {
            case 8:
                biomesForWorldType = new BiomeGenBase[] { BiomeGenBase.desert, BiomeGenBase.forest, BiomeGenBase.extremeHills,
                        BiomeGenBase.swampland, BiomeGenBase.plains, BiomeGenBase.taiga };
                break;
            default:
                biomesForWorldType = new BiomeGenBase[] { BiomeGenBase.desert, BiomeGenBase.forest, BiomeGenBase.extremeHills,
                        BiomeGenBase.swampland, BiomeGenBase.plains, BiomeGenBase.taiga, BiomeGenBase.jungle };
        }            
    }

    public String func_48449_a()
    {
        return this.worldType;
    }

    /**
     * Returns generatorVersion.
     */
    public int getGeneratorVersion()
    {
        return this.generatorVersion;
    }

    public WorldType func_48451_a(int par1)
    {
        return this == DEFAULT && par1 == 0 ? DEFAULT_1_1 : this;
    }

    /**
     * Sets canBeCreated to the provided value, and returns this.
     */
    private WorldType setCanBeCreated(boolean par1)
    {
        this.canBeCreated = par1;
        return this;
    }

    private WorldType func_48448_d()
    {
        this.field_48460_h = true;
        return this;
    }

    public boolean func_48453_c()
    {
        return this.field_48460_h;
    }

    public static WorldType parseWorldType(String par0Str)
    {
        for (int var1 = 0; var1 < worldTypes.length; ++var1)
        {
            if (worldTypes[var1] != null && worldTypes[var1].worldType.equalsIgnoreCase(par0Str))
            {
                return worldTypes[var1];
            }
        }

        return null;
    }
    
    public BiomeGenBase[] getBiomesForWorldType() {
        return biomesForWorldType;
    }
    
    public void addNewBiome(BiomeGenBase biome) {
        List<BiomeGenBase> biomes=Arrays.asList(biomesForWorldType);
        biomes.add(biome);
        biomesForWorldType=biomes.toArray(new BiomeGenBase[0]);
    }
}
