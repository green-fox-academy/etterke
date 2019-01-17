import jdk.nashorn.internal.runtime.arrays.ArrayLikeIterator;

import java.util.ArrayList;
import java.util.Arrays;

public class AddNeighbours {
//
//  Írj egy functiont, ami egy számokat tartalmazó listát kap, összadja párban az egymás mellett lévő számokat, és az így kapott listát adja vissza eredményül. Ha páratlan a lista hossza, az utolsó elem önmagában szerepel az eredmény listában.
//  Pl:
//      - [1, 2, 3, 4] » [3, 7]
//      - [1, 2, 3, 4, 5] » [3, 7, 5]
//      - [1, 2, 3, 4, 5, 6] » [3, 7, 11]

  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));

    System.out.println(sumElementsNextToOneAnother(numbers));

  }

  private static ArrayList<Integer> sumElementsNextToOneAnother(ArrayList<Integer> numbers) {
    ArrayList<Integer> summedNumbers = new ArrayList<>();
    int sum;

    if (numbers.size() % 2 == 0){
      for (int i = 0; i < numbers.size(); i+=2) {
        sum = numbers.get(i) + numbers.get(i + 1);
        summedNumbers.add(sum);
      }
    } else {
      for (int i = 0; i < numbers.size() - 1; i+=2) {
        sum = numbers.get(i) + numbers.get(i + 1);
        summedNumbers.add(sum);
      }
      summedNumbers.add(numbers.get(numbers.size() - 1));
    }
    return summedNumbers;
  }
}
