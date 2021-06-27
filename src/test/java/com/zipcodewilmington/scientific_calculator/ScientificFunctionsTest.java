package com.zipcodewilmington.scientific_calculator;
import com.zipcodewilmington.scientificcalculator.ScientificFunctions;
import junit.framework.Assert;
import org.junit.Test;

public class ScientificFunctionsTest {
    @Test
    public void testSine(){
        //Given
        double baseValue = 15;
        double expected = 0.25881904510252074;
        //When
        double actual = ScientificFunctions.getSine(baseValue);
        //Then

        Assert.assertEquals(expected, actual);
    }

}
