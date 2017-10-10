package logic;

/**
 *
 * Created by Nikos on 8/22/2017.
 *
 Given three ints, a b c, one of them is small, one is medium and one is large.
 Return true if the three values are evenly spaced, so the difference between small and medium
 is the same as the difference between medium and large.

 evenlySpaced(2, 4, 6) - true
 evenlySpaced(4, 6, 2) - true
 evenlySpaced(4, 6, 3) - false
 */
public class evenlySpaced {
    public static boolean evenlySpaced(int a, int b, int c) {

        boolean result=false;

        if(a>b && a>c) {
            if (b > c) {
                if (a - b == b - c) {
                    result = true;
                }
            }
            else {
                    if (a - c == c - b) {
                        result = true;
                    }
                }
        }
        else if(b>a && b>c){
            if(a>c) {
                if (b - a == a - c) {
                    result = true;
                }
            }
             else {
                    if(b-c==c-a) {
                        result=true;
                    }
            }
        }
        else if(c>a && c>b) {
            if(b>a){
                if(c-b==b-a) {
                    result=true;
                }
            }
            else{
                if(c-a==a-b){
                    result=true;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println(evenlySpaced(2, 4, 6));
        System.out.println(evenlySpaced(4, 6, 2));
        System.out.println(evenlySpaced(4, 6, 3));
        System.out.println(evenlySpaced(6, 4, 2));
        System.out.println(evenlySpaced(6, 2, 4));
    }
}
