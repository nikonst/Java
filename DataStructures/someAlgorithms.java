// @Nikos Konstantakis
// @October 2018

import java.util.Collections;
import static java.util.Collections.max;
import static java.util.Collections.min;
import static java.util.Collections.reverse;
import static java.util.Collections.rotate;
import java.util.Comparator;
import java.util.LinkedList;


public class someAlgorithms {
    
    public static void main(String[] args) {
        
        LinkedList<String> ll = new LinkedList<String>(); 
        
        ll.add("A");
        ll.add("B");
        ll.add("C");
        ll.add("D");
        ll.add("E");
        ll.add("F");
        ll.add("F");
        System.out.println("Size:"+ll.size()+" - The List:"+ll.toString());
        
        rotate(ll,4);
        System.out.println("Size:"+ll.size()+" - The List:"+ll.toString());
        
        reverse(ll);
        System.out.println("Size:"+ll.size()+" - The List:"+ll.toString());
        
        // Create a reverse order comparator
        Comparator r = Collections.reverseOrder();
        Collections.sort(ll, r);
        System.out.println("Size:"+ll.size()+" - The List:"+ll.toString());
        
        // Sort the List
        Collections.sort(ll);
        System.out.println("Size:"+ll.size()+" - The List:"+ll.toString());
        
        // Min Max
        System.out.println("Min:"+min(ll));
        System.out.println("Max:"+max(ll));
        
    }
 }
