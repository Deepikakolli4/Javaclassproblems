public class RotateString {
    public static void main(String[] args) {
        String s = "gcmbf";
        String goal = "fgcmb";
        Boolean result = rotateString(s, goal);
        System.out.println(result);
    }

    public static Boolean rotateString(String s, String goal) {
        char start = goal.charAt(0);
        String comp = "";
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == start) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            return false;
        }
        comp = s.substring(index) + s.substring(0, index);
        if (comp.equals(goal)) {
            return true;
        }
        return false;
    }
}
