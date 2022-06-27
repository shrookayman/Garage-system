package com.company;

public class BestFit extends ParkIn {

    public Vehicle vehicle=new Vehicle();
    ParkinTime parkinTime = new ParkinTime();
    public Slots slots=new Slots();


    public void arrive(){
        boolean choose=true;
        for (int i=0;i< slots.numOfSlots;i++) {
            if (vehicle.vehicleDepth == slots.arrSlotDepth[i] &&
                    vehicle.vehicleWidth == slots.arrSlotsWidth[i] && slots.statusArr[i] == 0) {
                slots.numOfVehicle++;
                slots.numOfAvailableSlots--;
                parkinTime.time();
                slots.statusArr[i] = 1;
                slots.vehicleID[i]= vehicle.uniqueIdentificationNumber;

                int index=i+1;
                System.out.println(vehicle.uniqueIdentificationNumber + " is now in slot number " + index);
                choose=false;
                break;
            }
        }
        if(choose) {
            for (int i = 0; i < slots.numOfSlots; i++) {

                int minWidth = 10000, minDepth = 10000;
                int index = 0;
                boolean flag = true;
                for (int j = 0; j < slots.numOfSlots; j++) {
                    if (minDepth > slots.arrSlotDepth[j])
                    {
                        if (minWidth > slots.arrSlotsWidth[j]) {
                            if (slots.statusArr[j] != 1 && vehicle.vehicleDepth <= slots.arrSlotDepth[j]) {
                                if (vehicle.vehicleWidth <= slots.arrSlotsWidth[j] ) {


                                    minDepth = slots.arrSlotDepth[j];
                                    minWidth = slots.arrSlotsWidth[j];
                                    index = j;
                                    flag = false;
                                }

                            }
                        }
                    }
                }
                if (!flag) {
                    slots.statusArr[index] = 1;
                    slots.vehicleID[index]= vehicle.uniqueIdentificationNumber;
                    slots.numOfVehicle++;
                    slots.numOfAvailableSlots--;
                    parkinTime.time();
                    int cnt=index+1;
                    System.out.println(vehicle.uniqueIdentificationNumber + " is now in slot number " + cnt);
                    break;
                }
                else  {
                    System.out.println("no available places");
                    break;
                }
            }
        }
    }
}
