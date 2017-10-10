package strings;

/**
 * Created by Nikos on 8/22/2017.
 *
 A sandwich is two pieces of bread with something in between. Return the string that is between the first and
 last appearance of "bread" in the given string, or return the empty string "" if there are not two pieces of bread.

 getSandwich("breadjambread") - "jam"
 getSandwich("xxbreadjambreadyy") - "jam"
 getSandwich("xxbreadyy") - ""
 */
public class getSandwich {

    public static String getSandwich(String str) {

        String s="",br="bread";
        int breadLength=br.length();

        int k=str.indexOf("bread");
        if(k>=0) {
            k = k + breadLength;
            int m = str.indexOf("bread", k + 1);
            if(m>=0) {
                s = str.substring(k, m);
            }
        }
        return s;
    }

    public static void main(String[] args) {

        String s1 = "breadjambread", s2 = "xxbreadhumbreadyy";
        String s3 = "My Sandwich is made of bread tomatoe, cheese bread.";
        String s4 = "NoSandwich", s5="xybreadyx";

        System.out.println(getSandwich(s1));
        System.out.println(getSandwich(s2));
        System.out.println(getSandwich(s3));
        System.out.println(getSandwich(s4));
        System.out.println(getSandwich(s5));
    }
}
