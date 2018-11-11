import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class WriteMultipleLines {
// Create a function that takes 3 parameters: a path, a word and a number,
// than it should write to a file.
// The path parameter should be a string, that describes the location of the file.
// The word parameter should be a string, that will be written to the file as lines
// The number paramter should describe how many lines the file should have.
// So if the word is "apple" and the number is 5, than it should write 5 lines
// to the file and each line should be "apple"
// The function should not raise any error if it could not write the file.
    public static void main(String[] args) {
        multiLineWriter("random-text.txt", "apple", 6);

    }

    public static void multiLineWriter(String path, String word, int number) {
        try {
            ArrayList <String> arrayList = new ArrayList<>();
            for (int i = 0; i <number ; i++) {
                arrayList.add(word);
            }
            Path filepath = Paths.get(path);
            Files.write(filepath, arrayList);

        } catch (Exception e) {
            System.out.println("Could not write the file");
        }


    }
}
