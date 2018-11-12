import java.util.Scanner;
import java.util.*;

public class AnagramArrayList {
    public static void main(String[] args) {

        Scanner string = new Scanner(System.in);
        System.out.println("Please write a word here: ");
        String input1 = string.nextLine();
        System.out.println("Please write another word, and I'll tell you if the two are anagrams: ");
        String input2 = string.nextLine();

        isAnagram(input1, input2);

    }

    public static void isAnagram(String firstWord, String secondWord) {
        char[] lettersOfFirstWord = firstWord.toCharArray();
        ArrayList<Character> lettersOfFirstWordAL = new ArrayList<>();
        for (int i = 0; i < lettersOfFirstWord.length; i++) {
            lettersOfFirstWordAL.add((char) i);
        }

        char[] lettersOfSecondWord = secondWord.toCharArray();
        ArrayList<Character> lettersOfSecondWordAL = new ArrayList<>();
        for (int j = 0; j < lettersOfSecondWord.length; j++) {
            lettersOfSecondWordAL.add((char) j);
        }

        if (lettersOfFirstWordAL.containsAll(lettersOfSecondWordAL)) {
            System.out.println("This is an anagram");
        } else {
            System.out.println("This is not an anagram");
        }
    }
}
