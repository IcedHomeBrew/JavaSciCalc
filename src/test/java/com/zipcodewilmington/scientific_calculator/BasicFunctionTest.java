package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.BasicFunctions;
import com.zipcodewilmington.scientificcalculator.ScientificFunctions;
import org.junit.Assert;
import org.junit.Test;

public class BasicFunctionTest {
    @Test
    public void testAdd() {
        //Given
        BasicFunctions addTest = new BasicFunctions();
        double input1 =  7;
        double input2 = 6;
        double expected = 13.0;

        //When
        double actual = BasicFunctions.addIt(7,6);
        //Then

        Assert.assertEquals(expected,actual,0.001);
    }
}
