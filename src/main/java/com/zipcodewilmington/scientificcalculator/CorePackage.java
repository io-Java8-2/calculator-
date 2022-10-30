package com.zipcodewilmington.scientificcalculator;

public class CorePackage {
    public static double addition(double x, double y){
        return x + y;
    }

    public static double subtraction(double x, double y){return x = x - y;}

    public static double multiplication(double x, double y){return x = x * y;}

    public static double division(double x, double y){return x = x / y;}
    public static double sqrt(double x){ return x =  Math.sqrt(x);}

    public static double sq(double x){return x =  x * x;}

    public static double raisePower(double x, double y){return x =  Math.pow(x, y);}

    public static double inverse(double x){return x = 1/x;}

    public static double invertSign(double x){return x = x * -1;}
}