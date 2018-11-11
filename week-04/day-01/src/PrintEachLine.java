import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.nio.file.*;
import java.util.Iterator;
import java.util.List;

public class PrintEachLine {
    public static void main(String[] args) {

        try {
            Path filePath = Paths.get("my_file.txt");
            List<String> lines = Files.readAllLines(filePath);
            for (String line: lines) {
                System.out.println(line);
            }
        }catch (Exception e){
            System.out.println("the file does not exist");
        }
    }
}
