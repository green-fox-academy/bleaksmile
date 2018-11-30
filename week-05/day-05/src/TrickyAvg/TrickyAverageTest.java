package TrickyAvg;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;;

public class TrickyAverageTest {
  /**
   * Write your test cases here. You should be able to invoke the method like this:
   * double result = TrickyAverage.getTrickyAvg(input);
   */
  int[] array1 = {1, 2, 3};
  int[] array2 = { 3,4,5,6};
  int[] array3 = {5, 2, 8, -1};
  double result = TrickyAverage.getTrickyAvg(array2);

  @Test
  public void getTrickyAvg_testCase1() {
    assertEquals(1.5,TrickyAverage.getTrickyAvg(array1));
  }

  @Test
  public void getTrickyAvg_testCase2() {
   assertEquals(4.5, result);
  }
  @Test

  public void getTrickyAvg_testCase3() {
    assertEquals(3.5, TrickyAverage.getTrickyAvg(array3));
  }
}