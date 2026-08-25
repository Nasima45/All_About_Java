package org.example.CollectionFramework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetSample {
    public static void main(String[] args) {
        //set is unordered , and stores unique values
        Set<Integer> set = new HashSet<>();
        Set<Integer> set1 = new HashSet<>();
        set.add(3);
        set.add(4);
        set1.add(3);
        set1.add(4);
        set1.add(5);
        set1.add(6);
        System.out.println("my set:" + set);
        set.retainAll(set1);
        System.out.println("only print which are present in both sets:" + set);
        System.out.println(set.containsAll(set1));

//it maintains order
        Set<Integer> set3 = new LinkedHashSet<>();
        set3.add(3);
        set3.add(4);
        System.out.println(set3);
        //its does the sorting also
        Set<Integer> set4 = new TreeSet<>();
        set4.add(3);
        set4.add(4);
        set4.add(2);
        System.out.println(set4);
        Set<Student> student = new HashSet<>();
        Student s1 = new Student(1,"kuhu");
        Student s2 = new Student(1,"kuhu");
        student.add(s1);
        student.add(s2);
        System.out.println(student);

    }

}
