public class BinaryToDecimal {
    public static void main(String[] args) {
        String s = "1101";
        int result = binaryToDecimal(s);
        System.out.println(result);
    }

    public static int binaryToDecimal(String s) {
        int decimal = Integer.parseInt(s, 2);
        return decimal;
    }
}
