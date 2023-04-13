package cozulensorular;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListteEnYakinIkiSayiBul {
    public static void main(String[] args) {
        List<Integer> h = new ArrayList<>();
        h.add(12);
        h.add(31);
        h.add(32);
        h.add(13);
        h.add(54);
        Collections.sort(h);
        int result=h.get(1)-h.get(0);

        for (int i=0;i<h.size()-1;i++){
            result=Math.min(result, h.get(i+1)-h.get(i));
        }
        for (int i=0;i<h.size()-1;i++){
           if(h.get(i+1)-h.get(i)==result) {
               System.out.println(h.get(i)+" and "+h.get(i+1));

           }
        }

    }
}
