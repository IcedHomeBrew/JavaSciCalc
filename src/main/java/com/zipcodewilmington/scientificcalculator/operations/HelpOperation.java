package com.zipcodewilmington.scientificcalculator.operations;

import com.zipcodewilmington.scientificcalculator.Console;
import com.zipcodewilmington.scientificcalculator.Global;


public class HelpOperation extends Operation {
    @Override
    public String getKey() {
        return "h";
    }

    @Override
    public String getName() {
        return "Help";
    }

    @Override
    public String getExample() {
        return getKey();
    }

    @Override
    public boolean validate(String[] stringArray) {
        for(Operation operation: Global.getInstance().getOperations()) {
            Console.println(operation.getName()+ ": " + operation.getExample());
        }
        return super.validate(stringArray);
    }
}
