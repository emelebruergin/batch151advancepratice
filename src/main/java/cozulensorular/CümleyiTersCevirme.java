package cozulensorular;

import java.util.Scanner;

public class CümleyiTersCevirme {
    public static void main(String[] args) {
        // kullanıcıdan aldıgınız cumleyi ters ceviren method creat ediniz
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir cümle giriniz");
        String cumle=scan.nextLine();
        System.out.println(cumle);

        StringBuilder sb=new StringBuilder(cumle);
        sb.reverse();
        System.out.println(sb);


    }
}
