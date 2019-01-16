import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Lottery {
  public static void main(String[] args) {
    String fileName = "lottery.txt";

    ArrayList<String> fileContent = readFile(fileName);
    System.out.println(getLotteryNumbers(fileContent));
    System.out.println(countFrequency(getLotteryNumbers(fileContent)));
    System.out.println(sortMap(countFrequency(getLotteryNumbers(fileContent))));
  }

  public static ArrayList<String> readFile(String file) {
    Path filePath = Paths.get("src/" + file);
    ArrayList<String> fileContent = new ArrayList<>();

    try {
      fileContent = (ArrayList<String>) Files.readAllLines(filePath);
    } catch (IOException iOe) {
      System.out.println("Something is wrong with the file");
    }
    return fileContent;
  }

  public static ArrayList<Integer> getLotteryNumbers(ArrayList<String> fileContent) {
    ArrayList<Integer> lotteryNumbers = new ArrayList<>();

    for (String lines : fileContent) {
      String[] winningNumbers = lines.split(";");
      for (int j = winningNumbers.length - 5; j < winningNumbers.length; j++) {
        lotteryNumbers.add(Integer.valueOf(winningNumbers[j]));
      }
    }
    return lotteryNumbers;
  }

  public static HashMap<Integer, Integer> countFrequency(ArrayList<Integer> numbers) {
    HashMap<Integer, Integer> mapping = new HashMap<>();

    for (int i = 0; i < numbers.size(); i++) {
      if (mapping.containsKey(numbers.get(i))) {
        int frequency = mapping.get(numbers.get(i));
        frequency++;
        mapping.put(numbers.get(i), frequency);
      } else {
        mapping.put(numbers.get(i), 1);
      }
    }
    return mapping;
  }

  public static HashMap<Integer, Integer> sortMap(HashMap<Integer, Integer> frequencies) {
    HashMap<Integer, Integer> topFive = new HashMap<>();
    int maxValue01 = 1;
    int maxValue02 = 1;
    int maxValue03 = 1;
    int maxValue04 = 1;
    int maxValue05 = 1;

    for (int i = 1; i < frequencies.size(); i++) {
      if (frequencies.get(i) > maxValue01) {
        maxValue01 = frequencies.get(i);
      } else if (frequencies.get(i) > maxValue02) {
        maxValue02 = frequencies.get(i);
      } else if (frequencies.get(i) > maxValue03) {
        maxValue03 = frequencies.get(i);
      } else if (frequencies.get(i) > maxValue04) {
        maxValue04 = frequencies.get(i);
      } else if (frequencies.get(i) > maxValue05) {
        maxValue05 = frequencies.get(i);
      }
    }
    System.out.println(maxValue01 + ", " + maxValue02 + ", " + maxValue03 + ", " + maxValue04 + ", " + maxValue05);


    for (Map.Entry<Integer, Integer> frequency : frequencies.entrySet()) {
      if (frequency.getValue() == maxValue01) {
        topFive.put(frequency.getKey(), maxValue01);
      } else if (frequency.getValue() == maxValue02) {
        topFive.put(frequency.getKey(), maxValue02);
      } else if (frequency.getValue() == maxValue03) {
        topFive.put(frequency.getKey(), maxValue03);
      } else if (frequency.getValue() == maxValue04) {
        topFive.put(frequency.getKey(), maxValue04);
      } else if (frequency.getValue() == maxValue05) {
        topFive.put(frequency.getKey(), maxValue05);
      }
    }
    return topFive;
  }
}
