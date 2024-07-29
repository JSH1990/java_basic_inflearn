package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

public class GetTimeMain {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(2020, 10, 10, 10, 10, 59);
        System.out.println(dt.get(ChronoField.YEAR));
        System.out.println(dt.get(ChronoField.MONTH_OF_YEAR));
        System.out.println(dt.get(ChronoField.DAY_OF_MONTH));
        System.out.println(dt.get(ChronoField.HOUR_OF_DAY));
        System.out.println(dt.get(ChronoField.MINUTE_OF_HOUR));
        System.out.println(dt.get(ChronoField.SECOND_OF_MINUTE));
        System.out.println();
        System.out.println(dt.getYear());
        System.out.println(dt.getMonthValue());
        System.out.println(dt.getDayOfMonth());
        System.out.println(dt.getDayOfWeek());
        System.out.println(dt.getDayOfYear());
        System.out.println(dt.getSecond());
        System.out.println();
        System.out.println(dt.get(ChronoField.MINUTE_OF_DAY));
    }
}
