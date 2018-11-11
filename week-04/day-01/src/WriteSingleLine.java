import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class WriteSingleLine {
    // Open a file called "my-file.txt"
    // Write your name in it as a single line
    // If the program is unable to write the file,
    // then it should print an error message like: "Unable to write file: my-file.txt"
    public static void main(String[] args) {
        ArrayList <String> content = new ArrayList<>();
        content.add("Eniko Tothova");
        try {
            Path filepath = Paths.get("new-file.txt");
            Files.write(filepath, content);
        }catch (Exception e){
            System.out.println("Unable to write file: my-file.txt");
        }
    }
}

