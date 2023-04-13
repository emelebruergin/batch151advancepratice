package cozulensorular;

import java.util.Scanner;

public class VerilenHarfAraligindaKacHarfVar {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("lütfen bir cümle giriniz");
        String str=input.nextLine();


        String ss=str.replaceAll(" ","");
        System.out.println("lütfen bir karakter giriniz");
        char ch=input.next().charAt(0);

        int ilkindx=ss.indexOf(ch);
        int sonindx=ss.lastIndexOf(ch);
        int counter=0;

        if (ilkindx==sonindx){
            System.out.println("-1");

        }else {
            for (int i=ilkindx+1;i<sonindx;i++){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
