package arrays;

import java.util.Arrays;

/**
 *
 * Created by Nikos on 8/22/2017.
 *
 Given an array of ints, return true if every element is a 1 or a 4.

 only14([1, 4, 1, 4]) - true
 only14([1, 4, 2, 4]) - false
 only14([1, 1]) - true
 */
public class only14 {

    public static boolean only14(int[] nums) {

        boolean flag = true;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 1 && nums[i] != 4) {
                flag = false;
            }
        }
        return flag;
    }

    public static void main(String[] args) {

        int[] a1= {1,4,4,1,4,1}, a2 = {1,4,4,3,1,4,1}, a3 = {1}, a4 = {4,4,4,1,1,1,7};

        System.out.println(Arrays.toString(a1));
        System.out.println(only14(a1)+"\n");

        System.out.println(Arrays.toString(a2));
        System.out.println(only14(a2)+"\n");

        System.out.println(Arrays.toString(a3));
        System.out.println(only14(a3)+"\n");

        System.out.println(Arrays.toString(a4));
        System.out.println(only14(a4)+"\n");
    }
}
