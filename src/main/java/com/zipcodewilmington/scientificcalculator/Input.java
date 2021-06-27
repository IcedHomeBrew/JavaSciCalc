package com.zipcodewilmington.scientificcalculator;

import com.zipcodewilmington.scientificcalculator.operations.Operation;
import com.zipcodewilmington.scientificcalculator.operations.OperationRequest;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Input {
    private Map<String, Operation> operationMap = new HashMap<String, Operation>(); // created map of operations by the key for operations
    public Input(Collection <Operation> operations) {
        for(Operation operation: operations) {
            operationMap.put(operation.getKey(),operation);
        }
    }
    public OperationRequest ask() {
        String input;
        String[] inputPart;
        Operation operation = null;
        while (true) {
            input = Console.getStringInput("> ");
            inputPart = input.split(" ");
            if(inputPart.length == 0) {
                continue;
            }
            String operationKey = inputPart[0];
            operation = this.operationMap.get(operationKey); // takes operation from map
            if(operation == null) {
                Console.println("Operation not found: " + operationKey); // invalid operation message
                continue;
            }
            if(!operation.validate(inputPart)){
                Console.println("Invalid input for operation: " + operationKey);
                continue;
            }
            break;
        }
        return new OperationRequest(operation, inputPart);
    }
}
