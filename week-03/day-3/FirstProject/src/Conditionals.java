import java.util.Scanner;

public class Conditionals {

    public static void main(String[] args) {

        // OddEven

        Scanner scanner = new Scanner (System.in);
        System.out.println("Please put a number here: ");

        int userInput1 = scanner.nextInt();

        if (userInput1 % 2 == 0) {
            System.out.println("Even");

        }   else {
            System.out.println("Odd");
        }


        //OneTwoALot

        System.out.println("Please put a number here: ");

        int userInput2 = scanner.nextInt();

        if (userInput2 <= 0) {
            System.out.println("Not enough");

        }   else if (userInput2 == 1) {
            System.out.println("One");

        }   else if (userInput2 == 2) {
            System.out.println("Two");

        }   else if (userInput2 > 2) {
            System.out.println("A lot");
        }


        //PrintBigger

        System.out.println("Please put two numbers here: ");

        int userInput3 = scanner.nextInt();
        int userInput4 = scanner.nextInt();

        if (userInput3 > userInput4) {
            System.out.println(userInput3);

        } else {
            System.out.println(userInput4);
        }


        // PartyIndicator

        System.out.println("Welcome to the party! Please put the number of girls here: ");

        int numberOfGirls = scanner.nextInt();

        System.out.println("Cool, now the number of boys: ");

        int numberOfBoys = scanner.nextInt();

        if (numberOfGirls == 0) {
            System.out.println("Sausage party");

        }   else if ((numberOfBoys == numberOfGirls) && (numberOfBoys + numberOfGirls > 20)) {
            System.out.println("The party is excellent!");

        }   else if ((numberOfBoys != numberOfGirls) && (numberOfBoys + numberOfGirls) >= 20) {
            System.out.println("Quite cool party!");

        }   else if ((numberOfBoys + numberOfGirls) < 20) {
            System.out.println("Average party...");

        }




    }






}
