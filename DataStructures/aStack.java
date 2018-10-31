// @Nikos Konstantakis
// @October 2018

import java.util.Random;
import java.util.Stack;


public class aStack {

    public static void main(String[] args) {
        
        Random r = new Random();
        
        Stack s = new Stack();
        
        System.out.println(s);
        System.out.println("Stack Size:"+s.size());
 
        System.out.println("******************");
        
        for(int i = 0; i< 10; i++) {
            s.push(r.nextInt(100));
        }
        
        System.out.println(s);
        System.out.println("Stack Size:"+s.size());
        
        System.out.println("******************");
        
        int k = (Integer) s.pop();
        
        System.out.println("k = "+k);
        System.out.println(s);
        System.out.println("Stack Size:"+s.size());
        
    }
    
}
