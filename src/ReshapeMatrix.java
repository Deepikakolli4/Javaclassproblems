

public class ReshapeMatrix {
    public static void main(String[] args) {
        int[][] input = {{1, 2}, {3, 4}};
        int row = 1;
        int col = 4;
        int[][] reshaped = matrixReshape(input, row, col);
        for (int i = 0; i < reshaped.length; i++) {
            for (int j = 0; j < reshaped[0].length; j++) {
                System.out.print(reshaped[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int originalRow = mat.length;
        int originalColumn = mat[0].length;
        int[][] reshaped = new int[r][c];
        if (originalRow * originalColumn != r * c) {
            return mat;
        }
        int row = 0, col = 0;
        for (int i = 0; i < originalRow; i++) {
            for (int j = 0; j < originalColumn; j++) {
                reshaped[row][col] = mat[i][j];
                col++;
                if (col == c) {
                    col = 0;
                    row++;
                }
            }
        }
        return reshaped;
    }
}
