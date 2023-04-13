package cozulensorular;

import java.util.Scanner;

public class Deneme {
    public static void main(String[] args) {
          /*
    Dizi Boyutunu Girin :4

    Dizi Öğelerini Girin :1  2   3   4


    Eklemek İstediğiniz Öğeyi Girin :5

    Eklenecek Konumu Girin :2

    Dizideki Tüm Değerler : 1 5 2 3 4
     */

        int n, i, num, loc;
        int arr[] = new int[100];
        Scanner sc = new Scanner(System.in);

        System.out.print("Dizi Boyutunu Girin :");
        n = sc.nextInt();

        System.out.print("\nDizi Öğelerini Girin :");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        /* www.tasarimkodlama.com */
        System.out.print("\nEklemek İstediğiniz Öğeyi Girin :");
        num = sc.nextInt();

        System.out.print("\nEklenecek Konumu Girin :");
        loc = sc.nextInt();

        for (i = n; i >= loc; i--) {
            arr[i] = arr[i - 1];
        }
        n++;
        arr[loc - 1] = num;

        System.out.print("\nDizideki Tüm Değerler :");
        for (i = 0; i < n; i++) {
            System.out.print(" " + arr[i]);
        }


    }
}
