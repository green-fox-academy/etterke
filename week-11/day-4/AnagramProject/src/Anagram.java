import java.util.ArrayList;

public class Anagram {

  public boolean isAnagram(String firstWord, String secondWord) {

    if (firstWord == null || secondWord == null) return false;
    if (firstWord.length() != secondWord.length()) return false;

    char[] lettersOfFirstWord = firstWord.toCharArray();
    ArrayList<Character> lettersOfFirstWordAL = new ArrayList<>();
    for (int i = 0; i < lettersOfFirstWord.length; i++) {
      lettersOfFirstWordAL.add(lettersOfFirstWord[i]);
    }

    char[] lettersOfSecondWord = secondWord.toCharArray();
    ArrayList<Character> lettersOfSecondWordAL = new ArrayList<>();
    for (int j = 0; j < lettersOfSecondWord.length; j++) {
      lettersOfSecondWordAL.add(lettersOfSecondWord[j]);
    }

    return lettersOfFirstWordAL.containsAll(lettersOfSecondWordAL);
  }
}
