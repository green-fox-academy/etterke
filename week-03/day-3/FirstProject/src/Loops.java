import java.util.Scanner;

public class Loops {

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

        System.out.println("Please write a number here that you would like to multiply: ");
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

        System.out.println("Please write a number here for the lines of the triangle: ");
        int number3 = scanner.nextInt();
        String star = "*";

        for (int e = 0; e < number3; e++) {
            System.out.println(star);
            star = star + "*";
        }


        // DrawDiagonal

        System.out.println("Please write a number here to draw a square with a diagonal: ");
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


        // GuessTheNumber

        int favNumber = 8;
        String question = "Can you guess the number that is stored?";


        for (int i = 0; i < 100; i ++) {
            System.out.println(question);
            int guess = scanner.nextInt();

            if (guess < favNumber) {
                System.out.println("The stored number is higher");

            } else if (guess > favNumber) {
                System.out.println("The stored number is lower");

            } else {
                System.out.println("You found the number: " + favNumber);
                break;
            }
        }


        // DrawAChessTable

        String black = "%";
        String white = " ";

        for (int g = 0; g < 8; g++) {
            for (int h = 0; h < 4; h++) {
                if (g % 2 == 0) {
                    System.out.print(black + white);
                } else {
                    System.out.print(white + black);
                }
            }
            System.out.println();
        }


        // DrawPyramid

        System.out.println("Please write a number for the layers of the pyramid here: ");
        int layers = scanner.nextInt();

        for (int e = 0; e < layers; e++) {
            for (int f = layers - e; f > 1; f--) {
                System.out.print(" ");
            } for (int f = 0; f <= e; f++) {
                System.out.print("*");
            }
            System.out.println();
        }


        // DrawSquare

        System.out.println("Please write a number here to draw a square: ");
        int sides = scanner.nextInt();

        for (int e = 0; e < sides; e++) {
            for (int f = 0; f < sides; f++) {
                if ((f == 0) || (f == rows - 1)  || (e == 0) || (e == rows - 1)) {
                    System.out.print("%");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


        // ParametricAverage

        int sum = 0;

        System.out.println("Please enter a number here: ");
        int number8 = scanner.nextInt();

        for (int i = 0; i < number8; i++) {
            System.out.println("Enter number" + (i + 1) + " :");
            int number9 = scanner.nextInt();
            sum = sum + number9;
        }
        double average = sum / number8;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}

