package com.zipcodewilmington.scientificcalculator;

public class Trig {
    public static double getDegSine(double displayNumber){
        double result = Math.sin(displayNumber);
        Console.println("The sine of " + displayNumber + " in degrees is " + result);
        return result;
    }

    public static double getDegSineInv(double displayNumber){
        double result = Math.asin(displayNumber);
        Console.println("The inverse sine of " + displayNumber + " in degrees is " + result);
        return result;
    }

    public static double getDegCosine(double displayNumber){
        double result = Math.cos(displayNumber);
        Console.println("The cosine of " + displayNumber + " in degrees is " + result);
        return result;
    }

    public static double getDegCosineInv(double displayNumber){
        double result = Math.acos(displayNumber);
        Console.println("The inverse cosine of " + displayNumber + " in degrees is " + result);
        return result;
    }

    public static double getDegTangent(double displayNumber){
        double result = Math.tan(displayNumber);
        Console.println("The tangent of " + displayNumber + " in degrees is " + result);
        return result;
    }
}