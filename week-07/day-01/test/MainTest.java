import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
@Test
  void threeForOne_TestCase1(){
  assertEquals(1,Main.threeForOne(3, 0.65));
}

  @Test
  void threeForOne_TestCase2(){
    assertEquals(0.65,Main.threeForOne(1, 0.65));
  }

  @Test
  void threeForOne_TestCase3(){
    assertEquals(2.30,Main.threeForOne(5, 0.65));
  }
}