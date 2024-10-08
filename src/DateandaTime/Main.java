package DateandaTime;

import java.time.*;

public class Main {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        System.out.println(instant);

        Instant customTimeStamp = Instant.ofEpochMilli(1718066969000L);
        System.out.println(customTimeStamp);

        OffsetDateTime nowUtc = OffsetDateTime.now();
        System.out.println(nowUtc);
        OffsetDateTime nowBangkok = OffsetDateTime.now(ZoneId.of("Asia/Bangkok"));
        System.out.println("nowBangkok "+nowBangkok);

        OffsetDateTime nowTokyo = OffsetDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println("nowTokyo "+nowTokyo);

        LocalDate currentDate = LocalDate.now();
        System.out.println("Current Date: " + currentDate);

        LocalTime currentTime = LocalTime.now();
        System.out.println("Current Time: " + currentTime);

        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current DateTime: " + currentDateTime);

        ZonedDateTime currentZoneDateTime = ZonedDateTime.now();
        System.out.println("Current ZonedDateTime: " + currentZoneDateTime);
    }
}
