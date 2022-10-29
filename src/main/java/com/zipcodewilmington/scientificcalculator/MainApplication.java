package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {

    public static void main(String[] args) {
        double displayNumber = 0;
        boolean endCalc = false;
        String userChoice = "";
        int switchChoice = 0;

        Console.println("Welcome to my calculator!");
        /*
        String s = Console.getStringInput("Enter a string");
        Integer i = Console.getIntegerInput("Enter an integer");
        Double d = Console.getDoubleInput("Enter a double.");

        Console.println("The user input %s as a string", s);
        Console.println("The user input %s as an integer", i);
        Console.println("The user input %s as a d", d);
        */
        while (!endCalc){
            Console.println("Current number: " + displayNumber);
            Console.println("What operation should be done with the number?");
            Console.getStringInput(userChoice);
            userChoice = userChoice.toLowerCase();
            if(userChoice.equals("addition")){

            }
            else if(userChoice.equals("subtraction")){

            }
            else if(userChoice.equals("multiplication")){

            }
            else if(userChoice.equals("division")){

            }
            else if(userChoice.equals("square")){

            }
            else if(userChoice.equals("square root")){

            }
            else{
                Console.println("Please enter a valid function");
            }


        }

    }

    public double getDegSine(double displayNumber){
        double result = Math.sin(displayNumber);
        Console.println("The sine of " + displayNumber + " in degrees is " + result);
        return result;
    }

    public double getDegSineInv(double displayNumber){
        double result = Math.asin(displayNumber);
        Console.println("The inverse sine of " + displayNumber + " in degrees is " + result);
        return result;
    }

    public double getDegCosine(double displayNumber){
        double result = Math.cos(displayNumber);
        Console.println("The cosine of " + displayNumber + " in degrees is " + result);
        return result;
    }

    public double getDegCosineInv(double displayNumber){
        double result = Math.acos(displayNumber);
        Console.println("The inverse cosine of " + displayNumber + " in degrees is " + result);
        return result;
    }

    public double getDegTangent(double displayNumber){
        double result = Math.tan(displayNumber);
        Console.println("The tangent of " + displayNumber + " in degrees is " + result);
        return result;
    }

}
