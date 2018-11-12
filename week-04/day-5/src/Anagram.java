import java.util.*;

public class Anagram {

    public static void main(String[] args) {

        Scanner string = new Scanner(System.in);
        System.out.println("Please write a word here: ");
        String input1 = string.nextLine();
        System.out.println("Please write another word, and I'll tell you if the two are anagrams: ");
        String input2 = string.nextLine();

        System.out.println(isAnagram(input1, input2));

    }

    public static boolean isAnagram(String firstWord, String secondWord) {
        char[] lettersOfFirstWord = firstWord.toCharArray();
        char[] lettersOfSecondWord = secondWord.toCharArray();

        for (int i = 0; i < lettersOfFirstWord.length; i++) {
            for (int j = 0; j < lettersOfFirstWord.length; j++) {
                if (lettersOfFirstWord[i] > lettersOfFirstWord[j]) {
                    char swap = lettersOfFirstWord[i];
                    lettersOfFirstWord[i] = lettersOfFirstWord[j];
                    lettersOfFirstWord[j] = swap;
                }
            }
            
        }

        for (int k = 0; k < lettersOfSecondWord.length; k++) {
            for (int l = 0; l < lettersOfSecondWord.length; l++) {
                if (lettersOfSecondWord[k] > lettersOfSecondWord [l]) {
                    char swap2 = lettersOfSecondWord[k];
                    lettersOfSecondWord[k] = lettersOfSecondWord[l];
                    lettersOfSecondWord[l] = swap2;
                }
            }

        }

        boolean result = Arrays.equals(lettersOfFirstWord, lettersOfSecondWord);

        return result;
    }
}
