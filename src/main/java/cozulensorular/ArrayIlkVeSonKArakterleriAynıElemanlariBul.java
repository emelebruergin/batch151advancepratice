package cozulensorular;

public class ArrayIlkVeSonKArakterleriAynıElemanlariBul {
    public static void main(String[] args) {
        // İlk ve son karakterleri aynı olan array öğelerini bulmak için kod yazınız.
        String[] arr = new String[]{"alabama", "pick", "sos", "sets", "pex"};

        String result="";
        for (String w:arr){
            if (w.substring(0,1).equals(w.substring(w.length()-1))){
                result+=w+" ";
            }
        }
        System.out.println(result);
    }
}
