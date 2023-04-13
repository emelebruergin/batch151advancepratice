package cozulensorular;

import java.util.ArrayList;
import java.util.List;

public class ListStringFiyatlariTopla {
    public static void main(String[] args) {
        // String bir listede verilen tüm fiyatların toplamını bulunuz.
        //Örnek: List<String> myList = new List<String>{'$12.99', '$23.60', '$54.45'}; ==> 91.04

        List<String>price=new ArrayList<>();
        price.add("$12.99");
        price.add("$23.60");
        price.add("$54.45");

       double sum=0;

        for (int i=0;i<price.size();i++){
            sum+=Double.valueOf(price.get(i).replace("$",""));
        }
        System.out.println(sum);














    }
}
