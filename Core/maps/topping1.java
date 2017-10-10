package maps;

import java.util.HashMap;
import java.util.Map;
import java.util.*;

/**
 * Created by Nikos on 8/22/2017.
 *
 Given a map of food keys and topping values, modify and return the map as follows:
 if the key "ice cream" is present, set its value to "cherry".
 In all cases, set the key "bread" to have the value "butter".

 topping1({"ice cream": "peanuts"}) - {"bread": "butter", "ice cream": "cherry"}
 topping1({}) - {"bread": "butter"}
 topping1({"pancake": "syrup"}) - {"bread": "butter", "pancake": "syrup"}
 */
public class topping1 {
    public static Map<String, String> topping1(Map<String, String> map) {

        if(map.containsKey("ice cream")) {
            map.put("ice cream","cherry");
        }
        map.put("bread","butter");
        return map;
    }

    public static void main(String[] args) {

        Map<String,String> m1=new HashMap<String,String>();

        m1.clear();
        m1.put("ice cream","peanuts");
        System.out.println(topping1(m1));
        m1.clear();
        System.out.println(topping1(m1));
        m1.clear();
        m1.put("pancake","syrup");
        System.out.println(topping1(m1));
    }
}


