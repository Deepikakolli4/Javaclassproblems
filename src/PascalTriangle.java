import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        int numRows;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to get pascal triangle: ");
        numRows = input.nextInt();
        List<List<Integer>> pascalTriangle = generatePascalTriangle(numRows);
        for (List<Integer> row : pascalTriangle) {
            System.out.println(row);
        }
    }

    public static List<List<Integer>> generatePascalTriangle(int numRows) {
        List<List<Integer>> pascalTriangle = new ArrayList<>();
        if (numRows == 0) {
            return pascalTriangle;
        }
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        pascalTriangle.add(firstRow);
        for (int i = 1; i < numRows; i++) {
            List<Integer> previousRow = pascalTriangle.get(i - 1);
            List<Integer> currentRow = new ArrayList<>();
            currentRow.add(1);
            for (int j = 1; j < i; j++) {
                currentRow.add(previousRow.get(j - 1) + previousRow.get(j));
            }
            currentRow.add(1);
            pascalTriangle.add(currentRow);
        }
        return pascalTriangle;
    }
}
