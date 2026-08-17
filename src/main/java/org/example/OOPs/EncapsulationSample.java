package org.example.OOPs;

public class EncapsulationSample {
    private int id ;
    private int age;
    private String name;
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public void setAge(int a){
        if(a<100){
         this.age=a;}
        return;
    }
    public EncapsulationSample(int id,int age,String name){
        System.out.println("calling student");
        this.id=id;
        this.age=age;
        this.name=name;
    }
    public void bunking(){
        System.out.println(name + " bunking to much");
    }
}
