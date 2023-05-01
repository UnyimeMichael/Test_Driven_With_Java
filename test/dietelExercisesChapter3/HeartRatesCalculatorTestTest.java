package dietelExercisesChapter3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeartRatesCalculatorTestTest {
    HeartRatesCalculatorTest heartRatesCalculatorTest = new HeartRatesCalculatorTest("Adeyemi", "Ajao", "13-April-1978");
    @Test
    public void heartRatesCalculatorTestTest() {
        assertNotNull(heartRatesCalculatorTest);
    }

    @Test
    public void testGetFirstNameTest(){
        String name = heartRatesCalculatorTest.getFirstName();
        assertEquals("Adeyemi", name);
    }

    @Test
    public void testGetLastName(){
        String name = heartRatesCalculatorTest.getLastName();
        assertEquals("Ajao", name);
    }

    @Test
    public void testGetDateOfBirth(){
        String date = heartRatesCalculatorTest.getDateOfBirth();
        assertEquals("13-April-1978", date);
    }

    @Test
    public void testSetFirstName(){
        heartRatesCalculatorTest.setFirstName("Banny");
        String name = heartRatesCalculatorTest.getFirstName();
        assertEquals("Banny", name);
    }

    @Test
    public void testSetLastName(){
        heartRatesCalculatorTest.setLastName("Ebusky");
        String name = heartRatesCalculatorTest.getLastName();
        assertEquals("Ebusky", name);
    }

    @Test
    public void testSetDateOfBirth(){
        heartRatesCalculatorTest.setDateOfBirth("1-December-2005");
        String date = heartRatesCalculatorTest.getDateOfBirth();
        assertEquals("1-December-2005" , date);
    }

    @Test
    public void testOfAge() {
        heartRatesCalculatorTest.setDateOfBirth("03-Apr-1922");
        heartRatesCalculatorTest.getAge();
        assertEquals(101, heartRatesCalculatorTest.getAge());
    }



    }