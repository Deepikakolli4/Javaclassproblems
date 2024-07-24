public class Swap {
    public static void main(String[] args) {
        String input = "yootaz";
        printSwapedXYZ(input);
    }

    public static void printSwapedXYZ(String input) {
        StringBuilder result = new StringBuilder(input);
        for (int i = 0; i < input.length(); i++) {
            switch (input.charAt(i)) {
                case 'y':
                    result.setCharAt(i, 'z');
                    break;
                case 'z':
                    result.setCharAt(i, 'y');
                    break;
                case 'Y':
                    result.setCharAt(i, 'Z');
                    break;
                case 'Z':
                    result.setCharAt(i, 'Y');
                    break;
                default:
                    break;
            }
        }
        System.out.println(result.toString());
    }

    public static void printSwapedXYZ1(String input) {
        char[] letters = input.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            switch (letters[i]) {
                case 'y':
                    letters[i] = 'z';
                    break;
                case 'z':
                    letters[i] = 'y';
                    break;
                case 'Y':
                    letters[i] = 'Z';
                    break;
                case 'Z':
                    letters[i] = 'Y';
                    break;
                default:
                    break;
            }
        }
        for (int i = 0; i < letters.length; i++) {
            System.out.print(letters[i]);
        }
    }
}


