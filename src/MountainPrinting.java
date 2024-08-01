public class MountainPrinting {
    public static void main(String[] args) {
        int[] pattern = {0, 1, 1, 2, 2, 3, 3, 3, 4, 5, 4, 3, 2, 2, 1, 0};
        printStars(pattern);
    }

    public static void printStars(int[] pattern) {
        int maxHeight = 0;
        for (int value : pattern) {
            if (value > maxHeight) {
                maxHeight = value;
            }
        }

        for (int i = maxHeight; i >= 0; i--) {
            for (int j = 0; j < pattern.length; j++) {
                if (pattern[j] == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
