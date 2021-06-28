package com.zipcodewilmington.scientificcalculator;

public class Calculator {
    private static double state = 0;
    private static double stored = 0; 
    public static void topMenu() {
        int input;
        //Display options to select mathematical operation
        Console.println("Select the type of mathematical operation to perform");
        Console.println("1: Basic");
        Console.println("2: Scientific");
        input = Console.getIntegerInput("Enter number for menu options");

        if (input == 2) {
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
        Console.println("5: More Functions");
        Console.println("6: Return to Top Menu");

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
                state = differ;
                break;
            case 3:
                Double product = BasicFunctions.multiplyIt(inputA, inputB);
                Console.println(product.toString());
                state = product;
                break;
            case 4:
                Double quotient = BasicFunctions.divideIt(inputA, inputB);
                Console.println(quotient.toString());
                state = quotient;
                break;
            case 5:
                moreFunctionsMenu();
            default:
                topMenu();

        }
    }
    public static void moreFunctionsMenu() {
        //more advanced functions with exponents and whatnot
        int input;

        Console.println("1: Exponent");
        Console.println("2: Square");
        Console.println("3: Square Root of()");
        Console.println("4: Inverse");
        Console.println("5: Flip It");
        Console.println("6: Return to Basic");

        input = Console.getIntegerInput("Enter number for menu option");

        int inputA = Console.getIntegerInput("Base number");
        int inputB = Console.getIntegerInput("To the Power of");
        int inputC = Console.getIntegerInput("Square Root of");
        int inputD = Console.getIntegerInput("Inverse of");


        switch (input) {
            case 1:
                Double power = BasicFunctions.powerExponent(inputA, inputB);
                Console.println(power.toString());
                state = power;
                break;
            case 2:
                Double square = BasicFunctions.squareIt(inputA);
                Console.println(square.toString());
                state = square;
                break;
            case 3:
                Double sqrt = BasicFunctions.squareRootIt(inputC);
                Console.println(sqrt.toString());
                state = sqrt;
                break;
            case 4:
                Double inverse = BasicFunctions.inverseIt(inputD);
                Console.println(inverse.toString());
                state = inverse;
                break;
            case 5:
                Double flip = BasicFunctions.changeSigns(inputA);
                Console.println(flip.toString());
                state = flip;
                break;
            default:
                basicOptionsMenu();

        }
    }
    public static void scientificOptionsMenu(){
        int input;

        Console.println("1: Trigonometry");
        Console.println("2: Logarithms");
        Console.println("3: Factorials");
        Console.println("4: Return to Top Menu");

        input = Console.getIntegerInput("Enter number for menu option");
        //selectFromScientificMenu(input);
    }

    
}
