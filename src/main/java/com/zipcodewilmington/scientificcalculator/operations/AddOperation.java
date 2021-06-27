package com.zipcodewilmington.scientificcalculator.operations;

import com.zipcodewilmington.scientificcalculator.Console;

public class AddOperation extends Operation{
    public static final String KEY = "+";
    @Override
    public String getKey() {
        return KEY;
    }

    @Override
    public String getName() {
        return "Addition";
    }

    @Override
    public String getExample() {
        return getKey() + " num";
    }

    @Override
    public boolean validate(String[] stringArray) {
        String toAdd = null;
        if(stringArray.length < 2) {
            Console.println("Not enough");
            Console.println("Example: " + getExample());
            return false;
        }
        toAdd = stringArray[1];
        try{
            Integer.parseInt(toAdd);
            Float.parseFloat(toAdd);
        } catch(Exception e){
            Console.println("Not a number: " + toAdd);
            return false;
        }
        return super.validate(stringArray);
    }
}
