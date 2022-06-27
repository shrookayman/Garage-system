package com.company;

public class CalculateDuration extends Calculate{
    ParkOut parkOut = new ParkOut();

    public double calculate(){

       double duration=  LeavingGarage.leavingTime - Slots.vehicleTime[LeavingGarage.index] ;
       duration/=2.77778e-7;
       return duration;
   }

}
