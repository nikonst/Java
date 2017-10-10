package arrays;
/*
Created by Nikos on 8/22/2017.

 Given an array of ints length 3, return a new array with the elements in reverse order,
 so {1, 2, 3} becomes {3, 2, 1}.

 arrays.reverse3([1, 2, 3]) - [3, 2, 1]
 arrays.reverse3([5, 11, 9]) - [9, 11, 5]
 arrays.reverse3([7, 0, 0]) - [0, 0, 7]
 */

public class reverse3 {

    public static int[] reverse3(int[] nums) {
        int[] k;
        k = new int[3];

        for(int i=0;i<nums.length;i++) {
           k[i] = nums[nums.length-i-1];
        }
        return k;
    }

    public static void main(String args[]) {

        int[] x = {1,2,3};
        int[] r;

        for(int i=0;i<x.length;i++) {
            System.out.println(x[i]);
        }
        System.out.println("******************");
        r = reverse3(x);
        for(int i=0;i<r.length;i++) {
            System.out.println(r[i]);
        }
    }
}
