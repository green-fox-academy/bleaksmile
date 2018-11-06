import java.util.ArrayList;
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println("Give me a number: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if ((double)number == armstrong(number) ) {
            System.out.println("The " + number + " is an Armstrong number.");
        } else {
            System.out.println("The " + number + " is NOT an Armstrong number.");
        }
    }

    public static double armstrong(int a){
        String stringNum = a + "";
        int length = stringNum.length();
        ArrayList<String> stringArrayList = new ArrayList<>();
        for (int i = 0; i <length ; i++) {
            char letter = stringNum.charAt(i);
            stringArrayList.add(letter+"");

        }
        ArrayList <Integer> numbers = new ArrayList<>();

        for (int j = 0; j <stringArrayList.size() ; j++) {
            numbers.add(Integer.parseInt(stringArrayList.get(j)));

        }
        int result = 0;
        for (int k = 0; k <numbers.size() ; k++) {
            result += Math.pow(numbers.get(k), numbers.size());

        }

        return result;


    }
}
