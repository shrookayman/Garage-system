package com.company;

public class DisplayFees extends Display{

   CalculateFees calculateFees = new CalculateFees();
   public void display(){

       System.out.println("your fees is "+ calculateFees.calculate());
   }
}
