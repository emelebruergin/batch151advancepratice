package cozulensorular;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramStringMi {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("lütfen iki kelime giriniz");
        String s1=input.nextLine();
        String s2=input.nextLine();

        String a1[]=s1.split("");
        Arrays.sort(a1);
        String a2[]=s2.split("");
        Arrays.sort(a2);

        if (s1.length()!=s2.length()){
            System.out.println("anagram değildir");
        }else if(s1.isEmpty()||s2.isEmpty()){
            System.out.println("anagram degildir");
        }else if (Arrays.equals(a1,a2)){
            System.out.println("anagramdır");
        }else {
            System.out.println("anagram degildir");
        }


    }
}
