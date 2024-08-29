public class Zeroes {
    public static void main(String[] args) {
        int[][] input = {
                {1, 2, 3},
                {4, 0, 9},
                {5, 6, 7}
        };
        int[][] result = findZeroes(input);
        printMatrix(result);
    }

    public static int[][] findZeroes(int[][] inputs) {
        boolean[] zeroRow = new boolean[inputs.length];
        boolean[] zeroColumn = new boolean[inputs[0].length];
        for (int i = 0; i < inputs.length; i++) {
            for (int j = 0; j < inputs[i].length; j++) {
                if (inputs[i][j] == 0) {
                    zeroRow[i] = true;
                    zeroColumn[j] = true;
                }
            }
        }
        for (int i = 0; i < inputs.length; i++) {
            for (int j = 0; j < inputs[i].length; j++) {
                if (zeroRow[i] || zeroColumn[j]) {
                    inputs[i][j] = 0;
                }
            }
        }
        return inputs;
    }

    public static void printMatrix(int[][] result) {
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }
}
