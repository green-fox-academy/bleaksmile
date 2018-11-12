import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TicTacToe {

    public static void main(String[] args) {
        // Write a function that takes a filename as a parameter
        // The file contains an ended Tic-Tac-Toe match
        // We have provided you some example files (draw.txt, win-x.txt, win-o.txt)
        // Return "X", "O" or "Draw" based on the input file

        System.out.println(ticTacResult("win-o.txt"));
        // Should print "O"

        System.out.println(ticTacResult("win-x.txt"));
        // Should print "X"

        System.out.println(ticTacResult("draw.txt"));
        // Should print "Draw"
    }


    public static char[][] convertToCharMat(String fileName) {
        List<String> lines = new ArrayList<>();
        char[][] characters = new char[3][3];
        try {
            Path filePath = Paths.get(fileName);
            lines = Files.readAllLines(filePath);
        } catch (IOException exep) {
            exep.printStackTrace();
        }

        for (int i = 0; i < lines.size(); i++) {
            for (int j = 0; j < lines.get(i).length(); j++) {
                characters[i][j] = lines.get(i).charAt(j);
            }
        }
        return characters;

    }
    public static String ticTacResult (String filename){
        char [] [] charMatrix = convertToCharMat(filename);
        if ((charMatrix[1][1] == charMatrix [0][0]) && (charMatrix [1][1] == charMatrix[2][2])){
           return charMatrix [1][1] + "";
        }
        if ((charMatrix[1][1] == charMatrix [0][2]) && (charMatrix [1][1] == charMatrix[2][0])){
            return charMatrix [1][1] + "";
        }
        for (int i = 0; i <charMatrix.length ; i++) {
            if (charMatrix[i][0]==charMatrix[i][1] && charMatrix[i][0]== charMatrix[i][2]){
                return charMatrix[i][0] + "";
            }

        }
        for (int j = 0; j <charMatrix.length ; j++) {
            if (charMatrix[0][j] == charMatrix[1][j] && charMatrix[0][j] == charMatrix[2][j]) {
                return charMatrix[0][j] + "";
            }
        }

        return "Draw";
    }
}
