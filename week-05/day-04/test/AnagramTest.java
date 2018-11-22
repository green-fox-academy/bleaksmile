import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {

    Anagram myAnagram = new Anagram();

    @Test
    void anagramCheckTest(){
        assertTrue(myAnagram.anagramCheck("god", "dog"));

    }

}