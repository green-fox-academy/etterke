import java.util.*;

public class Calculator {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.println("Please put two numbers here: ");

        int number1 = input.nextInt();
        int number2 = input.nextInt();

        Scanner op = new Scanner(System.in);

        System.out.println("Thank you! Now please specify the mathematical operation you would like to perform: ");

        String mathOp = op.nextLine();

        calculate(number1, number2, mathOp);
    }

    public static void calculate(int x, int y, String operation) {

        if (operation.equals("+")) {
            System.out.println("The result is: " + (x + y));
        }

        if (operation.equals("-")) {
            System.out.printf("The result is: " + (x - y));
        }

        if (operation.equals("*")) {
            System.out.printf("The result is: " + (x * y));
        }

        if (operation.equals("/")) {
            System.out.printf("The result is: " + (x / y));
        }

        if (operation.equals("%")) {
            System.out.println("The result is: " + (x % y));
        }
    }
}
