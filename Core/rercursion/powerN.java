package rercursion;

/**
 * Created by Nikos on 8/22/2017.
 *
 Given base and n that are both 1 or more, compute recursively (no loops) the value of base to the n power,
 so powerN(3, 2) is 9 (3 squared).

 powerN(3, 1) - 3
 powerN(3, 2) - 9
 powerN(3, 3) - 27
 */
public class powerN {

    public static int powerN(int base, int n) {
        if(n==1) {
            return base;
        }
        else {
            return base*powerN(base,n-1);
        }
    }

    public static void main(String[] args) {

        for(int i=1;i<=10;i++) {
            for(int j=1;j<=3;j++) {
                System.out.println(i+"^"+j+"\t"+"="+powerN(i,j));
            }
        }
    }
}
