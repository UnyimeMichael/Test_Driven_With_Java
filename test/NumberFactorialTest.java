import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberFactorialTest {
        NumberFactorial number = new NumberFactorial();
    @Test
    public void numberFactorial(){

        number.NumberFactorial(-5);
        number.getNumberFactored();
        assertEquals(1 , number.getNumberFactored());

    }
}
