package strings;

/**
* Created by Nikos on 8/22/2017.
*
 Given two strings, base and remove, return a version of the base string where all instances of the remove string
 have been removed (not case sensitive). You may assume that the remove string is length 1 or more.
 Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".

 withoutString("Hello there", "llo") - "He there"
 withoutString("Hello there", "e") - "Hllo thr"
 withoutString("Hello there", "x") - "Hello there"
 */
public class withoutString {

    public static String withoutString(String base, String remove) {
        return base.replaceAll(remove,"");
    }

    public static void main(String[] args) {
        String s1 = "Hello there", s2 = "Return of the Jedi", s3 = "Mary had a little lamb";
        String s4 = "Sunday Monday Tuesday", s5="Strange Magic";

        System.out.println(withoutString(s1,"llo"));
        System.out.println(withoutString(s2,"the"));
        System.out.println(withoutString(s3,"lit"));
        System.out.println(withoutString(s4,"Mon"));
        System.out.println(withoutString(s5,"yes"));
    }
}
