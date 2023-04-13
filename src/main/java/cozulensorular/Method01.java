package cozulensorular;

import java.util.Arrays;
import java.util.Scanner;

public class Method01 {
    static Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {
        arrayOlustur();

    }
    private static void arrayOlustur() {
        System.out.println("dizinin boyutunu girin");
        int []arr=new int[scan.nextInt()];
        arrElemanEkle(arr);


    }

    private static void arrElemanEkle(int[] arr) {
        int index=0;
        for (int i=0;i<arr.length;i++){


            System.out.println("elemanın kaçıncı sırada oldugunu giriniz");
            index=scan.nextInt()-1;
            if (!(index<=arr.length-1)){
                System.out.println("gecerli sıra giriniz");
                i-=1;
            }
            else {
                System.out.println(i + 1 + ". elemanı giriniz");
                arr[index] = scan.nextInt();
            }


        }
        System.out.println(Arrays.toString(arr));
    }
}
