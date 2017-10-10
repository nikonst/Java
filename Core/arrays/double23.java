package arrays;

/**
 *
 * Created by Nikos on 8/22/2017.
 *
 Given an int array, return true if the array contains 2 twice, or 3 twice. The array will be length 0, 1, or 2.

 double23([2, 2]) - true
 double23([3, 3]) - true
 double23([2, 3]) - false
 */
public class double23 {

    public static boolean double23(int[] nums) {
        int count_2 = 0, count_3 = 0;

        for(int i=0;i<nums.length;i++) {
            if (nums[i] == 2) {
                count_2++;
            }
            if (nums[i] == 3) {
                count_3++;
            }
        }
        if(count_2>1 || count_3>1)
            return true;
        else
            return false;
    }

    public static void main(String args[]) {

        int[] x1 = {2,3}, x2 = {2,2}, x3 = {3,3}, x4 = {1};
        boolean result;

        result = double23(x1);
        System.out.println(result);

        result = double23(x2);
        System.out.println(result);

        result = double23(x3);
        System.out.println(result);

        result = double23(x4);
        System.out.println(result);
    }
}
