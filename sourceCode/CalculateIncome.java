package com.company;

public class CalculateIncome extends Calculate {

    CalculateFees calculateFees=new CalculateFees();
    public double sum=0;
    public double calculate(){
        sum+=calculateFees.calculate();
        return sum;
    }
}
