package com.zipcodewilmington.scientific_calculator;
import org.junit.Test;
import java.text.DecimalFormat;
import static org.junit.jupiter.api.Assertions.*;
import com.zipcodewilmington.scientificcalculator.Custom;

public class CustomTest {

    @Test
    public void testCircumference(){
        Custom testCustom = new Custom();
        DecimalFormat numFormat = new DecimalFormat("0.#####E0");
        double test = testCustom.getCircumference(4);
        assertEquals(numFormat.format(25.13274), numFormat.format(test));
    }
}
