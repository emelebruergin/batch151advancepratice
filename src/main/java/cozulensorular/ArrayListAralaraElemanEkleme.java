package cozulensorular;

import java.util.ArrayList;

public class ArrayListAralaraElemanEkleme {
    public static void main(String[] args) {
        //Array list oluşturun daha sonra aşağıda belirtilen yerlere yebi array elemanlarını ekleyen java kodunu yazınız.
        //Array List:  siyah,mavi,kirmizi,beyaz
        //en başa: **pembe**

        //mavi-kirmizi arasına **yesil**  renk eklenecek.

        //Beklenen Çıktı:

        //[pembe,siyah,mavi,yesil,kirmizi,beyaz]

        ArrayList<String>colors=new ArrayList<>();
        colors.add("siyah");
        colors.add("mavi");
        colors.add("kirmizi");
        colors.add("beyaz");

        colors.add(0,"pembe");

        colors.add(colors.indexOf("mavi")+1,"yesil");
        System.out.println(colors);

    }
}
