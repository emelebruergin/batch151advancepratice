package cozulensorular;

import java.util.*;

public class MapKeyleriAlfabetikSiraYap {
    public static void main(String[] args) {

        // Aşağıda key olarak ürün adlarını ve value olarak ürün sayısını içeren bir map
        //bulunmaktadır. Ürün adlarını alfabetik sırayla yazdırınız.
        Map<String, Integer> product = new HashMap<>();
        product.put("Laptop", 82);
        product.put("TV", 53);
        product.put("Refrigerator", 12);
        product.put("Music System", 87);
        product.put("Mobile Phone", 53);

        Object [] alfbtk=product.keySet().toArray();
        Arrays.sort(alfbtk);
        System.out.println(Arrays.toString(alfbtk));
    }
}
