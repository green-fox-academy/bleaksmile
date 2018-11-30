package NthElement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NthElementTest {
  int[] numbers = {2, 4, 10, 34, 3, 16, 3, 21};

  @Test
  void nthElementAvg_testWithN3() {
    assertEquals(13, NthElement.nthElementAvg((numbers),3));

  }
  @Test
  void nthElementAvg_testWithN2() {
    assertEquals(18.75, NthElement.nthElementAvg((numbers),2));

  }
  @Test
  void nthElementAvg_testWithN10() {
    assertEquals(0, NthElement.nthElementAvg((numbers),10));
  }
  @Test
  void nthElementAvg_testWithN8() {
    assertEquals(21, NthElement.nthElementAvg((numbers),8));
  }
}