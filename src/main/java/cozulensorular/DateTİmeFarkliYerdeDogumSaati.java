package cozulensorular;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class DateTİmeFarkliYerdeDogumSaati {
    public static void main(String[] args) {
        // Mark 23.02.2018 tarihinde saat 15:25'te GMT ' de doğmuştur, Mark'ın Japonya'daki tam
        //doğum tarihi ve saati nedir?

        LocalDateTime tokyo=LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        LocalDateTime gmt=LocalDateTime.now(ZoneId.of("GMT"));
        long fark= ChronoUnit.HOURS.between(gmt,tokyo);

        LocalDateTime markTokyo=LocalDateTime.of(2018,02,23,15,25,0).minusHours(fark);
        System.out.println(markTokyo);
    }
}
