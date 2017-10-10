package functional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * Created by Nikos on 8/22/2017.
 *
 Given a list of integers, return a list where each integer is multiplied with itself.

 square([1, 2, 3]) - [1, 4, 9]
 square([6, 8, -6, -8, 1]) - [36, 64, 36, 64, 1]
 square([]) - []
 */
public class square {
    public static List<Integer> square(List<Integer> nums) {
        nums.replaceAll(n->n*n);
        return nums;
    }

    public static void main(String[] args) {
        ArrayList<Integer> n1 = new ArrayList<Integer>(Arrays.asList(1,2,3));
        ArrayList<Integer> n2 = new ArrayList<Integer>(Arrays.asList(6, 8, -6, -8, 1));
        ArrayList<Integer> n3 = new ArrayList<Integer>(Arrays.asList());

        System.out.println(n1);
        System.out.println(square(n1));
        System.out.println(n2);
        System.out.println(square(n2));
        System.out.println(n3);
        System.out.println(square(n3));
    }
}
