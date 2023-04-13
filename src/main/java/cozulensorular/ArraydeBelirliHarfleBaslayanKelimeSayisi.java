package cozulensorular;

import java.util.ArrayList;

public class ArraydeBelirliHarfleBaslayanKelimeSayisi {
    public static void main(String[] args) {
       // Verilen bir String'de 'a' veya 'A' ile başlayan kelimeyi sayısını bulunuz.

        String s = "Apex is an object oriented programming language";
        String arr[]=s.split(" ");
        int counter=0;

        for (String w:arr){
            if (w.startsWith("a")||w.startsWith("A")){
                counter++;
            }
        }
        System.out.println(counter);











    }

    public static class ListtekiCiftSayiCarpimi {
        public static void main(String[] args) {
            // Bir tamsayı listesindeki tüm çift sayıların çarpımını bulunuz.
            ArrayList<Integer> myList=new ArrayList<>();
            myList.add(10);
            myList.add(23);
            myList.add(12);
            myList.add(35);
            myList.add(100);
            myList.add(89);
            int sum=1;

            for (int w:myList){
                if (w%2==0){
                    sum*=w;
                }
            }
            System.out.println(sum);
        }
    }
}
