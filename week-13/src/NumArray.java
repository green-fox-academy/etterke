import java.util.Arrays;

public class NumArray {

//  Írj egy functiont, ami a kapott számokat tartalmazó tömbből (array) visszaadja a legnagyobb elemet.
  public static void main(String[] args) {
    int[] numbers = {3, 6, 34, 23, 87, 19, 44};

    findBiggestNumber(numbers);

  }

  public static void findBiggestNumber(int[] numbers) {
    int[] ascending = new int[numbers.length];
    int temp;
    for (int i = 0; i < numbers.length; i++) {
      for (int j = i + 1; j < numbers.length; j++) {
        if (numbers[i] > numbers[j]) {
          temp = numbers[i];
          numbers[i] = numbers[j];
          numbers[j] = temp;
          ascending = numbers;
        }
      }
    }

    print(ascending);
    printBiggestNumber(ascending);
  }

  private static void printBiggestNumber(int[] ascending) {
    int biggestNumber = ascending[6];
    System.out.println(biggestNumber);
  }

  private static void print(int[] numbers) {
    for (int number : numbers) {
      System.out.println(" " + number + " ");
    }
  }
}
