// @Nikos Konstantakis
// @October 2018

import java.util.BitSet;
import java.util.Random;

public class bitStructure {

   public static int N_BITS = 8;

   public static void main(String[] args) {

      BitSet b1 = new BitSet(N_BITS);
      BitSet b2 = new BitSet(N_BITS);
      BitSet b3 = new BitSet(N_BITS);
      
      printBits("Initial b1: ", b1);
      printBits("Initial b2: ", b2);

      setRandomBits(b1);
      setRandomBits(b2);

      printBits("Random bits b1: ", b1);
      printBits("Random bits b2: ", b2);
      System.out.println(b1.toString());
      System.out.println(b2.toString());
      System.out.println("No. of set values in b1=" + b1.cardinality());
      System.out.println("No. of set values in b2=" + b2.cardinality());
      
      System.out.println("**********************");
      
      b2.and(b1);
      printBits("b2 AND b1:", b2);

      System.out.println(b1.toString());
      System.out.println(b2.toString());
      System.out.println("No. of set values in b1=" + b1.cardinality());
      System.out.println("No. of set values in b2=" + b2.cardinality());
      
      System.out.println("**********************");          

      b1.or(b2);
      printBits("b1 OR b2, b1 = ", b1);
      System.out.println(b1.toString());
      System.out.println(b2.toString());
      System.out.println("No. of set values in b1=" + b1.cardinality());
      System.out.println("No. of set values in b2=" + b2.cardinality());
      
      System.out.println("**********************");          
      
      b2.xor(b1);
      printBits("b2 XOR b1, b2 = ", b2);
      System.out.println(b1.toString());
      System.out.println(b2.toString());
      System.out.println("No. of set values in b1=" + b1.cardinality());
      System.out.println("No. of set values in b2=" + b2.cardinality());
      

   }

   public static void setRandomBits(BitSet b) {
      Random r = new Random();
      for (int i = 0; i < N_BITS / 2; i++) {
          b.set(r.nextInt(N_BITS));
      }

   }

   public static void printBits(String prompt, BitSet b) {
      System.out.print(prompt + " ");
      for (int i = 0; i < N_BITS; i++) {
         System.out.print(b.get(i) ? "1" : "0");
      }
      System.out.println();
   }
}