package com.company;

public class DisplaySlots extends Display {
    public Slots slots=new Slots();

    DisplaySlots(){}
    DisplaySlots(Slots obj){
        slots = obj;
    }
    public void display(){
        System.out.println("number of available slots "+ slots.numOfAvailableSlots);
          for(int i=0;i<slots.numOfSlots;i++) {
            if (slots.statusArr[i] == 0) {
                System.out.println("slot number " + (i + 1) + " Dimensions: " + slots.arrSlotDepth[i] + " " + slots.arrSlotsWidth[i]);
            }
          }
    }
}
