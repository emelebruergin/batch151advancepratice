package cozulensorular;

public class ArrayElemanlarınBasHarfiniAlma {
    public static void main(String[] args) {
        // String’ lerden oluşan bir arrayde öğeler 'n' veya 'k' ile bitiyorsa, o öğelerin baş harflerini
        //alınız.
        //Örnek: { “Kemal”, “Jonathan”, “Mark”, “Jackson”, “Ali” } ==> Çıktı JJM

        String arr[]={"Kemal", "Jonathan", "Mark", "Jackson", "Ali"};
        String d="";
        for (String w:arr){
            if (w.endsWith("n")||w.endsWith("k")){
                String c=w.substring(0,1);
                d+=c+" ";
            }

        }
        System.out.println(d);










    }
}
