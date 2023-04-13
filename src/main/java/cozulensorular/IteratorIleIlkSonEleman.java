package cozulensorular;

import java.util.Iterator;
import java.util.LinkedList;

public class IteratorIleIlkSonEleman {
    public static void main(String[] args) {
        LinkedList<String> lst = new LinkedList<>();
        lst.add("sari");
        lst.add("mavi");
        lst.add("turuncu");
        lst.add("siyah");
        lst.add("yesil");
        lst.add("beyaz");

        Iterator<String> lstItr= lst.iterator();

        System.out.println("Orjinal list elemanlari:\n"+lst);

        while (lstItr.hasNext()){
            String el=lstItr.next();
            if (el.equals(lst.get(0))){
                System.out.println("Listenin ilk elemani: "+el);
            } else if (el.equals(lst.get(lst.size()-1))) {
                System.out.println("Listenin son elemani: "+el);
            }
        }


    }
}
