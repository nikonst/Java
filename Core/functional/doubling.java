package functional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * Created by Nikos on 8/22/2017.
 *
 Given a list of integers, return a list where each integer is multiplied by 2.

 doubling([1, 2, 3]) - [2, 4, 6]
 doubling([6, 8, 6, 8, -1]) - [12, 16, 12, 16, -2]
 doubling([]) - []
 */
public class doubling {

    public static List<Integer> doubling(List<Integer> nums) {
        nums.replaceAll(n -> n*2);
        return nums;
    }

    public static void main(String[] args) {

        ArrayList<Integer> n1 = new ArrayList<Integer>(Arrays.asList(1,2,3));
        ArrayList<Integer> n2 = new ArrayList<Integer>(Arrays.asList(6, 8, 6, 8, -1));
        ArrayList<Integer> n3 = new ArrayList<Integer>(Arrays.asList());

        System.out.println(n1);
        System.out.println(doubling(n1));
        System.out.println(n2);
        System.out.println(doubling(n2));
        System.out.println(n3);
        System.out.println(doubling(n3));
    }
}
