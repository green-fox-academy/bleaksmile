public class Summing {
    //  Create the usual class wrapper
    //  and main method on your own.

    // - Write a function called `sum` that sum all the numbers
    //   until the given parameter and returns with an integer
    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 12;
        int num3 = 64;
        int num4 = 31;

        System.out.println(sum(num1, num2, num3, num4));


    }
    public static int sum (int a, int b, int c, int d){
        int result = a + b + c + d;
        return result;

    }

}
