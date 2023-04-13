package cozulensorular;

public class ArrayIcindeKacElemanVar {

    public static void main(String[] args) {
        /*
    int arr [][]={{7,12,97,23},{543,23,675},{2},{2,33,6,3,7}};
    verilen Array icinde
    --> kac tane eleman oldugunu return eden methodu yazdiriniz //cevap : 13 donsun
    */

        int arr[][] = {{7, 12, 97, 23}, {543, 23, 675}, {2}, {2, 33, 6, 3, 7}};

        System.out.println(sayiAdedi(arr));

    }
    private static int sayiAdedi(int[][] xxx) {
        int counter = 0;
        for (int[] w : xxx) {
            for (int k : w) {
                counter++;
            }
        }
        return counter;
    }
}





