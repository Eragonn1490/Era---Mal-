package net.minecraft.src.Reactioncraft;

import java.util.Random;

import net.minecraft.src.EntityMob;
import net.minecraft.src.Item;
import net.minecraft.src.World;

public class EntityBee extends EntityMob
{
        public EntityBee(World world)
        {
                super(world);
                texture = "/reactioncraft/mobs/bee.png";
                moveSpeed = 0.5F;
                isImmuneToFire = false;
                attackStrength = 4; //This line can only be here if the class extends EntityMob above ^^^. If it doesn't, just delete this whole line
        }

        public int getMaxHealth()
        {
                return 10;
        }

        protected String getLivingSound()
        {
                return null;
        }

        protected String getHurtSound()
        {
                return null;
        }

        protected String getDeathSound()
        {
                return null;
        }

        protected int getDropItemId()
        {
                return Item.ingotIron.shiftedIndex;
        }

protected boolean canDespawn()
{
return false;
}

}