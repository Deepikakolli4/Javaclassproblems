public class LargestSmallest {
    public static void main(String[] args) {
        int input = 9012345;
        findSmallestLargest(input);
    }

    public static void findSmallestLargest(int input) {
        String number = Integer.toString(input);
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        int[] digits = new int[number.length()];
        for (int i = 0; i < number.length(); i++) {
            digits[i] = number.charAt(i) - '0';
        }
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] < smallest) {
                smallest = digits[i];
            }
        }
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] > largest) {
                largest = digits[i];
            }
        }
        System.out.println(smallest + "\t" + largest);
    }
}
