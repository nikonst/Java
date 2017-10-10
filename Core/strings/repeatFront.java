package strings;

/**
 * Created by Nikos on 8/22/2017.
 *
 Given a string and an int n, return a string made of the first n characters of the string,
 followed by the first n-1 characters of the string, and so on. You may assume that n
 is between 0 and the length of the string, inclusive (i.e. n >= 0 and n <= str.length()).

 repeatFront("Chocolate", 4) - "ChocChoChC"
 repeatFront("Chocolate", 3) - "ChoChC"
 repeatFront("Ice Cream", 2) - "IcI"
 */
public class repeatFront {

    public static String repeatFront(String str, int n) {

        String s = "";
        for(int i=n;i>0;i--) {
            s = s.concat(str.substring(0,i));
        }
        return s;
    }

    public static void main(String[] args) {

        String s1 = "Hello Everyone!", s2 = "Ground Control", s3 = "Ice Cream";

        System.out.println(repeatFront(s1,5));
        System.out.println(repeatFront(s2,3));
        System.out.println(repeatFront(s3,8));
        System.out.println(repeatFront("Chocolate",4));
        System.out.println(repeatFront("Chocolate",3));
        System.out.println(repeatFront("Ice Cream",2));
    }
}
