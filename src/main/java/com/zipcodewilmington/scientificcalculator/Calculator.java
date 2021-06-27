package com.zipcodewilmington.scientificcalculator;

public class Calculator {
    private static double state = 0;
    private static double stored = 0; 
    public static void topMenu(){
        int input;
        //Display options to select mathematical operation
        Console.println("Select the type of mathematical operation to perform");
        Console.println("1: Basic");
        Console.println("2: Scientific");
        input = Console.getIntegerInput("Enter number for menu options");

        if(input == 2){
            scientificOptionsMenu();
        } else {
            basicOptionsMenu();
        }
    }

    public static void basicOptionsMenu(){
        int input;

        Console.println("1: Addition");
        Console.println("2: Subtraction");
        Console.println("3: Multiplication");
        Console.println("4: Division");
        Console.println("5: Return to Top Menu");

        input = Console.getIntegerInput("Enter number for menu option");

        int inputA = Console.getIntegerInput("First number");
        int inputB = Console.getIntegerInput("Second number");

        switch (input) {
            case 1:
                Double sum = BasicFunctions.addIt(inputA, inputB);
                Console.println(sum.toString());
                state = sum;
                break;
            case 2:
                Double differ = BasicFunctions.subtractIt(inputA, inputB);
                Console.println(differ.toString());
                break;
            case 3:
                Double product = BasicFunctions.multiplyIt(inputA, inputB);
                Console.println(product.toString());
                break;
            case 4:
                Double quotient = BasicFunctions.divideIt(inputA, inputB);
                Console.println(quotient.toString());
                break;
            default:
                topMenu();

        }
    }

    public static void scientificOptionsMenu(){
        int input;

        Console.println("1: Trigonometry");
        Console.println("2: Logarithms");
        Console.println("3: Factorials");
        Console.println("4: Return to Top Menu");

        input = Console.getIntegerInput("Enter number for menu option");

        // Double inputA = Console.getDoubleInput("First number");

        switch (input) {
            case 1:
                trigOptionsMenu();
                break;
            case 2:


        }
    }

    public static void trigOptionsMenu() {
        int trigSelector;

        Console.println("1: Sine");
        Console.println("2: Cosine");
        Console.println("3: Tangent");
        Console.println("4: Inverse Sine");
        Console.println("5: Inverse Cosine");
        Console.println("6: Inverse Tangent");
        Console.println("7: Return to Top Menu");

        trigSelector = Console.getIntegerInput("Enter number for Trigonometry menu");

        Double trigNumber = Console.getDoubleInput("First number");

        switch (trigSelector) {
            case 1:
                Double sineValue = ScientificFunctions.getSine(trigNumber);
                Console.println(sineValue.toString());
                state = sineValue;
                break;
            case 2:
                Double cosineValue = ScientificFunctions.getCosine(trigNumber);
                Console.println(cosineValue.toString());
                state = cosineValue;
                break;
            case 3:
                Double tangentValue = ScientificFunctions.getCosine(trigNumber);
                Console.println(tangentValue.toString());
                state = tangentValue;
                break;
            case 4:
                Double inverseSineValue = ScientificFunctions.getSine(trigNumber);
                Console.println(inverseSineValue.toString());
                state = inverseSineValue;
                break;
            case 5:
                Double inverseCosineValue = ScientificFunctions.getCosine(trigNumber);
                Console.println(inverseCosineValue.toString());
                state = inverseCosineValue;
                break;
            case 6:
                Double inverseTangentValue = ScientificFunctions.getCosine(trigNumber);
                Console.println(inverseTangentValue.toString());
                state = inverseTangentValue;
                break;
        }
    }

}
