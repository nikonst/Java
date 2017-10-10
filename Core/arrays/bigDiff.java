package arrays;

import java.util.Arrays;

/**
 Created by Nikos on 8/22/2017.

 Given an array length 1 or more of ints,
 return the difference between the largest and smallest values in the array.

 bigDiff([10, 3, 5, 6]) - 7
 bigDiff([7, 2, 10, 9]) - 8
 bigDiff([2, 10, 7, 2]) - 8

 */
public class bigDiff {

    public static int bigDiff(int[] nums) {
        int min = nums[0], max = nums[0];

        if (nums.length>1) {
            for(int i=1;i<nums.length;i++) {
                if (min>=nums[i]) { min = nums[i]; }
                if (max<=nums[i]) { max = nums[i]; }
            }
            return max - min;
        }
        else
            return -9999;
    }

    public static void main(String args[]) {

        int[] x1 = {2, 3, 5, 6, 2, 1}, x2 = {2, 2, 4, 5, 6, 7, 5, 6, 8, 7}, x3 = {3, 3, 4, 5}, x4 = {1};
        int result;

        System.out.println(Arrays.toString(x1));
        result = bigDiff(x1);
        System.out.println(result + "\n");

        System.out.println(Arrays.toString(x2));
        result = bigDiff(x2);
        System.out.println(result + "\n");

        System.out.println(Arrays.toString(x3));
        result = bigDiff(x3);
        System.out.println(result + "\n");

        System.out.println(Arrays.toString(x4));
        result = bigDiff(x4);
        System.out.println(result + "\n");
    }
}
