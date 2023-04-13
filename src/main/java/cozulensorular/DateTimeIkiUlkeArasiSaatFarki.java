package cozulensorular;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class DateTimeIkiUlkeArasiSaatFarki {
    public static void main(String[] args) {
        // Japonya saat dilimi ile Almanya saat dilimi arasındaki saat farkını bulmak için kodu yazınız.
        LocalTime japonya=LocalTime.now(ZoneId.of("Asia/Tokyo"));
        LocalTime almanya=LocalTime.now(ZoneId.of("Europe/Berlin"));

        long fark= ChronoUnit.HOURS.between(almanya,japonya);
        System.out.println(fark);
    }
}
