public class MinOperationsForDiv3 {
    public static void main(String[] args) {
        int[] input = {1, 3, 4, 5, 6, 7};
        int minOperations = findMinOperations(input);
        System.out.println("Minimum operations to make all elements divisible by 3: " + minOperations);
    }

    public static int findMinOperations(int[] inputs) {
        int totalOperations = 0;

        for (int i = 0; i < inputs.length; i++) {
            int rem = inputs[i] % 3;
            switch (rem) {
                case 0:
                    break;
                case 1:
                    totalOperations++;
                    break;
                case 2:
                    totalOperations++;
                    break;
            }
        }
        return totalOperations;
    }
}
