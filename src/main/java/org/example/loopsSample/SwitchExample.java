package org.example.loopsSample;

import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {
        //calculator();
        admission();
        String day="sun";
        int result=switch(day){
            case "mon","fri"->8;
            case "tues"->2;
            default->throw new IllegalArgumentException("invalid day : "+ day);
        };
        System.out.println(result);

    }
    public static void calculator(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your operator please: ");
        char operator = sc.next().charAt(0);
        int a=3,b=4;
        int result=switch(operator){
            case '*'->a*b;
            case '+'->a+b;
            case '-'->a-b;
            case '/'->a/b;
            default -> throw new IllegalArgumentException("invalid op: "+ operator);
        };
        System.out.println(result);
    }
    public static void admission(){
        int age=13;
        String result=switch(age){
            case 12->"two";
            case 13->"three";
            default ->"not eligible";
        };
        System.out.println(result);
    }
}
