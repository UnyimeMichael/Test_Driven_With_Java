import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxAndMinNumberTest {
    MaxAndMinNumber maxAndMinNumber = new MaxAndMinNumber();
    @Test
    public void testForMaxNumber(){
        int maximumNumber = maxAndMinNumber.getMaxNumber(3,5,9);
        assertEquals(9,maximumNumber);
    }

    @Test
    public void testForMinNumber(){
        int minimumNumber = maxAndMinNumber.getMinNumber(2,6,9);
        assertEquals(2,minimumNumber);
    }
}
