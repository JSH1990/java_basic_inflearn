package time;

import java.time.ZoneId;
import java.util.Set;

public class ZoneIdMain {
    public static void main(String[] args) {
        for(String availableZoneId : ZoneId.getAvailableZoneIds())
            System.out.println(availableZoneId);
        ZoneId zoneId = ZoneId.of("America/Los_Angeles");
        System.out.println(zoneId.getRules());

        ZoneId zoneId1 = ZoneId.systemDefault();
        System.out.println(zoneId1);

    }
}
