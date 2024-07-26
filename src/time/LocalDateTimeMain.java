package time;

import java.time.LocalDateTime;

public class LocalDateTimeMain {
    public static void main(String[] args) {
        LocalDateTime nowDt = LocalDateTime.now();
        LocalDateTime ofDt = LocalDateTime.of(2016, 7, 17, 19 , 1);

        System.out.println(ofDt);

        System.out.println(nowDt.isBefore(ofDt));
    }
}
