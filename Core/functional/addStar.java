package functional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * Created by Nikos on 8/22/2017.
 *
 Given a list of strings, return a list where each string has "*" added at its end.

 addStar(["a", "bb", "ccc"]) - ["a*", "bb*", "ccc*"]
 addStar(["hello", "there"]) - ["hello*", "there*"]
 addStar(["*"]) - ["**"]
 */
public class addStar {

    public static List<String> addStar(List<String> strings) {
        strings.replaceAll(s -> s+"*");
        return strings;
    }

    public static void main(String[] args) {
        ArrayList<String> s1 = new ArrayList<String>(Arrays.asList("a", "bb", "ccc"));
        ArrayList<String> s2 = new ArrayList<String>(Arrays.asList("hello", "there"));
        ArrayList<String> s3 = new ArrayList<String>(Arrays.asList("*"));

        System.out.println(s1);
        System.out.println(addStar(s1));
        System.out.println(s2);
        System.out.println(addStar(s2));
        System.out.println(s3);
        System.out.println(addStar(s3));
    }
}
