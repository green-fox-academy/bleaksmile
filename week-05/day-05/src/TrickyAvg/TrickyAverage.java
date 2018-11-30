package TrickyAvg;

public class TrickyAverage {
  public static void main(String[] args) {
    int[] array1 = {1, 2, 3};
    int[] array2 = { 3,4,5,6};
    int[] array3 = {5, 2, 8, -1};
    int[] array4 = {2,5,7,9};


    System.out.println(getTrickyAvg(array1));
    System.out.println(getTrickyAvg(array2));
    System.out.println(getTrickyAvg(array3));
    System.out.println(getTrickyAvg(array4));
  }

  public static double getTrickyAvg(int[] inputArray) {
    double largestEven = 0;
    double smallestOdd = 0;
    for (int i = 0; i < inputArray.length; i++) {
      if (inputArray[i] % 2 == 0) {
        largestEven = inputArray[i];
        if (largestEven < inputArray[i]) {
          largestEven = inputArray[i];
        }
      } else {
        if (smallestOdd > inputArray[i]) {
          smallestOdd = inputArray[i];
        }
      }
    }
    return (largestEven+smallestOdd)/2.0;
  }

}
/**
 * Create and test a function called `getTrickyAvg` that takes a number array (only integers) as parameter
 * and returns the average of the smallest odd and largest even.
 * - use only basic control flow statements, like 'for', 'if', etc.
 * - do not use built-in methods like 'filter', 'forEach', 'map', etc.
 * - write test for 2 different scenarios (test file is provided: TrickyAverageTest.java)
 * <p>
 * Example cases:
 * [1, 2, 3] -> should return 1.5
 * [3, 4, 5, 6] -> should return 4.5
 * [5, 2, 8, -1] -> should return 3.5
 */



