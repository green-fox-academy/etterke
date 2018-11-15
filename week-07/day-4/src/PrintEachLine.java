import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

public class PrintEachLine {
  public static void main(String[] args) {
    // Write a program that opens a file called "my-file.txt", then prints
    // each of the lines form the file.
    // If the program is unable to read the file (for example it does not exists),
    // then it should print an error message like: "Unable to read file: my-file.txt"
    Path filePathRel = Paths.get("src/my-file.txt");
    Path filePathAbs = Paths.get("/Users/eszternagy/greenfox/etterke/week-07/day-4/src/my-file.txt");

    List<String> lines = null;

    try {
      lines = Files.readAllLines(filePathAbs);
    } catch (IOException e) {
      System.out.println("Something went very wrong!!!");
    }

    for (String line : lines) {
      System.out.println(line);
    }

    System.out.println("The program runs smoothly");

  }
}
