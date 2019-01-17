import java.util.ArrayList;

public class AddStrings {

  public static void main(String[] args) {

//    Írj egy functiont, ami ha kap két szöveget, visszadja a betűnként összefésült új szöveget. Pl: alma, traktor » atlrmaaktor

    String firstWord = "alma";
    String secondWord = "traktor";

    System.out.println(put2and2together(firstWord, secondWord));
    System.out.println(put2and2together2(firstWord, secondWord));
  }

  private static String put2and2together(String firstWord, String secondWord) {
    String twoWordCombined = new String();

    for (int i = 0; i < (Math.min(firstWord.length(), secondWord.length())); i++) {
      twoWordCombined += String.valueOf(firstWord.charAt(i)) + String.valueOf(secondWord.charAt(i));
    }
    return twoWordCombined;
  }

  private static String put2and2together2(String firstWord, String secondWord) {
    String twoWordsCombined2 = new String();

    if(firstWord.length() >= secondWord.length()){
      for(int i = 0; i < firstWord.length(); i++){
        twoWordsCombined2 += String.valueOf(firstWord.charAt(i)) + String.valueOf(secondWord.charAt(i));
      }
    } else if (secondWord.length() >= firstWord.length()) {
      for(int i = 0; i < secondWord.length(); i++){
        if(i < firstWord.length()){
          twoWordsCombined2 += firstWord.charAt(i);
        }
        twoWordsCombined2 += secondWord.charAt(i);
      }
    }
    return twoWordsCombined2;
  }
}
