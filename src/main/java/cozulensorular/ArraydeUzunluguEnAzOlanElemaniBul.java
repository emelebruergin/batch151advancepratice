package cozulensorular;

public class ArraydeUzunluguEnAzOlanElemaniBul {
    public static void main(String[] args) {
        // String’ lerden oluşan bir arrayde uzunluğu en küçük olan elemanları bulunuz.
        //Örnek: ( Kemal, Jonathan, Mark, Angie, Veli ) ==> Output is Mark, Veli
        String []b={"Kemal", "Jonathan", "Mark", "Angie", "Veli"};

      int minLength=b[0].length();
      for (String w:b){
          minLength=Math.min(minLength,w.length());
      }

      for (String w:b){
          if (minLength==w.length()){
              System.out.println(w);
          }
      }

    }
}
