package functional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * Created by Nikos on 8/22/2017.
 *
 Given a list of strings, return a list of the strings, omitting any string length 4 or more.

 noLong(["this", "not", "too", "long"]) - ["not", "too"]
 noLong(["a", "bbb", "cccc"]) - ["a", "bbb"]
 noLong(["cccc", "cccc", "cccc"]) - []
 */
public class noLong {

    public static List<String> noLong(List<String> strings) {
        strings.removeIf( s -> s.length()>=4);
        return strings;
    }

    public static void main(String[] args) {
        ArrayList<String> s1 = new ArrayList<String>(Arrays.asList("this", "not", "too", "long"));
        ArrayList<String> s2 = new ArrayList<String>(Arrays.asList("a", "bbb", "cccc"));
        ArrayList<String> s3 = new ArrayList<String>(Arrays.asList("cccc", "cccc", "cccc"));

        System.out.println(s1);
        System.out.println(noLong(s1));
        System.out.println(s2);
        System.out.println(noLong(s2));
        System.out.println(s3);
        System.out.println(noLong(s3));
    }
}
