package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class TestAdjusters {
    public static void main(String[] args) {
        int year = 2024;
        int month = 1;

        LocalDate date = LocalDate.of(year, month, 1);
        DayOfWeek first = date.getDayOfWeek();
        LocalDate lastDayOfWeek = date.with(TemporalAdjusters.lastDayOfMonth());
        lastDayOfWeek.getDayOfWeek();
        System.out.println(first);
        System.out.println(lastDayOfWeek);


    }
}
