package dsa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplicationMethodTest {
    @Test
    public void testTwoElementMultiplication(){
        MultiplicationMethod multiplicationMethod = new MultiplicationMethod();
        multiplicationMethod.multiplyElement(2, 4);
        multiplicationMethod.getMultipliedElement();
        assertEquals(8, multiplicationMethod.getMultipliedElement());
    }
}
