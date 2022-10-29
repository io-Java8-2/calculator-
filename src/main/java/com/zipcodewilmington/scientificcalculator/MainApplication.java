package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    double displayNumber = 0;
    boolean endCalc = false;
    String userChoice;

    int switchChoice = 0;
    public void main(String[] args) {
        Console.println("Welcome to my calculator!");
        /*
        String s = Console.getStringInput("Enter a string");
        Integer i = Console.getIntegerInput("Enter an integer");
        Double d = Console.getDoubleInput("Enter a double.");

        Console.println("The user input %s as a string", s);
        Console.println("The user input %s as a integer", i);
        Console.println("The user input %s as a d", d);
        */
        while (endCalc = false){
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
}
