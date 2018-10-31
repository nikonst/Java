// @Nikos Konstantakis
// @October 2018

import java.util.*;

public class aLinkedList {
    
    public static void main(String[] args) {
        
        LinkedList<String> ll = new LinkedList<String>(); 
        
        ll.add("A");
        ll.add("B");
        ll.add("C");
        ll.add("D");
        ll.add("E");
        
        System.out.println("Size:"+ll.size()+" - The List:"+ll.toString());
        
        ll.add("F");
        ll.add("F");
        System.out.println("Size:"+ll.size()+" - The List:"+ll.toString());
        
        System.out.println(ll.contains("A"));
        
        ll.remove("B");
        System.out.println("Size:"+ll.size()+" - The List:"+ll.toString());
        
        String element = ll.get(0);
        System.out.println("Element:"+element);
        
        ll.add(1,"Z");
        System.out.println("Size:"+ll.size()+" - The List:"+ll.toString());
        
    }
    
}
