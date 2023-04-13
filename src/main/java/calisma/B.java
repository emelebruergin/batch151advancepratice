package calisma;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class B{
    public static void main(String[] args) {

        List<Integer> sayi = new ArrayList<>(Arrays.asList(34, 22, 16, 11, 35, 20, 63, 21, 65, 44, 66, 64, 81, 38, 15));

        buyuktenKucuge(sayi);
        System.out.println();
        ciftlerKucuktenBuyuge(sayi);
        System.out.println();

        System.out.println(tumSayilarKupToplam(sayi));
        System.out.println(tumSayilarOrtalama(sayi));

        System.out.println(ss(sayi));

        System.out.println(enbuyukEnKucukIkiKezYazdir(sayi));


    }

    public static void buyuktenKucuge(List<Integer> sayi){
        sayi.stream().sorted(Comparator.reverseOrder()).forEach(t-> System.out.print(t+" "));
    }
    public static void ciftlerKucuktenBuyuge(List<Integer>sayi){
        sayi.stream().filter(t->t%2==0).sorted().forEach(t-> System.out.print(t+" "));
    }

    public static int tumSayilarKupToplam(List<Integer>sayi){
       return sayi.stream().map(t->t*t*t).reduce(Math::addExact).get();
    }
    public static double tumSayilarOrtalama(List<Integer>sayi){
        return sayi.stream().reduce(Math::addExact).map(t->t/sayi.size()).get();
    }
    //3e bolunen en buyuk sayı ile 2 ye bolunen enbuyuk sayıyı topla 2ye bolumunden kalanı bul
    public static int ss(List<Integer>sayi){
       int a= sayi.stream().filter(t->t%3==0).max(Integer::compareTo).get();
       int b= sayi.stream().filter(t->t%2==0).max(Integer::compareTo).get();
       return (a+b)%2;
    }


    public static List<Integer> enbuyukEnKucukIkiKezYazdir(List<Integer>sayi){

        List<Integer>list=new ArrayList<>();
        int a=sayi.stream().min(Integer::compareTo).get();
        int b=sayi.stream().max(Integer::compareTo).get();
        list.add(a);
        list.add(a);
        list.add(b);
        list.add(b);
        return list;
    }








}
