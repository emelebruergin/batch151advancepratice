package cozulensorular;

import java.util.*;

public class Calisma {
    public static void main(String[] args) {


        String s="Javaisalsoeasy";

        String ss[]=s.split("");
        String str="";
        for (String w:ss){
            if (s.indexOf(w)!=s.lastIndexOf(w) && !str.contains(w)){
                str+=w+" ";
            }
        }
        System.out.println(str);


    }
}
