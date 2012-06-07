package net.minecraft.src.railcraft.common.api;

/**
 * This enum represent the standard Minecraft defined direction values
 * often used for metadata and various other functions.
 * @author CovertJaguar <railcraft.wikispaces.com>
 */
public enum EnumDirection
{

    DOWN(0),
    UP(1),
    NORTH(2),
    SOUTH(3),
    WEST(4),
    EAST(5);
    private final byte value;

    private EnumDirection(int value)
    {
        this.value = (byte)value;
    }

    public byte getValue()
    {
        return value;
    }

    public static EnumDirection fromValue(int i)
    {
        for(EnumDirection d : values()) {
            if(d.getValue() == i) {
                return d;
            }
        }
        return UP;
    }

    public EnumDirection oppositeSide()
    {
        return EnumDirection.fromValue(getValue() % 2 == 0 ? getValue() + 1 : getValue() - 1);
    }
}
