package cozulensorular;

import java.util.Scanner;

public class VerilenSayiHangiIndexte {public static void main(String[] args) {
    int [] arr= new int[]{25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

    System.out.println("hangi sayıyı arıyorsunuz");
    Scanner input=new Scanner(System.in);
    int secim=input.nextInt();

    myMethod(arr,secim);
    System.out.println("girdiğiniz " +secim+" sayisi "+myMethod(arr,secim)+". indextedir");
}

    private static int myMethod(int[] arr, int secim) {

        if (arr==null)  return -1;

        for (int i=0;i<arr.length;i++){
            if (arr[i]==secim){
                return i;
            }
        }
        return -1;
    }


}
