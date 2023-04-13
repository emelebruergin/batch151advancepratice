package cozulensorular;

import java.util.Iterator;
import java.util.LinkedList;

public class IteratorIleListTerstenYazdir {
    public static void main(String[] args) {
        LinkedList<String> lst = new LinkedList<>();
        lst.add("sari");
        lst.add("mavi");
        lst.add("yesil");
        lst.add("kirmizi");
        lst.add("beyaz");
        lst.add("mor");

        System.out.println("Orjinal linked list: " + lst);
        Iterator<String> lstItr = lst.descendingIterator();

        System.out.println("LinkedList Tersi:");
        while (lstItr.hasNext()) {
            String el = lstItr.next();
            System.out.println(el);
        }
    }
}
