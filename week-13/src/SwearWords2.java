import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class SwearWords2 {

  public static void main(String[] args) {
    // There is a not so family friendly text in the `content.txt`
    // Create a function named familyFriendlizer that takes a filename and a list of strings as parameters
    // and remove all the given words from the file and returns the amount of the removed words.

    ArrayList<String> offensiveWords = new ArrayList<> (Arrays.asList(
        "fuck", "bloody", "cock", "shit", "fucker", "fuckstick", "asshole", "dick", "piss"
    ));
    System.out.println(familyFriendlizer("content.txt", offensiveWords)); // should print out 17
  }

  private static String familyFriendlizer(String fileName, ArrayList<String> offensiveWords) {
    List<String> content = readContentFromFile(fileName);
    HashMap<String, Integer> swearWordFrequency = getWordFrequency(content, offensiveWords);
    String mostFrequentWord = getMostFrequentWord(swearWordFrequency);
    List<String> familyFriendlyContent = removeSwearWords(content, offensiveWords);
    writeContentToFile(familyFriendlyContent, fileName);
    return mostFrequentWord;
  }

  private static void writeContentToFile(List<String> familyFriendlyContent, String fileName) {
    Path path = Paths.get(fileName);
    try {
      Files.write(path, familyFriendlyContent);
    } catch (IOException e) {
      System.out.println("Unable to write file.");
    }
  }

  private static List<String> removeSwearWords(List<String> content, List<String> offensiveWords) {
    List<String> newContent = new ArrayList<>();

    for (String row : content) {
      String[] words = row.split(" ");
      List<String> newRow = new ArrayList<>();
      for (String word : words) {
        if (word.length() > 0 && (word.charAt(word.length() - 1) == '.' || word.charAt(word.length() - 1) == ',')) {
          if (offensiveWords.contains(word.substring(0, word.length() - 1).toLowerCase())) {
            int lastIndex = newRow.size() - 1;
            newRow.set(lastIndex, newRow.get(lastIndex) + word.substring(word.length() - 1));
          } else {
            newRow.add(word);
          }
        } else if (!offensiveWords.contains(word.toLowerCase())) {
          newRow.add(word);
        }
      }
      newContent.add(String.join(" ", newRow));
    }

    return newContent;
  }

  private static String getMostFrequentWord(HashMap<String, Integer> swearWordFrequency) {
    Map.Entry<String, Integer> mostFrequentWord = null;

    for (Map.Entry<String, Integer> wordOccurence : swearWordFrequency.entrySet()) {
      if (mostFrequentWord == null) {
        mostFrequentWord = wordOccurence;
      } else if (wordOccurence.getValue() > mostFrequentWord.getValue()) {
        mostFrequentWord = wordOccurence;
      }
    }

    return mostFrequentWord.getKey();
  }

  private static HashMap<String, Integer> getWordFrequency(List<String> content, ArrayList<String> offensiveWords) {
    HashMap<String, Integer> swearWordFrequency = new HashMap<>();

    for (String row : content) {
      String[] words = row.split(" |\\.|\\,|\\!|\\?|\\-");
      for (String word : words) {
//        if (word.charAt(word.length() - 1) == '.' || word.charAt(word.length() - 1) == ',') {
//          word = word.substring(0, word.length() - 1);

        word = word.toLowerCase();
        if (offensiveWords.contains(word)) {
          if (swearWordFrequency.get(word) == null) {
            swearWordFrequency.put(word, 1);
          } else {
            swearWordFrequency.put(word, swearWordFrequency.get(word) + 1);
          }
        }
      }
    }

    return swearWordFrequency;
  }

  private static List<String> readContentFromFile(String fileName) {
    Path filePath = Paths.get(fileName);
    List<String> content = new ArrayList<>();
    try {
      content = Files.readAllLines(filePath);
    } catch (IOException e) {
      System.out.println("Unable to read file");
    }
    return content;
  }

}