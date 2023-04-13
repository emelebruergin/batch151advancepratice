package cozulensorular;

import java.util.Arrays;
import java.util.Random;

public class Method {
    public static void main(String[] args) {
   //||This Part Should be in Main Method||
        //
        //     -Create an array of size 5, assign some random values from 0 to 10
        //     -(use random class and for loop to assign values)
        //
        //
        //    ||You should create public static void methods fori loop (Parameter should be int Array for methods)||
        //
        //     -1-Create a method that prints array like "2 3 1 10 2", space between elements of array
        //     -2-Create a method that prints the sum of an array
        //-3-Create a method that prints the max element of an array
        //    //
        //    //    P.S: Return type should be void because we are not returning anything just printing







        int arr[]=new int[5];
        arrOlustur(arr);
        arrBoslukluYazdir(arr);
        arrTopla(arr);
        arrMax(arr);


    }

    private static void arrMax(int[] arr) {
        Arrays.sort(arr);
        int max=arr[arr.length-1];
        System.out.println(max);
    }

    private static void arrTopla(int[] arr) {
        int sum=0;
        for(int x:arr){
            sum=sum+x;
        }
        System.out.println(sum);
    }

    private static void arrBoslukluYazdir(int[] arr) {
        for (int x:arr){
            System.out.print(x+" ");
        }
        System.out.println();
    }

    private static void arrOlustur(int[] arr) {
        Random rnd=new Random();
        for (int i=0;i<arr.length;i++){
            arr[i]=rnd.nextInt(10);
        }
        System.out.println(Arrays.toString(arr));
    }
}
