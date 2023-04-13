package cozulensorular;

import java.util.*;

public class MapTekrarlananOgeSayisi {
    public static void main(String[] args) {
        //Belirli bir listede tekrarlanan öğelerin sayısı nasıl kontrol edilir?
        List<Integer> myList = new ArrayList<>();
        myList.add(12);
        myList.add(21);
        myList.add(12);
        myList.add(13);
        myList.add(12);
        myList.add(21);
        myList.add(35);

        Map<Integer,Integer> mp=new HashMap<>();

        for (Integer w:myList){
            Integer num=mp.get(w);
            if (num==null){
                mp.put(w,1);

            }else {
                mp.replace(w,num+1);
            }
        }

        Collection<Integer> cc=mp.values();

        Integer counter=0;
        for (Integer w:cc){
            if (w>1){
                counter++;
            }
        }
        System.out.println("Tekrarlı eleman sayısı "+counter+" adettir.");



    }
}
