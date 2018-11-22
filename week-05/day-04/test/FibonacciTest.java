import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {
  Fibonacci testFibo;
  @BeforeEach
  void setUp() {
    testFibo = new Fibonacci();
  }

  @Test
  void fiboTester() {
    assertEquals(3, testFibo.fibonacci(4));
  }
}