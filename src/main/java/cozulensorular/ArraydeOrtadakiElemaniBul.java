package cozulensorular;

import java.util.Arrays;

public class ArraydeOrtadakiElemaniBul {
    public static void main(String[] args) {
        // Tamsayılardan oluşan bir arrayde ortadaki elemanı bulunuz.
        //Örnek: (12, 5, 8) ==> (5, 8, 12) ==> Çıktı =8
        // (12, 5, 8, 13) ==> (5, 8, 12, 13) ==> Çıktı =(8+12)/2 = 10


        int []arr={12, 5,3, 8};

        Arrays.sort(arr);
       if (arr.length%2!=0){
           int ortIndx=arr.length/2;
          System.out.println(arr[ortIndx]);
       }else {
           int ortIndx=arr.length/2;
           System.out.println((arr[ortIndx]+arr[arr.length-1])/2);
       }











    }
}
