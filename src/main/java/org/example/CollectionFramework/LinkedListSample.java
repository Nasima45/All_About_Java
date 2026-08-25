package org.example.CollectionFramework;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedListSample {
    public static void main(String[] args) {
        LinkedList<Integer> coll=new LinkedList<>();
        coll.add(90);
        coll.add(20);
        coll.add(30);
        coll.add(60);
        coll.add(60);
        System.out.println(coll);
        Collections.sort(coll);
        System.out.println("After Sorting :" +coll);
        System.out.println("is my list empty ?:" + coll.isEmpty());
        System.out.println("index of my value : " + coll.indexOf(20));
        System.out.println(coll.lastIndexOf(60));
        coll.addFirst(40);
        coll.addLast(100);
        System.out.println(coll);
        System.out.println("first elem : "+ coll.peek());
        //it remove the first element but it shows the value
        System.out.println("first elem and remove that :"+ coll.poll());
        System.out.println(coll);
    }

}
