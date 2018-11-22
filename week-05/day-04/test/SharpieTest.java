import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SharpieTest {
  Sharpie mySharpie;

  @BeforeEach
  void setup() {
    mySharpie = new Sharpie("blue", 9f);
  }

  @Test
  void checkUsage() {
    assertEquals(90, mySharpie.use());
  }

  @Test
  void testInkAmount() {
    assertEquals(100, Sharpie.getInkAmount());
  }
}