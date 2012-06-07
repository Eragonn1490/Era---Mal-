package net.minecraft.src.railcraft.common.api;

public interface IBlockSignal
{

    public void startSignalBlockPairing();

    public void endSignalBlockPairing();
    
    public boolean locateRail();

    public boolean attemptToPair(IBlockSignal other);

    public void clearSignalBlockPairing(String reason);

    public boolean isSignalBlockBeingPaired();

    public boolean isSignalBlockPaired();

    public IBlockSignal getSignalBlockPair();

    public int getSignalBlockPairX();

    public int getSignalBlockPairY();

    public int getSignalBlockPairZ();

    public int getRailX();

    public int getRailY();

    public int getRailZ();

    public int getX();

    public int getY();

    public int getZ();
    
    public int getDimension();
    
    public String getDescription();
}
