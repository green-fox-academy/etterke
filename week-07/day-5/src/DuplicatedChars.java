import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;

public class DuplicatedChars {
  public static void main(String[] args) {
    Path file = Paths.get("src/duplicated-chars.txt");
    ArrayList<String> fileContent = new ArrayList<>();

    try {
      fileContent = (ArrayList<String>)Files.readAllLines(file);
    } catch (IOException iOe) {
      System.out.println("Something is wrong with the file");
    }

    decryptDoubleChars(fileContent);
  }

  public static String[] decryptDoubleChars(ArrayList content) {
    ArrayList<String> decryptedList = new ArrayList<>();

    for (int i = 0; i < content.size(); i++) {
      String originalLines = (String) content.get(i);
      String decrypted = originalLines.replaceAll("(.)\\1+", "$1");
      decryptedList.add(decrypted);
    }
    String[] decryptedString = new String[decryptedList.size()];

    for (int i = 0; i < decryptedList.size(); i++) {
      decryptedString[i] = decryptedList.get(i);
      System.out.println(decryptedString[i]);
    }
    return decryptedString;
  }
}
