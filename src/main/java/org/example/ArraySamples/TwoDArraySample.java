package org.example.ArraySamples;

import java.util.Scanner;

public class TwoDArraySample {
    public static void main(String[] args) {
        int arr[][]={{2,1},{21,3}};
        findMax(arr);
//        sameColumnNum(arr);
//        summation(arr) ;
//        //differentColumnNum(arr);
//        int brr[][]=new int[2][2];
//        Scanner sc =new Scanner(System.in);
//        //takeInputFromUser(brr, sc);
//        //printUser(brr);
    }

    private static void takeInputFromUser(int[][] brr, Scanner sc) {
        for(int row = 0; row<= brr.length-1; row++){
            int columnIndex= brr[row].length;
            for(int column =0;column<columnIndex;column++){
                System.out.println("provide value for row: "+ row+"and column : "+ column);
                brr[row][column]= sc.nextInt();
            }
        }
    }
    public static void printUser(int brr[][]){
        for(int row=0;row<= brr.length-1;row++){
            for (int column=0;column<=brr[row].length-1;column++){
                System.out.print(brr[row][column]+" ");
            }
            System.out.println();
        }

    }

    private static void sameColumnNum(int[][] arr) {
        int rowLength= arr.length;
        int columnLength= arr[0].length;
        int sum=0;
        for(int rowIndex=0;rowIndex<=rowLength-1;rowIndex++){
            for(int columnIndex=0;columnIndex<=columnLength-1;columnIndex++){
                System.out.print(arr[rowIndex][columnIndex]+" ");
            }
            System.out.println();
        }
        System.out.println(sum);
    }
    private static void summation(int[][] arr) {
        int rowLength= arr.length;
        int columnLength= arr[0].length;
        int sum=0;
        for(int rowIndex=0;rowIndex<=rowLength-1;rowIndex++){
            for(int columnIndex=0;columnIndex<=columnLength-1;columnIndex++){
                int value=arr[rowIndex][columnIndex];
                sum=sum+value;
            }

        }
        System.out.println(sum);
    }

    public static void differentColumnNum(int arr[][]){
        int rowLength=arr.length;
        for(int rowIndex = 0;rowIndex<=rowLength-1;rowIndex++){
            int columnLength=arr[rowIndex].length;
            for(int columnIndex=0;columnIndex<=columnLength-1;columnIndex++){
                System.out.print(arr[rowIndex][columnIndex] +" ");
            }
            System.out.println();
        }
    }
    private static void findMax(int[][] arr) {
        int rowLength= arr.length;
        int columnLength= arr[0].length;
        int max=arr[0][0];
        System.out.println(max);
        for(int rowIndex=0;rowIndex<=rowLength-1;rowIndex++){
            for(int columnIndex=0;columnIndex<=columnLength-1;columnIndex++){
                if(arr[rowIndex][columnIndex]>max){
                    max=arr[rowIndex][columnIndex];
                }
            }
        }
        System.out.println(max);
    }
}
