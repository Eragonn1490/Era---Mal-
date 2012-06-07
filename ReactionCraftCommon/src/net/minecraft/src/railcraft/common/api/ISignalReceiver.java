package net.minecraft.src.railcraft.common.api;

import net.minecraft.src.World;

public interface ISignalReceiver
{

    public boolean doesActionOnAspect(EnumSignalAspect aspect);

    public void doActionOnAspect(EnumSignalAspect aspect, boolean trigger);

    public boolean attemptToPairWithController(ISignalController controller);

    public void clearPairedController();

    public boolean isPairedWithController();

    public ISignalController getController();

    public int getControllerX();

    public int getControllerY();

    public int getControllerZ();

    public int getX();

    public int getY();

    public int getZ();

    public int getDimension();
    
    public World getWorld();

    public String getDescription();
}
