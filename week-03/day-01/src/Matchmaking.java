import java.util.ArrayList;
import java.util.Arrays;

public class Matchmaking {
    public static void main(String... args){
        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve","Ashley","Claire","Kat","Jane"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe","Fred","Tom","Todd","Neef","Jeff", "bela", "Pista"));

        // Write a method that joins the two lists by matching one girl with one boy into a new list
        // Exepected output: "Eve", "Joe", "Ashley", "Fred"...

        System.out.println(makingMatches(girls, boys));
    }

    public static ArrayList<String> makingMatches(ArrayList<String> input1, ArrayList<String> input2) {
        int max = 0;
        if (input2.size() > input1.size()){
            max = input2.size();
        }else {
            max = input1.size();
        }

        ArrayList<String> output = new ArrayList<>();
        for (int i = 0; i <max ; i++) {
            if (input1.size()> i) {
                output.add(input1.get(i));
            }
            if (input2.size()>i) {
                output.add(input2.get(i));
            }
        }
        
        return output;
    }

}
