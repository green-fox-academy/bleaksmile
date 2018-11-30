package NthElement;

public class NthElement {

  public static double nthElementAvg(int[] numbers, int n) {
    double counter = 0;
    double sum = 0;
    int position = n;
    if (numbers.length >= n) {
      for (int i = 0; i < numbers.length; i++) {
        if (i == position - 1) {
          counter++;
          sum += numbers[i];
          position += n;
        }
      }
      return sum / counter;
    } else {
      return 0;
    }
  }
}
