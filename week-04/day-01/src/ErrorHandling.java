import java.util.Scanner;

public class ErrorHandling {
    public static void main(String[] args) {
        System.out.println("Give me the number: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        try {
            int result = 10/number;
            System.out.println(result);
        }
        catch (ArithmeticException zero){
            System.out.println("you can not divide by zero");

        }


    }

}
