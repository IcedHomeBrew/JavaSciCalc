package com.zipcodewilmington.scientificcalculator.operations;

public abstract class Operation {
    public abstract String getKey();
    public abstract String getName();
    public abstract String getExample();
    public boolean validate (String[] stringArray) {
        return true;

    }


}
