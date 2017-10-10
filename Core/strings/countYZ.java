package strings;

/**
 * Created by Nikos on 8/22/2017.
 *
 Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count,
 but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word
 if there is not an alphabetic letter immediately following it.
 (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)

 countYZ("fez day") - 2
 countYZ("day fez") - 2
 countYZ("day fyyyz") - 2
 */
public class countYZ {
    public static int countYZ(String str) {
        int count=0;
        String[] strs = str.split(" ");

        for(int i=0;i<strs.length;i++) {
            if(strs[i].charAt(strs[i].length()-1)=='y' || strs[i].charAt(strs[i].length()-1)=='z') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        String s1 = "funny way Taz", s2 = "Return of the Jedi", s3 = "Mary had a little lamb";
        String s4 = "Sunday Monday Tuesday", s5="Strange Magic";

        System.out.println(countYZ(s1));
        System.out.println(countYZ(s2));
        System.out.println(countYZ(s3));
        System.out.println(countYZ(s4));
        System.out.println(countYZ(s5));
    }
}
