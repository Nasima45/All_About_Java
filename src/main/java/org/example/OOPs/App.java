package org.example.OOPs;

public class App {
    public static void main(String[] args) {
        ClassConstructorSample A = new ClassConstructorSample(1,15,"kuhu");
        //uses of copy constructor
        ClassConstructorSample B = new ClassConstructorSample(A);
        B.sleeping();
        A.sleeping();
        EncapsulationSample e=new EncapsulationSample(2,24,"nasu");
        e.bunking();
        e.setAge(2);
        System.out.println(e.getAge());
    }
}
