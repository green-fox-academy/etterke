import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class WriteSingleLine {
  public static void main(String[] args) {

    Path filePathRel = Paths.get("src/my-name.txt");
    Path filePathAbs = Paths.get("/Users/eszternagy/greenfox/etterke/week-07/day-4/src/my-name.txt");

    List<String> lines = new ArrayList<>();
    lines.add("Eszter Nagy");

    try {
      Files.write(filePathAbs, lines);
      System.out.println(lines);
    } catch (IOException IOe) {
      System.out.println("Unable to write file: my-name.txt");
    }
  }
}
