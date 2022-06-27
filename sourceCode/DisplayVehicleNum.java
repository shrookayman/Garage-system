package com.company;

public class DisplayVehicleNum extends Display{
    Slots slots=new Slots();
    public void display(){
        System.out.println("Number of vehicles: "+slots.numOfVehicle);
    }
}
