import java.util.ArrayList;

public class KidsWithGreatestCandies {
    public static void main(String[] args) {
        int[] candies = {4, 2, 1, 1, 2};
        int extraCandies = 1;
        ArrayList<Boolean> result = isKidWithHighestCandies(candies, extraCandies);
        for (boolean b : result) {
            System.out.print(b + "\t");
        }
    }

    public static ArrayList<Boolean> isKidWithHighestCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> isHighest = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < candies.length; i++) {
            if (max < candies[i]) {
                max = candies[i];
            }
        }
        for (int i = 0; i < candies.length; i++) {
            int sum = 0;
            sum = candies[i] + extraCandies;
            if (sum >= max) {
                isHighest.add(true);
            } else {
                isHighest.add(false);
            }
        }
        return isHighest;
    }
}
