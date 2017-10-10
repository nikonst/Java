import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;

/**
 * Created by emeis on 8/21/2017.
 */
public class readJSON {

    public static void main(String[] args) {
        JSONParser parser = new JSONParser();

        try {
            Object obj = parser.parse(new FileReader("txts/disneyMovies.json"));

            JSONArray jsonArray = (JSONArray) obj;
            String format = "%-65s%-20s%-20s%n";
            System.out.printf(format, "Title", "Year","Length");
            System.out.printf(format, "-----", "----","------");
            for (int i = 0; i < jsonArray.size(); i++) {
                JSONObject jsonObjectRow = (JSONObject) jsonArray.get(i);
                System.out.printf(format,(String) jsonObjectRow.get("title"),
                        (String) jsonObjectRow.get("year"),
                        (Long) jsonObjectRow.get("length_in_minutes"));
                        /* System.out.println("Title: "+(String) jsonObjectRow.get("title")+
                "\t\tYear: "+(String) jsonObjectRow.get("year") +
                "\t\tLength:" + (Long) jsonObjectRow.get("length_in_minutes") ); */
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
