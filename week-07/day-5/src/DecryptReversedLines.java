import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;

public class DecryptReversedLines {
  public static void main(String[] args) {
    Path file = Paths.get("src/reversed-lines.txt");
    ArrayList<String> fileContent = new ArrayList<>();

    try {
      fileContent = (ArrayList<String>) Files.readAllLines(file);
    } catch (IOException iOe) {
      System.out.println("Something is wrong with the file");
    }
    decryptReversedLines(fileContent);
  }

  public static void decryptReversedLines(ArrayList content) {
    ArrayList<String> decryptedLines = new ArrayList<>();

    StringBuilder corrected = new StringBuilder((CharSequence) decryptedLines);

    System.out.println(corrected.reverse().toString());
  }
}
