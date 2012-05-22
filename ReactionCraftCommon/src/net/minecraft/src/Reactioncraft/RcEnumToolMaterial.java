package net.minecraft.src.Reactioncraft;

public enum RcEnumToolMaterial 
{
		Bone("Bone", 1, 1, 131, 4F, 1, 5),
		GOLDCHISEL("GOLDCHISEL", 1, 1, 5, 4F, 1, 5),
		FLINTCHISEL("FLINTCHISEL", 1, 1, 10, 4F, 1, 5),
		BLOODSTONE("BLOODSTONE", 5, 5, 2000, 10.0F, 3, 10);
	
		//
		
	    private final int harvestLevel;
	    private final int maxUses;
	    private final float efficiencyOnProperMaterial;
	    private final int damageVsEntity;
	    private final int enchantability;
	    private static final RcEnumToolMaterial[] allToolMaterials; /* synthetic field */
	
	    //
	    
	    private RcEnumToolMaterial(String s, int i, int j, int k, float f, int l, int i1)
	    {
//	        super(s, i);
	        harvestLevel = j;
	        maxUses = k;
	        efficiencyOnProperMaterial = f;
	        damageVsEntity = l;
	        enchantability = i1;
	    }

	    public int getMaxUses()
	    {
	        return maxUses;
	    }

	    public float getEfficiencyOnProperMaterial()
	    {
	        return efficiencyOnProperMaterial;
	    }

	    public int getDamageVsEntity()
	    {
	        return damageVsEntity;
	    }

	    public int getHarvestLevel()
	    {
	        return harvestLevel;
	    }

	    public int getEnchantability()
	    {
	        return enchantability;
	    }

	    static 
	    {
	   
	    // Cojomax99
	    
	        allToolMaterials = (new RcEnumToolMaterial[] {
	            BLOODSTONE, Bone, GOLDCHISEL, FLINTCHISEL
	        });
	    }
	}


