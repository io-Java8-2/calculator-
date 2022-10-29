package com.zipcodewilmington.scientificcalculator;

public class Memory{

    public static void saveToMemory(double currentMemoryValue, double displayNumber) { // saves current mem value
        currentMemoryValue = displayNumber;
    }
    public static void resetMemory(double currentMemoryValue){ //reset memory
        currentMemoryValue = 0;
    }
    public static double recallMemory(double currentMemoryValue){
        return currentMemoryValue;
    }
}
