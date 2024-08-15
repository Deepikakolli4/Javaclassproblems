public class NumberOfGoodPairs {
    public static void main(String[] args) {
     int[] nums = {1,2,3,1,1,3};
     int noOfGoodPairs = findGoodPairs(nums);
     System.out.println("noOfGoodPairs: "+noOfGoodPairs);
    }
    public static int findGoodPairs(int[] nums){
        int noOfGoodPairs = 0;
        for(int i = 0 ;i < nums.length ; i++){
            for (int j= i+1;j< nums.length;j++){
                 if(nums[i]==nums[j]){
                     noOfGoodPairs++;
                 }
            }
        }
       return noOfGoodPairs;
    }
}
