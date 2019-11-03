package com.manashee.corejava.set;

import java.util.Collection;

public interface Set<E> {

    boolean add ( E e);
    // more type safe than contains ( Object o ) in Collection
    boolean contains(E e);
    void remove (E e);
    void addAll (Collection<E> c);
//    boolean containsAll(Collection<E> t);
//    void removeAll (Collection<E> c);
//    void clear();
//    void retainAll (Collection<E> c);
    int size();
    boolean isEmpty();
//    Iterator iterator();
//    E [] toArray();
}
