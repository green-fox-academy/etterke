import java.util.Scanner;

public class loops {

    public static void main(String[] args) {


        // IWontCheatOnTheExam

        String line = "I won't cheat on the exam";

        for (int i = 0; i < 100; i++) {
            System.out.println(line);
        }


        // PrintEven

        int a = 0;
        while (a < 500) {
            System.out.println(a);
            a += 2;
        }


        // MultiplicationTable

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please write a number here: ");
        int userInput1 = scanner.nextInt();

        for (int i = 0; i < 15; i++) {
            System.out.println((i + 1) + " x " + userInput1 + " = " + (i + 1) * userInput1);
        }


        //CountFromTo

        System.out.println("Please write two numbers here: ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        if (number1 > number2) {
            System.out.println("The second number should be bigger!");

        } else {
            for (int b = 0; b < (number2 - number1); b++) {
                System.out.println(number1 + b);
            }
        }


        // FizzBuzz

        for (int number = 0; number < 100; number++) {
            if (((number + 1) % 3 == 0) && ((number + 1) % 5 == 0)) {
                System.out.println("FizzBuzz");

            } else if ((number + 1) % 3 == 0) {
                System.out.println("Fizz");

            } else if ((number + 1) % 5 == 0) {
                System.out.println("Buzz");

            } else {
                System.out.println(number + 1);
            }
        }


        // DrawTriangle

        System.out.println("Please write a number here: ");
        int number3 = scanner.nextInt();
        String star = "*";

        for (int e = 0; e < number3; e++) {
            System.out.println(star);
            star = star + "*";
        }


        // DrawDiagonal

        System.out.println("Please write a number here: ");
        int rows = scanner.nextInt();

        for (int e = 0; e < rows; e++) {
            for (int f = 0; f < rows; f++) {
                if ((f == 0) || (f == rows - 1) || (e == f) || (e == 0) || (e == rows - 1)) {
                    System.out.print("%");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}