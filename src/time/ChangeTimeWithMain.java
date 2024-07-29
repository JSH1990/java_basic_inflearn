package time;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class ChangeTimeWithMain {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();

        LocalDateTime change1 = dt.withYear(2020);
        System.out.println(change1);

        LocalDateTime with = dt.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
        System.out.println(with);

        LocalDateTime with1 = dt.with(TemporalAdjusters.next(DayOfWeek.SUNDAY));
        System.out.println(with1);
    }
}
