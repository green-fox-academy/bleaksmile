import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Doubled {

    public static void main(String[] args) {
        // Create a method that decrypts the duplicated-chars.txt

        System.out.println(decrypt("duplicated-chars.txt"));
    }
    public static String decrypt (String filename){
        List <String> lines = new ArrayList<>();
        try {
            Path filepath = Paths.get(filename);
            lines = Files.readAllLines(filepath);
        } catch (IOException exeption){
            exeption.printStackTrace();
            System.out.println("File can not read");
        }
        List<String> singleCharacters = new ArrayList<>();
        String message = "";
        for (String line : lines) {
            for (int i = 0; i <line.length() ; i++) {
                if(i%2==0){
                    message+= line.charAt(i);
                }
            }
            singleCharacters.add(message);
            //singleCharacters.add("\n");
            message = "";
        }
        try {
            Files.write(Paths.get("decrypted-message.txt"), singleCharacters);
        } catch (IOException exep){
            exep.printStackTrace();
            System.out.println("File can not be written");
        }


        String decpryptedMessage = "";
        for (int j = 0; j <singleCharacters.size() ; j++) {
            decpryptedMessage += (singleCharacters.get(j));
        }
        return decpryptedMessage;
    }
}


