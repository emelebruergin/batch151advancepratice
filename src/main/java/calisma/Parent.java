package calisma;

import javax.swing.text.html.HTMLDocument;
import java.util.*;
import java.util.stream.Collectors;

public class Parent {
    public static void main(String[] args) {



    List<Integer> list = new ArrayList<>(Arrays.asList(-5, -8, -2, -12, 0, 1, 12, 5, 6, 9, 15, 8));

    boslukluYazdir(list);
        System.out.println();

        negatifYazdir(list);
        System.out.println();

        System.out.println(pozitifListeOlustur(list));

        System.out.println(karelerindenListOlustur(list));

        System.out.println(karalerindenTekrarsizListOlustur(list));

        siraliYazdir(list);
        System.out.println();

        tersSiraliYazdir(list);
        System.out.println();

        System.out.println(pozitifKuplerBirlerBesOlanlar(list));

        System.out.println(pozitiflerinKarelerininBirlerBsmkBesOlmayan(list));

        System.out.println(toplamYazdir(list));

        System.out.println(negatifKare(list));

        System.out.println(bestenBuyukVarMi(list));

        System.out.println(sifirdanKucukMu(list));

        System.out.println(yuzeEsitElemanYokMu(list));

        System.out.println(sifiraEsitElemanYokMu(list));

        System.out.println(listeninIlkBesElemaniniTopla(list));










    }

public static void boslukluYazdir(List<Integer> list){
        list.stream().forEach(t-> System.out.print(t+" "));

}

public static void negatifYazdir(List<Integer> list){
        list.stream().filter(t->t<0).forEach(t-> System.out.print(t+" "));
}

public static List<Integer> pozitifListeOlustur (List<Integer> list){
       return list.stream().filter(t->t>0).collect(Collectors.toList());
}

public static List<Integer> karelerindenListOlustur(List<Integer>list){
       return list.stream().map(t->t*t).collect(Collectors.toList());
}

public static List<Integer> karalerindenTekrarsizListOlustur(List<Integer>list){
        return list.stream().map(t->t*t).distinct().collect(Collectors.toList());
}

public static void siraliYazdir(List<Integer>list){
        list.stream().sorted().forEach(t-> System.out.print(t+" "));
}

public static void tersSiraliYazdir (List<Integer> list){
        list.stream().sorted(Comparator.reverseOrder()).forEach(t-> System.out.print(t+" "));
}
    //list pozitif elemanlari icin kuplerini bulup birler basamagi 5 olanlardan yeni bir list olusturalim

    public static List<Integer> pozitifKuplerBirlerBesOlanlar(List<Integer> list){
        return list.
                stream().
                filter(t-> t>0).
                map(t->t*t*t).
                filter(t->t%10==5).
                collect(Collectors.toList());
    }

    //list pozitif elemanlari icn karelerini bulup birler basamagi 5 olmayanlardan yeni bir list olusturalim

    public static List<Integer> pozitiflerinKarelerininBirlerBsmkBesOlmayan(List<Integer>list){
       return list.stream().filter(t->t>0).map(t->t*t).filter(t->t%10!=5).collect(Collectors.toList());
    }

    public static int toplamYazdir(List<Integer>list){
        return list.stream().reduce(0,Integer::sum);
    }


    public static List<Integer> negatifKare(List<Integer>list){
       return list.stream().
                filter(t->t<0).
               filter(t->t<0).
               peek(t-> System.out.println("Negatif sayi= "+t)).
               map(t->t*t).peek(t-> System.out.println("Karesi= "+t)).
               collect(Collectors.toList());

    }

    public static boolean bestenBuyukVarMi(List<Integer>list){
        return list.stream().anyMatch(t->t>5);
    }

    public static boolean sifirdanKucukMu(List<Integer>list){
        return list.stream().allMatch(t->t<0);
    }

    public static boolean yuzeEsitElemanYokMu(List<Integer>list){
        return list.stream().noneMatch(t->t==100);
    }

    public static boolean sifiraEsitElemanYokMu(List<Integer>list){
        return list.stream().noneMatch(t->t==0);
    }

    public static int listeninIlkBesElemaniniTopla(List<Integer>list){
        //return list.stream().filter(t->list.indexOf(t)<5).reduce(0,Integer::sum);
        return list.stream().limit(5).reduce(0,Integer::sum);
    }






}















