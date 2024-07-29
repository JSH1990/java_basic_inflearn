package time.test;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class TestLoopPlus {
    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2024, 1, 1);
        for(int i=0; i<10; i++){
            LocalDate nextDate = start.plus(2 * i, ChronoUnit.WEEKS);
            System.out.println(nextDate);
        }
    }
}
