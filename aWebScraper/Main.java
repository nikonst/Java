/**
 * Created by emeis on 7/31/2018.
 */

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import static com.sun.activation.registries.LogSupport.log;

public class Main {
    public static void main(String[] args) {

        try {
            Document doc = Jsoup.connect("https://en.wikipedia.org/wiki/Main_Page").get();

            System.out.println("Title:");
            System.out.println(doc.title());

            System.out.println("ALL THE LINKS:");
            Elements allHRefs = doc.select("a");
            for (Element hrefs: allHRefs) {
                System.out.println("Anchor Text: " + hrefs.text());
                System.out.println("URL: " + hrefs.absUrl("href"));
            }

            System.out.println("IMAGES:");
            Elements images = doc.select("img[src~=(?i)\\.(png|jpe?g|gif)]");
            for (Element image : images) {
                System.out.println("src : " + image.attr("src"));
                System.out.println("height : " + image.attr("height"));
                System.out.println("width : " + image.attr("width"));
                System.out.println("alt : " + image.attr("alt"));
            }

            System.out.println("IN THE NEWS HEAD LINES:");
            Elements newsHeadlines = doc.select("#mp-itn b a");
            for (Element headline : newsHeadlines) {
                System.out.println(headline.text());
                System.out.println(headline.absUrl("href"));
            }

            System.out.println("ON THIS DAY:");
            Elements onThisDay = doc.select("#mp-otd b a");
            for (Element thisday: onThisDay) {
                System.out.println(thisday.text());
                System.out.println(thisday.absUrl("href"));
            }

        }
        catch (Exception e) {
            System.out.println("Exception occurred");
        }
    }
}
