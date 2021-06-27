package com.zipcodewilmington.scientificcalculator;

import com.zipcodewilmington.scientificcalculator.operations.Operation;
import com.zipcodewilmington.scientificcalculator.operations.OperationRequest;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {

        Global global = Global.getInstance();
        global.init();
        Input input = new Input(global.getOperations());

        Console.println("Welcome to IcedHomeBrew calculator!");
        Console.println("(Type 'h' for help)"); // directions for user

        //while (true) {
            //OperationRequest request = input.ask();
            // pass this to something
            // print response (maybe response object) and handle in main application
            // On HelpOperation do nothing and return current calculator value
            //break; // make this conditional (user exit or not exit)
            // it could be continue which will have a string or break
        //}

        System.out.print(BasicFunctions.addIt(1.0, 2.0) + ""); // bye message


    }

    public Double state = 0.00;
    public Double memoryValue = 0.00;
    public int currentDisplayMode = 3;
    public String currentUnitsMode = "degrees";


}


