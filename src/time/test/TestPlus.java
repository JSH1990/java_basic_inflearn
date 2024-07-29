package time.test;

import java.time.LocalDateTime;

public class TestPlus {
    public static void main(String[] args) {
        LocalDateTime dateTime= LocalDateTime.now();
        LocalDateTime futur = dateTime.plusYears(1).plusMonths(1).plusDays(1);
        System.out.println(futur);
    }
}
