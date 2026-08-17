package org.example.OOPs.Transport;

public class Vehicle {
    public String name;
    public String model;
    public int noOfTyres;
    public Vehicle(){

    }
    public Vehicle(String name, String model,int noOfTyres){
        this.name=name;
        this.model= model;
        this.noOfTyres = noOfTyres;
    }
    public void startEngine(){
        System.out.println("starting engine"+name + model);
    }

    public void stopEngine(){
        System.out.println("stoping engine" +name + model);
    }
}

