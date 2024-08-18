import java.util.HashMap;
import java.util.Map;

public class SumOfUniqueNumbers {
    public static void main(String[] args) {
        int[] nums = {1,2,3,2};
        int result = sumOfUniqueNumbers(nums);
        System.out.println("Sum is: "+result);
    }

    public static int sumOfUniqueNumbers(int[] nums) {
        HashMap<Integer,Integer> frequencyCount = new HashMap<>();
        int sum = 0 ;
        for(int num: nums){
            frequencyCount.put(num, frequencyCount.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry: frequencyCount.entrySet()){
            if(entry.getValue()==1){
                sum = sum+entry.getKey();
            }
        }
        return sum;
    }
}
