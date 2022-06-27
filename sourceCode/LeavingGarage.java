package com.company;

import java.util.Scanner;

public class LeavingGarage extends ParkOut{
    Vehicle vehicle = new Vehicle();
    ParkOut parkOut = new ParkOut();
    Slots slots = new Slots();
    Scanner in =new Scanner(System.in);
    public static double leavingTime;
    public static int index;
    public void parkOutInfo(){
        System.out.println("Enter your vehicle ID: ");
        vehicle.uniqueIdentificationNumber = in.nextInt();
       leavingTime= parkOut.time();

        for(int i=0;i<slots.numOfVehicle;i++){
            if(vehicle.uniqueIdentificationNumber==slots.vehicleID[i]){
                 slots.vehicleTime[i]=0;
                 slots.vehicleID[i]=0;
                 slots.statusArr[i]=0;
                 slots.numOfAvailableSlots++;
                 slots.numOfVehicle--;
                 index=i;
                 break;
            }
        }

    }

}



