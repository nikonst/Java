// @Nikos Konstantakis
// @October 2018

import java.util.HashSet;
import java.util.Set;

public class aSet {

    public static void main(String args[]) {
        
        Set someSet = new HashSet();
        
        for(int i = 0; i< 10; i++) {
            someSet.add(i);
        }
        
        System.out.println(someSet.toString());
        System.out.println("Set Size:"+someSet.size());
        
        someSet.add(13);
        System.out.println(someSet.toString());
        
        someSet.remove(4);
        System.out.println(someSet.toString());
        
        Set<String> someSet2 = new HashSet();
        someSet2.add("a");
        someSet2.add("b");
        someSet2.add("c");
        System.out.println(someSet2.toString());
        
        someSet2.addAll(someSet);
        
        System.out.println(someSet2.toString());
        System.out.println("Set Size:"+someSet2.size());
        
        System.out.println(someSet2.contains(1));
        System.out.println(someSet2.contains(11));
        
    }
}
