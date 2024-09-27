import java.util.HashMap;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {2, 2,2};
        int result = singleNumber(nums);
        System.out.println(result);
    }

    public static int singleNumber(int[] nums) {
        HashMap<Integer, Integer> frequency = new HashMap<>();
        for (int num : nums) {
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }
        for (int num : frequency.keySet()) {
            if (frequency.get(num) == 1) {
                return num;
            }
        }
        return -1;
    }
}