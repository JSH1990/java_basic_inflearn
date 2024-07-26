package time;

import java.time.Duration;
import java.time.LocalTime;

public class DurationMain {
    public static void main(String[] args) {
        Duration duration = Duration.ofSeconds(10);
        System.out.println(duration);

        LocalTime it = LocalTime.of(1,0);
        System.out.println();

        LocalTime plus = it.plus(duration);
        System.out.println(plus);

        LocalTime start = LocalTime.of(1,0);
        LocalTime end = LocalTime.of(2,0);
        Duration d = Duration.between(start, end);
        System.out.println(d.getSeconds());
        System.out.println(d.toHours());
    }
}
