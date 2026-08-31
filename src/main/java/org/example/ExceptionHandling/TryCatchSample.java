package org.example.ExceptionHandling;

public class TryCatchSample {
    public static void main(String[] args) {
        try{
            int a= 5;
            int b = 0;
            System.out.println(a/b);
            System.out.println("no  bye");
        }
//        catch(ArithmeticException e){
//            System.out.println("not allowed");
//        }

        //System.out.println("we are done here");
        finally{
            System.out.println("we will always be there");
        }
    }
}
