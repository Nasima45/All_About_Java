package org.example.OOPs.Transport;

public class Car extends Vehicle {
    public int noOfDoor;
    public String transmissionType;

    Car(String name, String model, int noOfTyres, int noOfDoor, String transmissionType) {
        //initializing parameter from parent class
        //need to initilize first later child parameter
        super(name, model, noOfTyres);
        this.noOfDoor = noOfDoor;
        this.transmissionType = transmissionType;
    }
    public void startAc(){
        System.out.println("Ac started of "+ name);
    }
    public void stopAc(){
        System.out.println("Ac is stopped now "+ name);
    }
}
