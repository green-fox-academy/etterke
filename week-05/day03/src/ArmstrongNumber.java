import java.util.*;

public class ArmstrongNumber {

    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);

        System.out.println("Tell me a number and I'll tell you if it's an Armstrong number: ");
        int inputNumber = number.nextInt();
        char[] inputDigitArray = String.valueOf(inputNumber).toCharArray();
        int index = inputDigitArray.length;

        // Print out the array to check if the numbers are in there
        // for (int i = 0; i < index; i++) {
            //System.out.print(inputDigitArray[i]);
        // }
        int sum = 0;

        //Math.pow (int, int) or (double, double) to raise to index
        for (int i = 0; i < inputDigitArray.length; i++) {
            sum += Math.pow((Character.getNumericValue(inputDigitArray[i])), index);
        }

        if (sum == inputNumber) {
            System.out.println("This is an Armstrong Number");
        } else {
            System.out.println("This is not an Armstrong Number");
        }
    }
}
