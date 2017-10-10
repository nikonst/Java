package arrays;

import java.util.Arrays;

/**
 *
 * Created by Nikos on 8/22/2017.
 *
 Given an array of ints, return true if every 2 that appears in the array is next to another 2.

 twoTwo([4, 2, 2, 3]) - true
 twoTwo([2, 2, 4]) - true
 twoTwo([2, 2, 4, 2]) - false
 */
public class twoTwo {

    public static boolean twoTwo(int[] nums) {

        boolean flag = false;

        for(int i=1;i<nums.length-1;i++) {
            if(nums[i] == 2) {
                if(nums[i+1]==2 || nums[i-1]==2) {
                    flag = true;
                }
                else {
                    flag = false;
                    break;
                }
            }
        }
     return flag;
    }

    public static void main(String[] args) {

        int[] a1= {2,2,4,1,2,1}, a2 = {1,3,4,2,2,4,1}, a3 = {1}, a4 = {4,1,4,1,2,2,7};

        System.out.println(Arrays.toString(a1));
        System.out.println(twoTwo(a1)+"\n");

        System.out.println(Arrays.toString(a2));
        System.out.println(twoTwo(a2)+"\n");

        System.out.println(Arrays.toString(a3));
        System.out.println(twoTwo(a3)+"\n");

        System.out.println(Arrays.toString(a4));
        System.out.println(twoTwo(a4)+"\n");
    }
}
