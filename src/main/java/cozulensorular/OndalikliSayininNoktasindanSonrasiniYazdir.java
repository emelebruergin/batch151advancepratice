package cozulensorular;

import java.util.Arrays;

public class OndalikliSayininNoktasindanSonrasiniYazdir {
    public static void main(String[] args) {
        // Verilen ondalık sayının sadece ondalık kısmındaki rakamlarını, kendisinden önce bir yıldız
        //işaretiyle yazdırmak için gereken kodu yazınız.
        //Örneğin; 75.4238 ´ *4*2*3*8


        double sayi1=75.4238;
        String sayi=String.valueOf(sayi1);
        String [] arr=sayi.split("");

        System.out.println(Arrays.toString(arr));
        int x=0;
        for (String s : arr) {
            if (x == 1) {
                System.out.print("*" + s);
            }
            if (s.equals(".")) {
                x = 1;
            }


        }






    }
}
