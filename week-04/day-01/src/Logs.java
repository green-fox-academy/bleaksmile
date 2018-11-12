import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Logs {

    // Read all data from 'log.txt'.
    // Each line represents a log message from a web server
    // Write a function that returns an array with the unique IP adresses.
    // Write a function that returns the GET / POST request ratio.

    public static void main(String[] args) {

        try {
            Path filepath = Paths.get("log.txt");
            List<String> lines = Files.readAllLines(filepath);
            System.out.println(uniqueIP(lines));
            System.out.println(ratio(lines));
        } catch (IOException exception) {
            exception.printStackTrace();
            System.out.println("file can not be read");
        }
    }

    public static List<String> uniqueIP (List<String> inputArray){
        int index =0;
        List <String> splittedArray = new ArrayList<>();
        for (int i = 0; i <inputArray.size() ; i++) {
            String ipAdress = inputArray.get(i).split("\\s+")[5];
            if (!splittedArray.contains(ipAdress))
           splittedArray.add(ipAdress);
        }

        return splittedArray;

    }
    public static double ratio(List<String> input){
        double getCounter = 0.0;
        double postCounter =0.0;
        double ratioNum = 0.0;
        ArrayList<String> getAndPost = new ArrayList<>();
        for (int i = 0; i <input.size() ; i++) {
            String message = input.get(i).split("\\s+")[6];
            getAndPost.add(message);
        }
        for (int i = 0; i <getAndPost.size() ; i++) {
            if (getAndPost.get(i).equals("GET")){
                getCounter ++;
            }
            else {
                postCounter ++;
            }
        }
        ratioNum = getCounter/postCounter ;

        return ratioNum;
    }

}
