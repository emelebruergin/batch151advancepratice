package cozulensorular;

import java.util.Scanner;

public class BirStringPalindromeMu {
    public static void main(String[] args) {

        /*
        Kullanıcının girdiği bir  String'in PALINDROME olup olmadığını kontrol eden bir method create ediniz
        polindrome :tersten okunuşu da aynı olan ifadeierdir.
        ornek : Ey edip Adanada pide ye,  Traş niçin şart
     */
        Scanner input=new Scanner(System.in);
        System.out.println("lütfen bir cümle giriniz");
        String cumle=input.nextLine();
        polindrome(cumle);

    }
    private static void polindrome(String a) {

            String c="";
            for (int i=a.length()-1;i>-1;i--){
                String d=a.substring(i,i+1);
                c=c+d;
            }
            if (c.equals(a)){
                System.out.println("girdiğiniz cumle palindrome dur");
            }else {
                System.out.println("girdiğiniz cumle palindrome değildir");
            }
        }



        }


