package strings;

import java.util.*;

/**
 * Created by Nikos on 8/22/2017.
 *
 Given a string, return the length of the largest "block" in the string.
 A block is a run of adjacent chars that are the same.

 maxBlock("hoopla") - 2
 maxBlock("abbCCCddBBBxx") - 3
 maxBlock("") - 0
 */
public class maxBlock {
    public static int maxBlock(String str) {
        int max = 1;
        int len = str.length();

        if (len >= 2) {
            char[] charArray = new char[len];
            List<Integer> maxList = new ArrayList<>();

            for (int i = 0; i < len; i++) {
                charArray[i] = str.charAt(i);
            }

            int t = 0;
            while (t < len - 1) {
                if (charArray[t] == charArray[t + 1]) {
                    max += 1;

                } else {
                    maxList.add(max);
                    max = 1;
                }
                t++;
            }
            int maxMax = maxList.get(0);
            for (Integer i : maxList) {
                if (i > maxMax) maxMax = i;
            }
            return maxMax;
        }
        else if(len==1)
            return 1;
        else
            return 0;
    }

    public static void main(String[] args) {
        String s1 = "hoopla", s2 = "abbCCCCddBBBxx", s3 = "i";

        System.out.println(maxBlock(s1));
        System.out.println(maxBlock(s2));
        System.out.println(maxBlock(s3));
    }
}
