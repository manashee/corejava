package com.manashee.corejava.set.impl;

import com.manashee.corejava.set.Set;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ArraySetTest  {
    @Test
    public void arraySet() {
    }

    @Test
    public void add() {
        Set<Integer> set = new ArraySet<>();
        assert (!set.contains ( 2 ));
        set.add(1);
        assert (set.contains ( 1 ));
    }


    @Test
    public void size() {
        Set<String> set = new ArraySet<>();
        assert (0 == set.size());
        set.add("Ashok");
        assert (1 == set.size());
        set.add("Ashok");
        assert (1 == set.size());
        set.add("ashok");
        assert (2 == set.size());
        set.add("ashok");
        assert (2 == set.size());
        set.add(null);
        assert (3 == set.size());
        set.add(null);
        assert (3 == set.size());
    }


    @Test
    public void contains() {
        Set<Double> set = new ArraySet<>();
        assert (!set.contains ( 2.5 ));
        set.add(1.0);
        assert (set.contains ( 1.0 ));
        assert (!set.contains ( 2.5 ));
    }

    @Test
    public void isEmpty() {
        Set<Boolean> set = new ArraySet<>();
        assert (set.isEmpty());
        assert (0 == set.size());
        set.add(true);
        assert (1 == set.size());
        set.add(true);
        assert (1 == set.size());
        set.add(false);
        assert (2 == set.size());
        set.add(false);
        assert (2 == set.size());
        set.add(null);
        assert (3 == set.size());
        set.add(null);
        assert (3 == set.size());
    }

    @Test
    public void remove() {
        Set<Person> citizens = new ArraySet<>();
        citizens.remove(new Person(25,"ashok","ABCDEFGH123"));
        citizens.add(new Person(25,"ashok","ABCDEFGH123"));
        assert ( !citizens.isEmpty());
        citizens.remove(new Person(25,"ashok","ABCDEFGH123"));
        assert ( citizens.isEmpty());
    }

    @Test
    public void addAll() {
        List<Integer> list = new ArrayList<>();
        for ( int i =0;i<10;i++)
            list.add(i);

        Set<Integer> set = new ArraySet<>();
        set.addAll(list);

        assert (10 == set.size());
        assert (!set.isEmpty());
        assert (set.contains(9));
    }

    class Person {
        int age;
        String name;
        String aadhaar;

        Person(int age, String name, String aadhaar) {
            this.age = age;
            this.name = name;
            this.aadhaar = aadhaar;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Person)) return false;

            Person person = (Person) o;

            return aadhaar.equals(person.aadhaar);
        }

        @Override
        public int hashCode() {
            return aadhaar.hashCode();
        }
    }
}
