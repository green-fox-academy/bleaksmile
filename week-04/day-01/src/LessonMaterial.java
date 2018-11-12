import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LessonMaterial {

    public static void main(String[] args) {
        Path filePath = Paths.get("hello.txt");
        try {
            List <String> lines = Files.readAllLines(filePath);
            System.out.println(lines);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("this block finally happened");
        }

    }
}
