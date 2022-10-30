package com.zipcodewilmington.scientific_calculator;
import com.zipcodewilmington.scientificcalculator.Trig;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.text.DecimalFormat;
import com.zipcodewilmington.scientificcalculator.CorePackage;

public class TestCorePackage{
    @Test
    public void testAddition(){
        CorePackage testCore = new CorePackage();
        double test = testCore.addition(2,2);
        assertEquals(4,test);
    }
    @Test
    public void testSubtraction(){
        CorePackage testCore = new CorePackage();
        double test = testCore.subtraction(10, 2);
        assertEquals(8,test);
    }
    @Test
    public void testMultiplication(){
        CorePackage testCore = new CorePackage();
        double test = testCore.multiplication(5,5);
        assertEquals(25, test);
    }
    @Test
    public void testDivision(){
        CorePackage testCore = new CorePackage();
        double test = testCore.division(25, 5);
        assertEquals(5, test);
    }
    @Test
    public void testSqrt(){
        CorePackage testCore = new CorePackage();
        double test = testCore.sqrt(4);
        assertEquals(2,test);
    }
    @Test public void testSq(){
        CorePackage testCore = new CorePackage();
        double test = testCore.sq(5);
        assertEquals(25, test);
    }
    @Test public void testRaisePower(){
        CorePackage testCore = new CorePackage();
        double test = testCore.raisePower(5,2);
        assertEquals(25, test);
    }
    @Test public void testInverse(){
        CorePackage testCore = new CorePackage();
        double test = testCore.inverse(10);
        assertEquals(0.1, test);
    }
    @Test public void testInverseSign() {
        CorePackage testCore = new CorePackage();
        double test = testCore.invertSign(10);
        assertEquals(-10, test);
    }

}