public class SquareRoot {
    public static void main(String[] args) {
        int x = 8;
        int number = findSqrtRoot(x);
        System.out.println(number);
    }
    public static int findSqrtRoot(int x){
        int start=0,ans = -1;
        int end = x;
         while(start<=end){
             int mid = start + (end - start) / 2;
             long sqrt = (long) mid*mid;
             if(sqrt==x){
                 return mid;
             }else if(sqrt<x){
                 ans = mid;
                 start=mid+1;
             }else{
                 end=mid-1;
             }
         }
         return ans;
    }
}
