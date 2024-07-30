public class Approaching {
    public static void main(String[] args) {
        String[] signals = {"F", "DO","MOS", "MOS", "MOS", "FA"};
        boolean result = isProbablyApproaching(signals);
        System.out.println(result);
    }

    public static boolean isProbablyApproaching(String... signals) {
        int count = 0;
        String target = "MOS";
        for (int i = 0; i < signals.length; i++) {
            if (signals[i].equals(target)) {
                count++;
                if (count == 4) {
                    return true;
                }
                }else{
                count=0;
            }
        }
        return false;
    }
}
