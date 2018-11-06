import java.util.ArrayList;
import java.util.Scanner;

public class Calculator {
    public static void main(String... args) {
        // Create a simple calculator application which reads the parameters from the prompt and prints the result to the prompt.
        // It should support the following operations,
        // create a method named "calculate()":
        // +, -, *, /, % and it should support two operands.
        // The format of the expressions must be: {operation} {operand} {operand}.
        // Examples: "+ 3 3" (the result will be 6) or "* 4 4" (the result will be 16)

        // You can use the Scanner class
        // It should work like this:

        // Start the program
        // It prints: "Please type in the expression:"
        // Waits for the user input
        // Print the result to the prompt
        // Exit
        System.out.println("Please type in the expression: ");
        Scanner input = new Scanner(System.in);
        String expression = input.nextLine();
        int k = calculate(expression);
        if (k !=-1){
            System.out.println(k);
        }
    }
    public static int calculate(String express){

        String [] splittedExpr = express.split(" ");
        int op1 = Integer.parseInt(splittedExpr[1]);
        int op2 = Integer.parseInt(splittedExpr[2]);
        int result;
        //for (int i = 0; i <splittedExpr.length ; i++) {

            if (splittedExpr[0].equals( "+")) {
                result = op1 + op2;
                return  result;
            } else if (splittedExpr[0].equals( "-")){
                result = op1-op2;
                return  result;
            } else if (splittedExpr[0].equals( "*")){
                result = op1*op2;
                return  result;
            } else if (splittedExpr[0].equals( "/")) {
                result = op1 / op2;
                return result;
            } else {
                System.out.println("If you are too stupid to add a correct expression, you don't deserve to use my calculator.");
            }
        //}
        return -1;

    }
}
