package logic;

/**
 * Created by Nikos on 8/22/2017.
 *
 We want make a package of goal kilos of chocolate. We have small bars (1 kilo each) and big bars (5 kilos each).
 Return the number of small bars to use, assuming we always use big bars before small bars.
 Return -1 if it can't be done.

 makeChocolate(4, 1, 9) - 4
 makeChocolate(4, 1, 10) - -1
 makeChocolate(4, 1, 7) - 2
 */
public class makeChocolate {

    public static int makeChocolate(int small, int big, int goal) {

        int smallKilos=small*1;
        int bigKilos=big*5;
        int goalKilos=goal;
        int numberOfSmallBars=0;

        if(bigKilos+smallKilos == goalKilos) {
            numberOfSmallBars=small;
        }
        else if(bigKilos+smallKilos>=goalKilos) {
            numberOfSmallBars=bigKilos+smallKilos-goalKilos;
        }
        else {
            numberOfSmallBars=-1;
        }
        return numberOfSmallBars;
    }

    public static void main(String[] args) {

        System.out.println(makeChocolate(4, 1, 9));
        System.out.println(makeChocolate(4, 1, 10));
        System.out.println(makeChocolate(4, 1, 7));
        System.out.println(makeChocolate(3, 2, 14));
        System.out.println(makeChocolate(3, 2, 11));
    }
}
