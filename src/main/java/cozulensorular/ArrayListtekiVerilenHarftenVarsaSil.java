package cozulensorular;

import java.util.ArrayList;
import java.util.List;

public class ArrayListtekiVerilenHarftenVarsaSil {
    public static void main(String[] args) {
        /* TASK :

         * Input olarak verilen listteki isimlerden
         * icinde ‘a’ harfi bulunanlari silen bir code create ediniz.
         *
         * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
         * OUTPUT : [Veli,Omer]
         */

        List<String>list1=new ArrayList<>(List.of("Ali","Veli","Ayse","Fatma","Omer"));
        System.out.println(list1);
        for (String w:list1){
            String s =w.toUpperCase();
            if (s.contains("A")){
                list1.remove(s);
            }


        }

        System.out.println(list1);






    }
}
