package cozulensorular;

public class ArraydekiToplamElemanSayisi {
    public static void main(String[] args) {


        // String’ lerden oluşan bir arrayde kullanılan öğelerin toplam karakter sayısını bulunuz.
        //Örnek: { "Kemal", "Jonathan", "Mark", "Angie", "Veli" } ==> Çıktı 26

        String []arr={"Kemal", "Jonathan", "Mark", "Angie", "Veli"};
        int sum=0;
        for (String w:arr){
            sum+=w.length();
        }
        System.out.println(sum);







    }
}
