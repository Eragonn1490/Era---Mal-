package net.minecraft.src;

import java.util.List;
import java.util.Random;

public class EntityFishHook extends Entity
{
    /** The tile this entity is on, X position */
    private int xTile;

    /** The tile this entity is on, Y position */
    private int yTile;

    /** The tile this entity is on, Z position */
    private int zTile;
    private int inTile;
    private boolean inGround;
    public int shake;
    public EntityPlayer angler;
    private int ticksInGround;
    private int ticksInAir;

    /** the number of ticks remaining until this fish can no longer be caught */
    private int ticksCatchable;

    /**
     * The entity that the fishing rod is connected to, if any. When you right click on the fishing rod and the hook
     * falls on to an entity, this it that entity.
     */
    public Entity bobber;
    private int fishPosRotationIncrements;
    private double fishX;
    private double fishY;
    private double fishZ;
    private double fishYaw;
    private double fishPitch;
    private double velocityX;
    private double velocityY;
    private double velocityZ;

    public EntityFishHook(World par1World)
    {
        super(par1World);
        xTile = -1;
        yTile = -1;
        zTile = -1;
        inTile = 0;
        inGround = false;
        shake = 0;
        ticksInAir = 0;
        ticksCatchable = 0;
        bobber = null;
        setSize(0.25F, 0.25F);
        ignoreFrustumCheck = true;
    }

    public EntityFishHook(World par1World, double par2, double par4, double par6)
    {
        this(par1World);
        setPosition(par2, par4, par6);
        ignoreFrustumCheck = true;
    }

    public EntityFishHook(World par1World, EntityPlayer par2EntityPlayer)
    {
        super(par1World);
        xTile = -1;
        yTile = -1;
        zTile = -1;
        inTile = 0;
        inGround = false;
        shake = 0;
        ticksInAir = 0;
        ticksCatchable = 0;
        bobber = null;
        ignoreFrustumCheck = true;
        angler = par2EntityPlayer;
        angler.fishEntity = this;
        setSize(0.25F, 0.25F);
        setLocationAndAngles(par2EntityPlayer.posX, (par2EntityPlayer.posY + 1.6200000000000001D) - (double)par2EntityPlayer.yOffset, par2EntityPlayer.posZ, par2EntityPlayer.rotationYaw, par2EntityPlayer.rotationPitch);
        posX -= MathHelper.cos((rotationYaw / 180F) * (float)Math.PI) * 0.16F;
        posY -= 0.10000000000000001D;
        posZ -= MathHelper.sin((rotationYaw / 180F) * (float)Math.PI) * 0.16F;
        setPosition(posX, posY, posZ);
        yOffset = 0.0F;
        float f = 0.4F;
        motionX = -MathHelper.sin((rotationYaw / 180F) * (float)Math.PI) * MathHelper.cos((rotationPitch / 180F) * (float)Math.PI) * f;
        motionZ = MathHelper.cos((rotationYaw / 180F) * (float)Math.PI) * MathHelper.cos((rotationPitch / 180F) * (float)Math.PI) * f;
        motionY = -MathHelper.sin((rotationPitch / 180F) * (float)Math.PI) * f;
        calculateVelocity(motionX, motionY, motionZ, 1.5F, 1.0F);
    }

    protected void entityInit()
    {
    }

    /**
     * Checks if the entity is in range to render by using the past in distance and comparing it to its average edge
     * length * 64 * renderDistanceWeight Args: distance
     */
    public boolean isInRangeToRenderDist(double par1)
    {
        double d = boundingBox.getAverageEdgeLength() * 4D;
        d *= 64D;
        return par1 < d * d;
    }

    public void calculateVelocity(double par1, double par3, double par5, float par7, float par8)
    {
        float f = MathHelper.sqrt_double(par1 * par1 + par3 * par3 + par5 * par5);
        par1 /= f;
        par3 /= f;
        par5 /= f;
        par1 += rand.nextGaussian() * 0.0074999999999999997D * (double)par8;
        par3 += rand.nextGaussian() * 0.0074999999999999997D * (double)par8;
        par5 += rand.nextGaussian() * 0.0074999999999999997D * (double)par8;
        par1 *= par7;
        par3 *= par7;
        par5 *= par7;
        motionX = par1;
        motionY = par3;
        motionZ = par5;
        float f1 = MathHelper.sqrt_double(par1 * par1 + par5 * par5);
        prevRotationYaw = rotationYaw = (float)((Math.atan2(par1, par5) * 180D) / Math.PI);
        prevRotationPitch = rotationPitch = (float)((Math.atan2(par3, f1) * 180D) / Math.PI);
        ticksInGround = 0;
    }

    /**
     * Sets the position and rotation. Only difference from the other one is no bounding on the rotation. Args: posX,
     * posY, posZ, yaw, pitch
     */
    public void setPositionAndRotation2(double par1, double par3, double par5, float par7, float par8, int par9)
    {
        fishX = par1;
        fishY = par3;
        fishZ = par5;
        fishYaw = par7;
        fishPitch = par8;
        fishPosRotationIncrements = par9;
        motionX = velocityX;
        motionY = velocityY;
        motionZ = velocityZ;
    }

    /**
     * Sets the velocity to the args. Args: x, y, z
     */
    public void setVelocity(double par1, double par3, double par5)
    {
        velocityX = motionX = par1;
        velocityY = motionY = par3;
        velocityZ = motionZ = par5;
    }

    /**
     * Called to update the entity's position/logic.
     */
    public void onUpdate()
    {
        super.onUpdate();

        if (fishPosRotationIncrements > 0)
        {
            double d = posX + (fishX - posX) / (double)fishPosRotationIncrements;
            double d1 = posY + (fishY - posY) / (double)fishPosRotationIncrements;
            double d2 = posZ + (fishZ - posZ) / (double)fishPosRotationIncrements;
            double d4;

            for (d4 = fishYaw - (double)rotationYaw; d4 < -180D; d4 += 360D) { }

            for (; d4 >= 180D; d4 -= 360D) { }

            rotationYaw = (float)((double)rotationYaw + d4 / (double)fishPosRotationIncrements);
            rotationPitch = (float)((double)rotationPitch + (fishPitch - (double)rotationPitch) / (double)fishPosRotationIncrements);
            fishPosRotationIncrements--;
            setPosition(d, d1, d2);
            setRotation(rotationYaw, rotationPitch);
        }
        else
        {
            if (!worldObj.isRemote)
            {
                ItemStack itemstack = angler.getCurrentEquippedItem();

                if (angler.isDead || !angler.isEntityAlive() || itemstack == null || itemstack.getItem() != Item.fishingRod || getDistanceSqToEntity(angler) > 1024D)
                {
                    setDead();
                    angler.fishEntity = null;
                    return;
                }

                if (bobber != null)
                {
                    if (!bobber.isDead)
                    {
                        posX = bobber.posX;
                        posY = bobber.boundingBox.minY + (double)bobber.height * 0.80000000000000004D;
                        posZ = bobber.posZ;
                        return;
                    }

                    bobber = null;
                }
            }

            if (shake > 0)
            {
                shake--;
            }

            if (inGround)
            {
                int i = worldObj.getBlockId(xTile, yTile, zTile);

                if (i == inTile)
                {
                    ticksInGround++;

                    if (ticksInGround == 1200)
                    {
                        setDead();
                    }

                    return;
                }

                inGround = false;
                motionX *= rand.nextFloat() * 0.2F;
                motionY *= rand.nextFloat() * 0.2F;
                motionZ *= rand.nextFloat() * 0.2F;
                ticksInGround = 0;
                ticksInAir = 0;
            }
            else
            {
                ticksInAir++;
            }

            Vec3D vec3d = Vec3D.createVector(posX, posY, posZ);
            Vec3D vec3d1 = Vec3D.createVector(posX + motionX, posY + motionY, posZ + motionZ);
            MovingObjectPosition movingobjectposition = worldObj.rayTraceBlocks(vec3d, vec3d1);
            vec3d = Vec3D.createVector(posX, posY, posZ);
            vec3d1 = Vec3D.createVector(posX + motionX, posY + motionY, posZ + motionZ);

            if (movingobjectposition != null)
            {
                vec3d1 = Vec3D.createVector(movingobjectposition.hitVec.xCoord, movingobjectposition.hitVec.yCoord, movingobjectposition.hitVec.zCoord);
            }

            Entity entity = null;
            List list = worldObj.getEntitiesWithinAABBExcludingEntity(this, boundingBox.addCoord(motionX, motionY, motionZ).expand(1.0D, 1.0D, 1.0D));
            double d3 = 0.0D;

            for (int j = 0; j < list.size(); j++)
            {
                Entity entity1 = (Entity)list.get(j);

                if (!entity1.canBeCollidedWith() || entity1 == angler && ticksInAir < 5)
                {
                    continue;
                }

                float f2 = 0.3F;
                AxisAlignedBB axisalignedbb = entity1.boundingBox.expand(f2, f2, f2);
                MovingObjectPosition movingobjectposition1 = axisalignedbb.calculateIntercept(vec3d, vec3d1);

                if (movingobjectposition1 == null)
                {
                    continue;
                }

                double d5 = vec3d.distanceTo(movingobjectposition1.hitVec);

                if (d5 < d3 || d3 == 0.0D)
                {
                    entity = entity1;
                    d3 = d5;
                }
            }

            if (entity != null)
            {
                movingobjectposition = new MovingObjectPosition(entity);
            }

            if (movingobjectposition != null)
            {
                if (movingobjectposition.entityHit != null)
                {
                    if (movingobjectposition.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, angler), 0))
                    {
                        bobber = movingobjectposition.entityHit;
                    }
                }
                else
                {
                    inGround = true;
                }
            }

            if (!inGround)
            {
                moveEntity(motionX, motionY, motionZ);
                float f = MathHelper.sqrt_double(motionX * motionX + motionZ * motionZ);
                rotationYaw = (float)((Math.atan2(motionX, motionZ) * 180D) / Math.PI);

                for (rotationPitch = (float)((Math.atan2(motionY, f) * 180D) / Math.PI); rotationPitch - prevRotationPitch < -180F; prevRotationPitch -= 360F) { }

                for (; rotationPitch - prevRotationPitch >= 180F; prevRotationPitch += 360F) { }

                for (; rotationYaw - prevRotationYaw < -180F; prevRotationYaw -= 360F) { }

                for (; rotationYaw - prevRotationYaw >= 180F; prevRotationYaw += 360F) { }

                rotationPitch = prevRotationPitch + (rotationPitch - prevRotationPitch) * 0.2F;
                rotationYaw = prevRotationYaw + (rotationYaw - prevRotationYaw) * 0.2F;
                float f1 = 0.92F;

                if (onGround || isCollidedHorizontally)
                {
                    f1 = 0.5F;
                }

                int k = 5;
                double d7 = 0.0D;

                for (int l = 0; l < k; l++)
                {
                    double d8 = ((boundingBox.minY + ((boundingBox.maxY - boundingBox.minY) * (double)(l + 0)) / (double)k) - 0.125D) + 0.125D;
                    double d9 = ((boundingBox.minY + ((boundingBox.maxY - boundingBox.minY) * (double)(l + 1)) / (double)k) - 0.125D) + 0.125D;
                    AxisAlignedBB axisalignedbb1 = AxisAlignedBB.getBoundingBoxFromPool(boundingBox.minX, d8, boundingBox.minZ, boundingBox.maxX, d9, boundingBox.maxZ);

                    if (worldObj.isAABBInMaterial(axisalignedbb1, Material.water))
                    {
                        d7 += 1.0D / (double)k;
                    }
                }

                if (d7 > 0.0D)
                {
                    if (ticksCatchable > 0)
                    {
                        ticksCatchable--;
                    }
                    else
                    {
                        char c = 500;

                        if (worldObj.canLightningStrikeAt(MathHelper.floor_double(posX), MathHelper.floor_double(posY) + 1, MathHelper.floor_double(posZ)))
                        {
                            c = 300;
                        }

                        if (rand.nextInt(c) == 0)
                        {
                            ticksCatchable = rand.nextInt(30) + 10;
                            motionY -= 0.20000000000000001D;
                            worldObj.playSoundAtEntity(this, "random.splash", 0.25F, 1.0F + (rand.nextFloat() - rand.nextFloat()) * 0.4F);
                            float f3 = MathHelper.floor_double(boundingBox.minY);

                            for (int i1 = 0; (float)i1 < 1.0F + width * 20F; i1++)
                            {
                                float f6 = (rand.nextFloat() * 2.0F - 1.0F) * width;
                                float f4 = (rand.nextFloat() * 2.0F - 1.0F) * width;
                                worldObj.spawnParticle("bubble", posX + (double)f6, f3 + 1.0F, posZ + (double)f4, motionX, motionY - (double)(rand.nextFloat() * 0.2F), motionZ);
                            }

                            for (int j1 = 0; (float)j1 < 1.0F + width * 20F; j1++)
                            {
                                float f7 = (rand.nextFloat() * 2.0F - 1.0F) * width;
                                float f5 = (rand.nextFloat() * 2.0F - 1.0F) * width;
                                worldObj.spawnParticle("splash", posX + (double)f7, f3 + 1.0F, posZ + (double)f5, motionX, motionY, motionZ);
                            }
                        }
                    }
                }

                if (ticksCatchable > 0)
                {
                    motionY -= (double)(rand.nextFloat() * rand.nextFloat() * rand.nextFloat()) * 0.20000000000000001D;
                }

                double d6 = d7 * 2D - 1.0D;
                motionY += 0.040000000000000001D * d6;

                if (d7 > 0.0D)
                {
                    f1 = (float)((double)f1 * 0.90000000000000002D);
                    motionY *= 0.80000000000000004D;
                }

                motionX *= f1;
                motionY *= f1;
                motionZ *= f1;
                setPosition(posX, posY, posZ);
            }
        }
    }

    /**
     * (abstract) Protected helper method to write subclass entity data to NBT.
     */
    public void writeEntityToNBT(NBTTagCompound par1NBTTagCompound)
    {
        par1NBTTagCompound.setShort("xTile", (short)xTile);
        par1NBTTagCompound.setShort("yTile", (short)yTile);
        par1NBTTagCompound.setShort("zTile", (short)zTile);
        par1NBTTagCompound.setByte("inTile", (byte)inTile);
        par1NBTTagCompound.setByte("shake", (byte)shake);
        par1NBTTagCompound.setByte("inGround", (byte)(inGround ? 1 : 0));
    }

    /**
     * (abstract) Protected helper method to read subclass entity data from NBT.
     */
    public void readEntityFromNBT(NBTTagCompound par1NBTTagCompound)
    {
        xTile = par1NBTTagCompound.getShort("xTile");
        yTile = par1NBTTagCompound.getShort("yTile");
        zTile = par1NBTTagCompound.getShort("zTile");
        inTile = par1NBTTagCompound.getByte("inTile") & 0xff;
        shake = par1NBTTagCompound.getByte("shake") & 0xff;
        inGround = par1NBTTagCompound.getByte("inGround") == 1;
    }

    public float getShadowSize()
    {
        return 0.0F;
    }

    public int catchFish()
    {
        byte byte0 = 0;

        if (bobber != null)
        {
            double d = angler.posX - posX;
            double d1 = angler.posY - posY;
            double d23 = angler.posZ - posZ;
            double d45 = MathHelper.sqrt_double(d * d + d1 * d1 + d23 * d23);
            double d67 = 0.10000000000000001D;
            bobber.motionX += d * d67;
            bobber.motionY += d1 * d67 + (double)MathHelper.sqrt_double(d45) * 0.080000000000000002D;
            bobber.motionZ += d23 * d67;
            byte0 = 3;
        }
        else if (ticksCatchable > 2)
        {
            int i = rand.nextInt(21);

            if (i == 0)
            {
                EntityItem entityitem = new EntityItem(worldObj, posX, posY, posZ, new ItemStack(Item.fishRaw));
                double d2 = angler.posX - posX;
                double d24 = angler.posY - posY;
                double d46 = angler.posZ - posZ;
                double d68 = MathHelper.sqrt_double(d2 * d2 + d24 * d24 + d46 * d46);
                double d89 = 0.10000000000000001D;
                entityitem.motionX = d2 * d89;
                entityitem.motionY = d24 * d89 + (double)MathHelper.sqrt_double(d68) * 0.080000000000000002D;
                entityitem.motionZ = d46 * d89;
                worldObj.spawnEntityInWorld(entityitem);
                angler.addStat(StatList.fishCaughtStat, 1);
                byte0 = 1;
            }

            if (i == 1)
            {
                EntityItem entityitem1 = new EntityItem(worldObj, posX, posY, posZ, new ItemStack(Item.bootsLeather));
                double d3 = angler.posX - posX;
                double d25 = angler.posY - posY;
                double d47 = angler.posZ - posZ;
                double d69 = MathHelper.sqrt_double(d3 * d3 + d25 * d25 + d47 * d47);
                double d90 = 0.10000000000000001D;
                entityitem1.motionX = d3 * d90;
                entityitem1.motionY = d25 * d90 + (double)MathHelper.sqrt_double(d69) * 0.080000000000000002D;
                entityitem1.motionZ = d47 * d90;
                worldObj.spawnEntityInWorld(entityitem1);
                angler.addStat(StatList.fishCaughtStat, 1);
                byte0 = 1;
            }

            if (i == 2)
            {
                EntityItem entityitem2 = new EntityItem(worldObj, posX, posY, posZ, new ItemStack(Item.glassBottle));
                double d4 = angler.posX - posX;
                double d26 = angler.posY - posY;
                double d48 = angler.posZ - posZ;
                double d70 = MathHelper.sqrt_double(d4 * d4 + d26 * d26 + d48 * d48);
                double d91 = 0.10000000000000001D;
                entityitem2.motionX = d4 * d91;
                entityitem2.motionY = d26 * d91 + (double)MathHelper.sqrt_double(d70) * 0.080000000000000002D;
                entityitem2.motionZ = d48 * d91;
                worldObj.spawnEntityInWorld(entityitem2);
                angler.addStat(StatList.fishCaughtStat, 1);
                byte0 = 1;
            }

            if (i == 3)
            {
                EntityItem entityitem3 = new EntityItem(worldObj, posX, posY, posZ, new ItemStack(mod_ReactionCraft.SamonRaw));
                double d5 = angler.posX - posX;
                double d27 = angler.posY - posY;
                double d49 = angler.posZ - posZ;
                double d71 = MathHelper.sqrt_double(d5 * d5 + d27 * d27 + d49 * d49);
                double d92 = 0.10000000000000001D;
                entityitem3.motionX = d5 * d92;
                entityitem3.motionY = d27 * d92 + (double)MathHelper.sqrt_double(d71) * 0.080000000000000002D;
                entityitem3.motionZ = d49 * d92;
                worldObj.spawnEntityInWorld(entityitem3);
                angler.addStat(StatList.fishCaughtStat, 1);
                byte0 = 1;
            }

            if (i == 4)
            {
                EntityItem entityitem4 = new EntityItem(worldObj, posX, posY, posZ, new ItemStack(mod_ReactionCraft.YellowTailRaw));
                double d6 = angler.posX - posX;
                double d28 = angler.posY - posY;
                double d50 = angler.posZ - posZ;
                double d72 = MathHelper.sqrt_double(d6 * d6 + d28 * d28 + d50 * d50);
                double d93 = 0.10000000000000001D;
                entityitem4.motionX = d6 * d93;
                entityitem4.motionY = d28 * d93 + (double)MathHelper.sqrt_double(d72) * 0.080000000000000002D;
                entityitem4.motionZ = d50 * d93;
                worldObj.spawnEntityInWorld(entityitem4);
                angler.addStat(StatList.fishCaughtStat, 1);
                byte0 = 1;
            }
            
            if (i == 5)
            {
                EntityItem entityitem5 = new EntityItem(worldObj, posX, posY, posZ, new ItemStack(mod_ReactionCraft.Shipinabottle));
                double d7 = angler.posX - posX;
                double d29 = angler.posY - posY;
                double d51 = angler.posZ - posZ;
                double d73 = MathHelper.sqrt_double(d7 * d7 + d29 * d29 + d51 * d51);
                double d94 = 0.10000000000000001D;
                entityitem5.motionX = d7 * d94;
                entityitem5.motionY = d29 * d94 + (double)MathHelper.sqrt_double(d73) * 0.080000000000000002D;
                entityitem5.motionZ = d51 * d94;
                worldObj.spawnEntityInWorld(entityitem5);
                angler.addStat(StatList.fishCaughtStat, 1);
                byte0 = 1;
            }
            
            if (i == 6)
            {
                EntityItem entityitem5 = new EntityItem(worldObj, posX, posY, posZ, new ItemStack(mod_ReactionCraft.Mapinabottle));
                double d7 = angler.posX - posX;
                double d29 = angler.posY - posY;
                double d51 = angler.posZ - posZ;
                double d73 = MathHelper.sqrt_double(d7 * d7 + d29 * d29 + d51 * d51);
                double d94 = 0.10000000000000001D;
                entityitem5.motionX = d7 * d94;
                entityitem5.motionY = d29 * d94 + (double)MathHelper.sqrt_double(d73) * 0.080000000000000002D;
                entityitem5.motionZ = d51 * d94;
                worldObj.spawnEntityInWorld(entityitem5);
                angler.addStat(StatList.fishCaughtStat, 1);
                byte0 = 1;
            }
            
            /**		Start by copying the code below and then follow steps:
             		# 1 to make extra random fish drops edit this change i == 5 to + 1 from the last used one 
             		# 2 change mod_ReactionCraft.insertitemnamehere to the actual item
            
             	
              if (i == 5)
            {
                EntityItem entityitem5 = new EntityItem(worldObj, posX, posY, posZ, new ItemStack(mod_ReactionCraft.insertitemhere));
                double d7 = angler.posX - posX;
                double d29 = angler.posY - posY;
                double d51 = angler.posZ - posZ;
                double d73 = MathHelper.sqrt_double(d7 * d7 + d29 * d29 + d51 * d51);
                double d94 = 0.10000000000000001D;
                entityitem5.motionX = d7 * d94;
                entityitem5.motionY = d29 * d94 + (double)MathHelper.sqrt_double(d73) * 0.080000000000000002D;
                entityitem5.motionZ = d51 * d94;
                worldObj.spawnEntityInWorld(entityitem5);
                angler.addStat(StatList.fishCaughtStat, 1);
                byte0 = 1;
            }
            
            
             **/
        }

        if (inGround)
        {
            byte0 = 2;
        }

        setDead();
        angler.fishEntity = null;
        return byte0;
    }
}
