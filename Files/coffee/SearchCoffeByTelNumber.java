import java.io.File;
import java.util.Scanner;

/**
 * Created by Nikos on 3/20/2017.
 *
 * Telephone Keyboard Input Recognition -
 * https://www.ieee.org/membership_services/membership/students/awards/xtremesamples.html
 *
 */
public class SearchCoffeByTelNumber {

    public static void main (String[] args) throws Exception {

        String fileIn = "coffee/coffeeListTelNumbers.txt";
        String searchFor = args[0];
        String line;
        int lineNum=0;
        int indexSemiColon=0;

        Scanner reader = new Scanner(new File(fileIn));

        while ( reader.hasNext() ) {
            line = reader.next();
            lineNum++;
            if (line.contains(searchFor)) {
                indexSemiColon = line.indexOf(':');
                System.out.println("Found At Line:"+lineNum);
                System.out.println("\tCoffee:"+line.substring(0,indexSemiColon));
            }
        }
        reader.close();
    }
}
