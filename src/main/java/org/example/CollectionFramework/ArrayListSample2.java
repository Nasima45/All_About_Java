package org.example.CollectionFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayListSample2 {
    public static void main(String[] args) {
        ArrayList<Integer> coll=new ArrayList<>();
        coll.ensureCapacity(10);
        coll.add(90);
        coll.add(20);
        coll.add(30);
        coll.add(60);
        Collections.sort(coll);
        System.out.println("After Sorting :" +coll);
        System.out.println("is my list empty ?:" + coll.isEmpty());
        System.out.println("index of my value : " + coll.indexOf(20));
    }
}
