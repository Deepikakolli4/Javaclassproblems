public class PalindromeNumber {
    public static void main(String[] args) {
        int x = -121;
        Boolean result = isPalindrome(x);
        System.out.println(result);
    }

    public static boolean isPalindrome(int x) {
        String input = String.valueOf(x);
        StringBuilder reverse = new StringBuilder(input).reverse();
        return input.equals(reverse.toString());
    }
}
