package cozulensorular;

public class ArraylerinAyniIndexIcleriniTopla {
    //Aşağıdaki mutli dimensional array'lerin iç array'lerinde
// aynı indexe sahip elamanların toplamını yazdıran bir program yazın.
// arr1[]={{1,2},{3,4,5}{6}}
// arr2[]={{7,8,9},{10,11},{12}}

    public static void main(String[] args) {
        int arr1[][]={{1,2},{3,4,5},{6}};
        int arr2[][]={{7,8,9},{10,11},{12}};

        for (int []w:arr1){
            for (int[]a:arr2){

                if (w.length==a.length){
                    for (int i = 0; i < w.length; i++) {
                        System.out.println(w[i]+a[i]);
                    }
                }
            }
        }




    }
}
