package com.zipcodewilmington.scientific_calculator;
import com.zipcodewilmington.scientificcalculator.Trig;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.text.DecimalFormat;

public class TrigTest {

    @Test
    public void testRadSine(){
        Trig testTrig = new Trig();
        double test = testTrig.getRadSine(180);
        assertEquals(-0.801153, test);

    }

    @Test
    public void testArcRadSine(){
        Trig testTrig = new Trig();
        double test = testTrig.getRadArcSine(0.5);
        assertEquals(0.523599, test);

    }

    @Test
    public void testRadCosine(){
        Trig testTrig = new Trig();
        double test = testTrig.getRadCosine(180);
        assertEquals(-0.598460, test);
    }

    @Test
    public void testArcRadCosine(){
        Trig testTrig = new Trig();
        double test = testTrig.getRadArcCosine(0.5);
        assertEquals(1.047198, test);
    }

    @Test
    public void testRadTangent(){
        Trig testTrig = new Trig();
        double test = testTrig.getRadTangent(30);
        assertEquals(-6.405331, test);
    }

    @Test
    public void testArcRadTangent(){
        Trig testTrig = new Trig();
        double test = testTrig.getRadArcTangent(1);
        assertEquals(0.785398, test);
    }

    @Test
    public void testLog(){
        Trig testTrig = new Trig();
        double test = testTrig.getLog(90);
        assertEquals(1.954243, test);
    }

    @Test
    public void testNatLog(){
        Trig testTrig = new Trig();
        double test = testTrig.getNatLog(75);
        assertEquals(4.317488, test);
    }

    @Test
    public void testInvLog(){
        Trig testTrig = new Trig();
        DecimalFormat numFormat = new DecimalFormat("0.######E0");
        double test = testTrig.getInvLog(20.2);
        assertEquals(numFormat.format(1.584893E20), numFormat.format(test));
    }

    @Test
    public void testInvNatLog(){
        Trig testTrig = new Trig();
        DecimalFormat numFormat = new DecimalFormat("0.######E0");
        double test = testTrig.getInvNatLog(60);
        assertEquals(numFormat.format(1.142007E26), numFormat.format(test));
    }


    @Test
    public void testFactorial(){
        Trig testTrig = new Trig();
        //DecimalFormat numFormat = new DecimalFormat("0.######E0");
        double test = Trig.getFactorial(4);
        assertEquals(24, test);
    }

}
