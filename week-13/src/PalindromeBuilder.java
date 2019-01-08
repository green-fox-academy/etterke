import java.util.Scanner;

public class PalindromeBuilder {

  public static void main(String[] args) {

    Scanner scannerString = new Scanner(System.in);
    System.out.println("Please, enter a word: ");
    String input = scannerString.nextLine();

    System.out.println(CreatePalimdrome(input));
  }

  private static String CreatePalimdrome(String a) {

    char[] palindromeBeginning = a.toCharArray();
    char[] palindromeEnd = new char[palindromeBeginning.length];

    for (int i = 0; i < palindromeEnd.length; i++) {
      palindromeEnd[i] = palindromeBeginning[palindromeBeginning.length - 1- i];
    }
    String palindrome = a + String.valueOf(palindromeEnd);
    return  palindrome;
  }
}
