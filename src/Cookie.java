public class Cookie {
    public static void main(String[] args) {
        String input = "PPPSSSEEE";
        int count = findNumberOfCookies(input);
        System.out.println("Number of cookies: " + count);
    }

    public static int findNumberOfCookies(String input) {
        input = input.toLowerCase();
        int count = 0;

        for (int i = 0; i < input.length() - 2; ) {
            boolean found = false;
            switch (input.charAt(i)) {
                case 'p':
                    if ((input.charAt(i + 1) == 'e' && input.charAt(i + 2) == 's') ||
                            (input.charAt(i + 1) == 's' && input.charAt(i + 2) == 'e')) {
                        count++;
                        found = true;
                    }
                    break;
                case 's':
                    if ((input.charAt(i + 1) == 'p' && input.charAt(i + 2) == 'e') ||
                            (input.charAt(i + 1) == 'e' && input.charAt(i + 2) == 'p')) {
                        count++;
                        found = true;
                    }
                    break;
                case 'e':
                    if ((input.charAt(i + 1) == 'p' && input.charAt(i + 2) == 's') ||
                            (input.charAt(i + 1) == 's' && input.charAt(i + 2) == 'p')) {
                        count++;
                        found = true;
                    }
                    break;
                default:
                    break;
            }

            if (found) {
                i += 3;
            } else {
                i++;
            }
        }

        return count;
    }
}
