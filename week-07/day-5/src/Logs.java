import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;


public class Logs {
  public static void main(String[] args) {
    Path file = Paths.get("src/log.txt");
    ArrayList<String> fileContent = new ArrayList<>();

    try {
      fileContent = (ArrayList<String>)Files.readAllLines(file);
    } catch (IOException iOe) {
      System.out.println("Something is wrong with the file");
    }
    findUniqueIPAddress(fileContent);
    System.out.println(countGetPostRatio(fileContent));
  }


  public static String[] findUniqueIPAddress(ArrayList content) {
    ArrayList<String> ipAddresses = new ArrayList<>();

    for (int i = 0; i < content.size(); i++) {
      String lines = (String) content.get(i);
      String[] splitLines = lines.split(" ");
      ipAddresses.add(splitLines[8]);
    }
    for (int i = 0; i <= ipAddresses.size() - 2; i++) {
      for (int j = i + 1; j <= ipAddresses.size() - 1; j++) {
        if (ipAddresses.get(j).equals(ipAddresses.get(i))){
          ipAddresses.remove(j);
          j--;
        }
      }
    }

    String[] uniqueIPaddresses = new String[ipAddresses.size()];

    for (int i = 0; i < ipAddresses.size(); i++) {
      uniqueIPaddresses[i] = ipAddresses.get(i);
      System.out.println(uniqueIPaddresses[i]);
    }
    return uniqueIPaddresses;
  }

  public static double countGetPostRatio(ArrayList content) {
    double getCount = 0;
    double postCount = 0;
    ArrayList<String> getPostValue = new ArrayList<>();

    for (int i = 0; i < content.size(); i++) {
      String lines = (String) content.get(i);
      String[] splitLines = lines.split(" ");
      getPostValue.add(splitLines[11]);
    }

    for (int j = 0; j < getPostValue.size(); j++) {
      if (getPostValue.get(j).equalsIgnoreCase("get")) {
        getCount++;
      } else {
        postCount++;
      }
    }

    double resultRatio = getCount / postCount;
    return resultRatio;
  }
}
