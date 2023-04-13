package cozulensorular;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateTimeYasadigiGunSayisi {

    // Ali'nin kaç gün yaşadığını bulan kodu yazınız.
    //Ali'nin doğum tarihi 12 Mayıs 2002'dir.
    public static void main(String[] args) {
        LocalDate myDate=LocalDate.of(2002,05,12);
        LocalDate now=LocalDate.now();
        long yasadigiGunSayisi= ChronoUnit.DAYS.between(myDate,now);
        System.out.println(yasadigiGunSayisi);
    }
}
