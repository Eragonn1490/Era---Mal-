package net.minecraft.src;

public abstract class EntityAIDoorInteract extends EntityAIBase
{
    protected EntityLiving theEntity;
    protected int entityPosX;
    protected int entityPosY;
    protected int entityPosZ;
    protected BlockDoor targetDoor;
    boolean field_48186_f;
    float field_48187_g;
    float field_48193_h;

    public EntityAIDoorInteract(EntityLiving par1EntityLiving)
    {
        this.theEntity = par1EntityLiving;
    }

    /**
     * Returns whether the EntityAIBase should begin execution.
     */
    public boolean shouldExecute()
    {
        if (!this.theEntity.isCollidedHorizontally)
        {
            return false;
        }
        else
        {
            PathNavigate var1 = this.theEntity.getNavigator();
            PathEntity var2 = var1.getPath();

            if (var2 != null && !var2.isFinished() && var1.getCanBreakDoors())
            {
                for (int var3 = 0; var3 < Math.min(var2.getCurrentPathIndex() + 2, var2.getCurrentPathLength()); ++var3)
                {
                    PathPoint var4 = var2.getPathPointFromIndex(var3);
                    this.entityPosX = var4.xCoord;
                    this.entityPosY = var4.yCoord + 1;
                    this.entityPosZ = var4.zCoord;

                    if (this.theEntity.getDistanceSq((double)this.entityPosX, this.theEntity.posY, (double)this.entityPosZ) <= 2.25D)
                    {
                        this.targetDoor = this.func_48185_a(this.entityPosX, this.entityPosY, this.entityPosZ);

                        if (this.targetDoor != null)
                        {
                            return true;
                        }
                    }
                }

                this.entityPosX = MathHelper.floor_double(this.theEntity.posX);
                this.entityPosY = MathHelper.floor_double(this.theEntity.posY + 1.0D);
                this.entityPosZ = MathHelper.floor_double(this.theEntity.posZ);
                this.targetDoor = this.func_48185_a(this.entityPosX, this.entityPosY, this.entityPosZ);
                return this.targetDoor != null;
            }
            else
            {
                return false;
            }
        }
    }

    /**
     * Returns whether an in-progress EntityAIBase should continue executing
     */
    public boolean continueExecuting()
    {
        return !this.field_48186_f;
    }

    /**
     * Execute a one shot task or start executing a continuous task
     */
    public void startExecuting()
    {
        this.field_48186_f = false;
        this.field_48187_g = (float)((double)((float)this.entityPosX + 0.5F) - this.theEntity.posX);
        this.field_48193_h = (float)((double)((float)this.entityPosZ + 0.5F) - this.theEntity.posZ);
    }

    /**
     * Updates the task
     */
    public void updateTask()
    {
        float var1 = (float)((double)((float)this.entityPosX + 0.5F) - this.theEntity.posX);
        float var2 = (float)((double)((float)this.entityPosZ + 0.5F) - this.theEntity.posZ);
        float var3 = this.field_48187_g * var1 + this.field_48193_h * var2;

        if (var3 < 0.0F)
        {
            this.field_48186_f = true;
        }
    }

    private BlockDoor func_48185_a(int par1, int par2, int par3)
    {
        int var4 = this.theEntity.worldObj.getBlockId(par1, par2, par3);

        if (var4 != Block.doorWood.blockID)
        {
            return null;
        }
        else
        {
            BlockDoor var5 = (BlockDoor)Block.blocksList[var4];
            return var5;
        }
    }
}