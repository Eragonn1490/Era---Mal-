package net.minecraft.src.railcraft.common.api;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import net.minecraft.src.ItemStack;

/**
 * This is a custom data structure designed specifically
 * for using ItemStacks as elements of a Set.
 *
 * The keys index on the itemID and damage of the ItemStacks,
 * ignoring any other differences (NBT Tags, stackSize, etc...).
 *
 * @author CovertJaguar <railcraft.wikispaces.com>
 */
public class ItemStackSet implements Set<ItemStack>
{

    private Set<Wrapper> set = new HashSet<Wrapper>();

    private static class Wrapper
    {

        private final ItemStack stack;

        public Wrapper(ItemStack stack)
        {
            this.stack = stack.copy();
        }

        @Override
        public boolean equals(Object obj)
        {
            if(obj == null) {
                return false;
            }
            if(getClass() != obj.getClass()) {
                return false;
            }
            final Wrapper other = (Wrapper)obj;
            if(stack.itemID != other.stack.itemID) {
                return false;
            }
            if(stack.getItemDamage() != other.stack.getItemDamage()) {
                return false;
            }
            return true;
        }

        @Override
        public int hashCode()
        {
            int hash = 5;
            hash = 23 * hash + stack.itemID;
            hash = 23 * hash + stack.getItemDamage();
            return hash;
        }

        public ItemStack getStack()
        {
            return stack.copy();
        }
    }

    private class IteratorWrapper implements Iterator<ItemStack>
    {

        private final Iterator<Wrapper> it;

        public IteratorWrapper(Iterator<Wrapper> it)
        {
            this.it = it;
        }

        @Override
        public boolean hasNext()
        {
            return it.hasNext();
        }

        @Override
        public ItemStack next()
        {
            Wrapper w = it.next();
            return w.getStack();
        }

        @Override
        public void remove()
        {
            it.remove();
        }
    }

    @Override
    public int size()
    {
        return set.size();
    }

    @Override
    public boolean isEmpty()
    {
        return set.isEmpty();
    }

    @Override
    public boolean contains(Object o)
    {
        if(o instanceof ItemStack) {
            return set.contains(new Wrapper((ItemStack)o));
        }
        return false;
    }

    @Override
    public Iterator<ItemStack> iterator()
    {
        return new IteratorWrapper(set.iterator());
    }

    @Override
    public Object[] toArray()
    {
        return toArray(new ItemStack[size()]);
    }

    @Override
    public <T> T[] toArray(T[] a)
    {
        try {
            if(a.length < size()) {
                a = Arrays.copyOf(a, size());
            }
            Object[] setArray = set.toArray();
            for(int i = 0; i < setArray.length; i++) {
                a[i] = (T)((Wrapper)setArray[i]).getStack();
            }
            return a;
        } catch (Exception e) {
            throw new ArrayStoreException();
        }
    }

    @Override
    public boolean add(ItemStack e)
    {
        return set.add(new Wrapper(e));
    }

    @Override
    public boolean remove(Object o)
    {
        if(o instanceof ItemStack) {
            return set.remove(new Wrapper((ItemStack)o));
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c)
    {
        return set.containsAll(getWrappedSet(c));
    }

    @Override
    public boolean addAll(Collection<? extends ItemStack> c)
    {
        return set.addAll(getWrappedSet(c));
    }

    @Override
    public boolean retainAll(Collection<?> c)
    {
        return set.retainAll(getWrappedSet(c));
    }

    @Override
    public boolean removeAll(Collection<?> c)
    {
        return set.removeAll(getWrappedSet(c));
    }

    private Set<Wrapper> getWrappedSet(Collection<?> c)
    {
        Set<Wrapper> newSet = new HashSet<Wrapper>();
        for(Object o : c) {
            if(o instanceof ItemStack) {
                newSet.add(new Wrapper((ItemStack)o));
            }
        }
        return newSet;
    }

    @Override
    public void clear()
    {
        set.clear();
    }
}
