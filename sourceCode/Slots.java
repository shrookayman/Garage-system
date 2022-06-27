package com.company;
import java.util.Scanner;
import com.company.Slots;

public class Slots {
    static Scanner in=new Scanner(System.in);
    public static int  numOfVehicle=0;
    public static int numOfSlots;
    public static int numOfAvailableSlots;
    static int []  arrSlotDepth=new int[numOfSlots];
    static int []  arrSlotsWidth=new int[numOfSlots];
    static int[] statusArr=new int[numOfSlots];
    static int[] vehicleID=new int[numOfSlots];
    static double[] vehicleTime=new double[numOfSlots];


    Slots(){
    }

    public Slots(int nSlots, int[] arrw, int[] arrd, int [] aStat, int nas) {
        numOfSlots = nSlots;
        numOfAvailableSlots=nSlots;
        arrSlotDepth=new int[numOfSlots];
        arrSlotsWidth=new int[numOfSlots];
        statusArr=new int[numOfSlots];
        for (int i = 0; i<numOfSlots; i++) {
            arrSlotDepth[i]=arrd[i];
            arrSlotsWidth[i]=arrw[i];
            statusArr[i]=aStat[i];

        }
    }

    public static void  getSlotsInfo() {
        System.out.println("------garage owner----- ");
        System.out.print("Enter number of slots in the garage: ");
        numOfSlots= in.nextInt();
        numOfAvailableSlots=numOfSlots;
        arrSlotDepth=new int[numOfSlots];
        arrSlotsWidth=new int[numOfSlots];
        statusArr=new int[numOfSlots];
        vehicleID=new int[numOfSlots];
        vehicleTime=new double[numOfSlots];
        System.out.println("Enter Depth and width: ");
        for (int i = 0; i<numOfSlots; i++) {
            int w = in.nextInt();
            arrSlotDepth[i] = w;   // input each slot depth
            int d = in.nextInt();
            arrSlotsWidth[i] = d;  // input each slot width
        }


    }


}
