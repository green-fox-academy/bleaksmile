package Apples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppleTest {
    Apple green = new Apple();

    @Test
    void testingApple() {
        assertEquals("bigapple", green.getApple());

    }

}