import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountLettersTest {

  @Test
  void CountLetterTester(){
    assertEquals(3, CountLetters.letterCounter("alama").get("a"));

  }

}