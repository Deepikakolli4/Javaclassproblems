public class ClimbingStairs {
    public static void main(String[] args) {
        int n = 5;
        noOfSteps(n);
    }

    public static void noOfSteps(int n) {
        if (n == 1) {
            System.out.println(1);
        }
        int first = 1;
        int second = 2;
        for (int i = 3; i <= n; i++) {
            int current = first + second;
            first = second;
            second = current;
        }
        System.out.println(second);
    }
}
