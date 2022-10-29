package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {

    public static void main(String[] args) {
        MainApplication calc = new MainApplication();
        double displayNumber = 0;
        boolean endCalc = true;
        String userChoice = "";
        String funcChoice = "";
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
        while (endCalc){
            Console.println("Current number: " + displayNumber);
            Console.println("What operation should be done with the number?");
            funcChoice = Console.getStringInput(userChoice);
            funcChoice = funcChoice.toLowerCase();
            if(funcChoice.equals("addition")){
                calc.addition();

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
            else{
                Console.println("Please enter a valid function");
            }


        }

    }

    public double addition(){
        String input = "";
        String input2 = "";
        double x = Console.getDoubleInput(input);
        double y = Console.getDoubleInput(input2);
        return x + y;
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

    public int switchUnitsMode(){
        return 0;
    }

}
