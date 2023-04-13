package cozulensorular;

import java.util.Arrays;
import java.util.Scanner;

public class HangiHarfKacTane {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz");
        String s = scan.nextLine();

        String[] arr = s.split("");
        System.out.println(Arrays.toString(arr));
        //alacan
        int counter = 0;
        Arrays.sort(arr);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1].equals(arr[i])) {
                counter++;
            } else {
                System.out.println(arr[i - 1] + "=" + (counter + 1));
                counter = 0;
            }
            if (i == arr.length - 1) {
                System.out.println(arr[i] + "=" + (counter + 1));
            }

        }
    }
}
