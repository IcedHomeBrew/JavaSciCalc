package com.zipcodewilmington.scientificcalculator;

import com.zipcodewilmington.scientificcalculator.operations.AddOperation;
import com.zipcodewilmington.scientificcalculator.operations.HelpOperation;
import com.zipcodewilmington.scientificcalculator.operations.Operation;
import com.zipcodewilmington.scientificcalculator.operations.SubtractionOperation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Global {
    private static Global instance;       //singleton pattern
    public static Global getInstance() {
        if (instance == null) {
            instance = new Global();
        }
        return instance;
    }
    private Collection<Operation> operations;

    public Collection<Operation> getOperations() {
        return operations;
    }

    private Global() {
        this.operations = new ArrayList<Operation>();
    }

    public void init() {
        this.operations.add(new HelpOperation());
        this.operations.add(new AddOperation());
        this.operations.add(new SubtractionOperation());

    }
}
