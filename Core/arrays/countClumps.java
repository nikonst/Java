package arrays;

import java.util.Arrays;

/**
 *
 * Created by Nikos on 8/22/2017.
 *
 Say that a "clump" in an array is a series of 2 or more adjacent elements of the same value.
 Return the number of clumps in the given array.

 countClumps([1, 2, 2, 3, 4, 4]) - 2
 countClumps([1, 1, 2, 1, 1]) - 2
 countClumps([1, 1, 1, 1, 1]) - 1
 */
public class countClumps {

    public static int countClumps(int[] nums) {
        int count=0,x=nums[0];
        boolean isTheSame=false;

        for(int i=0;i<nums.length-1;i++) {
            if(nums[i]==nums[i+1] ) {
                if(!isTheSame) {
                    count++;
                    isTheSame=true;
                }
            }
            else {
                isTheSame=false;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        int[] a1= {1, 2, 2, 2, 3, 4, 4,7,8,8,8,9}, a2 = {1, 1, 2, 1, 1}, a3 = {1, 1, 1, 1, 1}, a4 = {1, 1, 1, 2, 1};

        System.out.println(Arrays.toString(a1));
        System.out.println(countClumps(a1)+"\n");

        System.out.println(Arrays.toString(a2));
        System.out.println(countClumps(a2)+"\n");

        System.out.println(Arrays.toString(a3));
        System.out.println(countClumps(a3)+"\n");

        System.out.println(Arrays.toString(a4));
        System.out.println(countClumps(a4)+"\n");
    }
}
