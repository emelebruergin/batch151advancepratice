package cozulensorular;

public class StringiTersCevirmek {
    public static void main(String[] args) {
        /*
      // Stringi ters cevirmek icin bir Java Programi yazin
      //1.Yol: StringBuilder () kullanarak
      //2.Yol: String Classini kullanarak
      //3.Yol: Bir method olusturun, ardindan methodu main method dan cagirin
    */
        String str="Java ogrenmek cok kolay";
        //1.Yol
        StringBuilder sb=new StringBuilder();
        sb.append(str);
        System.out.println(sb.reverse());
        // 2.yol
        String c="";
        for (int i=str.length()-1;i>-1;i--){
            String d=str.substring(i,i+1);
            c=c+d;
        }
        System.out.println(c);
        //3.yol

        str1(str);
    }

    private static void str1(String a) {
        String c="";
        for (int i=a.length()-1;i>-1;i--){
            String d=a.substring(i,i+1);
            c=c+d;
        }
        System.out.println(c);
    }
}
