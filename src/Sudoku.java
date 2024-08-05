import java.util.HashSet;

public class Sudoku {
    public static void main(String[] args) {
        int[] input = {1, 3, 4, 2, 6, 8, 9, 7};
        boolean result = findValidity(input);
        System.out.println(result);
    }

    public static boolean findValidity(int[] input) {
        HashSet<Integer> numbers = new HashSet<>();
        for (int i = 0; i < input.length; i++) {
            int req = input[i];
            if (req >= 1 && req <= 9) {
                if (!numbers.contains(req)) {
                    numbers.add(req);
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        return numbers.size() == 9;
    }
}
