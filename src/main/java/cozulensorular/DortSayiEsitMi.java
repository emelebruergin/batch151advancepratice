package cozulensorular;

import java.util.Scanner;

public class DortSayiEsitMi {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen 4 sayi giriniz");
        int sayi1=input.nextInt();
        int sayi2=input.nextInt();
        int sayi3=input.nextInt();
        int sayi4=input.nextInt();

        if (sayi1==sayi2 && sayi2==sayi3 && sayi3==sayi4){
            System.out.println("Sayilar eşittir");
        }else {
            System.out.println("Sayilar esit değildir");
        }
    }


}
