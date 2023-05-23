package tdd;

public class Ac {

    private boolean isOn;
    private int temperature = 18;

    public boolean isOn() {
        return isOn;
    }

    public void toggleOn() {
        isOn = !isOn;
    }

    public void increaseTemperature() {
        if (temperature < 18) temperature = 18;
        temperature = temperature + 1;
    }

    public int getTemperature() {
        return temperature;
    }

    public void decreaseTemperature(int temperature) {
        if(temperature > 30) temperature = 30;
        temperature = temperature - 1;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

}
