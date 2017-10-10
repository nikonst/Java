package rercursion;

/**
 * Created by Nikos on 8/22/2017.
 *
 Given n of 1 or more, return the factorial of n, which is n * (n-1) * (n-2) ... 1.
 Compute the result recursively (without loops).

 factorial(1) - 1
 factorial(2) - 2
 factorial(3) - 6
 */
public class factorial {
    public static int factorial(int n) {
        if(n==0) {
            return 1;
        }
        else {
            return n*factorial(n-1);
        }
    }

    public static void main(String[] args) {

        for(int i=0;i<=10;i++) {
            System.out.println(i+" "+factorial(i));
        }
    }
}
