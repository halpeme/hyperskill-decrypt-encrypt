import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Scanner;

class Time {

    int hour;
    int minute;
    int second;

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public static Time noon() {
        // write your code here
        Time time = new Time();
        time.setHour(12);
        time.setMinute(0);
        time.setSecond(0);
        return time;
    }

    public static Time midnight() {
        // write your code here
        Time time = new Time();
        time.setHour(0);
        time.setMinute(0);
        time.setSecond(0);
        return time;
    }

    public static Time ofSeconds(long seconds) {
        // write your code here
        Time time = new Time();
        LocalDateTime localDateTime = LocalDateTime.ofEpochSecond(seconds, 0, ZoneOffset.UTC);
        time.setSecond(localDateTime.getSecond());
        time.setMinute(localDateTime.getMinute());
        time.setHour(localDateTime.getHour());
        return  time;
    }

    public static Time of(int hour, int minute, int second) {
        Time time = new Time();
        if(hour >= 0 && hour <= 23){
            time.hour = hour;
        }else{ return null; }
        if (minute>= 0 && minute <= 59){
            time.setMinute(minute);
        }else{ return null; }

        if (second>= 0 && second <= 59){
            time.setSecond(second);
        }else{ return null; }
        // write your code here
        return time;
    }
}

/* Do not change code below */
public class Main {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final String type = scanner.next();
        Time time = null;

        switch (type) {
            case "noon":
                time = Time.noon();
                break;
            case "midnight":
                time = Time.midnight();
                break;
            case "hms":
                int h = scanner.nextInt();
                int m = scanner.nextInt();
                int s = scanner.nextInt();
                time = Time.of(h, m, s);
                break;
            case "seconds":
                time = Time.ofSeconds(scanner.nextInt());
                break;
            default:
                time = null;
                break;
        }

        if (time == null) {
            System.out.println(time);
        } else {
            System.out.println(String.format("%s %s %s", time.hour, time.minute, time.second));
        }
    }
}