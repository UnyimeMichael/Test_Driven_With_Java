package tdd;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OddPositionTest {
    OddPosition oddPosition = new OddPosition();
    @Test
    public void addTest () {
        int [] arrays = {2, 3, 4, 6, 7, 8};
        int [] oddNum = oddPosition.identifyOddPosition(arrays);
        assertEquals("[2, 4, 7]", Arrays.toString(oddNum) );



    }
}
