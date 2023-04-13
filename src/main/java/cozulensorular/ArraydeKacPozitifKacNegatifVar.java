package cozulensorular;

public class ArraydeKacPozitifKacNegatifVar {
    public static void main(String[] args) {
        int []arr={-12, 18, -5, 23, -2};


        int poztf=0;
        int ngtf=0;

        for (int w:arr){
            if (w>0){
                if (w>poztf){
                    poztf++;
                }
            }else {
                if (w<ngtf){
                    ngtf++;
                }

            }
        }
        System.out.println("poztf = " + poztf);
        System.out.println("ngtf = " + ngtf);

    }
}
