package myjavanet;

/**
 *
 * @author Nikos Konstantakis
 */

public class MyJavaNet {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        if(args.length != 0) {
            System.out.println("Arg 0:"+args[0]);
            System.out.println("Arg 1:"+args[1]);
        }
        else {
            System.out.println("No arguments");
        }
    } 
}
