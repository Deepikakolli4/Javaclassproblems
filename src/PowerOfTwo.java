public class PowerOfTwo {
        public static boolean isPowerOfTwo(int number) {
            return number > 0 && (number & (number - 1)) == 0;
        }
        public static void main(String[] args) {
            int[] testNumbers = {1, 2, 3, 4, 16, 18};
            for (int number : testNumbers) {
                System.out.println(number + " is power of 2: " + isPowerOfTwo(number));
            }
        }
    }

