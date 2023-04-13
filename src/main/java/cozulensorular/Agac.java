package cozulensorular;

import java.util.Scanner;

public class Agac {
    public static void main(String[] args) {
        //  /*
        //         Agac sekli olusturmak icin, kullanicidan yaprak satir sayisini ve gövde satir sayisini ayrı ayrı
        //         sisteme girmesini isteyiniz.
        //         Asagıdaki agac seklini konsala yazdırınız
        //        ^
        //        ^^
        //        ^^^
        //        ^^^^
        //        ^^^^^
        //        |||
        //        |||
        //        |||
        //        |||
        //        |||
        //         */


        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen yaprak sayisini giriniz");
        int yaprak = input.nextInt();
        System.out.println("Lutfen govde icin satir sayisi giriniz");
        int govde = input.nextInt();
        String yprk = "";
        for (int i = 0; i < yaprak; i++) {
            yprk += "^";
            System.out.println(yprk);
        }
        for (int k = 0; k < govde; k++) {
            System.out.println("|||");
        }

    }
}
