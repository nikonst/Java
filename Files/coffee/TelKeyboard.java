import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by Nikos on 3/19/2017.
 *
 * Produce Telephone Keyboard Coding for Coffees
 */
public class TelKeyboard {

    public static void main(String[] args) throws Exception {

        String fileIn = "coffee/coffeeList.txt";
        String fileOut= "coffee/coffeeListTelNumbers.txt";

        PrintWriter out = new PrintWriter(fileOut);

        String telCode="", toFile="";

        char[] wordToNumbers;

        Scanner wordReader = new Scanner(new File(fileIn));
        while ( wordReader.hasNext() ) {
            String w = wordReader.next();
            w = w.toLowerCase();
            wordToNumbers = w.toCharArray();
            for (char k : wordToNumbers) {
              telCode += letterToNumber(k);
            }
            toFile = w+":"+telCode;
            out.println(toFile);
            telCode="";
            }
        wordReader.close();
        out.close();
        System.out.println("Done!");
    }

    public static String letterToNumber (char letter) {

        String ch="";

        if (letter == 'a' || letter == 'b' || letter == 'c') {
            ch = "2";
        } else if (letter == 'd' || letter == 'e' || letter == 'f') {
            ch = "3";
        } else if (letter == 'g' || letter == 'h' || letter == 'i') {
            ch = "4";
        } else if (letter == 'j' || letter == 'k' || letter == 'l') {
            ch = "5";
        } else if (letter == 'm' || letter == 'n' || letter == 'o') {
            ch = "6";
        } else if (letter == 'p' || letter == 'q' || letter == 'r' || letter == 's') {
            ch = "7";
        } else if (letter == 't' || letter == 'u' || letter == 'v') {
            ch = "8";
        } else if (letter == 'w' || letter == 'x' || letter == 'y' || letter == 'z') {
            ch = "9";
        }
        return ch;
    }
}
