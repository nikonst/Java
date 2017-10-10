package maps;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Nikos on 8/22/2017.
 *
 Given an array of strings, return a Map<String, Boolean>
 where each different string is a key and its value is true if that string appears 2 or more times in the array.

 wordMultiple(["a", "b", "a", "c", "b"]) - {"a": true, "b": true, "c": false}
 wordMultiple(["c", "b", "a"]) - {"a": false, "b": false, "c": false}
 wordMultiple(["c", "c", "c", "c"]) - {"c": true}
 */
public class wordMultiple {
    public static Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Boolean> map = new HashMap<String, Boolean> ();
        for(String s:strings) {
            if(!map.containsKey(s)) {
                map.put(s,false);
            }
            else {
                map.put(s,true);
            }
        }
        return map;
    }

    public static void main(String[] args) {
        String[] strArray1 = {"a", "b", "a", "c", "b"};
        String[] strArray2 = {"c", "b", "a"};
        String[] strArray3 = {"c", "c", "c", "c"};

        System.out.println(wordMultiple(strArray1));
        System.out.println(wordMultiple(strArray2));
        System.out.println(wordMultiple(strArray3));
    }
}
