package org.example.CollectionFramework;

import java.util.*;
class Sorting implements Comparator<Integer>{
    public int compare(Integer o1,Integer o2){
        return o1.compareTo(o2);
    }
}
public class ComparableInterfaceUsages {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(16,"kuhu"));
        list.add(new Student(12,"kuhu"));
        list.add(new Student(18,"kuhu"));
        list.add(new Student(18,"abc"));
        Collections.sort(list);
        //comparable usages
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.id -o2.id;
            }
        });
        ////comparable usages present in different class
        Collections.sort(list,new ComparatorSample());
        System.out.println(list);
        Integer arr[]={8,7,9,6,5};
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length;j++){
                if(arr[i]>arr[j]){

                }
            }
        }
        Arrays.sort(arr,new Sorting());
        for(int i: arr){
            System.out.print(i);
        }
    }
}
