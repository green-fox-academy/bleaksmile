import java.util.Arrays;

public class Bubble {

    //  Create a function that takes a list of numbers as parameter
    //  Returns a list where the elements are sorted in ascending numerical order
    //  Make a second boolean parameter, if it's `true` sort that list descending

    //  Example:
    //System.out.println(bubble(new int[] {34, 12, 24, 9, 5});
    //  should print [5, 9, 12, 24, 34]
    // System.out.println(advancedBubble(new int[] {34, 12, 24, 9, 5}, true));
    //  should print [34, 24, 12, 9, 5]

    public static void main(String[] args) {

        System.out.println(bubble(new int[] {9, 12, 33, 1, 9, 5}));
        System.out.println(advancedBubble(new int[] {34, 12, 24, 9, 5}, true));
    }
    public static String bubble (int[] input){
        int temp;
        for (int i = 0; i < input.length-1 ; i++) {
            for (int j = 0; j <input.length-i-1 ; j++) {
                while (input[j] > input[j + 1]) {
                    temp = input[j];
                    input[j] = input[j + 1];
                    input[j + 1] = temp;

                }
            }
        }
        String sorted = Arrays.toString(input);

        return sorted;
    }

    public static String advancedBubble (int [] input, boolean bool){
        int temp;
        if (!bool) {
            for (int i = 0; i < input.length-1 ; i++) {
                for (int j = 0; j <input.length-i-1 ; j++) {
                    while (input[j] > input[j + 1]) {
                        temp = input[j];
                        input[j] = input[j + 1];
                        input[j + 1] = temp;
                    }
                }
            }

        } else {
            for (int i = 0; i < input.length-1 ; i++) {
                for (int j = 0; j <input.length-i-1 ; j++) {
                    while (input[j] < input[j + 1]) {
                        temp = input[j];
                        input[j] = input[j + 1];
                        input[j + 1] = temp;
                    }
                }
            }


        }
        String sorted = Arrays.toString(input);

        return sorted;

    }
}
