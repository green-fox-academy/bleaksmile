public class ArrayExample {
    public static void main(String[] args) {
        int john = 2;
        int jane =3;

        int[] numbers = new int[10];
        System.out.println(numbers.toString());
        System.out.println(numbers);
        System.out.println(numbers[0]);
        numbers[9] = 7;
        System.out.println(numbers[9]);
        int[] copyOfNumbers = numbers;

        System.out.println(numbers.length);
        final  boolean[] booleans = new boolean[2];
        booleans[0] = true;


    }

}
