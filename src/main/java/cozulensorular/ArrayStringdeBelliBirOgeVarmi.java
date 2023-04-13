package cozulensorular;

public class ArrayStringdeBelliBirOgeVarmi {
    public static void main(String[] args) {
        // Verilen bir String arraydeki belirli bir öğenin var olup olmadığını bulmak için kod yazınız.
        String[] arr = new String[]{"Apex", "is", "an", "object", "oriented", "programming", "language"};
        String s="object";
        int counter=0;
        for (String w:arr){
            if (w.equals(s)){
                counter++;
            }
        }
        if (counter>0){
            System.out.println(s+" Array de vardır");
        }else {
            System.out.println(s+" Array de yoktur");
        }










    }
}
