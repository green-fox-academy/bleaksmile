import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;

public class SubInt {
    public static void main(String[] args) {
        //  Create a function that takes a number and a list of numbers as a parameter
        //  Returns the indeces of the numbers in the list where the first number is part of
        //  Returns an empty list if the number is not part any of the numbers in the list

        //  Example:
        System.out.println(subInt(1, new int[] {1, 11, 34, 52, 61}));
        //  should print: `[0, 1, 4]`
        System.out.println(subInt(9, new int[] {1, 11, 34, 52, 61}));
        //  should print: '[]'
    }

    public static ArrayList<Integer> subInt(int a, int[] array){
        ArrayList<String> splitArray = new ArrayList<>();

        for (int number : array) {
            splitArray.add("" + number);
        }
        String digit = Integer.toString(a);
        ArrayList <Integer> result = new ArrayList<>();
        for (int i = 0; i <splitArray.size() ; i++) {
           if (splitArray.get(i).contains(digit)){
                result.add(i);
            //System.out.println(splitArray[i] + " ");
            }
        }
       return result;

    }
}
