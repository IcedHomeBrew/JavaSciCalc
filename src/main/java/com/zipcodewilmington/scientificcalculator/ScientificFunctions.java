package com.zipcodewilmington.scientificcalculator;

import java.util.Locale;

public class ScientificFunctions {

    ///////////////////////////////////////
    // Trig Methods
    ///////////////////////////////////////

    //getSine
    //Accepts a double value, converts to Radians and passes the result to Math.sin.
    //The product is returned to the caller
    public static Double getSine(Double valueToSine){
        return Math.sin(Math.toRadians(valueToSine));
    }

    //getCosine
    //Accepts a double value, converts to Radians and passes the result to Math.cos.
    //The product is returned to the caller
    public static Double getCosine(Double valueToCosine){
        return Math.cos(Math.toRadians(valueToCosine));
    }

    //getTangent
    //Accepts a double value, converts to Radians and passes the result to Math.tan
    //the product is returned to the caller
    public static Double getTangent(Double valueToTangent){
        return Math.tan(valueToTangent);
    }

    //getInverseSine
    //Accepts a double value, converts to Radians and passes the result to Math.asin.
    //The product is returned to the caller
    public static Double getInverseSine(Double valueToSine){
        return Math.asin(Math.toRadians(valueToSine));
    }

    //getInverseCosine
    //Accepts a double value, converts to Radians and passes the result to Math.acos.
    //The product is returned to the caller
    public static Double getInverseCosine(Double valueToCosine){
        return Math.acos(Math.toRadians(valueToCosine));
    }

    //getInverseTangent
    //Accepts a double value, converts to Radians and passes the result to Math.atan
    //the product is returned to the caller
    public static Double getInverseTangent(Double valueToTangent){
        return Math.atan(valueToTangent);
    }

    ///////////////////////////////////////
    // Factorial F
    ///////////////////////////////////////

    //getFactorial
    public static Integer getFactorial(int factor){
        return (factor == 1 || factor == 0) ? 1 : factor * getFactorial(factor - 1);
    }

    ///////////////////////////////////////
    // Logarithmic Methods
    ///////////////////////////////////////

    //log
    //returns the logarithm for the provided value (valueToLog)
    public static Double log(double valueToLog){
        return Math.log10(valueToLog);
    }

    //naturalLog
    //returns the natural logarithm for the provided value (valueToLog)
    public static Double naturalLog(double valueToLog){
        return Math.log(valueToLog);
    }

    //inverseLog
    //returns the inverse of a logarithm
    public static Double inverseLog(double valueToLog){
        return Math.pow(10, valueToLog);
    }

    //inverseNaturalLog
    //returns the inverse natural logarithm for the provided value (valueToLog)
    public static Double inverseNaturalLog(double valueToLog){
        return Math.exp(valueToLog);
    }



    ///////////////////////////////////////
    // Display Mode Methods
    ///////////////////////////////////////

    //switchDisplayMode - Cycle
    //Will increment the current displayMode variable by 1, keeping it in range, (1-2-3-4-1-2...)
    //and update the current displayMode variable. Afterwards,
    //display is updated to reflect the new display mode
    public static void switchDisplayMode(){
        int currentMode = 1; //<== replace later with displayMode public prop
        int nextMode = currentMode + 1;

        currentMode = nextMode % 4;
        //currentMode = mode;
        //updateDisplayMode()   <== Replace with method name to convert display mode;
    }

    //switchDisplayMode - Change via parameter
    //Will accept a string (modeName), and update the current displayMode variable. Afterwards,
    //display is updated to reflect the new display mode
    public static void switchDisplayMode(String modeName){
        switch(modeName.toLowerCase(Locale.ROOT)){
            case "decimal":
                //displayMode = 1      <== will update variable representing display mode
                break;
            case "hexadecimal":
                //displayMode = 2      <== will update variable representing display mode
                break;
            case "binary":
                //displayMode = 3      <== will update variable representing display mode
                break;
            case "octal":
                //displayMode = 4      <== will update variable representing display mode
                break;
            default:
                //displayMode = 1      <== will update variable representing display mode
        }
        //updateDisplayMode()   <== Replace with method name to convert display mode;
    }

    //switchUnitsMode - Cycle
    public static void switchUnitsMode(){
        //unitsMode = unitMode == "degrees" ? "radians" : "degrees"; <== will update variable representing units mode
        //updateUnitsMode()  <== Replace with method name ot convert units mode
    }

    //switchUnitsMode - Change via parameter
    public static void switchUnitsMode(String mode){
        switch(mode.toLowerCase(Locale.ROOT)){
            case "degrees":
            case "radians":
                //unitsMode = mode;  <== will update variable representing units mode
                break;
            default:
                //unitsMode = "degrees";  <== will update variable representing units mode
        }
        //updateUnitsMode()  <== Replace with method name to convert units mode
    }

    ///////////////////////////////////////
    // Memory Methods
    ///////////////////////////////////////

    //Step 1: Remember.
    //Step 2: Don't forget.
    //memoryAdd
    //Adds currently displayed value to the value stored in memory
    public static void memoryAdd(){
        //displayValue += memoryValue;   <== Replace with variables for displayed value and value stored in memory
    }

    //memoryClear
    //Clears value currently stored in memory
    public static void memoryClear(){
        //memoryValue = 0;  <== Replace with variable representing value stored in memory
    }

    //memoryRecall
    public static void memoryRecall(){
        //displayValue = memoryValue;  <== Replace with variables for displayed value and value stored in memory
    }
}
