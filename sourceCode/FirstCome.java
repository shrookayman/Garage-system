package com.company;

public class FirstCome extends ParkIn {
    public Vehicle vehicle=new Vehicle();
    public Slots slots=new Slots();
    ParkinTime parkinTime = new ParkinTime();
    FirstCome(){}
   // Vehicle vehicle1 =new Vehicle(Vehicle.modelName, Vehicle.uniqueIdentificationNumber, Vehicle.vehicleDepth, Vehicle.vehicleWidth, Vehicle.ModelYear) ;
  //   Slots slots1 = new Slots(Slots.numOfSlots, Slots.arrSlotsWidth,Slots.arrSlotDepth, Slots.statusArr, slots.numOfAvailableSlots);
    public void arrive(){
        boolean flag=true;
        for (int j=0;j<slots.numOfSlots;j++)
        {


            if (vehicle.vehicleWidth <= slots.arrSlotsWidth[j] && vehicle.vehicleDepth <= slots.arrSlotDepth[j] &&slots.statusArr[j]!=1 ) {

                slots.numOfVehicle++;
                slots.numOfAvailableSlots--;
                slots.vehicleTime[j] = parkinTime.time();
                slots.statusArr[j]=1;
                slots.vehicleID[j]= vehicle.uniqueIdentificationNumber;
                int index=j+1;
                System.out.println(vehicle.uniqueIdentificationNumber +" is now in slot number "+ index);
                flag= false;
                break;
            }

        }
          if(flag){
            System.out.println("no available places");

        }
    }

}
