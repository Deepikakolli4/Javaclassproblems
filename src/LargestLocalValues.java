import java.util.Arrays;

public class LargestLocalValues {
    public static void main(String[] args) {
        int[][] grid = {
                {9, 9, 8, 1},
                {5, 6, 2, 6},
                {8, 2, 6, 4},
                {6, 2, 2, 2}
        };
        int[][] result = findLargestLocalValues(grid);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result.length; j++) {
                System.out.print(result[i][j] + "\t");
            }
        }
    }

    public static int[][] findLargestLocalValues(int[][] grid) {
        int[][] result = new int[grid.length - 2][grid.length - 2];
        for (int i = 0; i < grid.length - 2; i++) {
            for (int j = 0; j < grid.length - 2; j++) {
                int maxVal = findMaxVal(grid, i, j);
                result[i][j] = maxVal;
            }
        }
        return result;
    }

    public static int findMaxVal(int[][] grid, int row, int col) {
        int max = Integer.MIN_VALUE;
        for (int i = row; i < row + 3; i++) {
            for (int j = col; j < col + 3; j++) {
                max = Math.max(max, grid[i][j]);
            }
        }
        return max;
    }
}
