import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedLines {
    public static void main(String[] args) {
        // Create a method that decrypts reversed-lines.txt
       reverse("reversed-lines.txt");
    }

    public static void reverse(String filename) {
        List<String> lines = new ArrayList<>();
        try {
            Path filepath = Paths.get(filename);
            lines = Files.readAllLines(filepath);
        } catch (IOException exep) {
            exep.printStackTrace();
            System.out.println("file can not be read");
        }
        String reversed = "";
        List<String> reversedArray = new ArrayList<>();
        for (String line : lines) {
            for (int i = 0; i < line.length(); i++) {
                reversed += line.charAt(line.length() - 1 - i);

            }
            reversedArray.add(reversed);
            reversed = "";
        }

        try {
            Files.write(Paths.get("reversed-valid.txt"), reversedArray);
        } catch (IOException exep) {
            exep.printStackTrace();
            System.out.println("file can not be written");
        }
        System.out.println(reversedArray);
    }
}
