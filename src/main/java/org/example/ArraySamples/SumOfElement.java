package org.example.ArraySamples;

public class SumOfElement {
    public static void main(String[] args) {
        int[] arr={9,2,1,3,4};
        int sum=0;
        for(int i=0;i<=arr.length-1;i++){
            sum=sum+arr[i];
        }
        int fact=1;
        for(int i=0;i<= arr.length-1;i++){
            fact=fact*arr[i];
        }
         int max=arr[0];
        for(int i=1;i<=arr.length-1;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
        System.out.println(sum);
        System.out.println(fact);
    }
}
