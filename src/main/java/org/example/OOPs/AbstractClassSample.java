package org.example.OOPs;
abstract class Bird{
    abstract void eat();
    abstract void fly();
}
class Sparrow extends Bird{
    void eat(){
        System.out.println("Sparrow : i can eat");
    }
    void fly(){
        System.out.println("Sparrow : i can fly");
    }
}
class Crow extends Bird{
    void eat(){
        System.out.println("Crow : i can eat");
    }
    void fly(){
        System.out.println("Crow : i can fly");
    }
}
public class AbstractClassSample {
    public static void main(String[] args) {
        Bird s= new Sparrow();
        doStuff(s);
        doStuff(new Crow());
    }
    public static void doStuff(Bird b){
        b.eat();
        b.fly();
    }
}
