package com.zipcodewilmington.scientificcalculator;

public class Calculator {
    public static void topMenu(){
        int input;
        //Display options to select mathematical operation
        Console.println("Select the type of mathematical operation to perform");
        Console.println("1: Basic");
        Console.println("2: Scientific");
        input = Console.getIntegerInput("Enter number for menu options");

        if(input == 2){
            basicOptionsMenu();
        } else {
            scientificOptionsMenu();
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
        selectFromBasicMenu(input);
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

    public static void selectFromBasicMenu(Integer input){
        switch(input){
            case 1:

        }
    }
}
