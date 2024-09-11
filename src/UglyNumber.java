
public class UglyNumber {
    public static void main(String[] args) {
        int number = 14;
        boolean result = isUglyNumber(number);
        System.out.println(result);
    }

    public static boolean isUglyNumber(int number) {
        if (number <= 0) {
            return false;
        }
        while (number % 2 == 0) {
            number = number / 2;
        }
        while (number % 3 == 0) {
            number = number / 3;
        }
        while (number % 5 == 0) {
            number = number / 5;
        }
        return number == 1;
    }
}
