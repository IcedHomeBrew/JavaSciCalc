package com.zipcodewilmington.scientificcalculator;

public class BasicFunctions {
    public static Double addIt(double input1, double input2){
        return input1 + input2;
    }
   public static Double subtractIt(double input1, double input2) {
        return input1-input2;
   }
   public static Double multiplyIt(double input1, double input2){
        return input1 * input2;
    }
    public static Double divideIt(double input1, double input2){
        return input1/input2;
    }
    public static Double squareIt(double input1, double input2) {
        return Math.pow(input1,input2);
    }
    public static Double squareRootIt(double input){
        return Math.sqrt(input);
    }
    public static Double inverseIt(double input){
        return 1/input;
    }
    public static Double changeSigns(double input){
        return input * (-1) ;
    }
    public static Boolean isError(){
        //if input is Not a Number return Error
        // 3/0 = NaN
        //any operator ("+","-","/","*") input in without a number = NaN
        return null ;
    }
}
