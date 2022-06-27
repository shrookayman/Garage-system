package com.company;

public class CalculateFees extends Calculate {
    CalculateDuration duration= new CalculateDuration();
    public double calculate(){
        double fees= 5*duration.calculate();
        return fees;
    }
}
