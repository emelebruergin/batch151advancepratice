package cozulensorular;

import java.util.Scanner;

public class Sifre3KereYanlisIseBloke {
    public static void main(String[] args) {
         /*
    // STRING OLAN PIN kodunuzu 3 tane yanlış girildiğinde bloke olacak şekilde kodu yazınız.
    String str = Bg1234.!
     */
        String str = "Bg1234.!";
        Scanner input=new Scanner(System.in);


        int i=3;
        do {
            if (i==0){
                System.out.println("hesabınız bloke olmuştur");
                break;
            }
            System.out.println("lütfen şifrenizi giriniz");
            String pwd=input.next();
            if(pwd.equals(str)){
                System.out.println("hoşgeldiniz");
                break;
            }else {
                System.out.println("şifreniz yanlış kalan hakkınız"+(i-1));
            }

            i--;
        }while (true);
    }
}
