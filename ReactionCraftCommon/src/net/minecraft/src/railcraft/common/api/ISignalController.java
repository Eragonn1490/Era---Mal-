package net.minecraft.src.railcraft.common.api;

import net.minecraft.src.World;

public interface ISignalController
{

    public EnumSignalAspect getSignalAspect();

    public boolean attemptToPairWithReceiver(ISignalReceiver receiver);

    public void startReceiverPairing();

    public void endReceiverPairing();

    public void clearPairedReceiver();

    public boolean isPairedWithReceiver();

    public ISignalReceiver getReceiver();

    public int getReceiverX();

    public int getReceiverY();

    public int getReceiverZ();

    public int getX();

    public int getY();

    public int getZ();

    public int getDimension();

    public World getWorld();

    public String getDescription();
}
