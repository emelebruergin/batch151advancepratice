package cozulensorular;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateTimeYasadigiAySayisi {

    // Ali'nin kaç ay yaşadığını bulan kodu yazınız.
    //Ali'nin doğum tarihi 4 Haziran 1997'dir.
    public static void main(String[] args) {
        LocalDate dgmtrhi=LocalDate.of(1997,06,4);
        LocalDate now=LocalDate.now();
        long month= ChronoUnit.MONTHS.between(dgmtrhi,now);
        System.out.println(month);
    }
}
