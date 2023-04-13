package cozulensorular;

import java.util.Arrays;
import java.util.Scanner;

public class ArraydekiEnKckEnBykFarki {
    public static void main(String[] args) {
        // Kullanıcıdan aldığınız tamsayılar ile bir array oluşturunuz ve bu arraydeki en küçük ve en
        //büyük öğeler arasındaki farkı konsolda yazdırınız.

        Scanner input=new Scanner(System.in);
        System.out.println("kaç eleman gireceksiniz");
        int arr[]=new int[input.nextInt()];


        int i=0;
        while (i<arr.length){
            System.out.println("lütfen "+(i+1)+". elemani giriniz");
            arr[i]=input.nextInt();


            i++;
        }
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        int result=arr[arr.length-1]-arr[0];
        System.out.println("result = " + result);


    }
}
