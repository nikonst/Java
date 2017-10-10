package arrays;

import java.util.Arrays;

/**
 * Created by Nikos on 8/22/2017.

 Given a non-empty array, return true if there is a place to split the array so that the sum
 of the numbers on one side is equal to the sum of the numbers on the other side.

 canBalance([1, 1, 1, 2, 1]) - true
 canBalance([2, 1, 1, 2, 1]) - false
 canBalance([10, 10]) - true
 */
public class canBalance {

    public static boolean canBalance(int[] nums) {

        boolean flag = false;
        int s1=0,s2=0;

        for(int i=0;i<nums.length;i++) {
            for(int j=0;j<i;j++) {
                s1+=nums[j];
            }
            for(int k=i;k<nums.length;k++) {
                s2+=nums[k];
            }
            if (s1==s2) {
                flag = true;
                break;
            }
            s1=s2=0;
        }
        return flag;
    }

    public static void main(String[] args) {

        int[] a1= {2,2,4,2,2,4}, a2 = {1,3,4,2,2,4,1}, a3 = {10, 10}, a4 = {1, 1, 1, 2, 1};

        System.out.println(Arrays.toString(a1));
        System.out.println(canBalance(a1)+"\n");

        System.out.println(Arrays.toString(a2));
        System.out.println(canBalance(a2)+"\n");

        System.out.println(Arrays.toString(a3));
        System.out.println(canBalance(a3)+"\n");

        System.out.println(Arrays.toString(a4));
        System.out.println(canBalance(a4)+"\n");
    }
}
