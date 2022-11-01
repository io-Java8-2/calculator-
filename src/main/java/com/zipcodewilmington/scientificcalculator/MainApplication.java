package com.zipcodewilmington.scientificcalculator;
import static com.zipcodewilmington.scientificcalculator.CorePackage.*;
import static com.zipcodewilmington.scientificcalculator.Memory.*;
import static com.zipcodewilmington.scientificcalculator.Trig.*;
import static com.zipcodewilmington.scientificcalculator.Display.*;
import static com.zipcodewilmington.scientificcalculator.Custom.*;

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
        double userInput2 = 0;
        double currentMemoryValue = 0;

        Console.println("Welcome to the Io calculator!");
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
            Console.println("What operation would you like to do? Type 'help' for a list of functions.");
            funcChoice = Console.getStringInput(userChoice);
            funcChoice = funcChoice.toLowerCase();
            if(funcChoice.equals("add")){
                userInput = Console.getDoubleInput("Please enter a number to add to " + displayNumber);
                displayNumber = addition(displayNumber, userInput);

            }
            else if(funcChoice.equals("subtract")){
                userInput = Console.getDoubleInput("Please enter a number to subtract from " + displayNumber);
                displayNumber = subtraction(displayNumber, userInput);
            }
            else if(funcChoice.equals("multiply")){
                userInput = Console.getDoubleInput("Please enter a number to multiply to " + displayNumber);
                displayNumber = multiplication(displayNumber, userInput);
            }
            else if(funcChoice.equals("divide")){
                userInput = Console.getDoubleInput("Please enter a number to divide from " + displayNumber);
                if(userInput == 0){
                    Console.println("Cannot divide by 0!");
                }
                else{
                    displayNumber = division(displayNumber, userInput);
                }
            }
            else if(funcChoice.equals("square")){
                userInput = Console.getDoubleInput("Please enter a number to square: ");
                displayNumber = sq(userInput);
            }
            else if(funcChoice.equals("square root")){
                userInput = Console.getDoubleInput("Please enter a number: ");
                displayNumber = sqrt(userInput);

            }
            else if(funcChoice.equals("sine")){
                userInput = Console.getDoubleInput("Please enter a number to get the sine of: ");
                displayNumber = getRadSine(userInput);
            }
            else if(funcChoice.equals("arc sine")){
                userInput = Console.getDoubleInput("Please enter a number to get the arc sine of: ");
                if(userInput > 1 || userInput < -1){
                    Console.println("Please enter a value between -1 and 1!");
                }
                else {
                    displayNumber = getRadArcSine(userInput);
                }
            }
            else if(funcChoice.equals("cosine")){
                userInput = Console.getDoubleInput("Please enter a number to get the cosine of: ");
                displayNumber = getRadCosine(userInput);
            }
            else if(funcChoice.equals("arc cosine")){
                userInput = Console.getDoubleInput("Please enter a number to get the arc cosine of: ");
                if(userInput > 1 || userInput < -1){
                    Console.println("Please enter a value between -1 and 1!");
                }
                else {
                    displayNumber = getRadArcCosine(userInput);
                }
            }
            else if(funcChoice.equals("tangent")){
                userInput = Console.getDoubleInput("Please enter a number to get the tangent of: ");
                displayNumber = getRadTangent(userInput);
            }
            else if(funcChoice.equals("arc tangent")){
                userInput = Console.getDoubleInput("Please enter a number to get the arc tangent of: ");
                displayNumber = getRadArcTangent(userInput);
            }
            else if(funcChoice.equals("log")){
                userInput = Console.getDoubleInput("Please enter a number to get the log of: ");
                if(userInput <= 0){
                    Console.println("Please enter a positive value!");
                }
                else {
                    displayNumber = getLog(userInput);
                }
            }
            else if(funcChoice.equals("natural log")){
                userInput = Console.getDoubleInput("Please enter a number to get the natural log of: ");
                if(userInput <= 0){
                    Console.println("Please enter a positive value!");
                }
                else {
                    displayNumber = getNatLog(userInput);
                }
            }
            else if(funcChoice.equals("inverse log")){
                userInput = Console.getDoubleInput("Please enter a number to get the inverse log of: ");
                displayNumber = getInvLog(userInput);
            }
            else if(funcChoice.equals("inverse natural log")){
                userInput = Console.getDoubleInput("Please enter a number to get the inverse natural log of: ");
                displayNumber = getInvNatLog(userInput);
            }
            else if(funcChoice.equals("factorial")){
                userInput = Console.getDoubleInput("Please enter a number to get the factorial of: ");
                displayNumber = getFactorial(userInput);
            }
            else if(funcChoice.equals("circumference")){
                userInput = Console.getDoubleInput("Please enter a number for the radius of a circle: ");
                displayNumber = getCircumference(userInput);
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
            else if (funcChoice.equals("qs")){
                userInput = Console.getDoubleInput("Please enter a new number:");
                displayNumber = qs(displayNumber,userInput);
            }
            else if(funcChoice.equals("clear")){
                displayNumber = clear(displayNumber);
                Console.println("Display number was cleared");
            }
            else if(funcChoice.equals("current number")){
                displayNumber = getDisplay(displayNumber);
                Console.println("The Current number is: " + displayNumber);
            }
            else if(funcChoice.equals("power")){
                userInput = Console.getDoubleInput("Please enter a number to have the current number raised to the power of");
                displayNumber = raisePower(displayNumber, userInput);
            }
            else if(funcChoice.equals("invert")){
                displayNumber = inverse(displayNumber);
                Console.println("Number inverted");
            }
            else if(funcChoice.equals("invert sign")){
                displayNumber = invertSign(displayNumber);
                Console.println("Numbers sign has been inverted");
            }
            else if(funcChoice.equals("pi")){
                displayNumber = importPi();
            }
            else if(funcChoice.equals("random")){
                userInput = Console.getDoubleInput("Enter the upper limit for a random number: ");
                displayNumber = randomNumber(userInput);
                Console.println("Here's your random number: ");
            }
            else if (funcChoice.equals("help")){
                Console.println("Please use one of the following commands:");
                Console.println("[Add] [Subtract] [Multiply] [Divide]\n[Square] [Square Root] [Factorial]");
                Console.println("[Power] [Invert] [Invert Sign]");
                Console.println("[Sine] [Cosine] [Tangent]\n[Arc Sine] [Arc Cosine] [Arc Tangent]");
                Console.println("[Log] [Natural Log] [Inverse Log] [Inverse Natural Log]");
                Console.println("[Circumference] [Pi] [Random]");
                Console.println("[QS (Quick Switch Number)] [Clear] [Current Number]");
                Console.println("[MS (Memory Save)] [MC (Memory Recall)] [MR (Memory Reset)]");
                Console.println("Type 'exit' to close the calculator");
            }
            else if(funcChoice.equals("exit")){
                Console.println("Goodbye!");
                endCalc = false;
            }
            else{
                Console.println("Please enter a valid function");
            }


        }

    }

}
