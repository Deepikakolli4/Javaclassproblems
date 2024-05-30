import java.util.ArrayList;
import java.util.Scanner;

public class Comparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int result1 = fact(n);
        System.out.println("Factorial: " + result1);

        System.out.print("Enter the number of units: ");
        int units = sc.nextInt();
        int result2 = calculateBill(units);
        System.out.println("The bill amount for " + units + " units is: " + result2);

        int set1[] = {1, 4, 6, 2, 3};
        int set2[] = {10, 5, 2, 1, 9, 4, 11, 7, 8};
        ArrayList<Integer> sameElements = findCommonElements(set1, set2);

        System.out.println("Common elements:");
        for (int i : sameElements) {
            System.out.println(i);
        }

        sc.close();
    }

    public static int fact(int n) {
        if (n == 1 || n == 0) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }

    public static int calculateBill(int units) {
        if (units == 0) {
            return 0;
        }
        int billAmount = 0;
        if (units <= 100) {
            billAmount = units * 10;
        } else if (units <= 200) {
            billAmount = (100 * 10) + (units - 100) * 15;
        } else if (units <= 300) {
            billAmount = (100 * 10) + (100 * 15) + (units - 200) * 20;
        } else {
            billAmount = (100 * 10) + (100 * 15) + (100 * 20) + (units - 300) * 25;
        }
        return billAmount;
    }

    public static ArrayList<Integer> findCommonElements(int[] set1, int[] set2) {
        ArrayList<Integer> sameElements = new ArrayList<>();
        for (int i : set1) {
            for (int j : set2) {
                if (i == j) {
                    sameElements.add(i);
                }
            }
        }
        return sameElements;
    }
}
