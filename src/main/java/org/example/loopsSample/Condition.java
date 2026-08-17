package org.example.loopsSample;

public class Condition {
    public static void main(String[] args) {
        genderCheck();
        int age=12;
        //ternary operator
        String result=age>=12?"yes":"no";
        System.out.println(result+"kido");

        if(age>67){
            System.out.println("not eligible");
        }
        else if(age>55){
            System.out.println("eli");
        }
        else{
            System.out.println("default");
        }
    }
    public static void genderCheck(){
        int age =34;
        String gender="female";
        if(gender.equalsIgnoreCase("female")){
            if(age>30){
                System.out.println("hi");
            }
            else{
                System.out.println("bye");
            }
        }
        else{
            System.out.println("not");
        }
    }
}
