package com.zipcodewilmington.scientific_calculator;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.zipcodewilmington.scientificcalculator.Display;


public class TestDisplay{
    @Test
    public void testQs(){
        Display testDisplay = new Display();
        double test = testDisplay.qs(34,65);
        assertEquals(65,test);
    }
    @Test
    public void testClear(){
        Display testDisplay = new Display();
        double test = testDisplay.clear(65);
        assertEquals(0, test);
    }
    @Test
    public void testGetDisplay(){
        Display testDisplay = new Display();
        double test = testDisplay.getDisplay(75);
        assertEquals(75,test);
    }
}