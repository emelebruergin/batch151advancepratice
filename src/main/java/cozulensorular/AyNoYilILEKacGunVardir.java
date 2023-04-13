package cozulensorular;

import java.util.Scanner;

public class AyNoYilILEKacGunVardir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ay = input.nextInt();
        int yil = input.nextInt();

        switch (ay) {
            case 1:
                System.out.println("Ocak " + yil + " 31 Gundur.");
                break;
            case 3:
                System.out.println("Mart " + yil + " 31 Gundur.");
                break;
            case 5:
                System.out.println("Mayis " + yil + " 31 Gundur.");
                break;
            case 7:
                System.out.println("Temmuz " + yil + " 31 Gundur.");
                break;
            case 8:
                System.out.println("Agustos " + yil + " 31 Gundur.");
                break;
            case 10:
                System.out.println("Eylul " + yil + " 31 Gundur.");
                break;
            case 12:
                System.out.println("Aralik " + yil + " 31 Gundur.");
                break;
            case 2:
                if (yil%100==0&&yil%400==0||yil%4==0){
                    System.out.println("Subat "+yil+" 29 Gundur.");

                }else {
                    System.out.println("Subat "+yil+" 28 Gundur.");

                }
                break;
            case 4:
                System.out.println("Nisan "+yil+" 30 Gundur.");
                break;
            case 6:
                System.out.println("Haziran "+yil+" 30 Gundur.");
                break;
            case 9:
                System.out.println("Eylul "+yil+" 30 Gundur.");
                break;
            case 11:
                System.out.println("Kasim "+yil+" 30 Gundur.");
                break;

        }
    }
}
