public class HumanReadableTime {
    public static String makeReadable(int seconds) {
        final int SECONDS_PER_HOUR = 3600;
        final int SECONDS_PER_MINUTE = 60;

        int hours = seconds / SECONDS_PER_HOUR;
        seconds = seconds % SECONDS_PER_HOUR;
      
        int minutes = seconds / SECONDS_PER_MINUTE;
        seconds = seconds % SECONDS_PER_MINUTE;

        int secs = seconds;

        return String.format("%02d:%02d:%02d", hours, minutes, secs);
    }
}