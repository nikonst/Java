// @Nikos Konstantakis
// @October 2018

import java.util.*;

public class aSortedMap {

    public static void main(String[] args) {
        TreeMap<String, Integer> m = new TreeMap<String, Integer>();
        
        m.put("Helsinki",1);
        m.put("Oslo",2);
        m.put("Stockholm",3);
        m.put("Copenhagen",4);
        m.put("Berlin",5);               
        
        for(Map.Entry melement:m.entrySet()){  
            System.out.println(melement.getKey()+" "+melement.getValue());  
        }  
        
        System.out.println("***********************");
        
        m.put("Vienna",6); 
        m.put("Bern",7); 
        m.put("Athens",7); 
        
        for(Map.Entry melement:m.entrySet()){  
            System.out.println(melement.getKey()+" "+melement.getValue());  
        }
        
        System.out.println("***********************");
        System.out.println(m);
        
    }
}
    
