package cozulensorular;

import java.util.Scanner;

public class DakikaKacYil {

    /*
    Kullanıcıdan dakika girmesini isteyin, Dakikaları birkaç yıl ve gün sayısına dönüştürmek için bir Java programı yazın.
     */
    public static void main(String[] args) {
        double minuteInYear=60*24*365;
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter minute");
        double min=input.nextDouble();
        long years=(long) (min/minuteInYear);
        int days=(int) (min/60/24)%365;
        int min1=(int) min;
        System.out.println(min1+" dakika yaklasik "+years+" yil "+days+" gundur");
    }
}
