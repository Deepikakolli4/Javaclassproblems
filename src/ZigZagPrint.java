import java.util.Arrays;

public class ZigZagPrint {
    public static void main(String[] args) {
        String input = "PAYPALISHIRING";
        int n = 4;
        printZigZag(input, n);
    }

    public static void printZigZag(String input, int n) {
        if (n <= 1) {
            System.out.println(input);
            return;
        }

        int len = input.length();
        char[][] spaces = new char[n][len];

        // Initialize the matrix with spaces
        for (int i = 0; i < n; i++) {
            Arrays.fill(spaces[i], ' ');
        }

        int index = 0;
        boolean down = true;
        int row = 0, col = 0;

        while (index < len) {
            spaces[row][col] = input.charAt(index++);
            if (down) {
                row++;
                if (row == n) {
                    row = n - 2;
                    down = false;
                    col++;
                }
            } else {
                row--;
                col++;
                if (row == -1) {
                    row = 1;
                    down = true;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < len; j++) {
                System.out.print(spaces[i][j]);
            }
            System.out.println();
        }
    }
}
