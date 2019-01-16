import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SwearWords {

  public static void main(String[] args) {
    String fileName = "content.txt";
    ArrayList<String> offensiveWords = new ArrayList<>(Arrays.asList("fuck", "bloody", "cock", "shit", "fucker", "fuckstick", "asshole", "dick", "piss"));
    System.out.println(familyFriendlizer("content.txt", offensiveWords)); // should print out 17
  }

  public static ArrayList<String> readFile(String fileName) {
    Path filePath = Paths.get("src/" + fileName);
    List<String> lines = new ArrayList<>();
    try {
      lines = Files.readAllLines(filePath);
    } catch (IndexOutOfBoundsException io) {
      System.out.println("Sorry, file is not found");
    } catch (IOException e) {
      e.printStackTrace();
    }
    return (ArrayList<String>) lines;
  }

  public static ArrayList<String> splitLines(ArrayList<String> lines) {
    ArrayList<String> splitLinesAL = new ArrayList<>();

    for (int i = 0; i < lines.size(); i++) {
      String[] splitLinesA = lines.get(i).split(" |\\.|\\,");
      for (int j = 0; j < splitLinesA.length; j++) {
        splitLinesAL.add(splitLinesA[j]);
      }
    }
    return splitLinesAL;
  }

  public static ArrayList<String> removeOffensiveWords(ArrayList<String> splitLinesAL, ArrayList<String> offensiveWords) {
    ArrayList<String> removedOffensiveWords = new ArrayList<>();

    for (int i = 0; i < splitLinesAL.size(); i++) {
      for (int j = 0; j < offensiveWords.size(); j++) {
        if (splitLinesAL.get(i).equalsIgnoreCase(offensiveWords.get(j))) {
          removedOffensiveWords.add(splitLinesAL.get(i));
        }
      }
    }
    return removedOffensiveWords;
  }

  public static int familyFriendlizer(String filename, ArrayList<String> offensiveWords) {
    ArrayList<String> lines = readFile(filename);
    ArrayList<String> splitLinesAL = splitLines(lines);
    ArrayList<String> removedOffensiveWords = removeOffensiveWords(splitLinesAL, offensiveWords);

    return removedOffensiveWords.size();
  }
}
