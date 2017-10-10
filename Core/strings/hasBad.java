package strings;

/**
 * Created by Nikos on 8/22/2017.
 *
 Given a string, return true if "bad" appears starting at index 0 or 1 in the string,
 such as with "badxxx" or "xbadxx" but not "xxbadxx".
 The string may be any length, including 0. Note: use .equals() to compare 2 strings.

 hasBad("badxx") - true
 hasBad("xbadxx") - true
 hasBad("xxbadxx") - false
 */
public class hasBad {

    public static boolean hasBad(String str) {

        String s =new String("bad");

        if(str.lastIndexOf(s)==0 || str.lastIndexOf(s)==1) {
            System.out.println(str.lastIndexOf(s));
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {

        String s1 = "Hellobad", s2 = "badHello", s3 = "1badHello";

        System.out.println(hasBad(s1));
        System.out.println(hasBad(s2));
        System.out.println(hasBad(s3));
    }
}
