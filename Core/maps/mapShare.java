package maps;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Nikos on 8/22/2017.
 *
 Modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that same value.
 In all cases remove the key "c", leaving the rest of the map unchanged.

 mapShare({"a": "aaa", "b": "bbb", "c": "ccc"}) - {"a": "aaa", "b": "aaa"}
 mapShare({"b": "xyz", "c": "ccc"}) - {"b": "xyz"}
 mapShare({"a": "aaa", "c": "meh", "d": "hi"}) - {"a": "aaa", "b": "aaa", "d": "hi"}
 */
public class mapShare {

    public static Map<String, String> mapShare(Map<String, String> map) {

        if(map.containsKey("c")) {
            map.remove(("c"));
        }
        if(map.containsKey("a")) {
            map.put("b",(String) map.get("a"));
        }
        return map;
    }

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();

        map.put("a","aaa");
        map.put("b","bbb");
        map.put("c","ccc");
        System.out.println(mapShare(map));
        map.clear();
        map.put("b","xyz");
        map.put("c","ccc");
        System.out.println(mapShare(map));
        map.clear();
        map.put("a","aaa");
        map.put("c","meh");
        map.put("d","hi");
        System.out.println(mapShare(map));
    }
}
