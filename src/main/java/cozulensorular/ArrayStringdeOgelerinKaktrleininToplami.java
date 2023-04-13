package cozulensorular;

public class ArrayStringdeOgelerinKaktrleininToplami {
    public static void main(String[] args) {

        // Verilen bir String arraydeki öğelerin karakterlerinin toplamını bulmak için kod yazınız.
        String[] arr = new String[]{"alabama", "pick", "sos", "sets", "pex"};
        int toplam=0;
        for (String w:arr){
           toplam+= w.length();
        }
        System.out.println(toplam);
    }
}
