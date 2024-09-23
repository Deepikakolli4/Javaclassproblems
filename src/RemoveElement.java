import java.util.ArrayList;
import java.util.List;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int value = 3;
        int result = removeElement(nums, value);
        System.out.println(result);

    }

    public static int removeElement(int[] nums, int val) {
        if (nums.length == 0) {
            return 0;
        }
            int index=0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != val) {
                    nums[index]=nums[i];
                    index++;
                }
            }
        return index;
    }
}
