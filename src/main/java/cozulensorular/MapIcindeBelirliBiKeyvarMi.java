package cozulensorular;

import java.util.HashMap;
import java.util.Map;

public class MapIcindeBelirliBiKeyvarMi {
    public static void main(String[] args) {


    Map<String ,Integer> vv= new HashMap<>();

    vv.put("Leptop",12);
    vv.put("TV",13);
    vv.put("Radio",16);
    vv.put("Ps",44);
    vv.put("Kulaklik",55);

    String varMi="Leptop";

    if (vv.containsKey(varMi)){
        System.out.println("VArdır");

    }else System.out.println("Yoktur");
}
 }