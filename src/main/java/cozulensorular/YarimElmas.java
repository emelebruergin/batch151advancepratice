package cozulensorular;

public class YarimElmas {
    public static void main(String[] args) {
        int rows=10;

        for (int i=0;i<rows;i++){
            for (int j=rows ; j>i;j--){
                System.out.print(" ");
            }
            for (int k=0;k<i+1;k++){
                System.out.print("* ");
            }
            System.out.println();

        }

        for (int i=0;i<rows-1;i++){
            for (int j=0;j<i+2;j++){
                System.out.print(" ");
            }

            for (int k=rows-1;k>i;k--){
                System.out.print("* ");
            }
            System.out.println();
        }






    }
}
