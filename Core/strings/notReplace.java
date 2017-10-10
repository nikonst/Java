package strings;

/**
 * Created by Nikos on 8/22/2017.
 *
 Given a string, return a string where every appearance of the lowercase word "is" has been replaced with "is not".
 The word "is" should not be immediately preceeded or followed by a letter --
 so for example the "is" in "this" does not count.
 (Note: Character.isLetter(char) tests if a char is a letter.)

 notReplace("is test") - "is not test"
 notReplace("is-is") - "is not-is not"
 notReplace("This is right") - "This is not right"
 */
public class notReplace {
    public static String notReplace(String str) {

        String s = str;
        boolean flag = false;

        int k1 = s.indexOf("is ");
        if(k1==0) {
            s = s.substring(0,3) + "not " + s.substring(3,s.length());
            flag=true;
        }

        int k2 = s.indexOf(" is ");
        while(k2!=-1) {
            flag=true;
            s = s.substring(0,k2+4) + "not " +s.substring(k2+4,s.length());
            k2 = s.indexOf(" is ",k2+5);
        }

        if(s.substring(s.length()-3).equals(" is")) {
            s = s + " not.";
            flag=true;
        }

        int k3 = s.indexOf("is-");
        while(k3!=-1) {
            flag=true;
            s = s.substring(0,k3+2) + " not" +s.substring(k3+2,s.length());
            k3 = s.indexOf("is-",k3+2);
        }

        int k4 = s.indexOf("-is");
        while(k4!=-1) {
            flag=true;
            s = s.substring(0,k4+3) + " not" +s.substring(k4+3,s.length());
            k4 = s.indexOf("is-",k4+3);
        }

        if(flag==true) {
            return s;
        }
        else {
            return str;
        }
    }

    public static void main(String[] args) {
        String s1 = "is Hello there", s2 = "this is wrong, it is right", s3 = "Mary is a little is lamb is";
        String s4 = "is-is";

        System.out.println(notReplace(s1));
        System.out.println(notReplace(s2));
        System.out.println(notReplace(s3));
        System.out.println(notReplace(s4));
    }
}
