package com.github.iweinzierl.android.utils.collection;

import java.util.ArrayList;
import java.util.Collection;

public class NoDuplicatesList<E> extends ArrayList<E> {

    @Override
    public boolean add(final E e) {
        return !contains(e) && super.add(e);
    }

    @Override
    public void add(final int index, final E e) {
        if (!contains(e)) {
            super.add(index, e);
        }
    }

    @Override
    public boolean addAll(final Collection<? extends E> c) {
        boolean success = false;
        ensureCapacity(size() + c.size());
        for (E e : c) {
            if (add(e)) {
                success = true;
            }
        }

        return success;
    }

    @Override
    public boolean addAll(final int index, final Collection<? extends E> c) {
        throw new UnsupportedOperationException("addAll currently not implemented");
    }
}
