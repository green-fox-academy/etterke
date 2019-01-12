import java.util.ArrayList;
import java.util.Scanner;

public class PalindromeSearcher {

  public static void main(String[] args) {

    Scanner scannerString = new Scanner(System.in);
    System.out.println("Please, enter a word, that is at least 3 characters: ");
    String input = scannerString.nextLine();
    System.out.println(searchPalindrome(input));
  }

  private static boolean checkIfPalindrome(String input) {
    char[] word = input.toCharArray();

    for (int i = 0; i < word.length / 2; i++) {
      if (word[i] == word[word.length - i - 1]) {
        return true;
      } else {
        return false;
      }
    }
    return true;
  }

  private static ArrayList<String> searchPalindrome(String input) {
    ArrayList<String> result = new ArrayList<>();
    int minLength = 3;

    for (int i = 0; i < input.length() - minLength + 1; i++) {
      for (int j = i + minLength - 1; j < input.length(); j++) {
        String subString = input.substring(i, j);
        if (checkIfPalindrome(subString)){
          result.add(subString);
        }
      }
    }
    return result;
  }
}
