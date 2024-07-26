package time;

import java.time.LocalDate;

public class LocalDateMain {
    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.now();
        System.out.println(nowDate);
        LocalDate ofDate = LocalDate.of(2018, 1, 1); //불변이라 반환데이트
        System.out.println(ofDate);

        LocalDate date = ofDate.plusDays(10);
        System.out.println(date);
    }
}
