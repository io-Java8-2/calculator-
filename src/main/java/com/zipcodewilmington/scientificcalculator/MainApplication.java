package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {

    public static void main(String[] args) {
        double displayNumber = 0;

        boolean runCalc = true;
        double currentMemoryValue = 0;
        String userChoice = "";
        String currentDisplayMode = "";
        int switchChoice = 0;
        Console.println("Welcome to my calculator!");
        /*
        String s = Console.getStringInput("Enter a string");
        Integer i = Console.getIntegerInput("Enter an integer");
        Double d = Console.getDoubleInput("Enter a double.");

        Console.println("The user input %s as a string", s);
        Console.println("The user input %s as a integer", i);
        Console.println("The user input %s as a d", d);
        */
        while (runCalc = true){
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

            }else if(userChoice.equals("ms")){
                saveToMemory(currentMemoryValue,displayNumber);
                Console.println("Value saved to memory");
            }else if(userChoice.equals("mr")){
                resetMemory(currentMemoryValue);
                Console.println("Memory was reset");
            }else if (userChoice.equals("mc")){
                recallMemory(currentMemoryValue);
            }
            else{
                Console.println("Please enter a valid function");
            }


        }
    }
    public static void saveToMemory(double currentMemoryValue, double displayNumber) { // saves current mem value
        currentMemoryValue = displayNumber;
    }
    public static void resetMemory(double currentMemoryValue){ //reset memory
        currentMemoryValue = 0;
    }
    public static double recallMemory(double currentMemoryValue){
        return currentMemoryValue;
    }
    public void changeDisplayMode(){

    }
}
