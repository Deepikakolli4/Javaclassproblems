import java.util.Arrays;

public class MaxProductOfElements {
    public static void main(String[] args) {
        int[] nums = {3,7};
        int result = maxProductOfElements(nums);
        System.out.println(result);
    }
    public static int maxProductOfElements(int[] nums) {
        Arrays.sort(nums);
        int max = (nums[nums.length-1]-1) * (nums[nums.length-2]-1);
        return max;
    }
}
