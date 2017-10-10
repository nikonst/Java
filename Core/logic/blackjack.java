package logic;

/**
 *
 * Created by Nikos on 8/22/2017.
 *
 Given 2 int values greater than 0, return whichever value is nearest to 21 without going over.
 Return 0 if they both go over.

 blackjack(19, 21) - 21
 blackjack(21, 19) - 21
 blackjack(19, 22) - 19
 */
public class blackjack {
    public static int blackjack(int a, int b) {

        if(a>0 && b>0){
            int a21 = 21-a;
            int b21 = 21-b;
            if(a21<0 && b21<0) {
                return 0;
            }
            else if(a21<0 && b21>=0) {
                return b;
            }
            else if(a21>=0 && b21<0) {
                return a;
            }
            else if(a21<=b21){
                return a;
            }
            else {
                return b;
            }
        }
        else return -1;
    }
    public static void main(String[] args) {
        System.out.println(blackjack(19,17));
        System.out.println(blackjack(19,21));
        System.out.println(blackjack(21,19));
        System.out.println(blackjack(19,22));
        System.out.println(blackjack(21,22));
        System.out.println(blackjack(23,22));
        System.out.println(blackjack(-1,22));
    }
}
