
import java.util.Arrays;

public class KWeakestRow {
    public static void main(String[] args) {
        int[][] input = {
                {1, 0, 0, 0},
                {1, 1, 1, 1},
                {1, 0, 0, 0},
                {1, 0, 0, 0},
        };
        int k = 3;
        int[] weakestRows = findKWeakestRows(input, k);

        System.out.println("The " + k + " weakest rows are: " + Arrays.toString(weakestRows));
    }

    public static int[] findKWeakestRows(int[][] input, int k) {
        int[] soldierCount = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            int count = 0;
            for (int j = 0; j < input[i].length; j++) {
                if (input[i][j] == 1) {
                    count++;
                }
            }
            soldierCount[i] = count * 100 + i;
        }
        Arrays.sort(soldierCount);
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = soldierCount[i] % 100;
        }
        return result;
    }
}

