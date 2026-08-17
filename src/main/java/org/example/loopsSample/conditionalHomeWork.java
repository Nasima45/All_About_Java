package org.example.loopsSample;

import java.util.Scanner;

public class conditionalHomeWork {
    public static void main(String[] args) {
        char c='k';
        System.out.println(Character.toUpperCase(c));
averageOfMarkes();
    }
    public static void voteEligibility(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Sweetheart please enter you age: ");
        int age=sc.nextInt();
        if(age>18){
            System.out.println("yes you are eligible to vote");
        }
        else{
            System.out.println("sorry kiddo");
        }
    }
    public static void averageOfMarkes(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter math marks :");
        int math = sc.nextInt();
        System.out.println("enter bio marks :");
        int bio = sc.nextInt();
        System.out.println("enter phy marks :");
        int phy = sc.nextInt();
        System.out.println("enter chem marks :");
        int chem = sc.nextInt();
        System.out.println("enter ben marks :");
        int ben = sc.nextInt();
        int result=(math+bio+phy+chem+ben)/5;
        int sum=math+bio+phy+chem+ben;
        System.out.println(result);
        int min=Integer.MAX_VALUE;
        if(bio<min){
            min=bio;
        }
        if(phy<min){
            min=phy;
        }
        if(chem<min){
            min=chem;
        }
        if(ben<min){
            min=ben;
        }
        double avg=(sum-min)/4.0;
        System.out.println(avg);
    }
}
