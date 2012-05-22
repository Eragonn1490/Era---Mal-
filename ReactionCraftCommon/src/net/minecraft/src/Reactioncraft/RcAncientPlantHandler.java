//Start Of Malkierian code from #risucraft
package net.minecraft.src.Reactioncraft;
 
import net.minecraft.src.World;
import net.minecraft.src.mod_ReactionCraft;
import net.minecraft.src.forge.*;
 
public class RcAncientPlantHandler implements IBonemealHandler
{
        public boolean onUseBonemeal(World world, int bid, int i, int j, int k)
        {
                if(bid == mod_ReactionCraft.AncientPlant.blockID)
                {
                	((RcAncientPlant)mod_ReactionCraft.AncientPlant).fertilize(world, i, j, k);   
                	return true;
                }
                return false;
        }
 
}
//End Of Malkierian code from #risucraft