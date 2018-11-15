public class MatReview {
    public static void main(String[] args) {
        //thisIsRecursive();
        System.out.println(factorial(3));

    }

    private static void thisIsRecursive() {
        System.out.println("recursion!");
        thisIsRecursive();

    }

    public static int factorial(int n) {
        System.out.println("n value is " + n);
        if (n == 1) {
            return 1;
        } else {
            return  n* factorial(n-1);
        }
    }
}
