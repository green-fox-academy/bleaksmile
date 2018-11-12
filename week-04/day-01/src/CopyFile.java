import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CopyFile {
    // Write a function that copies a file to an other
    // It should take the filenames as parameters
    // It should return a boolean that shows if the copy was successful
    public static void main(String[] args) {
        System.out.println(copy("hello.txt"));
    }
    public static boolean copy (String fileName){
        try {
            Path filePath = Paths.get(fileName);
            List <String> lines = Files.readAllLines(filePath);
            Files.copy(filePath, Paths.get("hello3.txt"));
            Files.write(Paths.get("hello2.txt") , lines);
            return true;
        } catch (Exception exception){
            exception.printStackTrace();
            return  false;
        }

    }

}
