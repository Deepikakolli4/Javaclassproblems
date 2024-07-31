public class SplitPoint {
    public static void main(String[] args) {
        int[] weights = {4,10,3,7,2,5};
        int index = findSplitPoint(weights);
        System.out.println(index);
    }

    public static int findSplitPoint(int[] weights) {
        int i = 1;
        int j = weights.length - 2;
        int leftSum = weights[0];
        int rightSum = weights[weights.length - 1];

        while (i <= j) {
            if (leftSum < rightSum) {
                leftSum += weights[i];
                i++;
            } else if (leftSum > rightSum) {
                rightSum += weights[j];
                j--;
            } else if (i == j) {
                return i;
            } else {
                leftSum += weights[i];
                i++;
                rightSum += weights[j];
                j--;
            }
        }

        return -1;
    }
}
