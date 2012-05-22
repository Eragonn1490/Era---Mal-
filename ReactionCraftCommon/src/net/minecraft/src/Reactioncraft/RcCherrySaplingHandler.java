//Start Of Malkierian code from #risucraft
package net.minecraft.src.Reactioncraft;
 
import java.util.Random;

import net.minecraft.src.World;
import net.minecraft.src.mod_ReactionCraft;
import net.minecraft.src.forge.*;
 
public class RcCherrySaplingHandler implements IBonemealHandler
{
		public boolean onUseBonemeal(World par1World, int blockID, int X, int Y, int Z)
        {
                if(blockID == mod_ReactionCraft.CherrySapling.blockID)
                {
                    ((RcCherrySapling)mod_ReactionCraft.CherrySapling).growTree(par1World, X, Y, Z, par1World.rand);   
                	return true;
                }
                return false;
		}
 
}
//End Of Malkierian code from #risucraft