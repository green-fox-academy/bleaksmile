public class Counter {
    // Write a recursive function that takes one parameter: n and counts down from n.
    public static void main(String[] args) {
        countDown(6);

    }

    public static void countDown(int n) {
        if (n == 0) {
            System.out.println(n);
        } else {
            System.out.println(n);
            countDown(n - 1);
        }
    }
}
