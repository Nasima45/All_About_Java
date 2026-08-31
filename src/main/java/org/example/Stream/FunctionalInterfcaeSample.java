package org.example.Stream;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

@FunctionalInterface
interface Greeting{
    void hello(String name);
    default void greet(){
        System.out.println("Have a nice day!");
    }
}
interface Calculator {
    int calculate(int a,int b);
}
public class FunctionalInterfcaeSample {
    public static void main(String[] args) {
        Calculator addition = (a, b) -> a + b;
        Calculator subtraction = (a, b) -> a - b;
        Calculator multiplication = (a, b) -> a * b;
        Calculator division = (a, b) -> a / b;

        System.out.println(addition.calculate(10, 5));
        System.out.println(subtraction.calculate(10, 5));
        System.out.println(multiplication.calculate(10, 5));
        System.out.println(division.calculate(10, 5));
        Greeting g = (name)-> System.out.println("hi dear"+name);
        g.greet();
        g.hello("kuhu");


        //it return resonse in bollean
        Predicate<Integer> p = number -> number>10;
        System.out.println(p.test(70));
        System.out.println(p.test(8));

        //it take some something and returns something
        Function<Integer,Integer> supply = number ->number*number;
        System.out.println(supply.apply(8));

        //it takes something but does not return anything
        Consumer<String> c= (name)-> System.out.println("hi "+ name);
        c.accept("nasima");

        //does not take anything but return something
        Supplier<String> s= ()->"hello sweeatheart..";
        System.out.println(s.get());
    }
}
