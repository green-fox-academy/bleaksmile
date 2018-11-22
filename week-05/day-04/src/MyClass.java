import java.util.ArrayList;

public class MyClass {
    private ArrayList<Integer> integers = new ArrayList<>();

    public ArrayList<Integer> getIntegers() {
        return integers;
    }

    public int sum(ArrayList<Integer> inputList){
        int sum = 0;
        for (Integer number: inputList) {
            sum += number;
        }
        return sum;
    }
}
