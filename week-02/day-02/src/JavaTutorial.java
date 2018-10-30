
import java.util.Arrays;

public class JavaTutorial {
    public static void main(String[] args) {
        int k=0;
        while(k<=61){
            System.out.print("-");
            k++;
        }
        System.out.println();

        String multiArray[][] = new String [10][10] ;
        for (int i =0; i<multiArray.length; i++){
            for (int j=0; j<multiArray[i].length; j++ ) {

                multiArray[i][j] = i + " " +j;
            }
        }

        for (int i =0; i<multiArray.length; i++){
            for (int j=0; j<multiArray[i].length; j++ ) {

                System.out.print("| " + multiArray[i][j] + " ");
            }
            System.out.print("|");
            System.out.println("\n");
        }
    }




}




