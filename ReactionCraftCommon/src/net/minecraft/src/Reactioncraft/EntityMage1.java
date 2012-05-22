package net.minecraft.src.Reactioncraft;

import net.minecraft.src.EntityCreature;
import net.minecraft.src.Item;
import net.minecraft.src.NBTTagCompound;
import net.minecraft.src.World;

public class EntityMage1 extends EntityCreature
{



	public EntityMage1(World world)
    {
        super(world);

        //Set the texture
        texture = "/reactioncraft/mobs/MageApprentice.PNG";

        //Set the size of the hitbox
        setSize(1F,1F);

        //Set the speed of the mob
        //NOTE: 0 = 0% speed, 1 = 100%, 0.75 = 75%
        moveSpeed = 20F;

        //Set how much health the mob has
    	health = 25;

    }     

    public void writeEntityToNBT(NBTTagCompound nbttagcompound)
    {
        super.writeEntityToNBT(nbttagcompound);
    } 

    public void readEntityFromNBT(NBTTagCompound nbttagcompound)
    {
        super.readEntityFromNBT(nbttagcompound);
    } 

 
    protected String getLivingSound()
    {
        //This is what sound the mob makes when it is alive and well
        return "mob.villager.default";
    } 

    protected String getHurtSound()
    {
       //This is what sound the mob makes when it is getting hurt
        return "mob.villager.defaulthurt";
    } 

    protected String getDeathSound()
    {
       //This is what sound the mob makes when it is in the process of dying
        return "mob.villager.defaultdeath";
    } 

 	//Here's where you change the volume of the mob's sounds
    protected float getSoundVolume()
    {
        return 0.4F;
    } 

 	//Here you define what items/blocks you want the mob to drop when killed
     protected void dropFewItems()
    {
      dropItem(Item.bow.shiftedIndex, 10);
      dropItem(Item.arrow.shiftedIndex, 64);
      dropItem(Item.swordDiamond.shiftedIndex, 1);
    }

	@Override
	public int getMaxHealth() {
		// TODO Auto-generated method stub
		return 0;
	}
}