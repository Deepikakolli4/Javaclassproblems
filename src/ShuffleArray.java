public class ShuffleArray {
    public static void main(String[] args) {
        int[] numbers={2,5,1,3,4,7};
        int n=3;
        int[] answers = shuffleArray(numbers,n);
        for(int i:answers){
            System.out.print(i+"\t");
        }

    }
    public static int[] shuffleArray(int[] numbers,int n){
        int[] result = new int[numbers.length];
        for(int i=0;i<(numbers.length)/2;i++){
            result[2*i]=numbers[i];
            result[2*i+1]=numbers[(numbers.length/2)+i];
        }
        return result;
    }
}
