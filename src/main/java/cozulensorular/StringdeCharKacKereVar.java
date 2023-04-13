package cozulensorular;

import java.util.Scanner;

public class StringdeCharKacKereVar {
    public static void main(String[] args) {
        //Kullanıcıdan bir isim ve bir karakter girmesini isteyin, ardından döngüleri kullanarak karakterin isimde kaç kez tekrarlandığını kontrol edin.
        //
        //    char ch1= 'a' ;
        //
        //		String name =“John came late"
        //
        //		Expected Output:
        //
        //
        //    Number of a = 2

        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir isim giriniz");
        String name=input.nextLine();
        System.out.println("Lütfen bir karakter giriniz");
        char ch=input.next().charAt(0);

        int counter=0;

        for (int i =0;i<name.length();i++){
            char t=name.charAt(i);
            if (t==ch){
                counter++;
            }
        }
        System.out.println("Number of "+ch+" = "+counter);












    }
}
