import java.util.Arrays;

public class Bubble {

  public static void main(String[] args) {
    //  Make a second boolean parameter, if it's `true` sort that list descending
    int[] numbers = new int[] {34, 12, 24, 9, 5};
    int[] ascendingNumbers = bubble(numbers);
    boolean arrayLength = numbers.length > 9;

    System.out.println(Arrays.toString(ascendingNumbers));
    advancedBubble(numbers, arrayLength);
  }



  private static int[] bubble(int[] ints) {
    int temp;
    for (int i = 0; i < ints.length; i++) {
      for (int j = i + 1; j < ints.length; j++) {
        if (ints[i] > ints[j]) {
          temp = ints[i];
          ints[i] = ints[j];
          ints[j] = temp;
        }
      }
    }
    return ints;
  }

  private static void advancedBubble(int[] ints, boolean b) {
    int temp;
    if (b == true) {
      for (int i = 0; i < ints.length - 1; i++) {
        for (int j = i + 1; j < ints.length; j++) {
          if (ints[i] < ints[j]) {
            temp = ints[j];
            ints[j] = ints[i];
            ints[i] = temp;
          }
        }
      }
      System.out.println(Arrays.toString(ints));
    }
  }
}
