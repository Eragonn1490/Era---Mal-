package net.minecraft.src;

import java.io.File;
import java.util.*;

import net.minecraft.src.forge.*;
import net.minecraft.src.Reactioncraft.*;

public class mod_ReactionCraft extends NetworkMod
{	
	public String getVersion()
    { 
            return "1.2.5";
    }
	
	
		/** Meta Blocks **/
		public static Block Multi;
		public static Block FlowerMulti;
		public static Block NetherMulti;
		public static Block HireoMulti;
		public static Block BushesMulti;
		public static Block SkinnyColumnMulti;
		public static Block ColumnMulti;
		public static Block OreMulti;
		public static Block MetalBlockMulti;
		public static Block BrickMulti;
		public static Block DesertBlockMulti;
		public static Block CarpetMulti;
		public static Block FossilMulti;
		public static Block FenceMulti;
		public static Block GlowShroomMulti;
		public static Block ShellMulti;
		public static Block LanternMulti;
		public static Block CactusMulti;
		
		
		/**Non Meta Blocks **/
		
		//Plant Pot
		public static Block PlantPot;
		
		//Ores
		public static Block BloodStone;
		
		//Explosives
		public static Block CreeperBlock;
	    public static Block DylanNuke;
		
	    
	    //Bamboo like
	    public static Block Bamboo;
		public static Block NetherCane;
		public static Block SeaWeed;
	    
		
		//Bee Blocks
		public static Block Hiveblock;
		public static Block Cellblock;
		public static Block Larvablock;
		
		
		//Sand Blocks
		public static Block DarkSand;
		
		
		//Desert Blocks
		public static Block DesertOre;
	    public static Block DesertOre1;
	    public static Block DesertGold;
	    public static Block DesertRock;
	    public static Block DesertCrackedStone;
	    public static Block LimeStone;
		 
	    
	    //Marble
	    public static Block Marble;
	    public static Block Marblec;
	    
	    
	    //Plants
	    public static Block AncientPlant;
	    public static Block OrangeKush;     	
        public static Block Blueberryyy; 
    	public static Block LemonKush;     	
    	public static Block BlueDream; 
    	public static Block Fire; 	
    	public static Block Crystal; 
	    public static Block WildKush;
	    
	    //Redstone Related Blocks
	    public static Block TrapBlock;
	    public static Block RedStoneBlock;
	    public static Block RedStoneBlockc;
	    
	    
	    //Trampoline
	    public static Block Bouncy;
	    
	    
	    //Liquids
	    public static Block MagmaliquidMoving;
	    public static Block MagmaliquidStill;
	    
	    
	    //Slabs
	    public static Block BloodStoneSlab;
	    public static Block GoldSlab;
	    public static Block DiamondSlab;
	    public static Block BedRockSlab;
	    public static Block StainedSlab;
	    public static Block MarbleSlab;
	    
	    
	    //Stairs
	    public static Block StainedStep;
	    public static Block GoldStep;
	    public static Block BedRockStep;
	    public static Block DiamondStep;
	    public static Block Glowstonestep;
	    public static Block Sandstonestep;
	    public static Block BBstep;
	    public static Block DesertBrickStep;
	    public static Block DesertBricksStep;
	    public static Block MarbleStep;
		 
	    
	    //Plants
	    public static Block ReedPlant;
	    
	  //Grass
        public static Block RcTallGrass;
        
        
        //Coral
        public static Block OrangeCoral;
    	public static Block GreenCoral;
    	public static Block PurpleCoral;
    	public static Block BrownCoral;
    	public static Block BlueCoral;
    	public static Block LightBlueCoral;
        public static Block LightGreenCoral;
        public static Block PinkCoral;
        public static Block LightBlueOrangeCoral;
        public static Block LightBlueCoral2;
        public static Block DarkGreenCoral;
        public static Block RedCoral;
        public static Block MagentaCoral;
        
        
        //Torches
        public static Block MysticTorch;
        
        
        //Cherry Tree Blocks
        public static Block RcLeaves1;
        public static Block Cherrywood;
        public static Block CherrySapling;
	    
        public static Block  GL;
        public static Block  Rope;
        public static Block  VineL;
        public static Block  ChainL;


        public static Block  CoralBlock1;
        public static Block  CoralBlock2;
        public static Block  CoralBlock3;

        public static Block  GlowingGrass;

        public static Block  Chain;

        public static Block  PermaFrost;

        public static Block  Fence;
        public static Block  BSFence;
        public static Block  CobbleFence;
        public static Block  MarbleFence;
        public static Block  StoneFence;

        public static Block  Bookcasedoor;

        public static Block  Vase;

        public static Block  SteelSpike;
        public static Block  SteelSpikeu;

        public static Block  StainedPlank;
        
        //Custom Block Model Blocks
        	//Custom Blocks
        public static Block blockAluminium;
        	//Statues
        public static Block creeperStatue;
        public static Block HumanStatue; 
        public static Block ZombieStatue; 
        public static Block SpiderStatue; 
        public static Block cowstatue;
        public static Block pigstatue;
        public static Block skeletonstatue; 
        public static Block villagerstatue; 
        public static Block endermanstatue; 
        public static Block irongolemstatue;
        public static Block dragonstatue;
        	//SnowMan
        public static Block Snowman;
        	//Starfish
        public static Block Starfish;
        
        
		 
		/**    *******************     Items     ****************************      **/
				 
			    
			    //Dusts-Clumps of ores - Shards From ores
			    public static Item BloodStoneDust;
				public static Item IronDust;
			    public static Item GoldClump;
			    public static Item GreenGlowShroomDust;
			    public static Item PurpleGlowShroomDust1;
			    public static  Item ManganeseDust;
		        public static  Item ZincDust;
		        
			    
			    //Misc Items
			    public static Item Varnish;
			    
			    
			    //Sticks
			    public static Item GoldStick;
			    
		
			    //items that place blocks
			    public static Item Vine;
			    public static  Item IBamboo;
			    public static  Item FlagItem1;
			    
			    
			    //Currency
			    public static Item GoldCoin;
			    public static Item BrassCoin;
			    public static Item SilverCoin;
			    public static Item GoldStack;
			    public static Item SilverStack;
			    public static Item BrassStack;
			    public static Item GoldCoinSack;
			    public static Item SilverCoinSack;
			    public static Item BrassCoinSack;
			    public static Item BagofGold;
                public static Item BagofSilver;
                public static Item BagofDiamond;
                
			    
			    //fish - new fishing drops
			    public static Item SamonRaw;
			    public static Item YellowTailRaw;
			     //-----Cooked Fisk
			    public static Item SamonCooked;
			    public static Item YellowTailCooked;
			     //-----Bottled Items
			    public static Item Mapinabottle;
			    public static Item Shipinabottle;
		
			    
				//Gems
				public static Item BlackDiamondShard;
				public static Item BlackDiamondGem;
				public static Item DragonStoneShard;
				public static Item DragonStoneGem;
		        public static Item WhiteDiamondShard;
		        public static Item WhiteDiamondGem;     
		        public static Item DBDesertShard;
		        public static Item DBDesertGem;
		        public static Item LBDesertShard;
		        public static Item LBDesertGem;
				
				//Raw Materials
		        public static Item Straw;
		        public static Item Sack;
		        public static Item Bag;
		        public static Item DriedBamboo;
		        public static Item DarkGreenDye;
		        public static Item NetherCaneDust;
		        public static Item MagmaFlint;
		        public static Item Papyrus;
                public static Item Reed;
                public static Item SandStonePaste;
                
                
		        //foods
		        public static Item AncientFruit;
		        public static Item Bacon;
		        public static Item RawBacon;
		        public static Item ChickenNuggets;
		        public static Item RawNuggets;  
		        public static Item SBread;
		        public static Item SteakSandwich;
		        
		        
		        //Tools
		        public static Item Knife;
		        public static Item Flintchisel;
		        public static Item Goldchisel;
		        public static Item BloodstoneChisel;
		        public static Item StoneHammer;
		        
		        
		        //Ingots
		        public static Item RefinedGoldIngot;
		        public static Item RefinedSilverIngot;
		        public static Item SilverIngot;
		        public static Item BrassIngot;
		        public static Item ObsidianIngot;
		        public static Item BloodStoneIngot;
		        public static Item MithrilIngot;
		        public static Item CobaltIngot;
		        public static Item TitaniumIngot;
		        public static Item TinIngot;
		        public static Item AdamantiteIngot;
		        public static Item CopperIngot;
		        public static Item PlatinumIngot;
		        public static Item ManganeseIngot;
		        public static Item OnyxIngot;
                public static Item IridiumIngot;
                public static Item CalciteIngot;
                public static Item AmethystIngot;
                public static Item DaeyaltIngot;
                public static Item SuperHeatedIron;
                public static Item SteelIngot;
                
                
                //Weapons
                	//DragonStone-BloodStone Weapons
		        public static Item BloodStoneHoe;
		        public static Item BloodStoneAxe;
		        public static Item BloodStoneShovel;
		        public static Item BloodStoneSword;
		        public static Item BloodStonePicAxe;
		        	//Bone Weapons
		        public static Item BonePicAxe;
		        	//Obsidian
		        public static Item ObsidianAxe;
		        public static Item ObsidianHoe;
		        public static Item ObsidianSword;
		        public static Item ObsidianShovel;
		        	//Mithril
		        public static Item MithrilSword;
		        public static Item MithrilPicAxe;
		        public static Item MithrilShovel;
		        public static Item MithrilAxe;
		        	//Flint-Bone
		        public static Item BoneFlintPicAxe;
		        public static Item BoneFlintShovel;
		        public static Item BoneFlintSword;
		        public static Item BoneFlintAxe;
		        	//
		        
		        
		        
		        //Seeds
		        public static Item AncientSeeds;
		        public static Item BlueDreamSeed;
		        public static Item BYYSeed;
		        public static Item CrystalSeed;
		        public static Item FireSeed;
		        public static Item LKSeed;
		        public static Item OKSeed;
		        public static Item WildKSeed;
		        
		        
		        //Leaves
		        public static Item BlueDreamBud;
		        public static Item BYYBud;
		        public static Item CrystalBud;
		        public static Item FireBud;
		        public static Item LKBud;
		        public static Item OKBud;
		        public static Item Toke;
		        
		        
		        //
		        public static Item bongmould;
		        public static Item bowlmould;
		        public static Item cylindermould;
		        public static Item bluebowl;
		        public static Item bluebong;
		        public static Item bluecylinder;
		        public static Item yellowbong;
		        public static Item yellowbowl;
		        public static Item yellowcylinder;
		        public static Item whitebong;
		        public static Item whitebowl;
		        public static Item whitecylinder;
		        public static Item clearbong;
		        public static Item clearbowl;
		        public static Item clearcylinder;
		        public static Item greenbong;
		        public static Item greenbowl;
		        public static Item greencylinder;
		        public static Item orangebong;
		        public static Item orangebowl;
		        public static Item orangecylinder;
		        public static Item blackbong;
		        public static Item blackbowl;
		        public static Item blackcylinder;
		        public static Item purplebong;
		        public static Item purplebowl;
		        public static Item purplecylinder;
		        
		        //more weedish related items
		        public static Item joint; 
		        public static Item driedtoke;
		        public static Item pipefilter;
		        public static Item mortat;
		        public static Item jointtape;
		        public static Item mortar;
		        
		        
		        
		        //buckets
		        public static  Item MagmaBucket;
		            
		        
		        //Custom Glass Bottles
		        public static Item GlassBottle;
		        public static Item PosionBottle;
		        
		        
		        //Arrows
		        public static Item DiamondArrow;
		        public static Item PosionArrow;
		        public static Item SteelArrow;
		        
		        
		        //Armor
		        	//Diving Suit
		        public static Item DivingHelm;
		        public static Item ScubaTank;
		        	//Mithril
		        public static Item MithrilChest;
		        public static Item MithrilBoots;
		        public static Item MithrilLegs;
		        public static Item MithrilHelm;
		        	//Iridium
		        public static Item IridiumBoots;
		        public static Item IridiumLegs;
		        public static Item IridiumChest;
		        public static Item IridiumHelm;
		        	//Obsidan
		        public static Item ObsidianHelm;
		        public static Item ObsidanChest;
		        public static Item ObsidanLegs;
		        public static Item ObsidanBoots;
		        	//Bloodstone
		        public static Item BloodstoneChest;
		        public static Item BloodstoneLegs;
		        public static Item BloodstoneHelm;
		        public static Item BloodstoneBootds;
		        
		        //Chain Parts
		        public static  Item ChainLoop;
		        public static  Item ChainLoops;
		        
		        
		        //Book like Items
		        public static  Item Scroll;
		        
		        //Wands 
		        public static Item DragonstoneWand;
		        public static Item FireWand;
		        public static Item IceWand;
		        public static Item ElectricWand;
		        public static Item WindWand;
		        public static Item WizardsBook;
		        
		        //BCD
		        public static Item BookcasedoorItem;
		        
		        
		        //Fossil Fragments
		        public static Item DinosaurFragments;
		        public static Item DinosaurFragments1;
		        
		        //Tele Items-arrow
		        public static Item Teleorb;
		        
		        /**  RailCraft Items **/
		        public static Item BloodStoneBorehead;
		        public static Item BlackdiamondBoreHead;
		       
		        
		        
		        //TO BE USED...
		        public static Item RcForgeItem;

		        
		        
		        
		/** ACHIEVEMENTS **/
		public Achievement DownloadReactionCraft;
		public Achievement Nether;
		public Achievement Nuke;
		public Achievement Creepin;
		
		
		/** BIOMES **/
		public static BiomeGenBase RcDesert; 
		public static BiomeGenBase RcOcean;
		public static BiomeGenBase RcWasteland;
		public static BiomeGenBase RcDesolate;
		
		
		
	@Override
    public void load()
	{
		Configuration config = new Configuration(new File(ModLoader.getMinecraftInstance().getMinecraftDir(), "/config/ReactonCraft.prop"));
		config.load();
		int[] ids = 
		{
			//Config Stuff Below Here
				//Instances here
			
					//Meta's
					Integer.parseInt(config.getOrCreateBlockIdProperty("Glass Blocks", 123).value),
					Integer.parseInt(config.getOrCreateBlockIdProperty("Flowers", 124).value),
					Integer.parseInt(config.getOrCreateBlockIdProperty("Nether Ores", 125).value),
					Integer.parseInt(config.getOrCreateBlockIdProperty("Hireglyphic Blocks", 126).value),
					Integer.parseInt(config.getOrCreateBlockIdProperty("Bushes", 127).value),
					Integer.parseInt(config.getOrCreateBlockIdProperty("Small Column's", 128).value),
					Integer.parseInt(config.getOrCreateBlockIdProperty("Large Column's", 129).value),
					Integer.parseInt(config.getOrCreateBlockIdProperty("Brick Blocks", 130).value),
					Integer.parseInt(config.getOrCreateBlockIdProperty("Ore Blocks", 131).value),
					Integer.parseInt(config.getOrCreateBlockIdProperty("Desert Blocks", 132).value),
					Integer.parseInt(config.getOrCreateBlockIdProperty("Nether Carpet Blocks", 133).value),
					Integer.parseInt(config.getOrCreateBlockIdProperty("Fossil Blocks", 134).value),
					Integer.parseInt(config.getOrCreateBlockIdProperty("GlowShroom's", 135).value),
					Integer.parseInt(config.getOrCreateBlockIdProperty("Shell Blocls", 136).value),
					Integer.parseInt(config.getOrCreateBlockIdProperty("Lantern Blocks", 137).value),
					Integer.parseInt(config.getOrCreateBlockIdProperty("Cactus Blocks", 138).value),
					//End of Meta's
					
					
					//Non Meta's
					
					//PlantPot
					Integer.parseInt(config.getOrCreateBlockIdProperty("Plant Pot", 139).value),
					
					//Liquids
					Integer.parseInt(config.getOrCreateBlockIdProperty("MagmaMoving", 140).value),
					Integer.parseInt(config.getOrCreateBlockIdProperty("MagmaStill", 141).value),
					
					//Ores
					Integer.parseInt(config.getOrCreateBlockIdProperty("BloodStone", 142).value),
						
					//Slabs (might be cut in half depending on malkerian...
					Integer.parseInt(config.getOrCreateBlockIdProperty("BloodStone Slab", 143).value),
					Integer.parseInt(config.getOrCreateBlockIdProperty("BloodStone Slab D", 144).value),
					//Slab
					Integer.parseInt(config.getOrCreateBlockIdProperty("Gold Slab", 145).value),
					Integer.parseInt(config.getOrCreateBlockIdProperty("Gold Slab D", 146).value),
					//Slab
					Integer.parseInt(config.getOrCreateBlockIdProperty("Bedrock Slab", 147).value),
					Integer.parseInt(config.getOrCreateBlockIdProperty("Bedrock Slab D", 148).value),
					//Slab
					Integer.parseInt(config.getOrCreateBlockIdProperty("Stained Plank Slab", 149).value),
					Integer.parseInt(config.getOrCreateBlockIdProperty("Stained Plank Slab D", 150).value),
					//Slab
					Integer.parseInt(config.getOrCreateBlockIdProperty("Marble Slab", 151).value),
					Integer.parseInt(config.getOrCreateBlockIdProperty("Marble Slab D", 152).value),
					
					
					//Stairs
					Integer.parseInt(config.getOrCreateBlockIdProperty("Gold Stair", 153).value),
					Integer.parseInt(config.getOrCreateBlockIdProperty("Bedrock Stair", 154).value),
					Integer.parseInt(config.getOrCreateBlockIdProperty("Diamond Stair", 155).value),
					Integer.parseInt(config.getOrCreateBlockIdProperty("Glowstone Stair", 156).value),
					Integer.parseInt(config.getOrCreateBlockIdProperty("Sandstone Stair", 157).value),
					Integer.parseInt(config.getOrCreateBlockIdProperty("Bloodstone Brick Stair", 158).value),
					Integer.parseInt(config.getOrCreateBlockIdProperty("DesertBrick Stair", 159).value),
					Integer.parseInt(config.getOrCreateBlockIdProperty("DesertBricks Stair", 160).value),
					Integer.parseInt(config.getOrCreateBlockIdProperty("Marble Stair", 161).value),
					Integer.parseInt(config.getOrCreateBlockIdProperty("Stained Plank Stair", 162).value),
					//End of Stairs
					
					
					//Gravity Affected Blocks
					Integer.parseInt(config.getOrCreateBlockIdProperty("DarkSand", 163).value),
					//End of Gravity Blocks
			        
					
					//Bee Blocks
					Integer.parseInt(config.getOrCreateBlockIdProperty("Hive Block", 164).value),
					Integer.parseInt(config.getOrCreateBlockIdProperty("Cell Block", 165).value),
					Integer.parseInt(config.getOrCreateBlockIdProperty("Larva Block", 166).value),
			        //End of Bee Blocks
					
					
					//Plants
					Integer.parseInt(config.getOrCreateBlockIdProperty("Ancient Plant", 167).value),
					//End of Plants

					
					//Redstone Related Blocks
					Integer.parseInt(config.getOrCreateBlockIdProperty("Trap Door Block", 168).value),
					Integer.parseInt(config.getOrCreateBlockIdProperty("Redstone Block", 169).value),
					Integer.parseInt(config.getOrCreateBlockIdProperty("Compressed Redstone Block", 170).value),					
					//End of Redstone Related Blocks
					
					//Planks
					Integer.parseInt(config.getOrCreateBlockIdProperty("Stained Plank", 171).value),
					
					
					//Spike Traps
					Integer.parseInt(config.getOrCreateBlockIdProperty("Spike Upright", 172).value),
					Integer.parseInt(config.getOrCreateBlockIdProperty("Spike Downturned", 173).value),
					
					
					
					//Flowers
					Integer.parseInt(config.getOrCreateBlockIdProperty("ReactionCraft Grass", 174).value),
					Integer.parseInt(config.getOrCreateBlockIdProperty("VaseBlock", 175).value),
					
					
					//First Door
					Integer.parseInt(config.getOrCreateBlockIdProperty("Wooden Bookcasedoor", 176).value),
					
					
					//Fences
					Integer.parseInt(config.getOrCreateBlockIdProperty("Sandstone Fence", 177).value),
					Integer.parseInt(config.getOrCreateBlockIdProperty("Bloodstone Fence", 178).value),
					Integer.parseInt(config.getOrCreateBlockIdProperty("Cobblestone Fence", 179).value),
					Integer.parseInt(config.getOrCreateBlockIdProperty("Marble Fence", 180).value),
					Integer.parseInt(config.getOrCreateBlockIdProperty("Stone Fence", 181).value),
					
					
					//PermaFrost
					Integer.parseInt(config.getOrCreateBlockIdProperty("Permafrost Block", 182).value),
					
					//Torches
					Integer.parseInt(config.getOrCreateBlockIdProperty("Mystic Torch", 183).value),
					
					//Chandelier Chains
					Integer.parseInt(config.getOrCreateBlockIdProperty("Chain", 184).value),
					
					
					//Glowing Grass
					Integer.parseInt(config.getOrCreateBlockIdProperty("Glowing Grass Block", 185).value),
					
					
					//Coral Blocks
					Integer.parseInt(config.getOrCreateBlockIdProperty("Coral Block 1", 186).value),
					Integer.parseInt(config.getOrCreateBlockIdProperty("Coral Block 2", 187).value),
					Integer.parseInt(config.getOrCreateBlockIdProperty("Coral Block 3", 188).value),
					
					
					//Coral Plants
					Integer.parseInt(config.getOrCreateBlockIdProperty("OrangeCoral", 189).value),
					Integer.parseInt(config.getOrCreateBlockIdProperty("GreenCoral", 190).value),
					Integer.parseInt(config.getOrCreateBlockIdProperty("PurpleCoral", 191).value),
					Integer.parseInt(config.getOrCreateBlockIdProperty("BrownCoral", 192).value),
					Integer.parseInt(config.getOrCreateBlockIdProperty("LightBlueCoral", 193).value),
					Integer.parseInt(config.getOrCreateBlockIdProperty("LightGreenCoral", 194).value),
					Integer.parseInt(config.getOrCreateBlockIdProperty("DarkGreenCoral", 195).value),
					Integer.parseInt(config.getOrCreateBlockIdProperty("RedCoral", 196).value),
					Integer.parseInt(config.getOrCreateBlockIdProperty("MagentaCoral", 197).value),
					
					
					//Ladder Type Blocks
					Integer.parseInt(config.getOrCreateBlockIdProperty("Chain Ladder", 198).value),
					Integer.parseInt(config.getOrCreateBlockIdProperty("Vine Ladder", 199).value),
					Integer.parseInt(config.getOrCreateBlockIdProperty("Rope", 200).value),
					Integer.parseInt(config.getOrCreateBlockIdProperty("Gold Ladder", 201).value),
					
					
					//SeaWeed Plant
					Integer.parseInt(config.getOrCreateBlockIdProperty("SeaWeed", 202).value),
					
					
					//LimeStone
					Integer.parseInt(config.getOrCreateBlockIdProperty("LimeStone", 203).value),
					
					
					//Custom Block Model Blocks...
					Integer.parseInt(config.getOrCreateBlockIdProperty("Gold Bars", 204).value),
					Integer.parseInt(config.getOrCreateBlockIdProperty("Creeper Statue", 205).value),
					Integer.parseInt(config.getOrCreateBlockIdProperty("Human Statue", 206).value),
					Integer.parseInt(config.getOrCreateBlockIdProperty("Zombie Statue", 207).value),
					Integer.parseInt(config.getOrCreateBlockIdProperty("Spider Statue", 208).value),
					Integer.parseInt(config.getOrCreateBlockIdProperty("Cow Statue", 209).value),
					Integer.parseInt(config.getOrCreateBlockIdProperty("Pig Statue", 210).value),
					Integer.parseInt(config.getOrCreateBlockIdProperty("Skeleton Statue", 211).value),
					Integer.parseInt(config.getOrCreateBlockIdProperty("Villager Statue", 212).value),
					Integer.parseInt(config.getOrCreateBlockIdProperty("Not Implemented Yet Statue", 213).value),
					Integer.parseInt(config.getOrCreateBlockIdProperty("Enderman Statue", 214).value),
					Integer.parseInt(config.getOrCreateBlockIdProperty("IronGolem Statue", 215).value),
					Integer.parseInt(config.getOrCreateBlockIdProperty("Snowman", 216).value),
					Integer.parseInt(config.getOrCreateBlockIdProperty("Starfish", 217).value),
					
							
					//Items
					config.getOrCreateIntProperty("Bloodstone Dust", config.CATEGORY_ITEM, 7000).getInt(),
					config.getOrCreateIntProperty("Black Diamond Shard", config.CATEGORY_ITEM, 7000).getInt(),
					config.getOrCreateIntProperty("Black Diamond Gem", config.CATEGORY_ITEM, 7000).getInt(),
					
					
					//Raw Materials Stuff
					config.getOrCreateIntProperty("Straw", config.CATEGORY_ITEM, 7000).getInt(),
					config.getOrCreateIntProperty("Sack", config.CATEGORY_ITEM, 7000).getInt(),
					config.getOrCreateIntProperty("Dried Bamboo", config.CATEGORY_ITEM, 7000).getInt(),
					config.getOrCreateIntProperty("Dark Green Dye", config.CATEGORY_ITEM, 7000).getInt(),
					config.getOrCreateIntProperty("NetherCane Dust", config.CATEGORY_ITEM, 7000).getInt(),
					
					
					//Dusts..
					config.getOrCreateIntProperty("Manganese Dust", config.CATEGORY_ITEM, 7000).getInt(),
					config.getOrCreateIntProperty("Zinc Dust", config.CATEGORY_ITEM, 7000).getInt(),
					
					
					//Bloodstone-DragonStone Tools
					config.getOrCreateIntProperty("Bloodstone Hoe", config.CATEGORY_ITEM, 7000).getInt(),
					config.getOrCreateIntProperty("Bloodstone Axe", config.CATEGORY_ITEM, 7000).getInt(),
					config.getOrCreateIntProperty("Bloodstone Shovel", config.CATEGORY_ITEM, 7000).getInt(),
					config.getOrCreateIntProperty("Bloodstone Sword", config.CATEGORY_ITEM, 7000).getInt(),
					config.getOrCreateIntProperty("Bloodstone Picaxe", config.CATEGORY_ITEM, 7000).getInt(),
					
					
					//Bone Tools
					config.getOrCreateIntProperty("Bone Picaxe", config.CATEGORY_ITEM, 7000).getInt(),
					
					
					//White Diamond gems
					config.getOrCreateIntProperty("White Diamond Gem", config.CATEGORY_ITEM, 7000).getInt(),
					config.getOrCreateIntProperty("White Diamond Shard", config.CATEGORY_ITEM, 7000).getInt(),
					
					//misc stuff...
					config.getOrCreateIntProperty("Superheated Iron", config.CATEGORY_ITEM, 7000).getInt(),
					config.getOrCreateIntProperty("Chain Loop", config.CATEGORY_ITEM, 7000).getInt(),
					config.getOrCreateIntProperty("Chain Loops", config.CATEGORY_ITEM, 7000).getInt(),
					
					
					//Fossil Parts
					config.getOrCreateIntProperty("Dinosaur Fragments", config.CATEGORY_ITEM, 7000).getInt(),
					config.getOrCreateIntProperty("Dinosaur Fragments 2", config.CATEGORY_ITEM, 7000).getInt(),
					
					
					//ReactionCraft Desert Items
					config.getOrCreateIntProperty("Sandstone Paste", config.CATEGORY_ITEM, 7000).getInt(),
					config.getOrCreateIntProperty("Flint Chisel", config.CATEGORY_ITEM, 7000).getInt(),
					config.getOrCreateIntProperty("Gold Chisel", config.CATEGORY_ITEM, 7000).getInt(),
					
					
					//Foods
					config.getOrCreateIntProperty("Ancient Fruit", config.CATEGORY_ITEM, 7000).getInt(),
					config.getOrCreateIntProperty("Bacon", config.CATEGORY_ITEM, 7000).getInt(),
					config.getOrCreateIntProperty("Raw Bacon", config.CATEGORY_ITEM, 7000).getInt(),
					config.getOrCreateIntProperty("Sliced Bread", config.CATEGORY_ITEM, 7000).getInt(),
					config.getOrCreateIntProperty("Steak Sandwich", config.CATEGORY_ITEM, 7000).getInt(),
					
					
					//Food Tools
					config.getOrCreateIntProperty("Knife", config.CATEGORY_ITEM, 7000).getInt(),
					
					
					//ReactionCraft Desert Gems
					config.getOrCreateIntProperty("DarkBlue Desert Gem", config.CATEGORY_ITEM, 7000).getInt(),
					config.getOrCreateIntProperty("DarkBlue Desert Gem Shard", config.CATEGORY_ITEM, 7000).getInt(),
					config.getOrCreateIntProperty("LightBlue Desert Gem Shard", config.CATEGORY_ITEM, 7000).getInt(),
					config.getOrCreateIntProperty("LightBlue Desert Gem", config.CATEGORY_ITEM, 7000).getInt(),
					
					
					//Buckets
					config.getOrCreateIntProperty("Magma Bucket", config.CATEGORY_ITEM, 7000).getInt(),
					
					
					//Other Tools...
					config.getOrCreateIntProperty("Stone Hammer", config.CATEGORY_ITEM, 7000).getInt(),
					
					
					//Plant Item Blocks..
					config.getOrCreateIntProperty("Bamboo Item", config.CATEGORY_ITEM, 7000).getInt(),
					
					
					//Flag Item.
					config.getOrCreateIntProperty("Flag Item", config.CATEGORY_ITEM, 7000).getInt(),
					
					
					//Currency
					config.getOrCreateIntProperty("Bag of Gold", config.CATEGORY_ITEM, 7000).getInt(),
					config.getOrCreateIntProperty("Bag of Silver", config.CATEGORY_ITEM, 7000).getInt(),
					config.getOrCreateIntProperty("Bag of Diamond", config.CATEGORY_ITEM, 7000).getInt(),
					config.getOrCreateIntProperty("Bag", config.CATEGORY_ITEM, 7000).getInt(),
					
					
					//More ReactionCraft Desert Stuff
					config.getOrCreateIntProperty("Papyrus Paper", config.CATEGORY_ITEM, 7000).getInt(),
					config.getOrCreateIntProperty("Reed Item", config.CATEGORY_ITEM, 7000).getInt(),
					config.getOrCreateIntProperty("Scroll", config.CATEGORY_ITEM, 7000).getInt(),
					config.getOrCreateIntProperty("Magma Flint", config.CATEGORY_ITEM, 7000).getInt(),
					
					
					//Ingots
					config.getOrCreateIntProperty("Refined Gold Ingot", config.CATEGORY_ITEM, 7000).getInt(),
					config.getOrCreateIntProperty("Refined Silver Ingot", config.CATEGORY_ITEM, 7000).getInt(),
					config.getOrCreateIntProperty("Silver Ingot", config.CATEGORY_ITEM, 7000).getInt(),
					config.getOrCreateIntProperty("Brass Ingot", config.CATEGORY_ITEM, 7000).getInt(),
					config.getOrCreateIntProperty("Obsidian Ingot", config.CATEGORY_ITEM, 7000).getInt(),
					config.getOrCreateIntProperty("Bloodstone Ingot", config.CATEGORY_ITEM, 7000).getInt(),
					config.getOrCreateIntProperty("Mithril Ingot", config.CATEGORY_ITEM, 7000).getInt(),
					config.getOrCreateIntProperty("Cobalt Ingot", config.CATEGORY_ITEM, 7000).getInt(),
					config.getOrCreateIntProperty("Titanium Ingot", config.CATEGORY_ITEM, 7000).getInt(),
					config.getOrCreateIntProperty("Tin Ingot", config.CATEGORY_ITEM, 7000).getInt(),
					config.getOrCreateIntProperty("Adamantite Ingot", config.CATEGORY_ITEM, 7000).getInt(),
					config.getOrCreateIntProperty("Copper Ingot", config.CATEGORY_ITEM, 7000).getInt(),
					config.getOrCreateIntProperty("Platinum Ingot", config.CATEGORY_ITEM, 7000).getInt(),
					config.getOrCreateIntProperty("Manganese Ingot", config.CATEGORY_ITEM, 7000).getInt(),
					config.getOrCreateIntProperty("Onyx Ingot", config.CATEGORY_ITEM, 7000).getInt(),
					config.getOrCreateIntProperty("Iridium Ingot", config.CATEGORY_ITEM, 7000).getInt(),
					config.getOrCreateIntProperty("Calcite Ingot", config.CATEGORY_ITEM, 7000).getInt(),
					config.getOrCreateIntProperty("Amethyst Ingot", config.CATEGORY_ITEM, 7000).getInt(),
					config.getOrCreateIntProperty("Daeyalt Ingot", config.CATEGORY_ITEM, 7000).getInt(),
					config.getOrCreateIntProperty("Steel Ingot", config.CATEGORY_ITEM, 7000).getInt(),
					
					//Herb Plants.... "its a Troll for weed"
					Integer.parseInt(config.getOrCreateBlockIdProperty("Orange Kush", 218).value),
					Integer.parseInt(config.getOrCreateBlockIdProperty("Blueberry Yum Yum", 219).value),
					Integer.parseInt(config.getOrCreateBlockIdProperty("Lemon Kush", 220).value),
					Integer.parseInt(config.getOrCreateBlockIdProperty("Blue Dream", 221).value),
					Integer.parseInt(config.getOrCreateBlockIdProperty("Fire", 222).value),
					Integer.parseInt(config.getOrCreateBlockIdProperty("Crystal", 223).value),
					
					//Seeds
					config.getOrCreateIntProperty("Blue Dream Seed", config.CATEGORY_ITEM, 7000).getInt(),
					config.getOrCreateIntProperty("Blueberry Yum Yum Seed", config.CATEGORY_ITEM, 7000).getInt(),
					config.getOrCreateIntProperty("Crystal Seed", config.CATEGORY_ITEM, 7000).getInt(),
					config.getOrCreateIntProperty("Fire Seed", config.CATEGORY_ITEM, 7000).getInt(),
					config.getOrCreateIntProperty("Lemon Kush Seed", config.CATEGORY_ITEM, 7000).getInt(),
					config.getOrCreateIntProperty("Orange Kush Seed", config.CATEGORY_ITEM, 7000).getInt(),
					config.getOrCreateIntProperty("Wild Kush Seed", config.CATEGORY_ITEM, 7000).getInt(),
					
					
					//Buds
					config.getOrCreateIntProperty("Blue Dream Bud", config.CATEGORY_ITEM, 7000).getInt(),
					config.getOrCreateIntProperty("Blueberry Yum Yum Bud", config.CATEGORY_ITEM, 7000).getInt(),
					config.getOrCreateIntProperty("Crystal Bud", config.CATEGORY_ITEM, 7000).getInt(),
					config.getOrCreateIntProperty("Fire Bud", config.CATEGORY_ITEM, 7000).getInt(),
					config.getOrCreateIntProperty("Lemon Kush Bud", config.CATEGORY_ITEM, 7000).getInt(),
					config.getOrCreateIntProperty("Orange Kush Bud", config.CATEGORY_ITEM, 7000).getInt(),
					config.getOrCreateIntProperty("Toke", config.CATEGORY_ITEM, 7000).getInt(),
					
				
					//Bongs and other Misc Stuff...27
					config.getOrCreateIntProperty("Bong Mould", config.CATEGORY_ITEM, 7000).getInt(),
					config.getOrCreateIntProperty("Bowl Mould", config.CATEGORY_ITEM, 7000).getInt(),
					config.getOrCreateIntProperty("Cylinder Mould", config.CATEGORY_ITEM, 7000).getInt(),
					config.getOrCreateIntProperty("Blue Bong", config.CATEGORY_ITEM, 7000).getInt(),
					config.getOrCreateIntProperty("Blue Bowl", config.CATEGORY_ITEM, 7000).getInt(),
					config.getOrCreateIntProperty("Blue Cylinder", config.CATEGORY_ITEM, 7000).getInt(),
					config.getOrCreateIntProperty("Yellow Bong", config.CATEGORY_ITEM, 7000).getInt(),
					config.getOrCreateIntProperty("Yellow Bowl", config.CATEGORY_ITEM, 7000).getInt(),
					config.getOrCreateIntProperty("Yellow Cylinder", config.CATEGORY_ITEM, 7000).getInt(),
					config.getOrCreateIntProperty("White Bong", config.CATEGORY_ITEM, 7000).getInt(),
					config.getOrCreateIntProperty("White Bowl", config.CATEGORY_ITEM, 7000).getInt(),
					config.getOrCreateIntProperty("White Cylinder", config.CATEGORY_ITEM, 7000).getInt(),
					config.getOrCreateIntProperty("Clear Bong", config.CATEGORY_ITEM, 7000).getInt(),
					config.getOrCreateIntProperty("Clear Bowl", config.CATEGORY_ITEM, 7000).getInt(),
					config.getOrCreateIntProperty("Clear Cylinder", config.CATEGORY_ITEM, 7000).getInt(),
					config.getOrCreateIntProperty("Green Bong", config.CATEGORY_ITEM, 7000).getInt(),
					config.getOrCreateIntProperty("Green Bowl", config.CATEGORY_ITEM, 7000).getInt(),
					config.getOrCreateIntProperty("Green Cylinder", config.CATEGORY_ITEM, 7000).getInt(),
					config.getOrCreateIntProperty("Orange Bong", config.CATEGORY_ITEM, 7000).getInt(),
					config.getOrCreateIntProperty("Orange Bowl", config.CATEGORY_ITEM, 7000).getInt(),
					config.getOrCreateIntProperty("Orange Cylinder", config.CATEGORY_ITEM, 7000).getInt(),
					config.getOrCreateIntProperty("Black Bong", config.CATEGORY_ITEM, 7000).getInt(),
					config.getOrCreateIntProperty("Black Bowl", config.CATEGORY_ITEM, 7000).getInt(),
					config.getOrCreateIntProperty("Black Cylinder", config.CATEGORY_ITEM, 7000).getInt(),
					config.getOrCreateIntProperty("Purple Bong", config.CATEGORY_ITEM, 7000).getInt(),
					config.getOrCreateIntProperty("Purple Bowl", config.CATEGORY_ITEM, 7000).getInt(),
					config.getOrCreateIntProperty("Purple Cylinder", config.CATEGORY_ITEM, 7000).getInt(),
					config.getOrCreateIntProperty("OrangeBlack Bong", config.CATEGORY_ITEM, 7000).getInt(),
					config.getOrCreateIntProperty("OrangeBlack Bowl", config.CATEGORY_ITEM, 7000).getInt(),
					config.getOrCreateIntProperty("OrangeBlack Cylinder", config.CATEGORY_ITEM, 7000).getInt(),
					
					//more exodus stuff....
					config.getOrCreateIntProperty("Joint", config.CATEGORY_ITEM, 7000).getInt(),
					config.getOrCreateIntProperty("Dried Toke", config.CATEGORY_ITEM, 7000).getInt(),
					config.getOrCreateIntProperty("Pipefilter", config.CATEGORY_ITEM, 7000).getInt(),
					config.getOrCreateIntProperty("Mortar", config.CATEGORY_ITEM, 7000).getInt(),
					config.getOrCreateIntProperty("Joint tape", config.CATEGORY_ITEM, 7000).getInt(),
					
					
					//Wild Weed Plant
					Integer.parseInt(config.getOrCreateBlockIdProperty("Wild Kush", 224).value),
					
					
					//Ship in a Bottle Stuff
					config.getOrCreateIntProperty("Map in a bottle", config.CATEGORY_ITEM, 7000).getInt(),
					config.getOrCreateIntProperty("Ship in a bottle", config.CATEGORY_ITEM, 7000).getInt(),
					
					
					//Teleporting Items
					config.getOrCreateIntProperty("Teleorb", config.CATEGORY_ITEM, 7000).getInt(),
					config.getOrCreateIntProperty("Ender Pearl Arrow", config.CATEGORY_ITEM, 7000).getInt(),
					
					
					//Arrows tele arrow above ^^^^^^^^
					config.getOrCreateIntProperty("Magma Flint Arrow", config.CATEGORY_ITEM, 7000).getInt(),
					config.getOrCreateIntProperty("Diamond Arrow", config.CATEGORY_ITEM, 7000).getInt(),
					config.getOrCreateIntProperty("Posion Arrow", config.CATEGORY_ITEM, 7000).getInt(),
					config.getOrCreateIntProperty("Freezing Arrow", config.CATEGORY_ITEM, 7000).getInt(),
					config.getOrCreateIntProperty("Fire Arrow", config.CATEGORY_ITEM, 7000).getInt(),
					config.getOrCreateIntProperty("Flare Arrow", config.CATEGORY_ITEM, 7000).getInt(),
					
					
					//Wands-Spell Book Items
					config.getOrCreateIntProperty("Fire Wand", config.CATEGORY_ITEM, 7000).getInt(),
					config.getOrCreateIntProperty("Wind Wand", config.CATEGORY_ITEM, 7000).getInt(),
					config.getOrCreateIntProperty("Dragonstone Wand", config.CATEGORY_ITEM, 7000).getInt(),
					config.getOrCreateIntProperty("Water Wand", config.CATEGORY_ITEM, 7000).getInt(),
					config.getOrCreateIntProperty("Lightning Wand", config.CATEGORY_ITEM, 7000).getInt(),
					config.getOrCreateIntProperty("SpellBook", config.CATEGORY_ITEM, 7000).getInt(),
					config.getOrCreateIntProperty("Nether Spell Book", config.CATEGORY_ITEM, 7000).getInt(),
					
					
					//RailCraft Items
					config.getOrCreateIntProperty("Bloodstone BoreHead", config.CATEGORY_ITEM, 7000).getInt(),
					config.getOrCreateIntProperty("Blackdiamond BoreHead", config.CATEGORY_ITEM, 7000).getInt(),
					
		};
		config.save();
		
				/** Block Code **/
					//Meta Blocks
					Multi = new BlockMulti(ids[1], Material.glass).setHardness(0.3F).setBlockName("Multi");
					FlowerMulti = new BlockFlowerMulti(ids[2], Material.plants).setHardness(0.0F).setBlockName("FlowerMulti").setRequiresSelfNotify();
					NetherMulti = new BlockNetherMulti(ids[3], Material.rock).setHardness(3.0F).setBlockName("NetherMulti");
					HireoMulti = new BlockHireoMulti(ids[4], Material.rock).setHardness(3.0F).setBlockName("HireoMulti");
					BushesMulti = new BlockBushesMulti(ids[5], Material.plants).setHardness(0.0F).setBlockName("BushesMulti").setRequiresSelfNotify();
					SkinnyColumnMulti = new BlockSkinnyCMulti(ids[6], Material.rock).setHardness(3.0F).setBlockName("SCMulti");
					ColumnMulti = new BlockColumnMulti(ids[7], Material.rock).setHardness(3.0F).setBlockName("ColumnMulti");
					BrickMulti = new BlockBrickMulti(ids[8], Material.rock).setHardness(3.0F).setBlockName("BrickMulti");
					OreMulti = new BlockRcOres(ids[9], Material.rock).setHardness(3.0F).setBlockName("OreMulti");
					MetalBlockMulti = new BlockRcMetalBlocks(ids[10], Material.rock).setHardness(3.0F).setBlockName("OreBlockMulti");
					DesertBlockMulti = new BlockDesertMulti(ids[12], Material.rock).setHardness(3.0F).setBlockName("DesertBlockMulti");
					CarpetMulti = new BlockGlowShroomCarpetMulti(ids[13], Material.rock).setHardness(3.0F).setBlockName("GlowShroomCarpetMulti");
					FossilMulti = new BlockFossilMulti(ids[14], Material.rock).setHardness(0.5F).setBlockName("FossilMulti");
					GlowShroomMulti = new BlockGlowShroomMulti(ids[16], Material.rock).setHardness(3.0F).setBlockName("GlowShroomMulti");
					ShellMulti = new BlockShellMulti(ids[17], Material.water).setHardness(0.80F).setResistance(0.1F).setStepSound(Block.soundStoneFootstep).setBlockName("Shell");
					LanternMulti = new BlockLanternMulti(ids[18], Material.glass).setLightValue(1.0F).setHardness(0.3F).setBlockName("LanternMulti");					
					CactusMulti = new BlockCactusMulti(ids[19], Material.plants).setHardness(0.10F).setResistance(0.1F).setStepSound(Block.soundStoneFootstep).setBlockName("StairMulti").setRequiresSelfNotify();
					
				/** Non Meta Blocks **/
				
				//Plant Pot
					PlantPot = new BlockPlantPot(ids[20], 99).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundStoneFootstep).setBlockName("PlantPot");
				
				//liquids
	        			//-Magma
						MagmaliquidMoving = new BlockMagmaFlowing(ids[21], Material.lava).setHardness(100F).setLightOpacity(3).setBlockName("MagmaliquidMoving").disableStats().setRequiresSelfNotify();
						MagmaliquidStill = new BlockMagmaStationary(ids[22], Material.lava).setHardness(100F).setLightOpacity(3).setBlockName("MagmaliquidStill").disableStats().setRequiresSelfNotify();
						
				//Ores
					BloodStone = new BlockForge(ids[23], 81).setHardness(60.0F).setResistance(2000.0F).setLightValue(0.25F).setStepSound(Block.soundStoneFootstep).setBlockName("BloodStone");
				
					
				//Slabs
					//84
					BloodStoneSlab = new BlockSlabRc(ids[24], true).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundStoneFootstep).setBlockName("BloodStoneSlab");
					BloodStoneSlab = new BlockSlabRc(ids[25], false).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundStoneFootstep).setBlockName("BloodStoneSlab");
					//214
					GoldSlab = new BlockSlabRc(ids[26], true).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundStoneFootstep).setBlockName("GoldSlab");
					GoldSlab = new BlockSlabRc(ids[27], false).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundStoneFootstep).setBlockName("GoldSlab");
					//215
					DiamondSlab = new BlockSlabRc(ids[28], true).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundStoneFootstep).setBlockName("DiamondSlab");
					DiamondSlab = new BlockSlabRc(ids[29], false).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundStoneFootstep).setBlockName("DiamondSlab");
					//206
					BedRockSlab = new BlockSlabRc(ids[30], true).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundStoneFootstep).setBlockName("BedRockSlab");
					BedRockSlab = new BlockSlabRc(ids[31], false).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundStoneFootstep).setBlockName("BedRockSlab");
					//100
					StainedSlab = new BlockSlabRc(ids[32], true).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundWoodFootstep).setBlockName("StainedStep");
					StainedSlab = new BlockSlabRc(ids[33], false).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundWoodFootstep).setBlockName("StainedStep");
					//164
					MarbleSlab = new BlockSlabRc(ids[34], true).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundWoodFootstep).setBlockName("MarbleSlab");
					MarbleSlab = new BlockSlabRc(ids[35], false).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundWoodFootstep).setBlockName("MarbleSlab");

					
				//Stair Blocks
			        GoldStep = new BlockStairs(ids[36], Block.blockGold).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundWoodFootstep).setBlockName("GoldStep");
			        BedRockStep = new BlockStairs(ids[37], Block.bedrock).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundWoodFootstep).setBlockName("BedRockStep");
			        DiamondStep = new BlockStairs(ids[38], Block.blockDiamond).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundWoodFootstep).setBlockName("DiamondStep");
			        Glowstonestep = new BlockStairs(ids[39], Block.glowStone).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundWoodFootstep).setBlockName("Glowstonestep");
			        Sandstonestep = new BlockStairs(ids[40], Block.sandStone).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundWoodFootstep).setBlockName("SandStonestep");
			        BBstep = new BlockStairsRc(ids[41], 84).setHardness(70.0F).setResistance(5.0F).setStepSound(Block.soundWoodFootstep).setBlockName("BBstep");
			        DesertBrickStep = new BlockStairsRc(ids[42], 139).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundWoodFootstep).setBlockName("DesertBrickStep");
			        DesertBricksStep = new BlockStairsRc(ids[43], 79).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundWoodFootstep).setBlockName("DesertBricksStep");
			        MarbleStep = new BlockStairsRc(ids[44], 164).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundWoodFootstep).setBlockName("MarbleStep");
			        StainedStep = new BlockStairsRc(ids[45], 100).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundWoodFootstep).setBlockName("StainedStep");
			        
			    //Gravity Affected Blocks
			        DarkSand = new BlockSandRc(ids[46], 136).setHardness(0.5F).setResistance(5.0F).setStepSound(Block.soundSandFootstep).setBlockName("DarkSand");
				
			        
			    //Gui Blocks
			        Hiveblock = new BlockForge(ids[47], 100).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundWoodFootstep).setBlockName("StainedPlank");
			        Cellblock = new BlockForge(ids[48], 100).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundWoodFootstep).setBlockName("StainedPlank");
			        Larvablock = new BlockForge(ids[49], 100).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundWoodFootstep).setBlockName("StainedPlank");
			        
			        
			    //Plants
				    AncientPlant = new AncientPlant(ids[50], 0).setHardness(0.0F).setResistance(5.0F).setStepSound(Block.soundStoneFootstep).setBlockName("AncientPlant");  
			        
			        
			    //Redstone Related
			      	 TrapBlock = new BlockGhostBlock(ids[51], 0).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundWoodFootstep).setBlockName("TrapBlock");
			      	 RedStoneBlock = new BlockRedstoneBlock(ids[52], 0).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundWoodFootstep).setBlockName("RedStoneBlock");
			      	 RedStoneBlockc = new BlockRedstoneBlock(ids[53], 1).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundWoodFootstep).setBlockName("RedStoneBlock");
			       
			        
			    //Plank		      	
				     StainedPlank = new BlockForge(ids[54], 100).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundWoodFootstep).setBlockName("StainedPlank");
				       
					
				//Spike Traps
			      	 SteelSpike = new BlockTrap(ids[55], 153).setHardness(0.1F).setResistance(5.0F).setStepSound(Block.soundStoneFootstep).setBlockName("SteelSpike");
			      	 SteelSpikeu = new BlockTrap(ids[56], 154).setHardness(0.1F).setResistance(5.0F).setStepSound(Block.soundStoneFootstep).setBlockName("SteelSpikeu");
			       
					
					
				//Flowers
					
					RcTallGrass = new BlockGrassRc(ids[57]).setHardness(0.0F).setResistance(5.0F).setStepSound(Block.soundGrassFootstep).setBlockName("RcTallGrass").setRequiresSelfNotify();		
					Vase = new BlockFlowerRc(ids[58], 97).setHardness(0.0F).setResistance(5.0F).setStepSound(Block.soundStoneFootstep).setBlockName("Vase").setRequiresSelfNotify();
					
					
					
				//Doors
					Bookcasedoor = new BlockBookcaseDoorW(ids[59], Material.wood).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundWoodFootstep).setBlockName("Bookcasedoor");
					
					
					
					//Fences
					Fence = new BlockFenceRc(ids[60], 139).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundWoodFootstep).setBlockName("Fence");
					BSFence = new BlockFenceRc(ids[61], 84).setHardness(70.0F).setResistance(5.0F).setStepSound(Block.soundWoodFootstep).setBlockName("BSFence");
					CobbleFence = new BlockFenceRc1(ids[62], 1).setHardness(2.0F).setResistance(5.0F).setStepSound(Block.soundWoodFootstep).setBlockName("CobbleFence");
					MarbleFence = new BlockFenceRc(ids[63], 164).setHardness(1.5F).setResistance(5.0F).setStepSound(Block.soundWoodFootstep).setBlockName("MarbleFence");
					StoneFence = new BlockFenceRc1(ids[64], 0).setHardness(1.5F).setResistance(5.0F).setStepSound(Block.soundWoodFootstep).setBlockName("StoneFence");
					
				//PermaFrost
					PermaFrost = new BlockForge(ids[65], 156).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundWoodFootstep).setBlockName("PermaFrost");	
					
					
				 //Torches
			      	MysticTorch = new BlockTorchRc(ids[66], 96).setLightValue(0.80F).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundWoodFootstep).setBlockName("MysticTorch");
			    
			      	
			     //chandelier chains
			      	Chain = new Chain(ids[67], 114).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundStoneFootstep).setBlockName("Chain");
			       
			        
			     //Glowing Grass
			      	GlowingGrass = new BlockGlowingGrass(ids[68], 125).setLightValue(0.80F).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundStoneFootstep).setBlockName("GlowingGrass");

			      	 
			     //coral blocks
			       CoralBlock1 = new BlockForge(ids[69], 6).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundStoneFootstep).setBlockName("CoralBlock1");
			       CoralBlock2 = new BlockForge(ids[70], 7).setLightValue(0.80F).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundStoneFootstep).setBlockName("CoralBlock2");
			       CoralBlock3 = new BlockForge(ids[71], 15).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundStoneFootstep).setBlockName("CoralBlock3");
			       
			     //coral plants
			       OrangeCoral = new BlockCoral(ids[72], 0).setLightValue(1.0F).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundStoneFootstep).setBlockName("MagentaCoral");
			       GreenCoral = new BlockCoral(ids[73], 1).setHardness(1.0F).setResistance(5.0F).setStepSound(Block.soundStoneFootstep).setBlockName("PurpleCoral");
			       PurpleCoral = new BlockCoral(ids[74], 2).setHardness(1.0F).setResistance(5.0F).setStepSound(Block.soundStoneFootstep).setBlockName("OrangeCoral");
			       BrownCoral = new BlockCoral(ids[75], 3).setHardness(1.0F).setResistance(5.0F).setStepSound(Block.soundStoneFootstep).setBlockName("BrownCoral");
			       BlueCoral = new BlockCoral(ids[76], 4).setHardness(1.0F).setResistance(5.0F).setStepSound(Block.soundStoneFootstep).setBlockName("GreenCoral");
			       LightBlueCoral = new BlockCoral(ids[77], 5).setHardness(1.0F).setResistance(5.0F).setStepSound(Block.soundStoneFootstep).setBlockName("GreenCoral");
			       LightGreenCoral = new BlockCoral(ids[78], 8).setHardness(1.0F).setResistance(5.0F).setStepSound(Block.soundStoneFootstep).setBlockName("GreenCoral");
			       PinkCoral = new BlockCoral(ids[79], 9).setHardness(1.0F).setResistance(5.0F).setStepSound(Block.soundStoneFootstep).setBlockName("GreenCoral");
			       LightBlueOrangeCoral = new BlockCoral(ids[80], 10).setHardness(1.0F).setResistance(5.0F).setStepSound(Block.soundStoneFootstep).setBlockName("GreenCoral");
			       LightBlueCoral2 = new BlockCoral(ids[81], 11).setHardness(1.0F).setResistance(5.0F).setStepSound(Block.soundStoneFootstep).setBlockName("GreenCoral");
			       DarkGreenCoral = new BlockCoral(ids[82], 12).setHardness(1.0F).setResistance(5.0F).setStepSound(Block.soundStoneFootstep).setBlockName("GreenCoral");
			       RedCoral = new BlockCoral(ids[83], 13).setHardness(1.0F).setResistance(5.0F).setStepSound(Block.soundStoneFootstep).setBlockName("GreenCoral");
			       MagentaCoral = new BlockCoral(ids[84], 14).setHardness(1.0F).setResistance(5.0F).setStepSound(Block.soundStoneFootstep).setBlockName("MagentaCoral");
			       
			     //Ladder Type Blocks
			       ChainL = new BlockChainLadder(ids[85], 114).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundStoneFootstep).setBlockName("ChainL");
			       VineL = new BlockVineRc(ids[86]).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundWoodFootstep).setBlockName("VineL");
			       Rope = new BlockRope(ids[87], 48).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundStoneFootstep).setBlockName("Rope");
			       GL = new BlockGoldLadder(ids[88], 68).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundStoneFootstep).setBlockName("GL");
			       
			       
			       SeaWeed = new BlockSeaweed(ids[89], 71).setHardness(1.0F).setResistance(5.0F).setStepSound(Block.soundStoneFootstep).setBlockName("Seaweed");
			       
			       LimeStone = new BlockForge(ids[90], 51).setHardness(1.0F).setResistance(5.0F).setStepSound(Block.soundStoneFootstep).setBlockName("LimeStone");
			       
			     //Custom Block Model Blocks
		        	//Custom Blocks
			       blockAluminium = new BlockAluminium(ids[91], 16, net.minecraft.src.Reactioncraft.TileEntityBlockAluminium.class).setHardness(0.7F).setResistance(5F).setBlockName("blockAluminium");
		        	//Statues
			       creeperStatue = new CreeperStatue(ids[92], 16, net.minecraft.src.Reactioncraft.TileEntityCreeperStatue.class).setHardness(0.7F).setResistance(5F).setBlockName("creeperStatue");
			       HumanStatue = new HumanStatue(ids[93], 16, net.minecraft.src.Reactioncraft.TileEntityHumanStatue.class).setHardness(0.7F).setResistance(5F).setBlockName("HumanStatue");
			       ZombieStatue = new ZombieStatue(ids[94], 16, net.minecraft.src.Reactioncraft.TileEntityZombieStatue.class).setHardness(0.7F).setResistance(5F).setBlockName("ZombieStatue");
			       SpiderStatue = new SpiderStatue(ids[95], 16, net.minecraft.src.Reactioncraft.TileEntitySpiderStatue.class).setHardness(0.7F).setResistance(5F).setBlockName("SpiderStatue");
			       cowstatue = new CowStatue(ids[96], 16, net.minecraft.src.Reactioncraft.TileEntityCowStatue.class).setHardness(0.7F).setResistance(5F).setBlockName("cowstatue");
			       pigstatue = new PigStatue(ids[97], 16, net.minecraft.src.Reactioncraft.TileEntityPigStatue.class).setHardness(0.7F).setResistance(5F).setBlockName("pigstatue");
			       skeletonstatue = new SkeletonStatue(ids[98], 16, net.minecraft.src.Reactioncraft.TileEntitySkeletonStatue.class).setHardness(0.7F).setResistance(5F).setBlockName("skeletonstatue");
			       villagerstatue = new VillagerStatue(ids[99], 16, net.minecraft.src.Reactioncraft.TileEntityVillagerStatue.class).setHardness(0.7F).setResistance(5F).setBlockName("villagerstatue");
			       dragonstatue = new DragonStatue(ids[100], 16, net.minecraft.src.Reactioncraft.TileEntityDragonStatue.class).setHardness(0.7F).setResistance(5F).setBlockName("dragonstatue");
			       endermanstatue = new EnderMStatue(ids[101], 16, net.minecraft.src.Reactioncraft.TileEntiyEndermanStatue.class).setHardness(0.7F).setResistance(5F).setBlockName("endermanstatue");
			       irongolemstatue = new IronGStatue(ids[102], 16, net.minecraft.src.Reactioncraft.TileEntityIronGolemStatue.class).setHardness(0.7F).setResistance(5F).setBlockName("irongolemstatue");
		        	//SnowMan
			       Snowman = new Snowman(ids[103], 16, net.minecraft.src.Reactioncraft.TileEntitySnowman.class).setHardness(0.7F).setResistance(5F).setBlockName("Snowman");
		        	//Starfish
			       Starfish = new Starfish(ids[104], 16, net.minecraft.src.Reactioncraft.TileEntityStarfish.class).setHardness(0.7F).setResistance(5F).setBlockName("Starfish");
		        
			       
			       //Item Code
						BloodStoneDust = (new ItemForge(ids[105])).setIconCoord(1, 0).setItemName("BloodStoneDust");
						BlackDiamondShard = (new ItemForge(ids[106])).setIconCoord(97, 0).setItemName("BlackDiamondShard");
						BlackDiamondGem = (new ItemForge(ids[107])).setIconCoord(84, 0).setItemName("BlackDiamondGem");
						
						
						//raw stuff
				         Straw = (new ItemForge(ids[108])).setIconCoord(67, 0).setItemName("Straw");
				         Sack = (new ItemForge(ids[109])).setIconCoord(64, 0).setItemName("Sack");
				         DriedBamboo = (new ItemForge(ids[110])).setIconCoord(68, 0).setItemName("DriedBamboo");
				         DarkGreenDye = (new ItemForge(ids[111])).setIconCoord(65, 0).setItemName("DarkGreenDye");
				         NetherCaneDust = (new ItemForge(ids[112])).setIconCoord(66, 0).setItemName("NetherCaneDust");
				        //Food
				        //Doors      
				        //Dusts
				         ManganeseDust = (new ItemForge(ids[113])).setIconCoord(87, 0).setItemName("ManganeseDust");
				         ZincDust = (new ItemForge(ids[114])).setIconCoord(96, 0).setItemName("ZincDust");
				        //Liquids
				         
				         
				        //DragonStone-BloodStone Tools
				         BloodStoneHoe = (new BloodStoneSword(ids[115], EnumRcToolMaterial.BLOODSTONE)).setIconCoord(89, 0).setItemName("BloodStoneSword");
				         BloodStoneAxe = (new BloodStoneSword(ids[116], EnumRcToolMaterial.BLOODSTONE)).setIconCoord(86, 0).setItemName("BloodStoneSword");
				         BloodStoneShovel = (new BloodStoneSword(ids[117], EnumRcToolMaterial.BLOODSTONE)).setIconCoord(88, 0).setItemName("BloodStoneSword");
				         BloodStoneSword = (new BloodStoneSword(ids[118], EnumRcToolMaterial.BLOODSTONE)).setIconCoord(5, 0).setItemName("BloodStoneSword");
				         BloodStonePicAxe = (new BloodStonePicaxe(ids[119], EnumRcToolMaterial.BLOODSTONE)).setIconCoord(85, 0).setItemName("BloodStonePixAxe");
				        //Bone Stools
				         BonePicAxe = (new BloodStoneSword(ids[120], EnumRcToolMaterial.Bone)).setIconCoord(99, 0).setItemName("BonePicAxe");
				            //Gems
				         WhiteDiamondShard = (new ItemForge(ids[121])).setIconCoord(98, 0).setItemName("WhiteDiamond");
				         BlackDiamondGem = (new ItemForge(ids[122])).setIconCoord(97, 0).setItemName("BlackDiamond1");
				        //Armor?
				       
				         SuperHeatedIron = (new ItemForge(ids[123])).setIconCoord(81, 0).setItemName("SuperHeatedIron");
				         ChainLoop = (new ItemForge(ids[124])).setIconCoord(82, 0).setItemName("ChainLoop");
				         ChainLoops = (new ItemForge(ids[125])).setIconCoord(83, 0).setItemName("ChainLoops");
				         BlackDiamondShard = (new ItemForge(ids[126])).setIconCoord(84, 0).setItemName("BlackDiamond2");
				         SteelIngot = (new ItemForge(ids[127])).setIconCoord(16, 0).setItemName("SteelIngot");
				         
				         //Fossil Items
				        DinosaurFragments = (new ItemForge(ids[128])).setIconCoord(0, 0).setItemName("DinosaurFragments");
				        DinosaurFragments1 = (new ItemForge(ids[129])).setIconCoord(0, 0).setItemName("DinosaurFragments1");

				         
				         SandStonePaste = (new ItemForge(ids[130])).setIconCoord(119, 0).setItemName("SandStonePaste");
				         Flintchisel = (new ItemForge(ids[131])).setIconCoord(110, 0).setItemName("Flintchisel");
				         Goldchisel = (new ItemForge(ids[132])).setIconCoord(113, 0).setItemName("Goldchisel");
				       
				        //foods and items to fix textures on
				                //foods
				         AncientFruit = (new ItemFoodRc(ids[133], 4, 1F, false)).setIconCoord(100, 0).setItemName("AncientFruit");
				         Bacon = (new ItemFoodRc(ids[134], 4, 1F, false)).setIconCoord(111, 0).setItemName("Bacon");
				         RawBacon = (new ItemForge(ids[135])).setIconCoord(126, 0).setItemName("RawBacon");
				         ChickenNuggets = (new ItemFoodRc(ids[136], 4, 1F, false)).setIconCoord(122, 0).setItemName("ChichenNuggets");
				         RawNuggets = (new ItemForge(ids[137])).setIconCoord(127, 0).setItemName("RawNuggets");        
				         SBread = (new ItemFoodRc(ids[138], 4, 1F, false)).setIconCoord(124, 0).setItemName("SBread");
				         SteakSandwich = (new ItemFoodRc(ids[139], 4, 1F, false)).setIconCoord(125, 0).setItemName("SteakSandWich");
				                //Tools
				         Knife = (new ItemForge(ids[140])).setIconCoord(123, 0).setItemName("Knfie");
		                       
				         DBDesertGem = (new ItemForge(ids[141])).setIconCoord(132, 0).setItemName("DBDesertGem");
				         DBDesertShard = (new ItemForge(ids[142])).setIconCoord(129, 0).setItemName("DBDesertGem1");
				         LBDesertShard = (new ItemForge(ids[143])).setIconCoord(130, 0).setItemName("LBDesertGem1");
				         LBDesertGem = (new ItemForge(ids[144])).setIconCoord(131, 0).setItemName("LBDesertGem");
				                //buckets
				         MagmaBucket = (new ItemForge(ids[145])).setIconCoord(113, 0).setItemName("MagmaBucket");
				        //
				         StoneHammer = (new ItemForge(ids[146])).setIconCoord(114, 0).setItemName("StoneHammer");
				        //
				         IBamboo = (new ItemBamboo(ids[147])).setIconCoord(136, 0).setItemName("IBamboo");
		       
		                //Flag
		                 FlagItem1 = (new ItemForge(ids[148])).setIconCoord(141, 0).setItemName("FlagItem1");
		               
		               
		                //
		                 BagofGold = (new ItemForge(ids[149])).setIconCoord(140, 0).setItemName("BagofGold");
		                 BagofSilver = (new ItemForge(ids[150])).setIconCoord(143, 0).setItemName("BagofSilver");
		                 BagofDiamond = (new ItemForge(ids[151])).setIconCoord(139, 0).setItemName("BagofDiamond");
		                 Bag = (new ItemForge(ids[152])).setIconCoord(145, 0).setItemName("Bag");
		               
		                //more desert stuff
		                 Papyrus = (new ItemForge(ids[153])).setIconCoord(121, 0).setItemName("Papyrus");
		                 Reed = (new ItemReedRc(ids[154])).setIconCoord(142, 0).setItemName("Reed");
		                 Scroll = (new ItemForge(ids[155])).setIconCoord(120, 0).setItemName("Scroll");
		                 MagmaFlint = (new ItemForge(ids[156])).setIconCoord(138, 0).setItemName("MagmaFlint");
		               
		               
		                //Fixed Textured Ingots
		                 RefinedGoldIngot = (new ItemForge(ids[157])).setIconCoord(62, 0).setItemName("RefinedGoldIngot");
		                 RefinedSilverIngot = (new ItemForge(ids[158])).setIconCoord(61, 0).setItemName("RefinedSilverIngot");
		                 SilverIngot = (new ItemForge(ids[159])).setIconCoord(61, 0).setItemName("SilverIngot");
				         BrassIngot = (new ItemForge(ids[160])).setIconCoord(60, 0).setItemName("BrassIngot");
				         ObsidianIngot = (new ItemForge(ids[161])).setIconCoord(23, 0).setItemName("ObsidianIngot");
				         BloodStoneIngot = (new ItemForge(ids[162])).setIconCoord(6, 0).setItemName("BloodStoneIngot");
				         MithrilIngot = (new ItemForge(ids[163])).setIconCoord(17, 0).setItemName("MithrilIngot");
				         CobaltIngot = (new ItemForge(ids[164])).setIconCoord(44, 0).setItemName("CobaltIngot");
				         TitaniumIngot = (new ItemForge(ids[165])).setIconCoord(10, 0).setItemName("TitaniumIngot");
				         TinIngot = (new ItemForge(ids[166])).setIconCoord(29, 0).setItemName("TinIngot");
				         AdamantiteIngot = (new ItemForge(ids[167])).setIconCoord(71, 0).setItemName("AdamantiteIngot");
				         CopperIngot = (new ItemForge(ids[168])).setIconCoord(72, 0).setItemName("CopperIngot");
				         PlatinumIngot = (new ItemForge(ids[169])).setIconCoord(28, 0).setItemName("PlatinumIngot");
				         ManganeseIngot = (new ItemForge(ids[170])).setIconCoord(95, 0).setItemName("ManganeseIngot");
				         OnyxIngot = (new ItemForge(ids[171])).setIconCoord(137, 0).setItemName("OnyxIngot");
		                 IridiumIngot = (new ItemForge(ids[172])).setIconCoord(137, 0).setItemName("IridiumIngot");
		                 CalciteIngot = (new ItemForge(ids[173])).setIconCoord(137, 0).setItemName("CalciteIngot");
		                 AmethystIngot = (new ItemForge(ids[174])).setIconCoord(135, 0).setItemName("AmethystIngot");
		                 DaeyaltIngot = (new ItemForge(ids[175])).setIconCoord(134, 0).setItemName("DaeyaltIngot");
		                 
        
		                 //"Herb" Plants trololololololol
		                 OrangeKush = new BlockOK(ids[176], 1).setHardness(0.0F).setResistance(5.0F).setStepSound(Block.soundGrassFootstep).setBlockName("AncientPlant");  		             	
		                 Blueberryyy = new BlockBbyyy(ids[177], 16).setHardness(0.0F).setResistance(5.0F).setStepSound(Block.soundGrassFootstep).setBlockName("AncientPlant");  	             	
		             	 LemonKush = new BlockLK(ids[178], 32).setHardness(0.0F).setResistance(5.0F).setStepSound(Block.soundGrassFootstep).setBlockName("AncientPlant");  		             	
		             	 BlueDream = new BlockBD(ids[179], 48).setHardness(0.0F).setResistance(5.0F).setStepSound(Block.soundGrassFootstep).setBlockName("AncientPlant");  		             	
		             	 Fire = new BlockKF(ids[180], 64).setHardness(0.0F).setResistance(5.0F).setStepSound(Block.soundGrassFootstep).setBlockName("AncientPlant");  		             	
		             	 Crystal = new BlockCK(ids[181], 80).setHardness(0.0F).setResistance(5.0F).setStepSound(Block.soundGrassFootstep).setBlockName("AncientPlant");  
		             	 
		                 
		                 
		                 //Seeds
		                 BlueDreamSeed = (new AncientSeeds(ids[182], mod_ReactionCraft.BlueDream.blockID, Block.tilledField.blockID)).setIconCoord(134, 0).setItemName("AncientSeeds");
		                 BYYSeed = (new AncientSeeds(ids[183], mod_ReactionCraft.Blueberryyy.blockID, Block.tilledField.blockID)).setIconCoord(134, 0).setItemName("AncientSeeds");
		                 CrystalSeed = (new AncientSeeds(ids[184], mod_ReactionCraft.Crystal.blockID, Block.tilledField.blockID)).setIconCoord(134, 0).setItemName("AncientSeeds");
		                 FireSeed = (new AncientSeeds(ids[185], mod_ReactionCraft.Fire.blockID, Block.tilledField.blockID)).setIconCoord(134, 0).setItemName("AncientSeeds");
		                 LKSeed = (new AncientSeeds(ids[186], mod_ReactionCraft.LemonKush.blockID, Block.tilledField.blockID)).setIconCoord(134, 0).setItemName("AncientSeeds");
		                 OKSeed = (new AncientSeeds(ids[187], mod_ReactionCraft.OrangeKush.blockID, Block.tilledField.blockID)).setIconCoord(134, 0).setItemName("AncientSeeds");	
		                 WildKSeed = new AncientSeeds(ids[188], mod_ReactionCraft.OrangeKush.blockID, Block.tilledField.blockID).setIconCoord(134, 0).setItemName("AncientSeeds");	
		                 
		                 	                 
		                 //Leaves
		                 BlueDreamBud = (new ItemForge(ids[189])).setIconCoord(134, 0).setItemName("OKLeaf");
		                 BYYBud = (new ItemForge(ids[190])).setIconCoord(134, 0).setItemName("OKLeaf");
		                 CrystalBud = (new ItemForge(ids[191])).setIconCoord(134, 0).setItemName("OKLeaf");
		                 FireBud = (new ItemForge(ids[192])).setIconCoord(134, 0).setItemName("OKLeaf");
		                 LKBud = (new ItemForge(ids[193])).setIconCoord(134, 0).setItemName("OKLeaf");
		                 OKBud = (new ItemForge(ids[194])).setIconCoord(134, 0).setItemName("OKLeaf");
		                 Toke = (new ItemForge(ids[195])).setIconCoord(134, 0).setItemName("OkLeaf");
		                 
		                 
		                 //Bongs-Bong Mould
		                 bongmould = (new ItemForge(ids[196])).setIconCoord(134, 0).setItemName("DaeyaltIngot");
		                 bowlmould = (new ItemForge(ids[197])).setIconCoord(134, 0).setItemName("DaeyaltIngot");
		                 cylindermould = (new ItemForge(ids[198])).setIconCoord(134, 0).setItemName("DaeyaltIngot");
		                 bluebong = (new ItemForge(ids[199])).setIconCoord(134, 0).setItemName("DaeyaltIngot");
		                 bluebowl = (new ItemForge(ids[200])).setIconCoord(134, 0).setItemName("DaeyaltIngot");
		                 bluecylinder = (new ItemForge(ids[201])).setIconCoord(134, 0).setItemName("DaeyaltIngot");
		                 yellowbong = (new ItemForge(ids[202])).setIconCoord(134, 0).setItemName("DaeyaltIngot");
		                 yellowbowl = (new ItemForge(ids[203])).setIconCoord(134, 0).setItemName("DaeyaltIngot");
		                 yellowcylinder = (new ItemForge(ids[204])).setIconCoord(134, 0).setItemName("DaeyaltIngot");
		                 whitebong = (new ItemForge(ids[205])).setIconCoord(134, 0).setItemName("DaeyaltIngot");
		                 whitebowl = (new ItemForge(ids[206])).setIconCoord(134, 0).setItemName("DaeyaltIngot");
		                 whitecylinder = (new ItemForge(ids[207])).setIconCoord(134, 0).setItemName("DaeyaltIngot");
		                 clearbong = (new ItemForge(ids[208])).setIconCoord(134, 0).setItemName("DaeyaltIngot");
		                 clearbowl = (new ItemForge(ids[209])).setIconCoord(134, 0).setItemName("DaeyaltIngot");
		                 clearcylinder = (new ItemForge(ids[210])).setIconCoord(134, 0).setItemName("DaeyaltIngot");
		                 greenbong = (new ItemForge(ids[211])).setIconCoord(134, 0).setItemName("DaeyaltIngot");
		                 greenbowl = (new ItemForge(ids[212])).setIconCoord(134, 0).setItemName("DaeyaltIngot");
		                 greencylinder = (new ItemForge(213)).setIconCoord(134, 0).setItemName("DaeyaltIngot");
		                 orangebong = (new ItemForge(ids[214])).setIconCoord(134, 0).setItemName("DaeyaltIngot");
		                 orangebowl = (new ItemForge(ids[215])).setIconCoord(134, 0).setItemName("DaeyaltIngot");
		                 orangecylinder = (new ItemForge(ids[216])).setIconCoord(134, 0).setItemName("DaeyaltIngot");
		                 blackbong = (new ItemForge(ids[217])).setIconCoord(134, 0).setItemName("DaeyaltIngot");
		                 blackbowl = (new ItemForge(ids[218])).setIconCoord(134, 0).setItemName("DaeyaltIngot");
		                 blackcylinder = (new ItemForge(ids[219])).setIconCoord(134, 0).setItemName("DaeyaltIngot");
		                 purplebong = (new ItemForge(ids[220])).setIconCoord(134, 0).setItemName("DaeyaltIngot");
		                 purplebowl = (new ItemForge(ids[221])).setIconCoord(134, 0).setItemName("DaeyaltIngot");
		                 purplecylinder = (new ItemForge(ids[222])).setIconCoord(134, 0).setItemName("DaeyaltIngot");
		                 
		                 
		                 //weed items....
		                 joint = (new ItemForge(ids[223])).setIconCoord(134, 0).setItemName("DaeyaltIngot");
		                 driedtoke = (new ItemForge(ids[224])).setIconCoord(134, 0).setItemName("DaeyaltIngot");
		                 pipefilter = (new ItemForge(ids[225])).setIconCoord(134, 0).setItemName("DaeyaltIngot");
		                 mortar = (new ItemForge(ids[226])).setIconCoord(134, 0).setItemName("DaeyaltIngot");
		                 jointtape = (new ItemForge(ids[227])).setIconCoord(134, 0).setItemName("DaeyaltIngot");
		                 
		                 //More Exodus BS located here//
		                 WildKush = new BlockWildK(ids[228], 80).setHardness(0.0F).setResistance(5.0F).setStepSound(Block.soundGrassFootstep).setBlockName("AncientPlant").setRequiresSelfNotify();  
		                 
		                  
		                 //Bottle Stuff
		                 Mapinabottle = (new IMapinbottle(ids[175])).setIconCoord(134, 0).setItemName("DaeyaltIngot");
		                 Shipinabottle = (new IShipinbottle(ids[175])).setIconCoord(134, 0).setItemName("DaeyaltIngot");
		                 
		                 //Teleporting Items-Arrows
		                 Teleorb = (new ITeleorb(ids[176])).setIconCoord(134, 0).setItemName("Teleorb");
		                 
		                 //Wands-spell book
		                 
		                 /** RailCraft Items **/
		                 BloodStoneBorehead = (new IBloodstoneBH(ids[174])).setIconCoord(151, 0).setItemName("BloodstoneBorehead");	
		                 BlackdiamondBoreHead = (new IBlackDiamondBH(ids[175])).setIconCoord(150, 0).setItemName("BloodstoneBorehead");	
				

			   //Achievements
		       DownloadReactionCraft = (new Achievement(999, "Downloaded ReactionCraft", 0, 2, FlowerMulti, AchievementList.openInventory)).registerAchievement();
		       Nether = (new Achievement(1000, "Welcome to Hell", -6, -5, BloodStone, null)).registerAchievement();
		       Nuke = (new Achievement(1001, "O Shit", -7, -5, DylanNuke, null)).registerAchievement();
		       Creepin = (new Achievement(1002, "Stalker", -8, -5, CreeperBlock, null)).registerAchievement();      
		       //End of Achievements
		       
		       
		        //Biomes
		        RcDesert = (new GenDesert(40)).setColor(16421912).setBiomeName("Desert");
		        RcOcean = (new BiomeGenOcean(41)).setColor(16421912).setBiomeName("Ocean");
		        RcDesolate = (new GenDesolate(42)).setColor(16421912).setBiomeName("Desolate");
		        RcWasteland = (new GenWasteland(43)).setColor(16421912).setBiomeName("RcWasteland");
		        
		        
		        //Begin Voids
		        RegisterBlocks();
		        SetTextures();
		        AddNames();
		        Recipes();
		        addSmelts();
		        Achievements();
		        Biomes();
		        AddMob();
		        TileEntites();
		        Bonemeal();
		        CustomBlockModels();
		        //End Voids		        
	}
	
	
	public void SetTextures()
	{
		MinecraftForgeClient.preloadTexture("/reactioncraft/rcs/Blocks.png");
		MinecraftForgeClient.preloadTexture("/reactioncraft/rcs/ExtraBlocks.png");
		MinecraftForgeClient.preloadTexture("/reactioncraft/rcs/Items.png");
		MinecraftForgeClient.preloadTexture("/reactioncraft/rcs/RcFalseBlocks.png");
		MinecraftForgeClient.preloadTexture("/reactioncraft/rcs/Liquids.png");
		MinecraftForgeClient.preloadTexture("/reactioncraft/rcs/Flags.png");
		MinecraftForgeClient.preloadTexture("/reactioncraft/rcs/extendedcolumn.png");
		MinecraftForgeClient.preloadTexture("/reactioncraft/rcs/plants.png");
		MinecraftForgeClient.preloadTexture("/reactioncraft/rcs/guiblock.png");
		MinecraftForgeClient.preloadTexture("/reactioncraft/rcs/furnace.png");
	}
	
	
	public void Achievements()
	{
		ModLoader.addAchievementDesc(Nether, "Welcome to Hell", " mined some bloodstone ");
		ModLoader.addAchievementDesc(DownloadReactionCraft, "Downloaded ReactionCraft", " Downloaded and played ReactionCraft :) ");	
		ModLoader.addAchievementDesc(Nuke, "O Shit", " we got nukes! ");
		ModLoader.addAchievementDesc(Creepin, "Stalker", " I'm Watching you ");
	}
	
	
	public void onItemPickup(EntityPlayer entityplayer, ItemStack itemstack) 
    { 
		if(itemstack.itemID == mod_ReactionCraft.FlowerMulti.blockID) 
		{ 
            entityplayer.addStat(DownloadReactionCraft, 1); 
		} 
		if(itemstack.itemID == mod_ReactionCraft.BloodStone.blockID) 
		{ 
            entityplayer.addStat(Nether, 1); 
		} 
		if(itemstack.itemID == mod_ReactionCraft.CreeperBlock.blockID) 
		{ 
            entityplayer.addStat(Creepin, 1); 
		}
		if(itemstack.itemID == mod_ReactionCraft.DylanNuke.blockID) 
		{ 
            entityplayer.addStat(Nuke, 1); 
		}
             
    }
	
	
	public void Bonemeal()
	{
		MinecraftForge.registerBonemealHandler(new RcForgeHandler());
	}
	
	
	public void Biomes() 
	{
		ModLoader.addBiome(RcDesert);
		ModLoader.addBiome(RcOcean);
		ModLoader.addBiome(RcWasteland);
		ModLoader.addBiome(RcDesolate);
	}
	
	
	public void RegisterBlocks()
	{
		 //MetaBlocks
    		//Glass Multi Blocks
			ModLoader.registerBlock(Multi, net.minecraft.src.Reactioncraft.ItemMulti.class);
			//Nether Multi Blocks
	        ModLoader.registerBlock(NetherMulti, net.minecraft.src.Reactioncraft.ItemMulti.class);
	        //HireoGlyphics
	        ModLoader.registerBlock(HireoMulti, net.minecraft.src.Reactioncraft.ItemMulti.class);
	        //Flowers
	        ModLoader.registerBlock(FlowerMulti, net.minecraft.src.Reactioncraft.ItemMulti.class);
	        //Bushes
	        ModLoader.registerBlock(BushesMulti, net.minecraft.src.Reactioncraft.ItemMulti.class);	        
	        //Small Columns
	        ModLoader.registerBlock(SkinnyColumnMulti, net.minecraft.src.Reactioncraft.ItemMulti.class);
	        //Columns
	        ModLoader.registerBlock(ColumnMulti, net.minecraft.src.Reactioncraft.ItemMulti.class);
	        //Bricks
	        ModLoader.registerBlock(BrickMulti, net.minecraft.src.Reactioncraft.ItemMulti.class);
	        //Ores
	        ModLoader.registerBlock(OreMulti, net.minecraft.src.Reactioncraft.ItemMulti.class);
	        //Ore Blocks
	        ModLoader.registerBlock(MetalBlockMulti, net.minecraft.src.Reactioncraft.ItemMulti.class);
	        //Desert Blocks
	        ModLoader.registerBlock(DesertBlockMulti, net.minecraft.src.Reactioncraft.ItemMulti.class);
	        //Glowing Carpets
	        ModLoader.registerBlock(CarpetMulti, net.minecraft.src.Reactioncraft.ItemMulti.class);
	        //Fossils
	        ModLoader.registerBlock(FossilMulti, net.minecraft.src.Reactioncraft.ItemMulti.class);
	        //GlowShrooms
	        ModLoader.registerBlock(GlowShroomMulti, net.minecraft.src.Reactioncraft.ItemMulti.class);
	        //Shells
	        ModLoader.registerBlock(ShellMulti, net.minecraft.src.Reactioncraft.ItemMulti.class);
	        //Lanterns
	        ModLoader.registerBlock(LanternMulti, net.minecraft.src.Reactioncraft.ItemMulti.class);
	        
	        
	        //Custom Block Models
			ModLoader.registerBlock(blockAluminium);
			ModLoader.registerBlock(creeperStatue);
			ModLoader.registerBlock(Cellblock);
			ModLoader.registerBlock(Larvablock);
			ModLoader.registerBlock(Hiveblock);
			ModLoader.registerBlock(creeperStatue);
			ModLoader.registerBlock(HumanStatue);
			ModLoader.registerBlock(ZombieStatue);
			ModLoader.registerBlock(SpiderStatue);
			ModLoader.registerBlock(cowstatue);
			ModLoader.registerBlock(pigstatue);
			ModLoader.registerBlock(skeletonstatue);
			ModLoader.registerBlock(villagerstatue);
			ModLoader.registerBlock(endermanstatue);
			ModLoader.registerBlock(dragonstatue);
			ModLoader.registerBlock(irongolemstatue);
	}
	
	public void CustomBlockModels()
	{
		BlockAluminiumRender render = new BlockAluminiumRender();
        ModLoader.registerTileEntity(net.minecraft.src.Reactioncraft.TileEntityBlockAluminium.class,"AluBlockTileEntity", render);
        
        net.minecraft.src.Reactioncraft.CreeperStatueRender render1 = new CreeperStatueRender();
        ModLoader.registerTileEntity(net.minecraft.src.Reactioncraft.TileEntityCreeperStatue.class,"CreeperStatueTileEntity", render1);
        
        net.minecraft.src.Reactioncraft.HumanStatueRender render2 = new HumanStatueRender();
        ModLoader.registerTileEntity(net.minecraft.src.Reactioncraft.TileEntityHumanStatue.class, "HumanStatueTileEntity", render2);
        
        net.minecraft.src.Reactioncraft.ZombieStatueRender render3 = new ZombieStatueRender();
        ModLoader.registerTileEntity(net.minecraft.src.Reactioncraft.TileEntityZombieStatue.class, "ZommbieStatueTileEntity", render3);
        
        net.minecraft.src.Reactioncraft.SpiderStatueRender render4 = new SpiderStatueRender();
        ModLoader.registerTileEntity(net.minecraft.src.Reactioncraft.TileEntitySpiderStatue.class, "SpiderStatueTileEntity" , render4);
        
        net.minecraft.src.Reactioncraft.CowStatueRender render5 = new CowStatueRender();
        ModLoader.registerTileEntity(net.minecraft.src.Reactioncraft.TileEntityCowStatue.class, "CowStatueTileEntity" , render5);
        
        net.minecraft.src.Reactioncraft.PigStatueRender render6 = new PigStatueRender();
        ModLoader.registerTileEntity(net.minecraft.src.Reactioncraft.TileEntityPigStatue.class, "PigStatueTileEntity" , render6);
        
        net.minecraft.src.Reactioncraft.SkeletonStatueRender render7 = new SkeletonStatueRender();
        ModLoader.registerTileEntity(net.minecraft.src.Reactioncraft.TileEntitySkeletonStatue.class, "SkeletonStatueTileEntity", render7);
        
        net.minecraft.src.Reactioncraft.VillagerStatueRender render8 = new VillagerStatueRender();
        ModLoader.registerTileEntity(net.minecraft.src.Reactioncraft.TileEntityVillagerStatue.class, "VillagerStatueTileEntity", render8);
        
        net.minecraft.src.Reactioncraft.EndermanStatueRender render9 = new EndermanStatueRender();
        ModLoader.registerTileEntity(net.minecraft.src.Reactioncraft.TileEntiyEndermanStatue.class, "EndermanTileEntity", render9);
        
        net.minecraft.src.Reactioncraft.DragonStatueRender render10 = new DragonStatueRender();
        ModLoader.registerTileEntity(net.minecraft.src.Reactioncraft.TileEntityDragonStatue.class, "DragonStatueTileEntity" , render10);
        
        net.minecraft.src.Reactioncraft.IronGolemStatueRender render11 = new IronGolemStatueRender();
        ModLoader.registerTileEntity(net.minecraft.src.Reactioncraft.TileEntityIronGolemStatue.class, "IronGolemStatueTileEntity", render11);
	}
	
	
	public void AddNames()
	{
		//Meta's
			//Colored Glass
			ModLoader.addName(new ItemStack(Multi, 1), "Yellow StainedGlass");
	        ModLoader.addName(new ItemStack(Multi, 1, 1), "Red StainedGlass");
	        ModLoader.addName(new ItemStack(Multi, 1, 2), "Black StainedGlass");
	        ModLoader.addName(new ItemStack(Multi, 1, 3), "Blue StainedGlass");
	        ModLoader.addName(new ItemStack(Multi, 1, 4), "Brown StainedGlass");
	        ModLoader.addName(new ItemStack(Multi, 1, 5), "Cyan StainedGlass");
	        ModLoader.addName(new ItemStack(Multi, 1, 6), "Gray StainedGlass");
	        ModLoader.addName(new ItemStack(Multi, 1, 7), "Green StainedGlass");
	        ModLoader.addName(new ItemStack(Multi, 1, 8), "Lightblue StainedGlass");
	        ModLoader.addName(new ItemStack(Multi, 1, 9), "Lightgray StainedGlass");
	        ModLoader.addName(new ItemStack(Multi, 1, 10), "Limegreen StainedGlass");
	        ModLoader.addName(new ItemStack(Multi, 1, 11), "Magenta StainedGlass");
	        ModLoader.addName(new ItemStack(Multi, 1, 12), "Orange StainedGlass");
	        ModLoader.addName(new ItemStack(Multi, 1, 13), "Pink StainedGlass");
	        ModLoader.addName(new ItemStack(Multi, 1, 14), "Purple StainedGlass");
	        ModLoader.addName(new ItemStack(Multi, 1, 15), "White StainedGlass");
		
	        
	        //Flowers
	        ModLoader.addName(new ItemStack(FlowerMulti, 1), 	 "");
	        ModLoader.addName(new ItemStack(FlowerMulti, 1, 1),  "");
	        ModLoader.addName(new ItemStack(FlowerMulti, 1, 2),  "");
	        ModLoader.addName(new ItemStack(FlowerMulti, 1, 3),  "");
	        ModLoader.addName(new ItemStack(FlowerMulti, 1, 4),  "");
	        ModLoader.addName(new ItemStack(FlowerMulti, 1, 5),  "");
	        ModLoader.addName(new ItemStack(FlowerMulti, 1, 6),  "");
	        ModLoader.addName(new ItemStack(FlowerMulti, 1, 7),  "");
	        ModLoader.addName(new ItemStack(FlowerMulti, 1, 8),  "");
	        ModLoader.addName(new ItemStack(FlowerMulti, 1, 9),  "");
	        ModLoader.addName(new ItemStack(FlowerMulti, 1, 10), "");
	        ModLoader.addName(new ItemStack(FlowerMulti, 1, 11), "");
	        ModLoader.addName(new ItemStack(FlowerMulti, 1, 12), "");
	        ModLoader.addName(new ItemStack(FlowerMulti, 1, 13), "");
	        ModLoader.addName(new ItemStack(FlowerMulti, 1, 14), "");
	        ModLoader.addName(new ItemStack(FlowerMulti, 1, 15), "");
	        
	        
			//NetherOres 
	        ModLoader.addName(new ItemStack(NetherMulti, 1), 	"Onyx");
	        ModLoader.addName(new ItemStack(NetherMulti, 1, 1), "BloodStone");
	        ModLoader.addName(new ItemStack(NetherMulti, 1, 2), "DragonStone");
	        ModLoader.addName(new ItemStack(NetherMulti, 1, 3), "Iridium");
	        ModLoader.addName(new ItemStack(NetherMulti, 1, 4), "BlackDiamond");
	        ModLoader.addName(new ItemStack(NetherMulti, 1, 5), "Nether Iron");
	        ModLoader.addName(new ItemStack(NetherMulti, 1, 6), "Nether Lapis");
	        ModLoader.addName(new ItemStack(NetherMulti, 1, 7), "Nredstone");
	        ModLoader.addName(new ItemStack(NetherMulti, 1, 8), "Ncoal");    
	        
	        
	        //Hireoglyphics
	        ModLoader.addName(new ItemStack(HireoMulti, 1),    	"Hireoglyphics");
            ModLoader.addName(new ItemStack(HireoMulti, 1, 1), 	"Hireoglyphics");
            ModLoader.addName(new ItemStack(HireoMulti, 1, 2), 	"Hireoglyphics");
            ModLoader.addName(new ItemStack(HireoMulti, 1, 3), 	"Hireoglyphics");
            ModLoader.addName(new ItemStack(HireoMulti, 1, 4), 	"Hireoglyphics");
            ModLoader.addName(new ItemStack(HireoMulti, 1, 5), 	"Hireoglyphics");
            ModLoader.addName(new ItemStack(HireoMulti, 1, 6), 	"Hireoglyphics");
            ModLoader.addName(new ItemStack(HireoMulti, 1, 7), 	"Hireoglyphics");
            ModLoader.addName(new ItemStack(HireoMulti, 1, 8), 	"Hireoglyphics");
            ModLoader.addName(new ItemStack(HireoMulti, 1, 9), 	"Column Top");
            ModLoader.addName(new ItemStack(HireoMulti, 1, 10), "Column Base");
            ModLoader.addName(new ItemStack(HireoMulti, 1, 11), "Weathered Hireoglyph");
            ModLoader.addName(new ItemStack(HireoMulti, 1, 12), "Marble");
            ModLoader.addName(new ItemStack(HireoMulti, 1, 13), "Scroll Shelf");       
	        
	        
            //Bushes
            ModLoader.addName(new ItemStack(BushesMulti, 1),    "Blue Bush");
            ModLoader.addName(new ItemStack(BushesMulti, 1, 1), "Red Bush");
            
            
            //Skinny Column
            
            
            //Column
            
            
	        //Ores!
	        ModLoader.addName(new ItemStack(OreMulti, 1),     "Platinum Ore");
            ModLoader.addName(new ItemStack(OreMulti, 1, 1),  "Iron Ore");
            ModLoader.addName(new ItemStack(OreMulti, 1, 2),  "Gold Ore");
            ModLoader.addName(new ItemStack(OreMulti, 1, 3),  "Tin Ore");
            ModLoader.addName(new ItemStack(OreMulti, 1, 4),  "Copper Ore");
            ModLoader.addName(new ItemStack(OreMulti, 1, 5),  "Mithril Ore");
            ModLoader.addName(new ItemStack(OreMulti, 1, 6),  "Adamantite Ore");
            ModLoader.addName(new ItemStack(OreMulti, 1, 7),  "Daeyalt Ore");
            ModLoader.addName(new ItemStack(OreMulti, 1, 8),  "Zinc Ore");
            ModLoader.addName(new ItemStack(OreMulti, 1, 9),  "Cobalt Ore");
            ModLoader.addName(new ItemStack(OreMulti, 1, 10), "Titanium Ore");
            ModLoader.addName(new ItemStack(OreMulti, 1, 11), "Silver Ore");
            ModLoader.addName(new ItemStack(OreMulti, 1, 12), "Amethyst Ore");
            ModLoader.addName(new ItemStack(OreMulti, 1, 13), "Calcite Ore");
            ModLoader.addName(new ItemStack(OreMulti, 1, 14), "Vectrite Ore");
            ModLoader.addName(new ItemStack(OreMulti, 1, 15), "Manganese Ore");
	        
	        
            //
	        
	        
	        //Ore Blocks
            ModLoader.addName(new ItemStack(MetalBlockMulti, 1),     "Platinum Block");
            ModLoader.addName(new ItemStack(MetalBlockMulti, 1, 1),  "Cobalt Block");
            ModLoader.addName(new ItemStack(MetalBlockMulti, 1, 2),  "Copper Block");
            ModLoader.addName(new ItemStack(MetalBlockMulti, 1, 3),  "Mithril Block");
            ModLoader.addName(new ItemStack(MetalBlockMulti, 1, 4),  "Adamantite Block");
            ModLoader.addName(new ItemStack(MetalBlockMulti, 1, 5),  "Daeyalt Block");
            ModLoader.addName(new ItemStack(MetalBlockMulti, 1, 6),  "Tin Block");
            ModLoader.addName(new ItemStack(MetalBlockMulti, 1, 7),  "Titanium block");
            ModLoader.addName(new ItemStack(MetalBlockMulti, 1, 8),  "Silver Block");
            ModLoader.addName(new ItemStack(MetalBlockMulti, 1, 9),  "Vectrite Block");
            ModLoader.addName(new ItemStack(MetalBlockMulti, 1, 10), "Calcite Block");
            ModLoader.addName(new ItemStack(MetalBlockMulti, 1, 11), "Steel Block");
            ModLoader.addName(new ItemStack(MetalBlockMulti, 1, 12), "Onyx Block");
            ModLoader.addName(new ItemStack(MetalBlockMulti, 1, 13), "Amethyst Block");
            
            
            //Lanterns
            ModLoader.addName(new ItemStack(LanternMulti, 1),    "Lantern");
            ModLoader.addName(new ItemStack(LanternMulti, 1, 1), "Lantern");
            
            //Custom Block Models
            ModLoader.addName(blockAluminium, "Gold Bars");
    		ModLoader.addName(creeperStatue, "Creeper Statue");
    		ModLoader.addName(BloodStoneBorehead, "Bloodstone BoreHead");
    		ModLoader.addName(HumanStatue, "Human Statue");
    		ModLoader.addName(ZombieStatue, "Zombie Statue");
    		ModLoader.addName(SpiderStatue, "Spider Statue");
    		ModLoader.addName(cowstatue, "Cow Statue");
    		ModLoader.addName(pigstatue, "Pig Statue");
    		ModLoader.addName(skeletonstatue, "Skeleton Statue");
    		ModLoader.addName(villagerstatue, "Villager Statue");
    		ModLoader.addName(endermanstatue, "Enderman Statue");
    		ModLoader.addName(dragonstatue, " Dragon Statue");
    		ModLoader.addName(irongolemstatue, "Iron Golem Statue");
	}
	
	
	public void addSmelts()
	{
		//NetherMulti Meta Smelts
		//Onyx
		FurnaceRecipes.smelting().addSmelting(NetherMulti.blockID, new ItemStack(OnyxIngot));
		//Iridium
		FurnaceRecipes.smelting().addSmelting(NetherMulti.blockID, 5, new ItemStack(mod_ReactionCraft.IridiumIngot));
		//nether lapis to lapis lazuli
		FurnaceRecipes.smelting().addSmelting(NetherMulti.blockID, 8, new ItemStack(Item.dyePowder, 4, 4));
	
	//OreMulti Meta Smelts
		//mithril
        FurnaceRecipes.smelting().addSmelting(OreMulti.blockID, 5, new ItemStack(mod_ReactionCraft.MithrilIngot));
        //silver related
        FurnaceRecipes.smelting().addSmelting(OreMulti.blockID, 11, new ItemStack(SilverIngot, 1));
        //cobalt
        FurnaceRecipes.smelting().addSmelting(OreMulti.blockID, 9, new ItemStack(CobaltIngot, 1));                       
        //adamantite
        FurnaceRecipes.smelting().addSmelting(OreMulti.blockID, 6, new ItemStack(AdamantiteIngot, 1));
        //Copper
        FurnaceRecipes.smelting().addSmelting(OreMulti.blockID, 4, new ItemStack(CopperIngot, 1));
        //Tin
        FurnaceRecipes.smelting().addSmelting(OreMulti.blockID, 3, new ItemStack(TinIngot, 1));
        //Calcite
        FurnaceRecipes.smelting().addSmelting(OreMulti.blockID, 13, new ItemStack(CalciteIngot, 1));
        //Amethyst
        FurnaceRecipes.smelting().addSmelting(OreMulti.blockID, 12, new ItemStack(AmethystIngot, 1));
        //Dayealt
        FurnaceRecipes.smelting().addSmelting(OreMulti.blockID, 7, new ItemStack(DaeyaltIngot, 1));
        //Titanium
        FurnaceRecipes.smelting().addSmelting(OreMulti.blockID, 10, new ItemStack(TitaniumIngot, 1));
        
        
        
        //platinum
        ModLoader.addSmelting(OreMulti.blockID, new ItemStack(PlatinumIngot, 1));
        
        //Misc Recipes\\
        
        //Exo marble to dark marble
        ModLoader.addSmelting(Marblec.blockID, new ItemStack(HireoMulti, 1, 12));
        
        
        
        //magma- to -magmastone              	
		//FurnaceRecipes.smelting().addSmelting(MiscMulti.blockID, 8, new ItemStack(MiscMulti, 1, 5));
		
		//Nether Recipes\\ 
		
		//Nether Iron                		
		FurnaceRecipes.smelting().addSmelting(NetherMulti.blockID, 7, new ItemStack(Item.ingotIron, 1));
        
        //food
		ModLoader.addSmelting(RawBacon.shiftedIndex, new ItemStack(Bacon, 1));
		ModLoader.addSmelting(RawNuggets.shiftedIndex, new ItemStack(ChickenNuggets, 1));
		
		
        //dust
        ModLoader.addSmelting(ManganeseDust.shiftedIndex, new ItemStack(ManganeseIngot, 1));
        
        //silver
        ModLoader.addSmelting(SilverIngot.shiftedIndex, new ItemStack(RefinedSilverIngot, 1));
        
        //charcoal
        ModLoader.addSmelting(Cherrywood.blockID, new ItemStack(Item.coal, 1));
        
		//nether smelting bs
        ModLoader.addSmelting(BloodStoneDust.shiftedIndex, new ItemStack(BloodStoneIngot, 1));
        ModLoader.addSmelting(Block.obsidian.blockID, new ItemStack(mod_ReactionCraft.ObsidianIngot, 2));
        ModLoader.addSmelting(GoldClump.shiftedIndex, new ItemStack(RefinedGoldIngot, 1));
        
        //Coral to dyes
        ModLoader.addSmelting(OrangeCoral.blockID, new ItemStack(Item.dyePowder, 1, 14));
        ModLoader.addSmelting(GreenCoral.blockID, new ItemStack(Item.dyePowder, 1, 2));
        ModLoader.addSmelting(PurpleCoral.blockID, new ItemStack(Item.dyePowder, 1, 5));
        ModLoader.addSmelting(BrownCoral.blockID, new ItemStack(Item.dyePowder, 1, 3));
        ModLoader.addSmelting(BlueCoral.blockID, new ItemStack(Item.dyePowder, 1, 4));
        ModLoader.addSmelting(LightBlueCoral.blockID, new ItemStack(Item.dyePowder, 1, 12));
        ModLoader.addSmelting(LightGreenCoral.blockID, new ItemStack(Item.dyePowder, 1, 10));
        ModLoader.addSmelting(PinkCoral.blockID, new ItemStack(Item.dyePowder, 1, 9));
        ModLoader.addSmelting(LightBlueOrangeCoral.blockID, new ItemStack(Item.dyePowder, 1, 12));
        ModLoader.addSmelting(LightBlueCoral2.blockID, new ItemStack(Item.dyePowder, 1, 2));
        ModLoader.addSmelting(DarkGreenCoral.blockID, new ItemStack(DarkGreenDye));
        ModLoader.addSmelting(RedCoral.blockID, new ItemStack(Item.dyePowder, 1, 1));
        ModLoader.addSmelting(MagentaCoral.blockID, new ItemStack(Item.dyePowder, 1, 1));
        
        //plants to raw stuff / dyes3
        ModLoader.addSmelting(Bamboo.blockID, new ItemStack(DriedBamboo));
        ModLoader.addSmelting(RcTallGrass.blockID, new ItemStack(Straw));
        ModLoader.addSmelting(NetherCane.blockID, new ItemStack(NetherCaneDust));
        
        ///Desert Ore           	
		ModLoader.addSmelting(DesertGold.blockID, new ItemStack(Item.ingotGold, 1));
		
		//Iron
		ModLoader.addSmelting(Item.ingotIron.shiftedIndex, new ItemStack(SuperHeatedIron, 1));
	}
	
	
	public void TileEntites()
	{
		ModLoader.registerTileEntity(TileEntityCrate.class, "RC chest");
	}
	
	
	public void Recipes()
	{
		//ModLoader.takenFromCrafting(var0, var1, var2)
		
		//MinecraftForge.getBlockHarvestLevel(block, metadata, toolClass)
		//ForgeHooks.onTakenFromCrafting(player, Flintchisel, craftMatrix);
	}
	
	
	public void AddMob()
	{
				//Giant Bee
				ModLoader.registerEntityID(EntityBee.class, "Bee", 141);
		        ModLoader.addSpawn(EntityBee.class, 1, 4, 4, EnumCreatureType.creature);
				
				//   ***MageApprentice***
				ModLoader.registerEntityID(EntityMage1.class, "Mage1", 141);
		        ModLoader.addSpawn(EntityMage1.class, 1, 4, 4, EnumCreatureType.creature);
				
				
				//  ***MageMaster***
		        ModLoader.registerEntityID(EntityMage2.class, "Mage2", 141);
		        ModLoader.addSpawn(EntityMage2.class, 1, 4, 4, EnumCreatureType.creature);
	}
	
	
	public int addFuel (int i, int j)
    {
            if(i== MagmaBucket.shiftedIndex)
                    return 600000;
            return 0;
    }
	
	/** Nether Generation **/
	public void generateNether(World world, Random rand, int baseX, int baseZ)
    {
      	for(int x = 0; x < 30; x++)
          {
              int Xcoord = baseX + rand.nextInt(16);
              int Ycoord = rand.nextInt(35);
              int Zcoord = baseZ + rand.nextInt(16);
              (new WorldGenRcNether(BloodStone.blockID, 50)).generate(world, rand, Xcoord, Ycoord, Zcoord);
          }
      	for(int x = 0; x < 30; x++)
          {
              int Xcoord = baseX + rand.nextInt(16);
              int Ycoord = rand.nextInt(35);
              int Zcoord = baseZ + rand.nextInt(16);
              (new WorldGenRcNether(NetherMulti.blockID, 5)).generate(world, rand, Xcoord, Ycoord, Zcoord);
          }
          //NetherMeta Blocks
      	
      	for(int x = 0; x < 30; x++)
          {
              int Xcoord = baseX + rand.nextInt(16);
              int Ycoord = rand.nextInt(35);
              int Zcoord = baseZ + rand.nextInt(16);
              (new GenMetaNether(NetherMulti.blockID, 50, 1)).generate(world, rand, Xcoord, Ycoord, Zcoord);
          }
      	for(int x = 0; x < 30; x++)
          {
              int Xcoord = baseX + rand.nextInt(16);
              int Ycoord = rand.nextInt(35);
              int Zcoord = baseZ + rand.nextInt(16);
              (new GenMetaNether(NetherMulti.blockID, 5, 2)).generate(world, rand, Xcoord, Ycoord, Zcoord);
          }
      	for(int x = 0; x < 30; x++)
          {
              int Xcoord = baseX + rand.nextInt(16);
              int Ycoord = rand.nextInt(35);
              int Zcoord = baseZ + rand.nextInt(16);
              (new GenMetaNether(NetherMulti.blockID, 5, 4)).generate(world, rand, Xcoord, Ycoord, Zcoord);
          }
      	for(int x = 0; x < 30; x++)
          {
              int Xcoord = baseX + rand.nextInt(16);
              int Ycoord = rand.nextInt(35);
              int Zcoord = baseZ + rand.nextInt(16);
              (new GenMetaNether(NetherMulti.blockID, 5, 5)).generate(world, rand, Xcoord, Ycoord, Zcoord);
          }
      	for(int x = 0; x < 30; x++)
          {
              int Xcoord = baseX + rand.nextInt(16);
              int Ycoord = rand.nextInt(35);
              int Zcoord = baseZ + rand.nextInt(16);
              (new GenMetaNether(NetherMulti.blockID, 5, 6)).generate(world, rand, Xcoord, Ycoord, Zcoord);
          }
      	for(int x = 0; x < 30; x++)
          {
              int Xcoord = baseX + rand.nextInt(16);
              int Ycoord = rand.nextInt(35);
              int Zcoord = baseZ + rand.nextInt(16);
              (new GenMetaNether(NetherMulti.blockID, 5, 7)).generate(world, rand, Xcoord, Ycoord, Zcoord);
          }
      	for(int x = 0; x < 30; x++)
          {
              int Xcoord = baseX + rand.nextInt(16);
              int Ycoord = rand.nextInt(35);
              int Zcoord = baseZ + rand.nextInt(16);
              (new GenMetaNether(NetherMulti.blockID, 5, 8)).generate(world, rand, Xcoord, Ycoord, Zcoord);
          }
      	for(int x = 0; x < 30; x++)
          {
              int Xcoord = baseX + rand.nextInt(16);
              int Ycoord = rand.nextInt(35);
              int Zcoord = baseZ + rand.nextInt(16);
              (new GenMetaNether(NetherMulti.blockID, 5, 9)).generate(world, rand, Xcoord, Ycoord, Zcoord);
          }
      	for(int x = 0; x < 30; x++)
          {
              int Xcoord = baseX + rand.nextInt(16);
              int Ycoord = rand.nextInt(35);
              int Zcoord = baseZ + rand.nextInt(16);
              (new GenMetaNether(NetherMulti.blockID, 5, 10)).generate(world, rand, Xcoord, Ycoord, Zcoord);
          }
      	
      	//GlowShrooms
      	for(int j11 = 0; j11 < 6; j11++)
          {
              int Xcoord = baseX + rand.nextInt(16) + 8;
              int Ycoord = rand.nextInt(128);
              int Zcoord = baseZ + rand.nextInt(16) + 8;
              (new WorldGenRcNether(GlowShroomMulti.blockID, 1)).generate(world, rand, Xcoord, Ycoord, Zcoord);
          }
      	for(int j11 = 0; j11 < 6; j11++)
          {
              int Xcoord = baseX + rand.nextInt(16) + 8;
              int Ycoord = rand.nextInt(128);
              int Zcoord = baseZ + rand.nextInt(16) + 8;
              (new GenMetaNether(GlowShroomMulti.blockID, 1, 1)).generate(world, rand, Xcoord, Ycoord, Zcoord);
          }
      	//Nethercane
      	if(rand.nextInt(20) == 0)
          {
              for(int k = 0; k < 40; k++)
              {
                  for(int l = 0; l < 40; l++)
                  {
                      int i1 = rand.nextInt(200);
                      if(world.getBlockId(baseX + l, i1, baseZ + k) != Block.netherrack.blockID || !world.isAirBlock(baseX + l, i1 + 1, baseZ + k))
                      {
                          continue;
                      }
                      int j1 = rand.nextInt(2);
                      if(j1 == 0)
                      {
                          world.setBlock(baseX + l, i1 + 1, baseZ + k, NetherCane.blockID);
                      }
                      if(j1 == 1)
                      {
                          world.setBlock(baseX + l, i1 + 1, baseZ + k, NetherCane.blockID);
                          world.setBlock(baseX + l, i1 + 2, baseZ + k, NetherCane.blockID);
                      }
                      if(j1 == 2)
                      {
                          world.setBlock(baseX + l, i1 + 1, baseZ + k, NetherCane.blockID);
                          world.setBlock(baseX + l, i1 + 2, baseZ + k, NetherCane.blockID);
                          world.setBlock(baseX + l, i1 + 3, baseZ + k, NetherCane.blockID);
                      }
                                          if(j1 == 3)
                      {
                          world.setBlock(baseX + l, i1 + 1, baseZ + k, NetherCane.blockID);
                          world.setBlock(baseX + l, i1 + 2, baseZ + k, NetherCane.blockID);
                          world.setBlock(baseX + l, i1 + 3, baseZ + k, NetherCane.blockID);
                      if(j1 == 4)
                      {
                          world.setBlock(baseX + l, i1 + 1, baseZ + k, NetherCane.blockID);
                          world.setBlock(baseX + l, i1 + 2, baseZ + k, NetherCane.blockID);
                          world.setBlock(baseX + l, i1 + 3, baseZ + k, NetherCane.blockID);
                          world.setBlock(baseX + l, i1 + 1, baseZ + k, NetherCane.blockID);
                          world.setBlock(baseX + l, i1 + 2, baseZ + k, NetherCane.blockID);
                          world.setBlock(baseX + l, i1 + 3, baseZ + k, NetherCane.blockID);
                      }
                                                  world.setBlock(baseX + l, i1 + 4, baseZ + k, Block.netherrack.blockID);
                      }
                  }
              }
              
          }
                  
    }
	
	public void generateSurface(World world, Random rand, int baseX, int baseZ)
    {	
  		
    	//Marble gen
    	for(int x = 0; x < 2; x++)
    	{
    		int Xcoord = baseX + rand.nextInt(16);
    		int Ycoord = rand.nextInt(70);
    		int Zcoord = baseZ + rand.nextInt(16);
    		(new WorldGenMinable(Marble.blockID, 10)).generate(world, rand, Xcoord, Ycoord, Zcoord);		
    	}	
    	
    	//Regular Ores
        
    	//Currupted Ores on the surface
    	for(int x = 0; x < 2; x++)
    	{
    		int Xcoord = baseX + rand.nextInt(16);
    		int Ycoord = rand.nextInt(35);
    		int Zcoord = baseZ + rand.nextInt(16);
    		(new WorldGenMinable(BloodStone.blockID, 2)).generate(world, rand, Xcoord, Ycoord, Zcoord);		
    	}
    	for(int x = 0; x < 2; x++)
    	{
    		int Xcoord = baseX + rand.nextInt(16);
    		int Ycoord = rand.nextInt(35);
    		int Zcoord = baseZ + rand.nextInt(16);
    		(new GenMetaMinable(NetherMulti.blockID, 8, 2)).generate(world, rand, Xcoord, Ycoord, Zcoord);		
    	}            
    	
    	//Platinum
        for(int k = 0; k < 5; k++)
        {
            int i1 = baseX + rand.nextInt(16);
            int k1 = rand.nextInt(30);
            int i2 = baseZ + rand.nextInt(16);
            (new WorldGenMinable(OreMulti.blockID, 8)).generate(world, rand, i1, k1, i2);
        }
        
        //
        for(int k = 0; k < 5; k++)
        {
            int i1 = baseX + rand.nextInt(16);
            int k1 = rand.nextInt(30);
            int i2 = baseZ + rand.nextInt(16);
            (new GenMetaMinable(OreMulti.blockID, 8, 3)).generate(world, rand, i1, k1, i2);
        }
        
        //
        for(int k = 0; k < 5; k++)
        {
            int i1 = baseX + rand.nextInt(16);
            int k1 = rand.nextInt(40);
            int i2 = baseZ + rand.nextInt(16);
            (new GenMetaMinable(OreMulti.blockID, 8, 4)).generate(world, rand, i1, k1, i2);
        }
        
        //
        for(int k = 0; k < 5; k++)
        {
            int i1 = baseX + rand.nextInt(16);
            int k1 = rand.nextInt(40);
            int i2 = baseZ + rand.nextInt(16);
            (new GenMetaMinable(OreMulti.blockID, 8, 5)).generate(world, rand, i1, k1, i2);
        }
        
        //
        for(int k = 0; k < 5; k++)
        {
            int i1 = baseX + rand.nextInt(16);
            int k1 = rand.nextInt(45);
            int i2 = baseZ + rand.nextInt(16);
            (new GenMetaMinable(OreMulti.blockID, 8, 6)).generate(world, rand, i1, k1, i2);
        }
        
        //
        for(int k = 0; k < 5; k++)
        {
            int i1 = baseX + rand.nextInt(16);
            int k1 = rand.nextInt(45);
            int i2 = baseZ + rand.nextInt(16);
            (new GenMetaMinable(OreMulti.blockID, 8, 7)).generate(world, rand, i1, k1, i2);
        }
        
        //
        for(int k = 0; k < 5; k++)
        {
            int i1 = baseX + rand.nextInt(16);
            int k1 = rand.nextInt(50);
            int i2 = baseZ + rand.nextInt(16);
            (new GenMetaMinable(OreMulti.blockID, 8, 8)).generate(world, rand, i1, k1, i2);
        }
        
        //
        for(int k = 0; k < 5; k++)
        {
            int i1 = baseX + rand.nextInt(16);
            int k1 = rand.nextInt(50);
            int i2 = baseZ + rand.nextInt(16);
            (new GenMetaMinable(OreMulti.blockID, 8, 9)).generate(world, rand, i1, k1, i2);
        }
        
        //
        for(int k = 0; k < 5; k++)
        {
            int i1 = baseX + rand.nextInt(16);
            int k1 = rand.nextInt(55);
            int i2 = baseZ + rand.nextInt(16);
            (new GenMetaMinable(OreMulti.blockID, 8, 10)).generate(world, rand, i1, k1, i2);
        }
        
        //
        for(int k = 0; k < 5; k++)
        {
            int i1 = baseX + rand.nextInt(16);
            int k1 = rand.nextInt(55);
            int i2 = baseZ + rand.nextInt(16);
            (new GenMetaMinable(OreMulti.blockID, 8, 11)).generate(world, rand, i1, k1, i2);
        }
        
        //
        for(int k = 0; k < 5; k++)
        {
            int i1 = baseX + rand.nextInt(16);
            int k1 = rand.nextInt(55);
            int i2 = baseZ + rand.nextInt(16);
            (new GenMetaMinable(OreMulti.blockID, 8, 12)).generate(world, rand, i1, k1, i2);
        }
        
        //
        for(int k = 0; k < 5; k++)
        {
            int i1 = baseX + rand.nextInt(16);
            int k1 = rand.nextInt(32);
            int i2 = baseZ + rand.nextInt(16);
            (new GenMetaMinable(OreMulti.blockID, 8, 13)).generate(world, rand, i1, k1, i2);
        }
        
        //
        for(int k = 0; k < 5; k++)
        {
        	int i1 = baseX + rand.nextInt(16);
            int k1 = rand.nextInt(31);
            int i2 = baseZ + rand.nextInt(16);
            (new GenMetaMinable(OreMulti.blockID, 8, 14)).generate(world, rand, i1, k1, i2);
        }
        
        //
        for(int k = 0; k < 5; k++)
        {
        	int i1 = baseX + rand.nextInt(16);
            int k1 = rand.nextInt(30);
            int i2 = baseZ + rand.nextInt(16);
            (new GenMetaMinable(OreMulti.blockID, 8, 15)).generate(world, rand, i1, k1, i2);
        }
        
        //Iron scarecly at 12 , more frequently at 40
        for(int k = 0; k < 5; k++)
        {
            int i1 = baseX + rand.nextInt(16);
            int k1 = rand.nextInt(12);
            int i2 = baseZ + rand.nextInt(16);
            (new GenMetaMinable(OreMulti.blockID, 3, 1)).generate(world, rand, i1, k1, i2);
        }
        for(int k = 0; k < 15; k++)
        {
            int i1 = baseX + rand.nextInt(16);
            int k1 = rand.nextInt(40);
            int i2 = baseZ + rand.nextInt(16);
            (new GenMetaMinable(OreMulti.blockID, 5, 1)).generate(world, rand, i1, k1, i2);
        }
        
        //Gold gold ore found at 27, scarcely 18, 22
        for(int k = 0; k < 5; k++)
        {
            int i1 = baseX + rand.nextInt(16);
            int k1 = rand.nextInt(18);
            int i2 = baseZ + rand.nextInt(16);
            (new GenMetaMinable(OreMulti.blockID, 1, 2)).generate(world, rand, i1, k1, i2);
        }
        for(int k = 0; k < 10; k++)
        {
            int i1 = baseX + rand.nextInt(16);
            int k1 = rand.nextInt(22);
            int i2 = baseZ + rand.nextInt(16);
            (new GenMetaMinable(OreMulti.blockID, 2, 2)).generate(world, rand, i1, k1, i2);
        }
        for(int k = 0; k < 15; k++)
        {
            int i1 = baseX + rand.nextInt(16);
            int k1 = rand.nextInt(27);
            int i2 = baseZ + rand.nextInt(16);
            (new GenMetaMinable(OreMulti.blockID, 5, 2)).generate(world, rand, i1, k1, i2);
        }
        
        //Magma Block
        for(int k = 0; k < 10; k++)
        {
            int i1 = baseX + rand.nextInt(16);
            int k1 = rand.nextInt(9);
            int i2 = baseZ + rand.nextInt(16);
            (new GenMetaMinable(BrickMulti.blockID, 3, 6)).generate(world, rand, i1, k1, i2);
        }
        
        //RcBedRock
        for(int k = 0; k < 60; k++)
        {
            int i1 = baseX + rand.nextInt(16);
            int k1 = rand.nextInt(6);
            int i2 = baseZ + rand.nextInt(16);
            (new GenMetaMinable(BrickMulti.blockID, 50, 7)).generate(world, rand, i1, k1, i2);
        }
        
      //bamboo
        if(rand.nextInt(20) == 0)
        {
            for(int k = 0; k < 16; k++)
            {
                for(int l = 0; l < 16; l++)
                {
                    int i1 = rand.nextInt(200);
                    if(world.getBlockId(baseX + l, i1, baseZ + k) != Block.grass.blockID || !world.isAirBlock(baseX + l, i1 + 1, baseZ + k))
                    {
                        continue;
                    }
                    int j1 = rand.nextInt(2);
                    if(j1 == 0)
                    {
                        world.setBlock(baseX + l, i1 + 1, baseZ + k, Bamboo.blockID);
                    }
                    if(j1 == 1)
                    {
                        world.setBlock(baseX + l, i1 + 1, baseZ + k, Bamboo.blockID);
                        world.setBlock(baseX + l, i1 + 2, baseZ + k, Bamboo.blockID);
                    }
                    if(j1 == 2)
                    {
                        world.setBlock(baseX + l, i1 + 1, baseZ + k, Bamboo.blockID);
                        world.setBlock(baseX + l, i1 + 2, baseZ + k, Bamboo.blockID);
                        world.setBlock(baseX + l, i1 + 3, baseZ + k, Bamboo.blockID);
                    }
                                        if(j1 == 3)
                    {
                        world.setBlock(baseX + l, i1 + 1, baseZ + k, Bamboo.blockID);
                        world.setBlock(baseX + l, i1 + 2, baseZ + k, Bamboo.blockID);
                        world.setBlock(baseX + l, i1 + 3, baseZ + k, Bamboo.blockID);
                    if(j1 == 4)
                    {
                        world.setBlock(baseX + l, i1 + 1, baseZ + k, Bamboo.blockID);
                        world.setBlock(baseX + l, i1 + 2, baseZ + k, Bamboo.blockID);
                        world.setBlock(baseX + l, i1 + 3, baseZ + k, Bamboo.blockID);
                        world.setBlock(baseX + l, i1 + 1, baseZ + k, Bamboo.blockID);
                        world.setBlock(baseX + l, i1 + 2, baseZ + k, Bamboo.blockID);
                        world.setBlock(baseX + l, i1 + 3, baseZ + k, Bamboo.blockID);
                    }
                                                world.setBlock(baseX + l, i1 + 4, baseZ + k, Bamboo.blockID);
                    }
                }

            }

        }
        //Flowers
        for(int k = 0; k < 1; k++)
        {
            int i1 = baseX + rand.nextInt(16) + 8;
            int k1 = rand.nextInt(128);
            int i2 = baseZ + rand.nextInt(16) + 8;
            (new WorldGenFlowers(FlowerMulti.blockID)).generate(world, rand, i1, k1, i2);
        }
        for(int k = 0; k < 1; k++)
        {
            int i1 = baseX + rand.nextInt(16) + 8;
            int k1 = rand.nextInt(128);
            int i2 = baseZ + rand.nextInt(16) + 8;
            (new WorldGenMetaFlowers(FlowerMulti.blockID, 1)).generate(world, rand, i1, k1, i2);
        }
        for(int k = 0; k < 1; k++)
        {
            int i1 = baseX + rand.nextInt(16) + 8;
            int k1 = rand.nextInt(128);
            int i2 = baseZ + rand.nextInt(16) + 8;
            (new WorldGenFlowers(RcTallGrass.blockID)).generate(world, rand, i1, k1, i2);
        }
        for(int k = 0; k < 1; k++)
        {
            int i1 = baseX + rand.nextInt(16) + 8;
            int k1 = rand.nextInt(128);
            int i2 = baseZ + rand.nextInt(16) + 8;
            (new WorldGenFlowers(BushesMulti.blockID)).generate(world, rand, i1, k1, i2);
        }
        for(int k = 0; k < 1; k++)
        {
            int i1 = baseX + rand.nextInt(16) + 8;
            int k1 = rand.nextInt(128);
            int i2 = baseZ + rand.nextInt(16) + 8;
            (new WorldGenMetaFlowers(BushesMulti.blockID, 1)).generate(world, rand, i1, k1, i2);
        }
        for(int k = 0; k < 1; k++)
        {
            int i1 = baseX + rand.nextInt(16) + 8;
            int k1 = rand.nextInt(128);
            int i2 = baseZ + rand.nextInt(16) + 8;
            (new WorldGenMetaFlowers(CactusMulti.blockID, 1)).generate(world, rand, i1, k1, i2);
        }
        for(int k = 0; k < 1; k++)
        {
            int i1 = baseX + rand.nextInt(16) + 8;
            int k1 = rand.nextInt(128);
            int i2 = baseZ + rand.nextInt(16) + 8;
            (new WorldGenFlowers(CactusMulti.blockID)).generate(world, rand, i1, k1, i2);
        }
        for(int k = 0; k < 1; k++)
        {
            int i1 = baseX + rand.nextInt(16) + 8;
            int k1 = rand.nextInt(128);
            int i2 = baseZ + rand.nextInt(16) + 8;
            (new WorldGenFlowers(ReedPlant.blockID)).generate(world, rand, i1, k1, i2);
        }
        
        // Trees!
        
        BiomeGenBase biome = world.getWorldChunkManager().getBiomeGenAt(baseX, baseZ); 
        WorldGenReactionCraftTree tree = new WorldGenReactionCraftTree(); 
        if(biome == BiomeGenBase.plains || biome == BiomeGenBase.forest ||
        		biome == BiomeGenBase.forestHills || biome == BiomeGenBase.extremeHillsEdge ||
        		biome == BiomeGenBase.extremeHills || biome == BiomeGenBase.desertHills ||
        		biome == BiomeGenBase.desert || biome == BiomeGenBase.swampland ||
        		biome == BiomeGenBase.taiga || biome == BiomeGenBase.taigaHills)
        { 
        	for(int x = 0; x < 1; x++)
        	{
        		int Xcoord = baseX + rand.nextInt(16); 
        		int Zcoord = baseZ + rand.nextInt(16); 
        		int i = world.getHeightValue(Xcoord, Zcoord); 
        		tree.generate(world, rand, Xcoord, i, Zcoord); 
        	}
        } 
    
        //Coral Generation
  
        	for(int f = 0; f < 200;f++)
        	{
        	int x = baseX + rand.nextInt(16);
        	int y = rand.nextInt(128);
        	int z = baseZ + rand.nextInt(16);
        	new WaterGeneration(OrangeCoral.blockID, 1).generate(world, rand, x, y, z);
        	System.out.println("lala: "+x+", "+y+", "+z);
        	}
        	for(int f = 0; f < 200;f++)
        	{
        	int x = baseX + rand.nextInt(16);
        	int y = rand.nextInt(128);
        	int z = baseZ + rand.nextInt(16);
        	new WaterGeneration(GreenCoral.blockID, 1).generate(world, rand, x, y, z);
        	System.out.println("l: "+x+", "+y+", "+z);
        	}
        	for(int f = 0; f < 200;f++)
        	{
        	int x = baseX + rand.nextInt(16);
        	int y = rand.nextInt(128);
        	int z = baseZ + rand.nextInt(16);
        	new WaterGeneration(Block.sponge.blockID, 1).generate(world, rand, x, y, z);
        	System.out.println("la: "+x+", "+y+", "+z);
        	}
        	
        	
        	
        	//not working below
        	//Soon to be sea weed gen
        	 if(rand.nextInt(20) == 0)
             {
                 for(int k = 0; k < 16; k++)
                 {
                     for(int l = 0; l < 16; l++)
                     {
                         int i1 = rand.nextInt(200);
                         if(world.getBlockId(baseX + l, i1, baseZ + k) != Block.sand.blockID || !world.isAirBlock(baseX + l, i1 + 1, baseZ + k))
                         {
                             continue;
                         }
                         int j1 = rand.nextInt(2);
                         if(j1 == 0)
                         {
                             world.setBlock(baseX + l, i1 + 1, baseZ + k, SeaWeed.blockID);
                         }
                         if(j1 == 1)
                         {
                             world.setBlock(baseX + l, i1 + 1, baseZ + k, SeaWeed.blockID);
                             world.setBlock(baseX + l, i1 + 2, baseZ + k, SeaWeed.blockID);
                         }
                         if(j1 == 2)
                         {
                             world.setBlock(baseX + l, i1 + 1, baseZ + k, SeaWeed.blockID);
                             world.setBlock(baseX + l, i1 + 2, baseZ + k, SeaWeed.blockID);
                             world.setBlock(baseX + l, i1 + 3, baseZ + k, SeaWeed.blockID);
                         }
                                             if(j1 == 3)
                         {
                             world.setBlock(baseX + l, i1 + 1, baseZ + k, SeaWeed.blockID);
                             world.setBlock(baseX + l, i1 + 2, baseZ + k, SeaWeed.blockID);
                             world.setBlock(baseX + l, i1 + 3, baseZ + k, SeaWeed.blockID);
                         if(j1 == 4)
                         {
                             world.setBlock(baseX + l, i1 + 1, baseZ + k, SeaWeed.blockID);
                             world.setBlock(baseX + l, i1 + 2, baseZ + k, SeaWeed.blockID);
                             world.setBlock(baseX + l, i1 + 3, baseZ + k, SeaWeed.blockID);
                             world.setBlock(baseX + l, i1 + 1, baseZ + k, SeaWeed.blockID);
                             world.setBlock(baseX + l, i1 + 2, baseZ + k, SeaWeed.blockID);
                             world.setBlock(baseX + l, i1 + 3, baseZ + k, SeaWeed.blockID);
                         }
                                                     world.setBlock(baseX + l, i1 + 4, baseZ + k, SeaWeed.blockID);
                         }
                     }

                 }

             }
    
    }    
	
	@Override
    public boolean clientSideRequired()
    {
            return false;
    }

	
    @Override
    public boolean serverSideRequired()
    {
            return false;
    }
}
