package rercursion;

/**
 * Created by Nikos on 8/22/2017.
 *
 Count recursively the total number of "abc" substrings that appear in the given string.

 countAbc("abc") - 1
 countAbc("abcxxabc") - 2
  */
public class countAbc {

    public static int countAbc(String str) {

        if(str.indexOf("abc")!=-1)
            return 1 + countAbc(str.substring(str.indexOf("abc")+3));
        else {
            return 0;
        }
    }

    public static void main(String[] args) {

        System.out.println(countAbc("abc-string"));
        System.out.println(countAbc("abc-abc-string"));
        System.out.println(countAbc("abc-abc-string-abc"));
        System.out.println(countAbc("another-string"));
    }
}
