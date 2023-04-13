package lambdasorular;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaSorular {
    public static void main(String[] args) {



    List<Integer> list = new ArrayList<>(Arrays.asList(-5, -8, -2, -12, 0, 1, 12, 5, 6, 9, 15, 8));

    boslukluYazdir(list);
        System.out.println();

    negatifYazdir(list);
        System.out.println();


        System.out.println(pozitifListeOlustur(list));


        System.out.println(karelerindenListOlustur(list));


        System.out.println(karelerindenTekrarsizListOlustur(list));

    siraliYazdir(list);
        System.out.println();

    tersSiraliYazdir(list);
        System.out.println();
    //list pozitif elemanlari icin kuplerini bulup birler basamagi 5 olanlardan yeni bir list olusturalim
        System.out.println(pozitifKupBirlerYazdir(list));


    //list pozitif elemanlari icn karelerini bulup birler basamagi 5 olmayanlardan yeni bir list olusturalim


        System.out.println(pozitifKareBirlerOlmayanYazdir(list));


        System.out.println(toplamYazdir(list));


        System.out.println(negatifKare(list));


        System.out.println(bestenBuyukVarMi(list));


        System.out.println(sifirdanKucukMu(list));


        System.out.println(yuzeEsitElemanYokMU(list));


        System.out.println(sifiraEsitElemanYokMu(list));


        System.out.println(listeninIlkBesElemanTopla(list));


        System.out.println(listeninSonBesElemanYazdir(list));
}



    private static List<Integer> listeninSonBesElemanYazdir(List<Integer> list) {
        return list.stream().skip(list.size()-5).collect(Collectors.toList());
    }


    private static int listeninIlkBesElemanTopla(List<Integer> list) {
        return list.stream().limit(5).reduce(0,Integer::sum);
    }

    private static boolean sifiraEsitElemanYokMu(List<Integer> list) {
        return list.stream().noneMatch(t->t==0);
    }

    private static boolean yuzeEsitElemanYokMU(List<Integer> list) {
        return list.stream().noneMatch(t->t==100);
    }

    private static boolean sifirdanKucukMu(List<Integer> list) {
        return list.stream().allMatch(t-> t<0);

    }

    private static boolean bestenBuyukVarMi(List<Integer> list) {
        return list.stream().anyMatch(t->t>5);
    }

    private static List<Integer> negatifKare(List<Integer> list) {
        return list.
                stream().
                filter(t-> t<0).
                peek(t-> System.out.println("Negatif Sayi = "+t)).map(t->t*t).
                peek(t->System.out.println("Karesi = "+t)).
                collect(Collectors.toList());
    }


    private static int toplamYazdir(List<Integer> list) {
        return  list.
                stream().
                reduce(0, Integer::sum);
    }

    private static List<Integer> pozitifKareBirlerOlmayanYazdir(List<Integer> list) {
        return list.
                stream()
                .filter(t->t>0).
                map(t->t*t).filter(t->t%10!=5).
                collect(Collectors.toList());
    }

    private static List<Integer> pozitifKupBirlerYazdir(List<Integer> list) {
        return list.
                stream().
                filter(t->t>0).
                map(t->t*t*t).
                filter(t->t%10==5).
                collect(Collectors.toList());
    }

    private static void tersSiraliYazdir(List<Integer> list) {
        list.stream().
                sorted(Comparator.reverseOrder()).
                forEach(t-> System.out.print(t+" "));
    }

    private static void siraliYazdir(List<Integer> list) {
        list.stream().sorted().forEach(t->System.out.print(t+ " "));
    }

    private static List<Integer> karelerindenTekrarsizListOlustur(List<Integer> list) {

        return list.
                stream().
                map(t->t*t).
                distinct().
                collect(Collectors.toList());

    }

    private static List<Integer> karelerindenListOlustur(List<Integer> list) {

        return list.stream().
                map(t->t*t).
                collect(Collectors.toList());

    }

    private static List<Integer> pozitifListeOlustur(List<Integer> list) {

        return list.stream().
                filter(t->t>0).
                sorted().
                collect(Collectors.toList());

    }

    private static void negatifYazdir(List<Integer> list) {

        list.stream().
                filter(t-> t<0).
                forEach(System.out::print);

    }

    private static void boslukluYazdir(List<Integer> list) {

        list.forEach(t-> System.out.print(t+" "));

    }


}
