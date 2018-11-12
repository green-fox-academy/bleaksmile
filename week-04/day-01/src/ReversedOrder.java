import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedOrder {
    public static void main(String[] args) {
        // Create a method that decrypts reversed-order.txt
        reverseOrder("reversed-order.txt");
    }

    public static void reverseOrder(String filename) {
        List<String> lines = new ArrayList<>();
        try {
            Path filepath = Paths.get(filename);
            lines = Files.readAllLines(filepath);
        } catch (IOException excep) {
            excep.printStackTrace();
            System.out.println("the file can not be read");
        }
        List<String> reversedArray = new ArrayList<>();
        for (int i = 0; i < lines.size(); i++) {
            reversedArray.add(lines.get(lines.size() - 1 - i));

        }
        try {
            Files.write(Paths.get("revesed-order-solution.txt"), reversedArray);
        } catch (IOException excep) {
            excep.printStackTrace();
            System.out.println("the file can not be written");
        }

    }
}
