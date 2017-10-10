package maps;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Nikos on 8/22/2017.
 *
 Given an array of strings, return a Map<String, Integer> containing a key for every different string in the array,
 and the value is that string's length.

 wordLen(["a", "bb", "a", "bb"]) - {"bb": 2, "a": 1}
 wordLen(["this", "and", "that", "and"]) - {"that": 4, "and": 3, "this": 4}
 wordLen(["code", "code", "code", "bug"]) - {"code": 4, "bug": 3}
 */
public class wordLen {
    public static Map<String, Integer> wordLen(String[] strings) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        for(String s:strings) {
            map.put(s,s.length());
        }
        return map;
    }

    public static void main(String[] args) {
        String[] strArray1 = {"a", "bb", "a", "bb"};
        String[] strArray2 = {"this", "and", "that", "and"};
        String[] strArray3 = {"code", "code", "code", "bug"};

        System.out.println(wordLen(strArray1));
        System.out.println(wordLen(strArray2));
        System.out.println(wordLen(strArray3));
    }
}
