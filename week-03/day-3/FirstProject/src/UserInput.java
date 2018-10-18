import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {

       // HelloUser

        Scanner scanner = new Scanner (System.in);

        System.out.println("Please, write your name here:");
        String userInput1 = scanner.nextLine();
        System.out.println("Hello, " + userInput1);


        // MileToKmConverter

        System.out.println("Write a distance in kilometers: ");

        double userInput2 = scanner.nextInt();

        userInput2 *= 0.621371192;

        System.out.println("Converted into miles: " + userInput2);


        // AnimalsAndLegs

        System.out.println("Number of chicken the farmer has: ");

        int userInput3 = scanner.nextInt();

        System.out.println("Number of pigs owned by the farmer: ");

        int userInput4 = scanner.nextInt();

        System.out.println("All together they have: " + ((userInput3 * 2) + (userInput4 * 4)) + " legs");


        // AverageOfInput

        System.out.println("Please write five numbers below:");
        int userInput5 = scanner.nextInt();
        int userInput6 = scanner.nextInt();
        int userInput7 = scanner.nextInt();
        int userInput8 = scanner.nextInt();
        int userInput9 = scanner.nextInt();
        int sum = userInput5 + userInput6 + userInput7 + userInput8 + userInput9;
        double average = sum / 5.;


        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);












    }

}
