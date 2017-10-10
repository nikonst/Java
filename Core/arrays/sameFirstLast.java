package arrays;

/**
 * Created by Nikos on 8/22/2017.
 *
 Given an array of ints, return true if the array is length 1 or more,
 and the first element and the last element are equal.

 sameFirstLast([1, 2, 3]) - false
 sameFirstLast([1, 2, 3, 1]) - true
 sameFirstLast([1, 2, 1]) - true
 */
public class sameFirstLast {

    public static boolean sameFirstLast(int[] nums) {
        if(nums.length>1 && nums[0] == nums[nums.length-1])
            return true;
        else
            return false;
    }

    public static void main(String args[]) {

        int[] x1 = {2,3,5,6,2}, x2 = {2,2,4,5,6}, x3 = {3,3,4,5,67,3}, x4 = {1};
        boolean result;

        result = sameFirstLast(x1);
        System.out.println(result);

        result = sameFirstLast(x2);
        System.out.println(result);

        result = sameFirstLast(x3);
        System.out.println(result);

        result = sameFirstLast(x4);
        System.out.println(result);
    }
}
