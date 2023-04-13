package cozulensorular;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrtalamayiGecenOgrenciSayisi {
    public static void main(String[] args) {

        /* TASK :
         Bir öğretmenden girmek istediği kadar notu alınız, ve
         ortalamayı geçen öğrenci sayısını bulan code create ediniz.

         */


        Scanner input=new Scanner(System.in);

        String secim=input.next();

        List<Integer>notlar=new ArrayList<>();
       int ortala= ortlamaBul(notlar);


                while (input.next().equalsIgnoreCase("e")){
                    System.out.println("not giriniz \nCıkmak için E ye basın");
                    String not=input.next();
                    notlar.add(Integer.valueOf(not));
                }


        int sayac=0;
        for (int w:notlar){
            if (w>ortala){
                sayac++;
            }
        }System.out.println("ortalamayı gecen ogrenci sayısı = "+sayac);



        }

    private static int ortlamaBul(List<Integer> notlar) {
        int ortalama=0;
        for (int w:notlar){
            ortalama+=w;
        }
       return ortalama/notlar.size();

    }
}

