package cozulensorular;

public class PaskalUcgeni {
    public static void main(String[] args) {
        int rows=5;
        int number;
        for (int i=0;i<rows;i++){
            for (int j=rows ; j>i;j--){
                System.out.print(" ");
            } number=1;
            for (int k=0;k<=i;k++){
                System.out.print(number+" ");
                number=number*(i-k)/(k+1);
            }
            System.out.println();

        }
    }
}
