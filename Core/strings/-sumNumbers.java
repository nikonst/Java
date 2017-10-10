package strings;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Nikos on 8/22/2017.
 *
 Given a string, return the sum of the numbers appearing in the string, ignoring all other characters.
 A number is a series of 1 or more digit chars in a row.
 (Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'.
 Integer.parseInt(string) converts a string to an int.)

 sumNumbers("abc123xyz") - 123
 sumNumbers("aa11b33") - 44
 sumNumbers("7 11") - 18
 */
public class sumNumbers {

    public static int sumNumbers(String str) {
        int sum=0;
        ArrayList<Integer> index_list = new ArrayList<>();
        char[] charArray = str.toCharArray();

        ArrayList<String> str_Numbers = new ArrayList<>();

        for(int i=0;i<str.length();i++) {
            if(Character.isDigit(charArray[i])) {
                index_list.add(i);
            }
        }

        for(int i=0;i<index_list.size();i++) {
            //char c = index_list[i].toArray();
            //str_Numbers.add(Character.toString(c));
        }

        System.out.println(Arrays.toString(index_list.toArray()));

        str_Numbers.add(Character.toString(charArray[2]));
        System.out.println(Arrays.toString(str_Numbers.toArray()));

        return sum;
    }

    public static void main(String[] args) {

        String s1 = "xx1yy56t4hh873kkk", s2 = "abcdefg", s3 = "12 13 14";

        System.out.println(sumNumbers(s1));
    }
}
