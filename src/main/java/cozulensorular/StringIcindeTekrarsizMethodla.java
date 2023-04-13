package cozulensorular;

public class StringIcindeTekrarsizMethodla {
    public static void main(String[] args) {
        /*
        Problem tanımı :
        Bir String içindeki tüm karakterleri en fazla bir kez yazdıran parametreli bir method yazınız.
        Test Data:
        input: "aabbcccccddddaaa"
        output: abcd
     */
        String input="aabbcccccddddaaa";
        benzersizYazdir(input);
    }

    private static void benzersizYazdir(String input) {
        String output="";
        for (int i=0;i<input.length();i++){
            String c=input.substring(i,i+1);


            if (!output.contains(c)){
                output+=c;
            }

    } System.out.println(output);
    }
}
