import java.util.HashSet;

public class ContainsDuplicates {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 4};
        boolean result = containDuplicates(num);
        System.out.println(result);
    }

    public static boolean containDuplicates(int[] num) {
        HashSet<Integer> original = new HashSet<>();
        for (int i = 0; i < num.length; i++) {
            if (original.contains(num[i])) {
                return true;
            } else {
                original.add(num[i]);
            }
        }
        return false;
    }
}
