import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class WriteMultipleLines {
  public static void main(String[] args) {
    String filePath = "src/apple.txt";
    String wordInput = "apple";
    int numberOfLines = 5;

    writeAFile(filePath, wordInput, numberOfLines);

  }

  public static void writeAFile(String path, String word, int lines ) {
    Path filePathRel = Paths.get(path);
    List<String> content = new ArrayList<>();

    try {
      for (int i = 0; i < lines; i++) {
        content.add(word);
        System.out.println(content.get(i));
      }
      Files.write(filePathRel, content);
    } catch (IOException IOe) {
      System.out.println(" ");
    }
  }
}
