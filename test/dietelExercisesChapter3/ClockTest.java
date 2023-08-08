package dietelExercisesChapter3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClockTest {
    //Given that I have a clock
    Clock clock = new Clock(67, 115 , 115);
    @Test
    public void hourTest(){
        //if I set the hour to a value greater than 23
        clock.setHour(22);
        //assert that hour = 0
        int hour = clock.getHour();
        assertEquals(22,hour);
    }
    @Test
    public void minutesTest(){
        clock.setMinute(23);
        clock.getMinute();
        assertEquals(23 , clock.getMinute());
    }

    @Test
    public void secondTest(){
        clock.setSecond(100);
        clock.getSecond();
        assertEquals(0, clock.getSecond());
    }
    @Test
    public void testIfHourIsGreaterThan24(){
        assertEquals(0,clock.getHour());
    }
    @Test
    public void testMinuteIsGreater60(){
        assertEquals(0, clock.getMinute());
    }
    @Test
    public void testSecondsIsGreaterThan60(){
        assertEquals(0,clock.getSecond());
    }
    @Test
    public void testMinuteForGetNegativeValue(){
        clock.setMinute(-20);
        assertEquals(0, clock.getMinute());

    }

}
