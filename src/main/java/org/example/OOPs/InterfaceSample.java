package org.example.OOPs;

import java.util.List;

interface Animal{
    void eat();
    void makeSound();
    default void sleep(){
        System.out.println("everone loves to sleep");
    }
}
class Cow implements Animal{
    public void eat(){
        System.out.println("Cow: i can eat");
    }
    public void makeSound(){
        System.out.println("Cow: i can make sound");
    }
}
class Tiger implements Animal{
    public void eat(){
        System.out.println("Tiger: i can eat");
    }
    public void makeSound(){
        System.out.println("Tiger: i can make sound");
    }
}
public class InterfaceSample {
    public static void main(String[] args) {
        doStuff(new Tiger());
        doStuff(new Cow());
    }
    public static void doStuff(Animal a){
        a.eat();
        a.makeSound();
        a.sleep();
    }
}
