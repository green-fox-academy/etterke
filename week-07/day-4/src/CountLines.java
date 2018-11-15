import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

public class CountLines {
  public static void main(String[] args) {
    // Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.
    String nameOfFile = "my-file.txt";

    countNumberOfLines(nameOfFile);

  }

  public static int countNumberOfLines(String filename) {
    Path filePathRel = Paths.get("src/" + filename);
    Path filePathAbs = Paths.get("/Users/eszternagy/greenfox/etterke/week-07/day-4/src/" + filename);

    List<String> numberOfLines = null;
    int count = 0;

    try {
      numberOfLines = Files.readAllLines(filePathAbs);
      for (int i = 0; i < numberOfLines.size(); i++) {
        count++;
        System.out.println("Number of line in the file: " + count);
      }
    } catch (IOException IOe) {
      System.out.println("0");
    }
    return count;
  }
}
