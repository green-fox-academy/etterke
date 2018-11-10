import java.sql.SQLOutput;
import java.util.*;

public class GuessMyNumber {

    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);
        System.out.println("Greetings player! Let!s play a guessing game! \n I'll think of a random number and you have to guess the exact number. \n Tell me the minimum range: ");
        int minRange = number.nextInt();

        System.out.println("Excellent! Now tell me the maximum range: ");
        int maxRange = number.nextInt();

        System.out.println("Splendid! Now tell me, how many lives would you like to have: ");
        int lives = number.nextInt();

        int randomNumber = (int) (minRange + (Math.random() * (maxRange + 1)));

        System.out.println("Take a guess: ");

        for (int i = 0; i < lives; i++) {
            int guess = number.nextInt();
            if (guess == randomNumber) {
                System.out.println("Good job! You won! The number I was looking for is: " + guess);
                break;
            } else if (guess < randomNumber) {
                System.out.println("Aim higher! You have " + (lives - 1  - i) + " lives left");
            } else {
                System.out.println("Aim lower! You have " + (lives - 1 - i) + " lives left");
            }
        }
    }
}
