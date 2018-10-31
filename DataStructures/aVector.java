// @Nikos Konstantakis
// @October 2018

import java.util.Random;
import java.util.Vector;

public class aVector {

    public static void main(String[] args) {
        Vector v = new Vector();
        Random r = new Random();
        
        System.out.println(v.capacity());
        System.out.println(v.toString());
        
        for(int i = 0; i < 10 ;i++) {
            v.addElement(r.nextInt(100));
        }
        System.out.println(v.toString());
        System.out.println("Size of vector: "+v.size());
        
        for(int i = 0; i < 5 ;i++) {
            v.addElement(r.nextInt(100));
        }
        System.out.println(v.toString());
        System.out.println("Size of vector: "+v.size());
     
        System.out.println("First element: " + v.firstElement());
        System.out.println("Last element: " + v.lastElement());
        
        System.out.println("******************");
        
        v.remove(1);
        System.out.println(v.toString());
        System.out.println("Size of vector: "+v.size());
        
        v.removeAllElements();
        System.out.println(v.toString());
        System.out.println("Size of vector: "+v.size());
        
    }
    
}
