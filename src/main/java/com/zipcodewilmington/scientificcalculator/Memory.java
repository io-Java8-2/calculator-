package com.zipcodewilmington.scientificcalculator;

public class Memory{

    public static double saveToMemory(double memoryValue, double displayNumber) {
        memoryValue = displayNumber;
        return memoryValue;
    }
    public static double resetMemory(double currentMemoryValue){
        currentMemoryValue = 0;
        return currentMemoryValue;
    }
    public static double recallMemory(double currentMemoryValue){
        return currentMemoryValue;
    }
}