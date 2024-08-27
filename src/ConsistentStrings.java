import java.util.HashSet;

public class ConsistentStrings {
    public static void main(String[] args) {
        String[] words = {"ad", "bd", "aaab", "baa", "badab"};
        String allowed = "ab";
        int count = countConsistentStrings(words, allowed);
        System.out.println("Number of Consistent words :  " + count);
    }

    public static int countConsistentStrings(String[] words, String allowed) {
        HashSet<Character> allowedSet = new HashSet<>();
        int count = 0;
        for (char c : allowed.toCharArray()) {
            allowedSet.add(c);
        }
        for (String word : words) {
            boolean isConsistent = true;
            for (char c : word.toCharArray()) {
                if (!allowedSet.contains(c)) {
                    isConsistent = false;
                    break;
                }
            }
            if (isConsistent) {
                count++;
            }
        }
        return count;
    }
}
