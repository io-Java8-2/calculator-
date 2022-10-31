package com.zipcodewilmington.scientific_calculator;
import com.zipcodewilmington.scientificcalculator.Custom;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestCustom{
    @Test
    public void testPi(){
        Custom testCustom = new Custom();
        double test = testCustom.importPi();
        assertEquals(Math.PI, test);
    }
}
