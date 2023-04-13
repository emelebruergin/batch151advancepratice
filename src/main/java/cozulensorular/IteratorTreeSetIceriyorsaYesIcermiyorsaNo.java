package cozulensorular;

import java.util.Iterator;
import java.util.TreeSet;

public class IteratorTreeSetIceriyorsaYesIcermiyorsaNo {
    public static void main(String[] args) {
        TreeSet<String> tst= new TreeSet<>();

        tst.add("mavi");
        tst.add("yesil");
        tst.add("kirmizi");
        tst.add("sari");

        System.out.println("1. TreeSet: "+tst);

        TreeSet<String> tst1= new TreeSet<>();

        tst1.add("mavi");
        tst1.add("pembe");
        tst1.add("turuncu");
        tst1.add("yesil");
        System.out.println("2. TreeSet: "+tst1);

        Iterator<String> tstItr=tst.iterator();


        System.out.println("KArsilastirma Sonucu: ");
        while (tstItr.hasNext()){
            if (tst1.contains(tstItr.next())){
                System.out.println("yes");
            }else {
                System.out.println("no");
            }

        }

    }
}
