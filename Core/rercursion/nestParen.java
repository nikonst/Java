package rercursion;

/**
 * Created by Nikos on 8/22/2017.
 *
 Given a string, return true if it is a nesting of zero or more pairs of parenthesis, like "(())" or "((()))".

 nestParen("(())") - true
 nestParen("((()))") - true
 nestParen("(((x))") - false
 */

public class nestParen {
    public static boolean nestParen(String str) {
        if(str.length()>=2) {
            if ((str.charAt(0) == '(') && (str.charAt(str.length() - 1) == ')')) {
                return true && nestParen(str.substring(1, str.length() - 1));
            } else {
                return false;
            }
        }
        else return true;
    }

    public static void main(String[] args) {

        System.out.println(nestParen("(())"));
        System.out.println(nestParen("((()))"));
        System.out.println(nestParen("(((x))"));
        System.out.println(nestParen("(((x)))"));
        System.out.println(nestParen("(((((((("));
    }
}
