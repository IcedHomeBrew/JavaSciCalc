package com.zipcodewilmington.scientificcalculator.operations;
import com.zipcodewilmington.scientificcalculator.Console;

public class SubtractionOperation extends Operation {
    @Override
    public String getKey() {
        return "-";
    }

    @Override
    public String getName() {
        return "Subtraction";
    }

    @Override
    public String getExample() {
        return getKey() + " num";
    }

    @Override
    public boolean validate(String[] stringArray) {
        String toSubtract = null;
        if(stringArray.length < 2) {
            Console.println("Not enough");
            Console.println("Example: " + getExample());
            return false;
        }
        toSubtract = stringArray[1];
        try{
            Integer.parseInt(toSubtract);
            Float.parseFloat(toSubtract);
        } catch(Exception e){
            Console.println("Not a number: " + toSubtract);
            return false;
        }
        return super.validate(stringArray);
    }
}
