import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class EncodedLines {
    public static void main(String[] args) {
        // Create a method that decrypts encoded-lines.txt

        decoded("encoded-lines.txt");
    }

    public static void decoded(String filename) {
        List<String> lines = new ArrayList<>();
        List<String> decodedArray = new ArrayList<>();
        try {
            Path filepath = Paths.get(filename);
            lines = Files.readAllLines(filepath);
        } catch (IOException except) {
            except.printStackTrace();
            System.out.println("file can not be read");
        }
        for (String line : lines) {
            StringBuilder decodedMessage = new StringBuilder(line);
            for (int i = 0; i < line.length(); i++) {
                int ascii = (int) line.charAt(i);
                if (ascii > 32) {
                    decodedMessage.setCharAt(i, (char) (ascii - 1));
                }
            }
            decodedArray.add(decodedMessage.toString());
        }
        try {
            Files.write(Paths.get("encoded-lines-solution.txt"), decodedArray);
        } catch (IOException excep) {
            excep.printStackTrace();
            System.out.println("file can not be written");
        }
    }
}
