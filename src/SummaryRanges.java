import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public static void main(String[] args) {
        int[] nums = {0, 2, 3, 4, 6, 7, 8};
        List<String> ranges = summaryRanges(nums);
        for (String range : ranges) {
            System.out.println(range);
        }
    }

    public static List<String> summaryRanges(int[] nums) {
        List<String> range = new ArrayList<>();
        if (nums.length == 0) {
            return range;
        }
        int start = nums[0];
        int stop = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == stop + 1) {
                stop = stop + 1;
            } else {
                addRange(range, start, stop);
                start = nums[i];
                stop = nums[i];
            }
        }
        addRange(range, start, stop);
        return range;
    }

    public static void addRange(List<String> range, int start, int stop) {
        if (start == stop) {
            range.add(String.valueOf(start));
        } else {
            range.add(start + "->" + stop);
        }
    }
}
