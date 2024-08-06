public class LargestSmallest {
    public static void main(String[] args) {
        int input = 9012345;
        findSmallestLargest(input);
    }

    public static void findSmallestLargest(int input) {
        String number = Integer.toString(input);
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < number.length(); i++) {
            int digit = number.charAt(i) - '0';
            if (digit < smallest) {
                smallest = digit;
            }
        }
        for (int i = 0; i < number.length(); i++) {
            int digit = number.charAt(i) - '0';
            if (digit > largest) {
                largest = digit;
            }
        }
        System.out.println(smallest + "\t" + largest);
    }
}
