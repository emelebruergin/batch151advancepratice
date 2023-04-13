package cozulensorular;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListtekiSayilarinKarelerininToplami {
    public static void main(String[] args) {
          /* TASK :
   Bir integer list oluşturunuz ve bu list’deki tum sayıların karesinin
   toplamını bulan code create ediniz.
    */

        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen listenin uzunlugunu giriniz");
        int uzunluk=input.nextInt();

        List<Integer> list=new ArrayList<>();

        for (int i=0;i<uzunluk;i++){
            System.out.println(i+1+". elemanı giriniz");
            int sayi=input.nextInt();
            list.add(sayi*sayi);
        }
        System.out.println(list);

        int toplam=0;
        for (Integer w:list){
            toplam+=w;
        }
        System.out.println(toplam);

    }
}
