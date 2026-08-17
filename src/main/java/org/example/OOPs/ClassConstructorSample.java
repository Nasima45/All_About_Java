package org.example.OOPs;

public class ClassConstructorSample {
    public int id ;
    public int age;
    public String name;

    //parameterized constructor
    public ClassConstructorSample(int id,int age,String name){
        System.out.println("calling student");
        this.id=id;
        this.age=age;
        this.name=name;
    }

    //copy constructor
    public ClassConstructorSample(ClassConstructorSample student){
        this.id=student.id;
        this.age=student.age;
        this.name=student.name;
    }
    public void sleeping(){
        System.out.println(name + " sleeping to much");
    }
}
