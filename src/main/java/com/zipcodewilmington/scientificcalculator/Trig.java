package com.zipcodewilmington.scientificcalculator;
import java.text.DecimalFormat;

public class Trig {

    public static double getRadSine(double x){
        double result = Math.sin(x);
        double rounded = Math.round(result*1000000.0)/1000000.0;
        Console.println("The sine of " + x + " in radians is " + rounded);
        return rounded;
    }

    public static double getRadArcSine(double x){
        double result = Math.asin(x);
        double rounded = Math.round(result*1000000.0)/1000000.0;
        Console.println("The arc sine of " + x + " in radians is " + rounded);
        return rounded;
    }

    public static double getRadCosine(double x){
        double result = Math.cos(x);
        double rounded = Math.round(result*1000000.0)/1000000.0;
        Console.println("The cosine of " + x + " in radians is " + rounded);
        return rounded;
    }

    public static double getRadArcCosine(double x){
        double result = Math.acos(x);
        double rounded = Math.round(result*1000000.0)/1000000.0;
        Console.println("The arc cosine of " + x + " in radians is " + rounded);
        return rounded;
    }

    public static double getRadTangent(double x){
        double result = Math.tan(x);
        double rounded = Math.round(result*1000000.0)/1000000.0;
        Console.println("The tangent of " + x + " in radians is " + rounded);
        return rounded;
    }

    public static double getRadArcTangent(double x){
        double result = Math.atan(x);
        double rounded = Math.round(result*1000000.0)/1000000.0;
        Console.println("The inverse tangent of " + x + " in radians is " + rounded);
        return rounded;
    }

    public static double getLog(double x){
        double result = Math.log10(x);
        double rounded = Math.round(result*1000000.0)/1000000.0;
        Console.println("The logarithm of " + x + " is " + rounded);
        return rounded;
    }

    public static double getNatLog(double x){
        double result = Math.log(x);
        double rounded = Math.round(result*1000000.0)/1000000.0;
        Console.println("The logarithm of " + x + " is " + rounded);
        return rounded;
    }

    public static double getInvLog(double x){
        double result = Math.pow(10,x);
        DecimalFormat numFormat = new DecimalFormat("0.######E0");
        Console.println("The inverse logarithm of " + x + " is " + numFormat.format(result));
        return result;
    }

    public static double getInvNatLog(double x){
        double result = Math.exp(x);
        DecimalFormat numFormat = new DecimalFormat("0.######E0");
        Console.println("The inverse natural logarithm of " + x + " is " + numFormat.format(result));
        return result;
    }


    public static double getFactorial(double x){
        double factorial = x;

        if (x == 0){
            return 1;
        }
        double i = 2;
        while(i < x){
            factorial *= i;
            i++;
        }
        Console.println("The factorial of " + x + " is " + factorial);
        return factorial;
    }

}