package Sum;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyClassTest {

    MyClass myObject;

    @BeforeEach
    void setup() {
        //myObject = new MyClass();

    }

    @Test
    void addNumbersToTheList() {
        myObject = new MyClass();
        myObject.getIntegers().add(5);
        myObject.getIntegers().add(4);
        myObject.getIntegers().add(2);
        myObject.getIntegers().add(1);
        assertFalse(myObject.getIntegers().isEmpty());

    }

    @Test
    void sumNumbers() {
        myObject.getIntegers().add(5);
        myObject.getIntegers().add(4);
        myObject.getIntegers().add(2);
        myObject.getIntegers().add(1);
        assertEquals(12, myObject.sum(myObject.getIntegers()));

    }

    @Test
    void emptyList(){
        assertEquals(0,myObject.sum(myObject.getIntegers()));

    }

    @Test
    void oneElement(){
        myObject.getIntegers().add(5);
        assertEquals(5, myObject.sum(myObject.getIntegers()));
    }

    @Test
    void isNull(){
        assertNull(myObject);
    }
}