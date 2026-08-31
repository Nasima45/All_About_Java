package org.example.ExceptionHandling;

public class ThrowSample {
    public static void main(String[] args) {
        checkAvailability(-9);
    }
    private static void checkAvailability(int age){
        if(age<0){
            throw new IllegalArgumentException("Age can not be negetive");
        }
        if(age>18){
            System.out.println("eligible");
        }
    }
}
