package net.minecraft.src.Reactioncraft;

import net.minecraft.src.BiomeDecorator;
import net.minecraft.src.BiomeGenBase;
import net.minecraft.src.WorldGenerator;

public class BiomeDecoratorDesertGems extends BiomeDecorator
{
	protected int DesertOrePerChunk;
	protected int DesertOre1PerChunk;
	protected int LimestonePerChunk;
	protected int DesertGoldPerChunk;
	protected WorldGenerator DesertGen;
	protected WorldGenerator DesertGen1;
	protected WorldGenerator DesertGen2;
	protected WorldGenerator DesertGen3;
	
	
	public BiomeDecoratorDesertGems(BiomeGenBase biomegenbase)
	{
		super(biomegenbase);
		DesertGen = new WorldGenLightBlueGem();
		DesertGen1 = new WorldGenDarkBlueGem();
		DesertGen2 = new WorldGenLimestone();
		DesertGen3 = new WorldGenDesertGold();
	}
	
	@Override
	protected void decorate() {
		// TODO Auto-generated method stub
		super.decorate();
		int var1;
        int var2;
        int var3;
        int var4;
        int var7;
        
        //DesertOre
        for (var2 = 0; var2 < this.DesertOrePerChunk; ++var2)
        {
            var3 = this.chunk_X + this.randomGenerator.nextInt(16);
            var4 = this.randomGenerator.nextInt(80);
            var7 = this.chunk_Z + this.randomGenerator.nextInt(16);
            DesertGen.generate(this.currentWorld, this.randomGenerator, var3, var4, var7);
        }
        
        //DesertOre1
		for (var2 = 0; var2 < this.DesertOre1PerChunk; ++var2)
        {
            var3 = this.chunk_X + this.randomGenerator.nextInt(16);
            var4 = this.randomGenerator.nextInt(80);
            var7 = this.chunk_Z + this.randomGenerator.nextInt(16);
            DesertGen1.generate(this.currentWorld, this.randomGenerator, var3, var4, var7);
        }
		
		//DesertGold
		for (var2 = 0; var2 < this.DesertGoldPerChunk; ++var2)
        {
            var3 = this.chunk_X + this.randomGenerator.nextInt(16);
            var4 = this.randomGenerator.nextInt(80);
            var7 = this.chunk_Z + this.randomGenerator.nextInt(16);
            DesertGen3.generate(this.currentWorld, this.randomGenerator, var3, var4, var7);
        }
		
		//Limestone
		for (var2 = 0; var2 < this.LimestonePerChunk; ++var2)
        {
            var3 = this.chunk_X + this.randomGenerator.nextInt(16);
            var4 = this.randomGenerator.nextInt(80);
            var7 = this.chunk_Z + this.randomGenerator.nextInt(16);
            DesertGen2.generate(this.currentWorld, this.randomGenerator, var3, var4, var7);
        }
	}
	
}
