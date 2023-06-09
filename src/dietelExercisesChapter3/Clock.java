package dietelExercisesChapter3;

public class Clock {
    private int hour;
    private int minute;
    private int second;

    public Clock(int hour, int minute, int second) {
        if (hour < 0 || hour > 23) {
            this.hour = 0;
        }
        if (minute < 0 || minute > 59) {
            this.minute = 0;
        }
        if (second < 0 || second > 59) {
            this.second = 0;
        }
    }

    public void setHour(int hour) {
        if (hour < 0 || hour > 23){
            this.hour = 0;
        }
        else this.hour = hour;
    }

    public int getHour() {
        return hour;
    }

    public void setMinute(int minute) {
        if(minute < 0 || minute > 59){
            this.minute = 0;
        }
        else this.minute = minute;
    }

    public int getMinute() {
        return minute;
    }

    public void setSecond(int second) {
        if(second < 0 || second > 59) {
            this.second = 0;
        }
        else this.second = second;
    }

    public int getSecond() {
        return second;
    }
}
