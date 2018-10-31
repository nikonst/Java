// @Nikos Konstantakis
// @October 2018

import java.util.*;


public class aProperty {
 
    public static void main(String[] args) {
        Properties p1 = new Properties();

        p1.put("England","London");
        p1.put("France","Paris");
        p1.put("Spain","Madrid");
        p1.put("Italy","Rome");
               
        System.out.println(p1.toString());
        System.out.println(p1.get("France"));
        
        p1.clear();
        System.out.println(p1.toString());
        
        }
    
}
