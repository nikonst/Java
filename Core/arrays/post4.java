package arrays;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * Created by Nikos on 8/22/2017.
 *
 Given a non-empty array of ints, return a new array containing the elements from the original array
 that come after the last 4 in the original array. The original array will contain at least one 4.
 Note that it is valid in java to create an array of length 0.

 post4([2, 4, 1, 2]) - [1, 2]
 post4([4, 1, 4, 2]) - [2]
 post4([4, 4, 1, 2, 3]) - [1, 2, 3]
 */
public class post4 {

    public static int[] post4(int[] nums) {
        int[] temp={0,0};

        ArrayList<Integer> nums_list = new ArrayList<Integer>();
        ArrayList<Integer> l = new ArrayList<Integer>();

        for(int k : nums) {
            nums_list.add(k);
        }

        for(int i=nums_list.lastIndexOf(4)+1;i<nums_list.size();i++) {
            l.add(nums_list.get(i));
        }
        int[] array_to_return = new int[l.size()];

        for (int i=0; i < array_to_return.length ; i++)
        {
            array_to_return[i] = l.get(i).intValue();
        }
        return array_to_return;
    }

    public static void main(String args[]) {

        int[] x1 = {2, 3, 5, 4, 2, 1}, x2 = {2, 2, 4, 5, 6, 4, 4, 6, 8, 7}, x3 = {3, 3, 4, 4}, x4 = {1};
        int[] result;

        System.out.println(Arrays.toString(x1));
        result = post4(x1);
        System.out.println(Arrays.toString(result) + "\n");

        System.out.println(Arrays.toString(x2));
        result = post4(x2);
        System.out.println(Arrays.toString(result) + "\n");

        System.out.println(Arrays.toString(x3));
        result = post4(x3);
        System.out.println(Arrays.toString(result) + "\n");

        System.out.println(Arrays.toString(x4));
        result = post4(x4);
        System.out.println(Arrays.toString(result) + "\n");
    }
}
