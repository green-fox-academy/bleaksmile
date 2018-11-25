import jdk.nashorn.internal.parser.Scanner;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

class CowsAndBullsTest {

  CowsAndBulls game;

  @Test
  void constructorTest() {
    game = new CowsAndBulls();
    assertEquals(0, game.guessCounter);
    assertEquals(false, game.finished);
    assertEquals(true, game.playing);
  }


  @Test
  void testScanner() {
    game = new CowsAndBulls();
    int input = 1245;
    InputStream in = new ByteArrayInputStream(input)
    assertEquals(1234, game.askUser());

  }


/*  @Test
  void testExepction() throws Exception {
    game = new CowsAndBulls();
    assertThrows(Exception.class, () -> {
      game.checkTheDigits(game.goalToGuess);
    });
  }*/

  @Test
  void areEgualsTester() {
    game = new CowsAndBulls();
    assertEquals(1234, game.goalToGuess);
  }
}