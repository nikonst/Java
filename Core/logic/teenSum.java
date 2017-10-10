package logic;

/**
 *
 * Created by Nikos on 8/22/2017.
 *
 Given 2 ints, a and b, return their sum. However, "teen" values in the range 13..19 inclusive, are extra lucky.
 So if either value is a teen, just return 19.

 teenSum(3, 4) → 7
 teenSum(10, 13) → 19
 teenSum(13, 2) → 19
 */
public class teenSum {

    public static int teenSum(int a, int b) {

        int k =  a + b;
        if(k>=13 && k<=19) {
            return 19;
        }
        else {
            return k;
        }
    }

    public static void main(String[] args) {

        System.out.println(teenSum(12,3));
        System.out.println(teenSum(2,5));
        System.out.println(teenSum(12,15));
    }
}
