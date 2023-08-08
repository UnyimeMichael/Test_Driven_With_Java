public class CurrentTimeMillis {
    public static void main(String[] args) {
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        long currentSeconds = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinutes = totalMinutes % 60;
        long totalHour = totalMinutes / 60;
        long currentHour = totalHour % 24;
        System.out.printf("The current GMT %d milliseconds elapsed since midnight, January 1, 1970 GMT is %d: %d: %d GMT%n", totalMilliseconds, currentHour, currentMinutes, currentSeconds);
    }
}
