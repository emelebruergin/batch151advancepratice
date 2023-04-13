package cozulensorular;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class DateTimeFarkliYerelSaatDogumTarihSaatFarki {
    public static void main(String[] args) {
        // Ali 5 Şubat 2015 TRT 10:00'da İstanbul' da, Mark 5 Şubat 2015 12:00 EST' de ABD' de
        //doğmuştur. Ali'nin doğum saati ile Mark'ın doğum saati arasındaki saat cinsinden fark
        //nedir?

        LocalDateTime ali=LocalDateTime.of(2015,2,15,10,0,0);
        ZonedDateTime yerlAli=ali.atZone(ZoneId.of("Europe/Istanbul"));

        LocalDateTime mark=LocalDateTime.of(2015,2,5,12,0,0);
        ZonedDateTime yerelMArk=mark.atZone(ZoneId.of("America/New_York"));

        long fark= ChronoUnit.HOURS.between(yerelMArk,yerlAli);
        System.out.println(fark);
    }
}
