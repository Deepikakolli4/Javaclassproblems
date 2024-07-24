public class Diamond {
    public static void main(String[] args) {
        char maxChar = 'Z';
        int maxLength = maxChar - 'A' + 1;
        for (int i = 0; i < maxLength; i++) {
            for (int k = maxLength; k > i; k--) {
                System.out.print(" ");
            }
            for (char first = 'A'; first <= 'A' + i; first++) {
                System.out.print(first);
            }
            for (char last = (char) ('A' + i - 1); last >= 'A'; last--) {
                System.out.print(last);
            }
            System.out.println("\n");
        }
        for (int i = maxLength; i >= 0; i--) {
            for (int k = maxLength; k > i; k--) {
                System.out.print(" ");
            }
            for (char last = 'A'; last <= 'A' + i; last++) {
                System.out.print(last);
            }
            for (char first = (char) ('A' + i - 2); first >= 'A'; first--) {
                System.out.print(first);
            }
            System.out.println("\n");
        }
    }
}

