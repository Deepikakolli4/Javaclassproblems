import java.util.ArrayList;
import java.util.List;

public class CountPrimes {
    public static void main(String[] args) {
        int num = 10;
        int result = countPrimes(num);
        System.out.println("Number of primes less than " + num + ": " + result);
    }

    public static int countPrimes(int num) {
        if (num <= 1) {
            return 0;
        }

        List<Integer> prime = new ArrayList<>();
        int count = 0;

        for (int i = 2; i < num; i++) {
            if (isPrime(i)) {
                prime.add(i);
                count++;
            }
        }
        for (int i : prime) {
            System.out.print(i + "\t");
        }
        System.out.println();

        return count;
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int j = 2; j <= Math.sqrt(num); j++) {
            if (num % j == 0) {
                return false;
            }
        }
        return true;
    }
}
