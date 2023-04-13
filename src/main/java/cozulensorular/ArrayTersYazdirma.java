package cozulensorular;

public class ArrayTersYazdirma {
    public static void main(String[] args) {
        String s = "Java is fun";


        //********  1.way******
        // String[] str = s.split(" ");
        // String [] ss=new String[str.length];
        // int count=0;
        // for (int i = str.length - 1; i > -1; i--) {
        //     ss[count]=str[i];
        //     count++;

        // }
        // System.out.println(Arrays.toString(ss));


        //****2.way***

        String[] str = s.split(" ");

        for (int i=str.length-1;i>-1;i--){
            System.out.print(str[i]+" ");
        }
    }
}
