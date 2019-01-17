import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class NumberFrequency {

  public static void main(String[] args) {

//    Írj egy functiont, ami megszámolja, hogy a kapott számokat tartalmazó tömbben melyik szám hányszor szerepel, és visszaadja eredményül ezt.
//        Pl: [3, 5, 6, 3, 1, 1, 5] » { 3: 2, 5: 2, 6: 1, 1: 2 }
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(3, 5, 6, 3, 1, 1, 5));
    System.out.println(getWordFrequency(numbers));
  }

  private static HashMap<Integer, Integer> getWordFrequency(ArrayList<Integer> numbers) {
    HashMap<Integer, Integer> numberFrequency = new HashMap<>();

    for (Integer number : numbers) {
        if (numbers.contains(number)) {
          if (numberFrequency.get(number) == null) {
            numberFrequency.put(number, 1);
          } else {
            numberFrequency.put(number, numberFrequency.get(number) + 1);
          }
        }
    }
    return  numberFrequency;
  }
}
