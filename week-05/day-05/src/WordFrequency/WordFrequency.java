package WordFrequency;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordFrequency {

  public static void main(String[] args) {
    //1. Write the selectWordsByFrequency method to find the needed words
    List<String> selectedWords = selectWordsByFrequency("input.txt", 4);
    System.out.println(selectedWords);
    //2. Write the saveSelectedWords method to save the selected words
    saveSelectedWords("output.txt", selectedWords);
  }

  private static void saveSelectedWords(String outputFileName, List<String> inputArray) {
    try {
      Files.write(Paths.get(outputFileName), inputArray);
    } catch (IOException exception) {
      exception.printStackTrace();
      System.out.println("Unable to write the file");
    }
  }

  public static List<String> selectWordsByFrequency(String filename, int frequency) {
    List<String> lines = new ArrayList<>();
    List<String[]> splittedList = new ArrayList<>();
    Map<String, Integer> mapOfFrequency = new HashMap<>();
    List<String> frequentWords = new ArrayList<>();
    try {
      Path filePath = Paths.get(filename);
      lines = Files.readAllLines(filePath);
      for (String line : lines) {
        splittedList.add(line.split("\\s+"));
      }
      for (String[] array : splittedList) {
        for (int i = 0; i < array.length; i++) {
          mapOfFrequency.put(array[i], mapOfFrequency.getOrDefault(array[i], 0) + 1);
        }
      }
      for (Map.Entry<String, Integer> words : mapOfFrequency.entrySet()) {
        if (words.getValue() == frequency) {
          frequentWords.add(words.getKey());
        }
      }
    } catch (
            IOException exeception) {
      exeception.printStackTrace();
      System.out.println("Unable to read the file");
    }
    return frequentWords;
  }
}
