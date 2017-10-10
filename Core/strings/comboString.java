package strings;
/**
 * Created by Nikos on 8/22/2017.
 *
 Given 2 strings, a and b, return a string of the form short+long+short,
 with the shorter string on the outside and the longer string on the inside.
 The strings will not be the same length, but they may be empty (length 0).

 comboString("Hello", "hi") - "hiHellohi"
 comboString("hi", "Hello") - "hiHellohi"
 comboString("aaa", "b") - "baaab"
 */
public class comboString {

    public static String comboString(String a, String b) {
        String s;
        if(a.length() >= b.length()) {
            s = b+a+b;
        }
        else {
            s = a+b+a;
        }
        return s;
    }

    public static void main(String[] args) {

        String s1 = "Hello", s2 = "hi";
        String s3 = "hi", s4 = "Hello";
        System.out.println(comboString(s1,s2));
        System.out.println(comboString(s3,s4));
    }
}
