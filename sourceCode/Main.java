package com.company;
import java.util.Scanner;
import java.lang.String;

public class Main {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        Slots slots=new Slots();
        BestFit bestFit = new BestFit();
        FirstCome firstCome = new FirstCome();
        Vehicle vehicle = new Vehicle();
        ParkOut parkOut= new ParkOut();
        CalculateDuration duration = new CalculateDuration();
        CalculateFees calculateFees =new CalculateFees();
        CalculateIncome calculateIncome = new CalculateIncome();
        DisplayFees displayFees = new DisplayFees();
        DisplayIncome displayIncome = new DisplayIncome();
        DisplaySlots displaySlots = new DisplaySlots();
        LeavingGarage leavingGarage = new LeavingGarage();
        DisplayVehicleNum displayVehicleNum=new DisplayVehicleNum();
        slots.getSlotsInfo();
        int configuration;

        System.out.println("choose one configurations:");
        System.out.println(" 1) first come 2) best fit ");
        configuration = in.nextInt();
        int choice=0;

        while(true) {
            System.out.println("----menu-----");
            System.out.println("1-Park in ");
            System.out.println("2-Park out");
            System.out.println("3-Available slots ");
            System.out.println("4-Total income ");
            System.out.println("5-Number of available vehicles");
            System.out.println("6-Exit ");
            System.out.print("Enter your choice: ");
            choice = in.nextInt();
            if (choice == 1) {
                vehicle.getVehicleInfo();
                if (configuration == 1) {
                    firstCome.arrive();

                }
                else {
                    bestFit.arrive();
                }
            }
            else if (choice == 2) {
                leavingGarage.parkOutInfo();
                calculateFees.calculate();
                displayFees.display();
            }
            else if (choice == 3) {
                displaySlots.display();
            }
            else if (choice == 4) {
                calculateIncome.calculate();
                displayIncome.display();
            }
            else if (choice == 5) {
                displayVehicleNum.display();
            }
            else if(choice==6){
                return ;
            }
        }

    }
}