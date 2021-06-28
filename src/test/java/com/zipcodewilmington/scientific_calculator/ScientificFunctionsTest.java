package com.zipcodewilmington.scientific_calculator;
import com.zipcodewilmington.scientificcalculator.ScientificFunctions;
import junit.framework.Assert;

import org.junit.Test;

public class ScientificFunctionsTest {
    @Test
    public void testSine(){
        //Given
        double baseValue = 15;
        double expected = 0.2588;
        //When
        double actual = ScientificFunctions.getSine(baseValue);
        //Then


        Assert.assertEquals(expected, actual, 0.0001);
    }

    @Test
    public void testCosine(){
        //Given
        double baseValue = 15;
        double expected = 0.9659;
        //When
        double actual = ScientificFunctions.getCosine(baseValue);
        //Then

        Assert.assertEquals(expected, actual, 0.0001);
    }

    @Test
    public void testTangent(){
        //Given
        double baseValue = 15;
        double expected = 0.2679;
        //When
        double actual = ScientificFunctions.getTangent(baseValue);

        //Then
        Assert.assertEquals(expected, actual, 0.0001);
    }

    @Test
    public void testInverseSine(){
        //Given
        double baseValue = -1;
        double expected = -0.0174;
        //When
        double actual = ScientificFunctions.getInverseSine(baseValue);
        //Then
        Assert.assertEquals(expected, actual, 0.0001);
    }

    @Test
    public void testInverseCosine(){
        //Given
        double baseValue = -1;
        double expected = 1.5882;
        //When
        double actual = ScientificFunctions.getInverseCosine(baseValue);
        //Then
        Assert.assertEquals(expected, actual, 0.0001);
    }

    @Test
    public void testInverseTangent(){
        //Given
        double baseValue = -1;
        double expected = -0.0174;
        //When
        double actual = ScientificFunctions.getInverseTangent(baseValue);
        //Then
        Assert.assertEquals(expected, actual, 0.0001);
    }

    @Test
    public void testFactorial(){
        //Given
        int factor = 5;
        int expected = 120;
        //When
        int actual = ScientificFunctions.getFactorial(factor);
        //Then
        

        Assert.assertEquals(expected, actual,0.0001);
 
    }

    @Test
    public void testLog(){
        //Given
        double valueToLog = 100;
        double expected = 2;
        //When
        double actual = ScientificFunctions.log(valueToLog);
        //Then
        Assert.assertEquals(expected, actual, .0001);
    }

    @Test
    public void testNaturalLog(){
        //Given
        double valueToNaturalLog = 100;
        double expected = 4.6051;
        //When
        double actual = ScientificFunctions.naturalLog(valueToNaturalLog);
        //Then
        Assert.assertEquals(expected, actual, 0.0001);
    }

    @Test
    public void testInverseLog(){
        //Given
        double valueToInverseLog = -1;
        double expected = 0.1;
        //When
        double actual = ScientificFunctions.inverseLog(valueToInverseLog);
        //Then
        Assert.assertEquals(expected, actual, 0.0001);
    }

    @Test
    public void testInverseNaturalLog(){
        //Given
        double valueToNaturalInverseLog = 2;
        double expected = 7.3890;
        //When
        double actual = ScientificFunctions.inverseNaturalLog(valueToNaturalInverseLog);
        //Then
        Assert.assertEquals(expected, actual, 0.0001);
    }

}
