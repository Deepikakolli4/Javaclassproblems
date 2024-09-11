import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args) {
        String t = "car";
        String s = "tar";
        boolean result = isAnagrams(t,s);
        System.out.println(result);
    }
    public  static boolean isAnagrams(String t, String s) {
        t = t.toLowerCase();
        s = s.toLowerCase();
        if (t.length() != s.length()) {
            return false;
        }
           char[] string1 = t.toCharArray();
            char[] string2 = s.toCharArray();
            Arrays.sort(string1);
            Arrays.sort(string2);
        return Arrays.equals(string1, string2);
    }
}
