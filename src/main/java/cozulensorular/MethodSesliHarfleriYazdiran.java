package cozulensorular;

import java.util.Scanner;

public class MethodSesliHarfleriYazdiran {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("cümle giriniz");
        String cumle=input.nextLine();

        String hrf []=cumle.split("");


        sesliharfleriyazdir(hrf);

    }

    public static void sesliharfleriyazdir(String[] hrf) {


        for (String w:hrf){
            if (w.equalsIgnoreCase("a")
                    ||w.equalsIgnoreCase("e")
                    ||w.equalsIgnoreCase("i")
                    ||w.equalsIgnoreCase("o")
                    ||w.equalsIgnoreCase("u")){
                System.out.print(w);
            }
        }



    }
}
