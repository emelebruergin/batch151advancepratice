package cozulensorular;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class HashSetTreeSetIleSirala {
    public static void main(String[] args) {
        HashSet<String> hst=new HashSet<>();
        hst.add("sari");
        hst.add("mavi");
        hst.add("kirmizi");
        hst.add("yesil");
        hst.add("mor");

        TreeSet<String> tst=new TreeSet<>(hst);

        Iterator<String> tstItr=tst.iterator();
        System.out.println("TreeSet elements:");
        while (tstItr.hasNext()){
            String el=tstItr.next();
            System.out.println(el);
        }

    }
}
