package strings;

import java.util.Arrays;

/**
 * Created by Nikos on 8/22/2017.
 *
 We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
 Return true if all the g's in the given string are happy.

 gHappy("xxggxx") - true
 gHappy("xxgxx") - false
 gHappy("xxggyygxx") - false
 */
public class gHappy {

    public static boolean gHappy(String str) {

        boolean result = false;
        boolean flag = true;
        int len = str.length();
        char[] charArray = new char[len];

        for(int i =0;i<len;i++) {
            charArray[i] = str.charAt(i);
        }

        for(int i=1;i<len-1;i++) {
            if(charArray[i] == 'g'){
                if((charArray[i-1]=='g' || charArray[i+1]=='g') && flag==true){
                    result=true;
                }
                else {
                    result=false;
                    flag=false;
                }
            }
        }
        System.out.println(Arrays.toString(charArray));
        return result;
    }

    public static void main(String[] args) {
        String s1="xxggxx", s2="xxgxx", s3="xxggyygxxgg", s4="ggggg", s5="agabcggik";

        System.out.println(gHappy(s1));
        System.out.println(gHappy(s2));
        System.out.println(gHappy(s3));
        System.out.println(gHappy(s4));
        System.out.println(gHappy(s5));
    }
}
