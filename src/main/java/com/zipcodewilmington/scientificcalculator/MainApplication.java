package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {

    public static void main(String[] args) {
        double displayNumber = 0;
        boolean endCalc = true;
        String userChoice = "";
        String funcChoice = "";
        double userInput = 0;

        Console.println("Welcome to my calculator!");
        /*
        String s = Console.getStringInput("Enter a string");
        Integer i = Console.getIntegerInput("Enter an integer");
        Double d = Console.getDoubleInput("Enter a double.");

        Console.println("The user input %s as a string", s);
        Console.println("The user input %s as an integer", i);
        Console.println("The user input %s as a d", d);
        */
        while (endCalc){
            Console.println("Current number: " + displayNumber);
            Console.println("What operation should be done with the number?");
            funcChoice = Console.getStringInput(userChoice);
            funcChoice = funcChoice.toLowerCase();
            if(funcChoice.equals("addition")){
                userInput = Console.getDoubleInput("Please enter a number to add to " + displayNumber);
                displayNumber = addition(displayNumber, userInput);

            }
            else if(funcChoice.equals("subtraction")){

            }
            else if(funcChoice.equals("multiplication")){

            }
            else if(funcChoice.equals("division")){

            }
            else if(funcChoice.equals("square")){

            }
            else if(funcChoice.equals("square root")){

            }
            else if(funcChoice.equals("exit")){
                endCalc = false;
            }
            else{
                Console.println("Please enter a valid function");
            }


        }

    }

    public static double addition(double x, double y){
        return x + y;
    }

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

    public static int switchUnitsMode(){
        return 0;
    }

}
