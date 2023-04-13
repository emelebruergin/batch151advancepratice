package cozulensorular;

import java.util.Arrays;

public class VerilenStringtesesliHarfSayisi {
    public static void main(String[] args) {
        // Verilen bir String'deki sesli harf sayısını bulunuz.

        String s = "Apex is an object oriented programming language";

        String arr[]=s.toLowerCase().split("");
        System.out.println(Arrays.toString(arr));
        int counter=0;
        for (String w:arr){
            if (w.equals("a")||w.equals("e")||w.equals("o")||w.equals("u")||w.equals("i")||w.equals("o")){
                counter++;
            }
        }
        System.out.println(counter);



    }
}
