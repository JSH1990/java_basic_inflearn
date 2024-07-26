package time;

import java.time.LocalDate;
import java.time.Period;

public class PeriodMain {
    public static void main(String[] args) {
        Period period = Period.ofDays(10);
        System.out.println(period);

        LocalDate localDate = LocalDate.of(2030, 1, 1);
        LocalDate plus = localDate.plus(period);;
        System.out.println(plus);

        LocalDate startDate = LocalDate.of(2030, 1, 1);
        LocalDate endDate = LocalDate.of(2030, 12, 31);
        Period between = Period.between(startDate, endDate);
        System.out.println(between.getDays() +" " +between.getMonths());
    }
}
