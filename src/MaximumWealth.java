import java.util.Arrays;

public class MaximumWealth {
    public static void main(String[] args) {
        int[][] accounts = {{1, 2, 12}, {5, 5}};
        int max = findRichestCustomerWealth(accounts);
        System.out.println("Richest Customer: " + max);
    }

    public static int findRichestCustomerWealth(int[][] accounts) {
        int sum, max = Integer.MIN_VALUE;
        for (int i = 0; i < accounts.length; i++) {
            sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum = sum + accounts[i][j];
            }
            max = Math.max(sum, max);
        }
        return max;
    }
}
