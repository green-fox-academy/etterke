import java.util.*;

public class CalculatorWithString {

    public static void main(String[] args) {

        Scanner expression = new Scanner(System.in);

        System.out.println("Welcome to this calculator application! \n Please write your expression in the following format {operation} {operand} {operand} \n e.g. +,3,3 or *,2,2");
        String mathOp = expression.nextLine();

        System.out.println("The result is: " + calculate(mathOp));
    }

    public static Integer calculate(String operation) {

        int result = 0;
        String[] operationArray = operation.split(",");
        ArrayList<String> operationArrayList = new ArrayList<>(Arrays.asList(operationArray));

        int number1 = Integer.parseInt(operationArrayList.get(1));
        int number2 = Integer.parseInt(operationArrayList.get(2));

        if (operationArrayList.contains("+")) {
            result = number1 + number2;
        }

        if (operationArrayList.contains("-")) {
            result = number1 - number2;
        }

        if (operationArrayList.contains("*")) {
            result = number1 * number2;
        }

        if (operationArrayList.contains("/")) {
            result = number1 / number2;
        }

        if (operationArrayList.contains("%")) {
            result = number1 % number2;
        }

        return result;
    }
}
