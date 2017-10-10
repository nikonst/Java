package arrays;

import java.util.Arrays;

/**
 *
 * Created by Nikos on 8/22/2017.
 *
 Given an array of ints of even length, return a new array length 2 containing the middle two elements
 from the original array. The original array will be length 2 or more.

 makeMiddle([1, 2, 3, 4]) - [2, 3]
 makeMiddle([7, 1, 2, 3, 4, 9]) - [2, 3]
 makeMiddle([1, 2]) - [1, 2]
 */

public class makeMiddle {

    public static int[] makeMiddle(int[] nums) {

        int[] k = {-1,-1};
        if(nums.length % 2 == 0) {
            k[0] = nums[nums.length/2 - 1];
            k[1] = nums[nums.length/2];
            return k;
        }
        return k;
    }

    public static void main(String args[]) {

        int[] x1 = {2,3,5,6,2,1}, x2 = {2,2,4,5,6,7,5,6,8,7}, x3 = {3,3,4,5}, x4 = {1};
        int[] result;

        System.out.println(Arrays.toString(x1));
        result = makeMiddle(x1);
        System.out.println(Arrays.toString(result) + "\n");

        System.out.println(Arrays.toString(x2));
        result = makeMiddle(x2);
        System.out.println(Arrays.toString(result) + "\n");

        System.out.println(Arrays.toString(x3));
        result = makeMiddle(x3);
        System.out.println(Arrays.toString(result) + "\n");

        System.out.println(Arrays.toString(x4));
        result = makeMiddle(x4);
        System.out.println(Arrays.toString(result) + "\n");
    }
}
