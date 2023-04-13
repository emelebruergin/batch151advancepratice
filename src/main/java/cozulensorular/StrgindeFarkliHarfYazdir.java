package cozulensorular;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StrgindeFarkliHarfYazdir {
    public static void main(String[] args) {
        // Bir String’ de kullanılan farklı karakterleri yazdırmak için kod yazınız.
        //Örnek: ‘Mississippi’ ´ Misp

        String ss="Mississippi";
        long t1=System.nanoTime();


        Set<String> st=new HashSet<>();
        for (int i=0;i<ss.length();i++){
            st.add(ss.substring(i,i+1));
        }
        System.out.println(st);
        long t2=System.nanoTime();

        String ssr="Mississippi";
        String[]arr=ss.split("");
        List<String> lst= Arrays.asList(arr);

        Set<String > strr=new HashSet<>(lst);
        System.out.println(st);

        long t3=System.nanoTime();

        System.out.println((t2-t1));
        System.out.println((t3-t2));
    }

}
