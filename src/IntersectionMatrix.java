import java.util.Arrays;
import java.util.HashSet;

public class IntersectionMatrix {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 5, 6, 6, 8};
        int[] nums2 = {2, 3, 6, 7, 8, 8};
        int[] result = findIntersection(nums1, nums2);
        for (int r : result) {
            System.out.print(r + "\t");
        }
    }

    public static int[] findIntersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        HashSet<Integer> result = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    result.add(nums1[i]);
                }
            }
        }
        Integer[] intersectionPoints = result.toArray(new Integer[0]);
        int[] iPoints = new int[intersectionPoints.length];
        for (int i = 0; i < intersectionPoints.length; i++) {
            iPoints[i] = intersectionPoints[i];
        }
        return iPoints;
    }
}
