import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;


public class CopyFile {
  public static void main(String[] args) {
    String firstFile = "src/flowers.txt";
    String secondFile = "src/trees.txt";

    System.out.println("Successfully copied the content of the first file into the second one " + copyAFile(firstFile, secondFile));

  }

  public static boolean copyAFile(String file1, String file2) {
    Path file1Path = Paths.get(file1);
    Path file2Path = Paths.get(file2);

    try {
      Files.copy(file1Path, file2Path, StandardCopyOption.REPLACE_EXISTING);
      if (Files.readAllLines(file1Path).equals(Files.readAllLines(file2Path))) {
        return true;
      }
    } catch (IOException IOe) {
      System.out.println("File not found");
    }
    return false;
  }
}
