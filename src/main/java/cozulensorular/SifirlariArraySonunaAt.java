package cozulensorular;

import java.util.Arrays;

public class SifirlariArraySonunaAt {
    public static void main(String[] args) {
        // Tamsayılardan oluşan arrayde bulunan sıfırları, array sonuna yerleştiren kod yazınız.
        //Örnek: (5, 0, 2, 0, 3) ==> (5, 2, 3, 0, 0)

        int arr[]= {5, 0, 2, 0, 3};

        int brr[]=new int[arr.length];

        int sonIndx=brr.length-1;

        int ilkIndx=0;


        for (int w:arr){
            if (w==0){

                brr[sonIndx]=w;

                sonIndx--;
            }else {

                brr[ilkIndx]=w;

                ilkIndx++;
            }


        }  System.out.println(Arrays.toString(brr));






    }
}
