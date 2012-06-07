package net.minecraft.src.railcraft.common.api;

public interface IRailPowered extends IRail
{

    boolean isPowered();

    void setPowered(boolean powered);

    int getPowerPropagation();
}
