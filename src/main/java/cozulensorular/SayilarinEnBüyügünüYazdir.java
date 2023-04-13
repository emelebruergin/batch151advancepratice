package cozulensorular;

import java.util.Scanner;

public class SayilarinEnBüyügünüYazdir {
    public static void main(String[] args) {
        /*  //TASK :  Kullanıcıdan 5 sayı isteyiniz, bu sayılardan en büyüğünü bularak yazdırınız.

         */

        Scanner input=new Scanner(System.in);


        int i=0;
        int enBuyugu=0;
        do {
            System.out.println("Lütfen "+(i+1)+". sayıyı giriniz");
            int sayi=input.nextInt();
            if (sayi>enBuyugu){
                enBuyugu=sayi;
            }

            i++;
        }while (i<5);
        System.out.println("enBuyugu = " + enBuyugu);
    }

}
