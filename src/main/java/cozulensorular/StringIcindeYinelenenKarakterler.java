package cozulensorular;

public class StringIcindeYinelenenKarakterler {
    public static void main(String[] args) {

        //Bir String icerisinde yinelenen karakterleri döndüren bir kod yazıniz.(mülakat Sorusu)
        //
        //Input :
        //
        //String str=“Javaisalsoeasy”
        //
        //Output: a s

        String str="Javaisalsoeasy";

        String c="";

        for (int i=0;i<str.length();i++){
            String d=str.substring(i,i+1);
            if (str.indexOf(d)!=str.lastIndexOf(d)&& !c.contains(d)){
                c+=d+" ";
            }
        }
        System.out.println(c);
    }
}
