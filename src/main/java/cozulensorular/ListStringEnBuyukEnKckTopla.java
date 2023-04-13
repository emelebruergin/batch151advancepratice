package cozulensorular;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListStringEnBuyukEnKckTopla {
    public static void main(String[] args) {
        // Bir String listesinde verilen en düşük ve en büyük fiyatın toplamını bulunuz.
        //Örnek: List<String> myList = new List<String>{'$12.99', '$8.25', '$23.60', '$54.45'}; ==> 62.70

        List<String>myList=new ArrayList<>();
        myList.add("$12.99");
        myList.add("$8.25");
        myList.add("$23.60");
        myList.add("$54.45");

        Collections.sort(myList);

        double ilk=Double.valueOf(myList.get(0).replace("$",""));
        double son=Double.valueOf(myList.get(myList.size()-1).replace("$",""));
        System.out.println(ilk+son);



    }
}
