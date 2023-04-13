package cozulensorular;

import java.util.Arrays;

public class SifirlariSonaKoy {
    public static void main(String[] args) {
      //  Tamsayılardan oluşan arrayde bulunan sıfırları, array sonuna yerleştiren kod yazınız.
        //Örnek: (5, 0, 2, 0, 3) ==> (5, 2, 3, 0, 0)

       int arr[]={5, 0, 2, 0, 3};
        int[] brr = new int [arr.length];
        int firstIdx = 0;
        int lastIdx = arr.length-1;


       for (int w:arr){
           if (w!=0){
               brr[firstIdx]=w;
               firstIdx++;
           }else {
               brr[lastIdx]=w;
               lastIdx--;
           }
       }
        System.out.println(Arrays.toString(brr));









    }
}
