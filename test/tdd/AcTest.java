package tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class AcTest {
    Ac mug = new Ac();


    @Test
    public void AcIsOn(){
        mug.toggleOn();
        mug.toggleOn();
        assertFalse(mug.isOn());
    }

    @Test
    public void getTemperature(){
        mug.setTemperature(18);
        assertEquals(18, mug.getTemperature());

    }
    @Test
    public void decreaseTemperatureBelow18(){
        mug.setTemperature(-10);
        assertEquals(18, mug.getTemperature());
    }
    @Test
    public void increaseTemperature(){
        mug.setTemperature(18);
        mug.increaseTemperature();
        mug.increaseTemperature();
        mug.increaseTemperature();
        assertEquals(21,mug.getTemperature());
    }
    @Test
    public void decreaseTemperature(){
        mug.toggleOn();
        mug.setTemperature(30);
        mug.decreaseTemperature();
        assertEquals(31,mug.getTemperature());
    }

}
