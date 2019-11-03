package com.manashee.corejava.set.impl;

import com.manashee.corejava.set.Set;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArraySet<T> implements Set<T> {

    private List<T> array = new ArrayList<>();

    public static <T> Set<T> arraySet () {
        return new ArraySet<>();
    }

    @Override
    public boolean add(T t) {
        if (!array.contains(t)) {
            array.add(t);
            return true;
        } else
            return false;
    }

    @Override
    public boolean contains(T t) {
        return array.contains(t);
    }

    @Override
    public void remove(T t) {
//        if ( array.contains(t))
            array.remove(t);
    }

    @Override
    public void addAll(Collection<T> c) {
        c.forEach( this::add );
    }

    @Override
    public int size() {
        return array.size();
    }

    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }
}
