package org.example.CollectionFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class ArrayListSample {
    public static void main(String[] args) {
        //Collection ->interface
        //List ->interface
        //ArrayList-> concrete class
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        Collection<Integer> coll=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list2.add(50);
        list2.add(60);
        list2.add(70);
        System.out.println(list);
        System.out.println("Element present in index: " + list.get(2));
        list.set(0,100);
        System.out.println("Element after updated index value : " + list);
        list.remove(2);
        System.out.println("After removing the index: "+ list);
        System.out.println("Size of my list : " + list.size());
        list.addAll(list2);
        System.out.println("After adding of list2 in list :" + list);
        list.removeAll(list2);
        System.out.println("After removing of list2 in list :" + list);
        //list.clear();
        System.out.println(list);
        System.out.println("Size of my list : " + list.size());


        Iterator<Integer> iterator= list.iterator();
        while(iterator.hasNext()){
            int elem = iterator.next();
            System.out.println("Element: "+ elem);
        }
        List<Integer> list3 = new ArrayList<>();
        list3.addAll(list2);
        System.out.println("After converting list to array:");
        Object[] arr= list3.toArray();

        for(Object elem:arr){
            System.out.println(elem);
        }
        System.out.println("Is this value is present or not :" +list.contains(20));
    }
}
