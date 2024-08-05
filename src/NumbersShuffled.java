import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

public class NumbersShuffled {
    public static void main(String[] args) {
        int[] randomNumbers = generateRandomNumbers();
        isHomogeneous(randomNumbers);
        findOccurances(randomNumbers);
        isFull(randomNumbers);
        printDice(randomNumbers);
    }

    public static int[] generateRandomNumbers() {
        int[] numbers = new int[6];
        Random rand = new Random();
        for (int i = 0; i < 6; i++) {
            int randomNumber = rand.nextInt(5) + 1;
            numbers[i] = randomNumber;
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + "\t");
        }
        return numbers;
    }

    public static void isHomogeneous(int[] numbers) {
        int count = 0;
        int element = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == element) {
                count++;
            } else {
                count = 0;
            }
        }
        if (count == numbers.length) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    public static void findOccurances(int[] numbers) {
        HashMap<Integer, Integer> occurrences = new HashMap<>();
        for (int number : numbers) {
            occurrences.put(number, occurrences.getOrDefault(number, 0) + 1);
        }

        for (int number : occurrences.keySet()) {
            System.out.println("Number " + number + " occurs " + occurrences.get(number) + " times.");
        }
    }

    public static void isFull(int[] numbers) {
        int min = Integer.MAX_VALUE;
        ArrayList<Integer> sortedNumbers = new ArrayList<>();
        HashMap<Integer, Integer> count = new HashMap<>();
        for (int number : numbers) {
            if (number < min) {
                min = number;
                sortedNumbers.add(number);
            }
        }
        for (int number : numbers) {
            count.put(number, count.getOrDefault(number, 0) + 1);
        }
        if (count.getOrDefault(1, 0) == 3 && count.getOrDefault(2, 0) == 2) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    public static void printDice(int[] numbers) {
        HashMap<Integer, Integer> count = new HashMap<>();

        for (int number : numbers) {
            count.put(number, count.getOrDefault(number, 0) + 1);
        }
        for (int number : count.keySet()) {
            int diceNumber = number;
            int diceCount = count.get(number);
            switch (diceNumber) {
                case 1:
                    System.out.println("\u2680 x " + diceCount);
                    break;
                case 2:
                    System.out.println("\u2681 x " + diceCount);
                    break;
                case 3:
                    System.out.println("\u2682 x " + diceCount);
                    break;
                case 4:
                    System.out.println("\u2683 x " + diceCount);
                    break;
                case 5:
                    System.out.println("\u2684 x " + diceCount);
                    break;
                case 6:
                    System.out.println("\u2685 x " + diceCount);
                    break;
                default:
                    System.out.println("Invalid dice number: " + diceNumber);
                    break;
            }

        }
    }
}


