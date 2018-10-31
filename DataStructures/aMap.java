// @Nikos Konstantakis
// @October 2018

import java.util.*;


public class aMap {
    
    public static void main(String[] args) {
        Map<String, Integer> m = new HashMap<String, Integer>();
        
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
        
        for(Map.Entry melement:m.entrySet()){  
            System.out.println(melement.getKey()+" "+melement.getValue());  
        }
        
        System.out.println("***********************");
        System.out.println(m);
        
        m.remove("Bern");
        System.out.println("***********************");
        System.out.println(m);
        
        System.out.println(m.containsValue("Vienna"));
        System.out.println(m.containsValue(5));
        System.out.println(m.get("Oslo"));
         System.out.println("Map Size:"+ m.size());
    }
    
}
