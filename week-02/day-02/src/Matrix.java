import java.util.Scanner;

public class Matrix {
    // - Create (dynamically) a two dimensional array
    //   with the following matrix. Use a loop!
    //
    //   1 0 0 0
    //   0 1 0 0
    //   0 0 1 0
    //   0 0 0 1
    //
    // - Print this two dimensional array to the output

    public static void main(String[] args) {
        System.out.println("Add a number: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

         int [][] multiArray = new  int[number][number];

        for(int i=0; i<multiArray.length; i++){

            for(int j = 0; j<multiArray.length; j++){

                if (i==j) {
                    multiArray[i][j] = 1;
                }
                System.out.print(multiArray[i][j] + " ");
            }
            System.out.print("\n");
        }

    }

}
