
import java.util.Arrays;

public class HeightsOfClass {
    public static void main(String[] args) {
        int[] heights = {5, 1, 2, 3, 4};
        int count = numberOfMisplaced(heights);
        System.out.println(count);
    }

    public static int numberOfMisplaced(int[] heights) {
        int count = 0;
        int[] copy = Arrays.copyOf(heights, heights.length);
        Arrays.sort(heights);
        for (int i = 0; i < heights.length; i++) {
            if (copy[i] != heights[i]) {
                count++;
            }
        }
        return count;
    }
}
