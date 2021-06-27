package com.zipcodewilmington.scientificcalculator;
import com.zipcodewilmington.scientificcalculator.operations.*;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static Collection<Operation> operations;
    public static void setUp() {
        operations = new ArrayList<Operation>();
        operations.add(new HelpOperation());
        operations.add(new AddOperation());
        operations.add(new SubtractionOperation());
    }

    public static void main(String[] args) {

        Console.println("Welcome to IcedHomeBrew calculator!");
        Console.println("(Type 'h' for help)"); // directions for user

        while (true) {
            OperationRequest request = input.ask();
            // pass this to something
            // print response (maybe response object) and handle in main application
            // On HelpOperation do nothing and return current calculator value
            break; // make this conditional (user exit or not exit)
            // it could be continue which will have a string or break
        }

        Console.println("Exiting IHB calculator"); // bye message


    }

    public Double state = 0.00;
    public Double memoryValue = 0.00;
    public int currentDisplayMode = 3;
    public String currentUnitsMode = "degrees";


}


