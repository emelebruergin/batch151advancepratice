package cozulensorular;

import java.util.Arrays;
import java.util.Scanner;

public class DiziIcindeArananDegerVarmi {
    public static void main(String[] args) {
        System.out.println("lütfen 3 sayı giriniz");



        Scanner input=new Scanner(System.in);
        System.out.println("kaç sayı gireceksiniz");
        int []arr=new int[input.nextInt()];
        int index=0;
        for (int i=0;i<arr.length;i++){
            System.out.println(i+1+". sayiyi giriniz");
            arr[i]=input.nextInt();
        }
        System.out.println("aranan değeri giriniz");
        int arananDeger=input.nextInt();
        Arrays.sort(arr);
        int varmi=Arrays.binarySearch(arr,arananDeger);
        if (varmi>=0){
            System.out.println("aranan değer dizi içinde bulundu: "+arananDeger);
        }else {
            System.out.println("aranan değer bulunamadı: "+arananDeger);
        }
    }
}
