import java.util.ArrayList;
import java.util.Arrays;

public class Ascending {

  public static void main(String[] args) {
//    Írj egy functiont, ami 3 paramétert kap:
//    - egy listát számokkal,
//    - egy számot, ami a minimum limitet jelenti,
//    - egy számot, ami a maximum limitet jelenti,
//    és visszaad egy új listát, amiben növekvő sorrendbe rendezve szerepelnek az eredeti listából azok a számok, amik a megadott minimum és maximum érték közé esnek (azokat is beleértve).
//    Pl: ([6, 3, 7, 1, 2, 4], 3, 6) » [3, 4, 6]

    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(6, 3, 7, 1, 2, 4));
    int min = 3;
    int max = 6;

    System.out.println(sortNumbersAscendingBetweenRange(numbers, min, max));

  }

  private static ArrayList<Integer> sortNumbersAscendingBetweenRange(ArrayList<Integer> numbers, int min, int max) {
    ArrayList<Integer> finalList = new ArrayList<>();

    for (int i = 0; i < numbers.size(); i++) {
      for (int j = i + 1; j < numbers.size(); j++) {
        int temp;
        if (numbers.get(i) > numbers.get(j)) {
          temp = numbers.get(i);
          numbers.set(i, numbers.get(j));
          numbers.set(j, temp);
        }
      }
      if (numbers.get(i) >= min && numbers.get(i) <= max){
        finalList.add(numbers.get(i));
      }
    }
    return finalList;
  }

//  private static ArrayList<Integer> sortNumbersAscendingBetweenRange(ArrayList<Integer> numbers, int min, int max) {
//    int temp;
//
//    for (int i = 0; i < numbers.size(); i++) {
//      for (int j = i + 1; j < numbers.size(); j++) {
//        if (numbers.get(i) > numbers.get(j)) {
//          temp = numbers.get(i);
//          numbers.set(i, numbers.get(j));
//          numbers.set(j, temp);
//        }
//      }
//    }
//
//    ArrayList<Integer> finalList = new ArrayList<>();
//    for (int i = 0; i < numbers.size(); i++) {
//      if (numbers.get(i) >= min && numbers.get(i) <= max) {
//        finalList.add(numbers.get(i));
//      }
//    }
//    return  finalList;
//  }
}
