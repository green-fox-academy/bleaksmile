import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UnitestExampleTest {
    private UnitestExample unitestExample = new UnitestExample();

    @Test
    void addingNumbers() {
        int expectedresult = 4;
        int input1 = 2;
        int input2 = 2;
        assertEquals(expectedresult, unitestExample.addingNumber(input1, input2));
    }

}