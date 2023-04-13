package cozulensorular;

import java.util.Scanner;

public class BirCumledeBirHarfKacKereKullanilmistir {
    public static void main(String[] args) {
        /*
         * Kullanicidan bir cumle ve bir harf alin,
         * Cumlede harfin kac kere
         * kullanildigini bulup, yazdirin
         *
         * ORNEK:
         *
         * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e
         *
         * OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
         */

        Scanner input=new Scanner(System.in);
        System.out.println("lütfen cümlenizi yazınız");
        String cumle=input.nextLine();
        System.out.println("sayısını bulmak istediğiniz harfi giriniz");
        String harf=input.next();

        System.out.println(cumle);
        System.out.println(harf);

        String arr[]=cumle.split("");
        int counter=0;

        for (String w:arr){
            if (w.equals(harf)){
                counter++;
            }
        }
        System.out.println(harf+" cumlede "+counter+" kez geçiyor");













    }
}
