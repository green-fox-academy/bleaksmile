import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Weather {

  public static void main(String[] args) {
    mostRainyCity("cities.csv");

  }

  public static void mostRainyCity(String filename){
    List<String> content = new ArrayList<>();
    List <String> cities = new ArrayList<>();
    try {
      Path filePath = Paths.get(filename);
      content = Files.readAllLines(filePath);
      for (String line: content){
        for(int i = 1; i<3; i++){
          cities.add(line.split(",")[i]);
        }
      }
      System.out.println(cities);

    } catch (IOException exception){
      exception.printStackTrace();
      System.out.println("Unable to read the file");
    }

  }
}
