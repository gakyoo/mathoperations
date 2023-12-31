package io.math.operations;

public class MathOperation {

    public String determineMathOperation(int number1, int number2, int number3){

        String operation = "";
        String[] possibleMathOperations = {"+","-","*","/"};

        for (String mOperation : possibleMathOperations) {

            switch (mOperation) {
                case "+":
                    if ((number1 + number2) == number3) {
                        operation += mOperation;
                    }
                    break;

                case "-":
                    if ((number1 - number2) == number3) {
                        operation += mOperation;
                    }
                    break;

                case "*":
                    if ((number1 * number2) == number3) {
                        operation += mOperation;
                    }
                    break;

                case "/":
                    try{
                        if ((number1 / number2) == number3) {
                            operation += mOperation;
                        }
                    } catch (ArithmeticException e) {
                        //System.out.println("Division by zero is not possible");
                    }
                    break;
            }

        }
         if (operation.length() == 0) {
                operation = "None";
            }
        
        return operation;
    }
}