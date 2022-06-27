package com.company;

import com.sun.tools.javac.Main;

import java.util.Scanner;

public class Vehicle {
     static Scanner in=new Scanner(System.in);
   // Main main = new Main();
    public static String modelName ;
    public static int uniqueIdentificationNumber;
    public static int ModelYear;
    public static int vehicleWidth;
    public static int vehicleDepth;
    Vehicle(){}
    Vehicle(String mName, int id, int d, int w, int yModel){
        modelName=mName;
        uniqueIdentificationNumber=id;
        vehicleDepth=d;
        vehicleWidth=w;
        ModelYear=yModel;
    }
    public static void  getVehicleInfo() {
        System.out.println("-----Vehicle's info------");
        System.out.println("enter your vehicle's model name: ");
        modelName = in.next();
        System.out.println("enter your id: ");
        uniqueIdentificationNumber = in.nextInt();
        System.out.println("enter your vehicle's model year: ");
        ModelYear = in.nextInt();
        System.out.println("enter your vehicle's depth: ");
        vehicleDepth = in.nextInt();
        System.out.println("enter your vehicle's width: ");
        vehicleWidth = in.nextInt();
    }

}
