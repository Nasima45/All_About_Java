package org.example.ArraySamples;

import java.util.Scanner;

public class ArraySample {
    public static void main(String[] args) {

        int[] arr= {5,4,3,2};
        int i=0;
        while(arr.length>i){
            System.out.println(arr[i]);
            i++;
        }
        Scanner sc=new Scanner(System.in);
        int newArr[]=new int[5];
        for(int k=0;i<=newArr.length-1;k++){
            arr[k]=sc.nextInt();
        }
        for(int j:newArr){
            System.out.println(j);
        }
    }
}
