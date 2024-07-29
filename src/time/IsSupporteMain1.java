package time;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class IsSupporteMain1 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        boolean supported = now.isSupported(ChronoField.SECOND_OF_MINUTE);
        System.out.println(supported);

        if(supported) {

        }
    }
}
