package com.zipcodewilmington.scientificcalculator;

import static com.zipcodewilmington.scientificcalculator.CorePackage.addition;
import static com.zipcodewilmington.scientificcalculator.Memory.*;

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
        double currentMemoryValue = 0;

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
            else if(funcChoice.equals("ms")){
                currentMemoryValue = saveToMemory(currentMemoryValue,displayNumber);
                Console.println("Value saved to memory");
            }
            else if(funcChoice.equals("mr")){
                currentMemoryValue = resetMemory(currentMemoryValue);
                Console.println("Memory was reset");
            }
            else if (funcChoice.equals("mc")){
                displayNumber = recallMemory(currentMemoryValue);
            }
            else if(funcChoice.equals("exit")){
                endCalc = false;
            }
            else{
                Console.println("Please enter a valid function");
            }


        }

    }

}
