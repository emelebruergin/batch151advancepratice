package cozulensorular;

import java.util.Scanner;

public class StringinSonIkiHarfininUcKopyasi {
    public static void main(String[] args) {
        //Kullanıcıdan bir isim girmesini isteyin ve son 2 harfinin 3 kopyasından oluşan yeni bir String yazdırın
        //
        //Kullanicidan alinan isim uzunluğu en az 2 olacaktır.
        //
        //INPUT   : Mustafa
        //
        //OUTPUT  : fafafa

        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir isim girin");
        String ss=input.next();
        String c="";
        for (int i=0;i<3;i++){
            String d=ss.substring(ss.length()-2);
            c+=d;
        }
        System.out.println(c);


    }
}
