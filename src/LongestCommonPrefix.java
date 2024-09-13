import java.util.HashSet;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] words = {"flower", "ow", "light"};
        String longestPrefix = findLongestCommonPrefix(words);
        System.out.println(longestPrefix);
    }

    public static String findLongestCommonPrefix(String[] words) {
        StringBuilder prefix = new StringBuilder();
        int minLength = Integer.MAX_VALUE;
        for (String word : words) {
            minLength = Math.min(minLength, word.length());
        }
        for (int i = 0; i < minLength; i++) {
            char currentChar = words[0].charAt(i);
            for (int j = 1; j < words.length; j++) {
                if (words[j].charAt(i) != currentChar) {
                    return prefix.toString();
                }
            }
            prefix.append(currentChar);
        }
        return prefix.toString();
    }
}
