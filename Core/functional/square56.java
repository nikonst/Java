package functional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * Created by Nikos on 8/22/2017.
 *
 Given a list of integers, return a list of those numbers squared and the product added to 10,
 omitting any of the resulting numbers that end in 5 or 6.

 square56([3, 1, 4]) - [19, 11]
 square56([1]) - [11]
 square56([2]) - [14]
 */
public class square56 {
    public static List<Integer> square56(List<Integer> nums) {

        nums = nums.stream()
                .map(n -> n * n + 10)
                .filter(n -> !(n % 10 == 6 || n % 10 ==5))
                .collect(Collectors.toList());
        return nums;
    }

    public static void main(String[] args) {
        ArrayList<Integer> n1 = new ArrayList<Integer>(Arrays.asList(3, 1, 4));
        ArrayList<Integer> n2 = new ArrayList<Integer>(Arrays.asList(1,5));
        ArrayList<Integer> n3 = new ArrayList<Integer>(Arrays.asList(2));

        System.out.println(n1);
        System.out.println(square56(n1));
        System.out.println(n2);
        System.out.println(square56(n2));
        System.out.println(n3);
        System.out.println(square56(n3));
    }
}
