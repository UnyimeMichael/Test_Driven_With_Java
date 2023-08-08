package tdd;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EvenPositionTest {
    EvenPosition evenPosition = new EvenPosition();
    @Test
    public void evenPositionTest(){
//        given
        int[] array = {3, 2, 4, 6, 5, 7, 9, 8};
//        when
        int[] evenNumPosition = evenPosition.evenPositionIdentifier(array);
        assertEquals("[2, 6, 7, 8]", Arrays.toString(evenNumPosition));

    }
}
