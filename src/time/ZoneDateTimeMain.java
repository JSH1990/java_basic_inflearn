package time;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneDateTimeMain {
    public static void main(String[] args) {
        ZonedDateTime nowZdt = ZonedDateTime.now();
        System.out.println(nowZdt);

        LocalDateTime nowLDt = LocalDateTime.of(2030, 1, 1, 13, 30, 50);
        System.out.println(nowLDt);

        ZonedDateTime utcZdt = nowZdt.withZoneSameInstant(ZoneId.of("UTC"));
        System.out.println(utcZdt);
    }
}
