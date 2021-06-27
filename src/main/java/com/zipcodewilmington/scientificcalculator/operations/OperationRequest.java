package com.zipcodewilmington.scientificcalculator.operations;

public class OperationRequest {
    private Operation operation;
    private String[] input;

    public OperationRequest(Operation operation, String[] input) {
        this.operation = operation;
        this.input = input;
    }

    public Operation getOperation() {
        return operation;
    }

    public String[] getInput() {
        return input;
    }
}
