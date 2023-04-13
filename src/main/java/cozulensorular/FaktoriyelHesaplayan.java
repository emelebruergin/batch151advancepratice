package cozulensorular;

public class FaktoriyelHesaplayan {
    public static void main(String[] args) {
        //Girdi olarak bir tamsayı kabul eden ve faktöriyel hesaplayan programi yazıniz.
        //
        //Input : 6
        //
        //Output: 6!=6*5*4*3*2*1=720

        int num=6;
        int fakt=1;
        int i=num;
        while (i>0){
            fakt=fakt*i;
            i--;
        }
        String cc="";
      for (int k=num-1;k>0;k--){
          cc=cc+"*"+k;
      }
        System.out.println(num+"!="+num+cc+"="+fakt);

    }
}
