package cozulensorular;

import java.util.*;

public class MapKacEntryVar {
    public static void main(String[] args) {


    // Aşağıda key olarak ürün adlarını ve value olarak ürün sayısını içeren bir map
    //bulunmaktadır. Toplam ürün sayısını bulmak için kodu yazınız.
    Map<String, Integer> product = new HashMap<>();
    product.put("Laptop", 12);
    product.put("TV", 53);
    product.put("Refrigerator", 12);
    product.put("Music System", 87);

       Collection<Integer>cc= product.values();
       int sum=0;
       for (int w:cc){
           sum+=w;
       }
        System.out.println(sum);


    }
  }