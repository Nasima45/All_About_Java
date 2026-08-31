package org.example.ExceptionHandling;

public class NestedTrySample {
    public static void main(String[] args) {
        //innerCatchHandleException();
        outerCatchHandleException();

    }

    private static void innerCatchHandleException() {
        try{
            System.out.println("outer try starts: ");
            try{
                System.out.println("inner try starts:");
                System.out.println(5/0);
                System.out.println("inner try ends");
            }
            catch(ArithmeticException e){
                System.out.println("not divisable:inner");
            }
        }
        catch(ArithmeticException e){
            System.out.println("not divisable:outer");
        }
    }
    private static void outerCatchHandleException() {
        try{
            System.out.println("outer try starts: ");
            try{
                System.out.println("inner try starts:");
                System.out.println(5/0);
                System.out.println("inner try ends");
            }
            catch(NullPointerException e){
                System.out.println("Handling null issues");
            }
        }
        catch(ArithmeticException e){
            System.out.println("not divisable:outer");
        }
    }
}
