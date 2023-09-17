package io.math.operations;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        int number1, number2, number3;

        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Enter number1");
        number1 = inputScanner.nextInt();

        System.out.println("Enter number2");
        number2 = inputScanner.nextInt();

        System.out.println("Enter number3");
        number3 = inputScanner.nextInt();

        inputScanner.close();

        MathOperation mathOperation = new MathOperation();

        String testResult = mathOperation.determineMathOperation(number1, number2, number3);
        System.out.println("\nMathematical Operation(s) producing "+number3+" is/are " + testResult + "\n");
    }
}
