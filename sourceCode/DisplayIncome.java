package com.company;

public class DisplayIncome extends Display {
    CalculateIncome calculateIncome= new CalculateIncome();
    public void display(){
        System.out.println("total income is "+ calculateIncome.calculate());
    }
}