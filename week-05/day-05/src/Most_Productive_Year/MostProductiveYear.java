package Most_Productive_Year;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class MostProductiveYear {

  public static void main(String[] args) {
    System.out.println(mostProductiveYear("paramount"));
  }

  public static String mostProductiveYear(String studio) {
    String filename = studio + ".csv";
    List<String> lines = new ArrayList<>();
    List<String> years = new ArrayList<>();
    try {
      Path filePath = Paths.get(filename);
      lines = Files.readAllLines(filePath);
    } catch (IOException exception) {
      exception.printStackTrace();
      System.out.println("Cannot find studio, please try again later.");
    }
    for (String line : lines) {
      years.add(line.split(",")[1]);
    }
    Map<String, Integer> mapOfYears = new HashMap<>();
    for (String year : years) {
      mapOfYears.put(year, mapOfYears.getOrDefault(year, 0) + 1);
      /*if (!mapOfYears.containsKey(year)) {
        mapOfYears.put(year, 1);
      } else {
        mapOfYears.put(year, mapOfYears.get(year) + 1);
      }
      */
    }
    //int mostFrequent = -1;
    String mostProdutiveYear = "";
 /*   for (Map.Entry<String, Integer> year : mapOfYears.entrySet()) {
      if (year.getValue() > mostFrequent) {
        mostFrequent = year.getValue();
        mostProdutiveYear = year.getKey();
      }

    }*/
    int maxValueInMap = (Collections.max(mapOfYears.values()));
    for (Map.Entry<String, Integer> entry : mapOfYears.entrySet()) {
      if (entry.getValue() == maxValueInMap) {
        mostProdutiveYear += entry.getKey()+ " ";
      }
    }
    return  studio + " has made the most movies in " + mostProdutiveYear;

  }

  /**
   * Write a method that helps you find the most productive year for a film studio.
   * The method should take one argument, which is the name of the film studio.
   * The method should try to open the related data file named `studioname`.csv,
   * which is a comma separated file with 3 columns: name of the movie, release year, director
   *
   *  - If we do not have any data about the studio, the method should return an error message.
   *  - If we have found data, the method should return an information message about the most productive year for that studio.
   *
   * Examples:
   *
   * If we call the method with 'marvel':
   * should return 'marvel has made the most movies in 2017.'
   *
   * If we call the method with 'ghibli':
   * should print 'Cannot find studio, please try again later.'
   *
   * Hint:
   *  - You can find some example files in this folder (marvel.csv and paramount.csv)
   *  - Most productive year: The year in which the studio has made the most movies.
   */

}