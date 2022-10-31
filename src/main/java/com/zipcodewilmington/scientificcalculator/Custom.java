package com.zipcodewilmington.scientificcalculator;

public class Custom {
    public static double importPi(){
        return Math.PI;
    }
    public static double randomNumber(double endRange){
        double effectiveEndRange = endRange + 1;
        double ranNum = Math.random() * effectiveEndRange;
        return ranNum;
    }
}