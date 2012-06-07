package net.minecraft.src.railcraft.common.api;

import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import net.minecraft.src.ModLoader;

/**
 * This class is used for printing API related errors to the log files.
 *
 * Generally, new API functions should be surround by try/catch blocks that catch <code>Error</code> throws.
 * This ensures that the game doesn't crash if the incorrect API version is loaded first.
 *
 * @author CovertJaguar <railcraft.wikispaces.com>
 */
public abstract class APIErrorHandler
{

    private static final Set<Class> printedWarnings = new HashSet<Class>();

    public static void versionMismatch(Class type)
    {
        if(!printedWarnings.contains(type)) {
            ModLoader.getLogger().log(Level.WARNING, "The Railcraft API ({0}) in one of the mods you are using needs updating, expect odd behaivor.", type.getSimpleName());
            printedWarnings.add(type);
        }
    }
}
