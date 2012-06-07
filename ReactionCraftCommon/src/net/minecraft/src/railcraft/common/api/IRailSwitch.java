package net.minecraft.src.railcraft.common.api;

public interface IRailSwitch extends IRail, IRailReversable
{

    public boolean isSwitched();

    public void setSwitched(boolean switched);

    public boolean getDirection();
}
