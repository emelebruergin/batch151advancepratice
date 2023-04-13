package calisma;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class C {
    public static void main(String[] args) {
        List<String> yemek = new ArrayList<>(Arrays.asList("kusleme", "adana", "trilece", "havucDilim", "buryan", "guvec", "yaglama", "kokorec", "arabAsi"));

        System.out.println(ilkHarfBuyukYazdir(yemek));

        System.out.println(bestenBuyukKacElemanVar(yemek));
        System.out.println(butunElemanlarTerstenYazdir(yemek));

    }

    //Sadece ilk harfler buyuk olacak halde yazdır
    public static List<String> ilkHarfBuyukYazdir(List<String>yemek){
       return yemek.stream().map(t->t.substring(0,1).toUpperCase()+t.substring(1).toLowerCase()).collect(Collectors.toList());
    }

    //karakter sayısı 5 ten buyuk kac eleman var

    public static long bestenBuyukKacElemanVar (List<String >yemek){
       return yemek.stream().filter(t->t.length()>5).count();
    }

    //butun elemanları tersten yazdır
    public static List<String> butunElemanlarTerstenYazdir (List<String> myList){
        return myList.
                stream().
                map(s -> new StringBuilder(s).reverse().toString()).
                collect(Collectors.toList());

    }
}
