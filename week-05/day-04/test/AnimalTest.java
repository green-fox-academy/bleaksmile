import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {
  Animal myAnimal;

  @BeforeEach
  void setup(){
    myAnimal = new Animal();
  }

  @Test
  void eatTester(){
    assertEquals(49,myAnimal.eat());
  }

  @Test
  void drinkTester(){
    assertEquals(49,myAnimal.drink());
  }

  @Test
  void playTester(){
    myAnimal.play();
    assertEquals(51,myAnimal.hunger);
  }
  @Test
  void playTester2(){
    myAnimal.play();
    assertEquals(51,myAnimal.thirst);
  }



}