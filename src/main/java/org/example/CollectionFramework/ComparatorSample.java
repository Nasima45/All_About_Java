package org.example.CollectionFramework;

import java.util.Comparator;

public class ComparatorSample implements Comparator<Student> {
    public static void main(String[] args) {

    }

    @Override
    public int compare(Student o1, Student o2) {
        return o1.name.compareTo(o2.name);
    }
}
