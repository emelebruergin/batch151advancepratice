package cozulensorular;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListteTekrarlananElemanVarmi {
    public static void main(String[] args) {
        // Bir listede tekrarlanan öğeler olup olmadığını kontrol etmek için kodu yazınız.


        List<Integer> myList = new ArrayList<>();
        myList.add(10);
        myList.add(31);
        myList.add(10);
        myList.add(7);
        myList.add(13);

        Set<Integer> stt=new HashSet<>(myList);

        if (stt.size()==myList.size()){
            System.out.println("Tekrarlanan eleman yoktur");
        }else {
            System.out.println("Tekrarlanan eleman vardır");
        }

    }
}
