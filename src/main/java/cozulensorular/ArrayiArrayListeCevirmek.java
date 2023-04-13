package cozulensorular;

import java.util.ArrayList;

public class ArrayiArrayListeCevirmek {
    public static void main(String[] args) {
        String arr[]={"Python", "JAVA", "PHP", "Perl", "C#", "C++"};

        ArrayList<String>arr1=new ArrayList<>();


        for (int i=0;i<arr.length;i++){
            arr1.add(i, arr[i]);
        }
        System.out.println(arr1);
    }
}
