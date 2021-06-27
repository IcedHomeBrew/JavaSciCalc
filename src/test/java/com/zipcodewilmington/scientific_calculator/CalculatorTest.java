package com.zipcodewilmington.scientific_calculator;
import com.zipcodewilmington.scientificcalculator.Calculator;
import com.zipcodewilmington.scientificcalculator.Console;
import junit.framework.Assert;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void testTopMenu() {
        // Given
        Integer expectedInput = 1;
        String expectedOutput = "1: Basic";
        // When
        String actual = null; //testing
        // Then
        Assert.assertEquals(expectedInput, actual);

    }
}
