/**
 * Created by emeis on 7/9/2018.
 */

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Iterator;

public class PersonDriver {
    public static void main(String[] arg) throws IOException {
        int i;
        String thename="", thesurname="", thecity="", thephone="";

        Scanner scanner = new Scanner(new File("csvdata.csv"));
        Scanner csvScanner = null;
        int index = 0;
        List<Person> personList = new ArrayList<>();

        while (scanner.hasNextLine()) {
            csvScanner = new Scanner(scanner.nextLine());
            csvScanner.useDelimiter(",");
            while (csvScanner.hasNext()) {
                String data = csvScanner.next();
                if (index == 0)
                    thename = data;
                else if (index == 1)
                    thesurname = data;
                else if (index == 2)
                    thecity = data;
                else if (index == 3)
                    thephone = data;
                else
                    System.out.println("invalid data::" + data);
                index++;
            }
            index = 0;
            Person p = new Person(thename, thesurname, thecity, thephone);
            personList.add(p);

        }
        csvScanner.close();

        System.out.println("List Size:"+personList.size());
        System.out.println("Data:");

        Iterator<Person> itr = personList.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next().getPersonData());
        }
        System.out.println("Done...");
     }
}
