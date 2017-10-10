import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Nikos on 3/18/2017.
 */
public class SearchStringInSongs {

    public static void main(String[] args) throws Exception {

        String a, text, songTitle="";
        String word = args[0];
        int i, linesSum, totalLinesFound = 0, linesForCurrentSong=0;

        File directory = new File("songs");
        File[] fList = directory.listFiles(); // Files in directory

        if (fList != null) {
            System.out.println("---------------------------");
            System.out.println("Directory List");
            for (i = 0; i < fList.length; i++) {
                System.out.println(fList[i]);
            }

            System.out.println("---------------------------");

            for (i = 0; i < fList.length; i++) {
                String thePath = fList[i].toString();
                try {
                    Scanner f = new Scanner(new File(thePath));
                    linesSum = 0;
                    linesForCurrentSong=0;
                    while (f.hasNext()) {
                        linesSum++;
                        if (linesSum == 1) {
                            songTitle = f.nextLine();
                        }
                        a = f.nextLine();
                        text = a.toLowerCase();
                        word = word.toLowerCase();
                        if (text.contains(word)) {
                            totalLinesFound++;
                            linesForCurrentSong++;
                            System.out.println("***> Line " + linesSum + " ' " + a + " ' ");
                        }
                    }
                    f.close();
                }
                catch (IOException err) {
                    System.out.println("File Error!" + err);
                }
                if(linesForCurrentSong != 0) {
                    System.out.println("For the Song '" + songTitle + "' the lines found are " + linesForCurrentSong + "\n\n");
                }
            }
            System.out.println("totalLinesFound = " + totalLinesFound);
        }
        else {
            System.out.println("The are no files to search ...");
        }
    }
}
