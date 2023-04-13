package cozulensorular;

import java.util.*;

public class MapKelimelerKacTekrar {
    public static void main(String[] args) {
       // Bir String’ deki kelimelerin kaç defa tekrarlandığını ifade eden kod yazınız.
        // (Büyük/küçük harfe duyarlı değil)
        String s = "Apex is easy. Type codes to learn apex. To earn money learn apex.";

        s=s.replaceAll("\\p{Punct}","").toLowerCase();


        String []arr =s.split(" ");

        Map<String,Integer> mm=new HashMap<>();

        for (String w:arr){
            Integer num=mm.get(w);
            if (num==null){
                mm.put(w,1);
            }else {
                mm.replace(w,num+1);
            }
        }
        System.out.println(mm);








    }
}
