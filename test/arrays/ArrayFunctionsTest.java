package arrays;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayFunctionsTest {
    private ArrayFunctions numbers = new ArrayFunctions();

    @Test
    public void largestNumberTest() {
        int[] arrLargestNumber = {5, 2, 10, 3, 7};
        numbers.setLargestNumber(arrLargestNumber);
        assertEquals(10, numbers.getLargestNumber());
    }

    @Test
    public void anotherLargestNumberTest() {
        int[] arrLargestNumber = {15, 2, 10, 3, 7};
        numbers.setLargestNumber(arrLargestNumber);
        assertEquals(15, numbers.getLargestNumber());
    }

    @Test
    public void negativeLargestNumberTest() {
        int[] arrLargestNumber = {-4, -2, -1, -6, -8};
        numbers.setLargestNumber(arrLargestNumber);
        assertEquals(-1, numbers.getLargestNumber());
    }

    @Test
    public void listReversalTest() {
        int[] arrList = {1, 2, 3, 4, 5};
        int[] arrlistReverse = {5, 4, 3, 2, 1};
        assertArrayEquals(arrlistReverse, numbers.checkReversal(arrList));
    }

    @Test
    public void elementExitInAListTest() {
        int[] arrList = {3, 6, 1, 2, 7};
        assertTrue(numbers.checkElementExit(arrList, 7));
    }

    @Test
    public void elementDoesNotExitInAListTest() {
        int[] arrList = {3, 6, 1, 2, 7};
        assertFalse(numbers.checkElementExit(arrList, 5));
    }

    @Test
    public void elementOccursInAListTest() {
        int[] arrList = {3, 6, 1, 2, 7};
        int[] expList = {6, 2};
        assertArrayEquals(expList, numbers.oddPosition(arrList));
    }
}