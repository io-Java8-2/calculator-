package com.zipcodewilmington.scientificcalculator;

import java.text.DecimalFormat;

public class Custom{

    public static double getCircumference(double x){
        double result = 2 * Math.PI * x;
        double rounded = Math.round(result*1000000.0)/1000000.0;
        Console.println("For a circle with a radius of: " + x + "\nThe circumference equals: " + rounded);
        return rounded;
    }
    
    public static double importPi(){
        return Math.PI;
    }
    public static double randomNumber(double endRange){
        double effectiveEndRange = endRange + 1;
        double ranNum = Math.random() * effectiveEndRange;
        ranNum = Math.round(ranNum);
        return ranNum;

    }
}