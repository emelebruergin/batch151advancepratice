package cozulensorular;

import java.util.Collections;
import java.util.LinkedList;

public class SwapIleElemanYerleriDegistirme {
    public static void main(String[] args) {
        LinkedList<String> lst= new LinkedList<>();
        lst.add("mavi");
        lst.add("kirmizi");
        lst.add("beyaz");
        lst.add("siyah");
        lst.add("yesil");
        lst.add("turuncu");
        System.out.println("Orjinal LinkedList: "+lst);
        Collections.swap(lst,0,3);
        System.out.println("Swap sonrası durum:\n"+lst);

    }
}
