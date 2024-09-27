public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        boolean result = isValidPalindrome(s);
        System.out.println(result);
    }

    public static boolean isValidPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        StringBuilder compare = new StringBuilder(s);
        return s.equals(compare.reverse().toString());
    }
}
