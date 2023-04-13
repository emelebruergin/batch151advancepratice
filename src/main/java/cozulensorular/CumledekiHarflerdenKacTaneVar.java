package cozulensorular;

import java.util.Arrays;

public class CumledekiHarflerdenKacTaneVar {
    public static void main(String[] args) {
        String str="Javacilar cook afilli";
        String []arr=str.split("");
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        int count=1;
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            count=1;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i].charAt(0)==arr[j].charAt(0)){
                    count++;
                }else{
                    i=j-1;
                    break;
                }
            }
            System.out.println(arr[i]+" = "+count);
        }
    }
}
