import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String string = input.nextLine();

        System.out.print("Enter the character to delete: ");
        char c = input.next().charAt(0);
        StringBuilder modifiedString = new StringBuilder(string);
        removeSpecifiedChar(modifiedString, c);
        toUpperCase(modifiedString);
        System.out.println("Reversed Sentence: " + reverseSentence(string));
        System.out.println("Valid IP Address: " + validateIpAddress(string));
        System.out.println("Valid Mobile Number: " + verifyMobileNumber(string));
        System.out.println("Path Depth: " + checkDepth(string));
    }

    public static String reverseSentence(String string) {
        String[] words = string.split("\\s+");
        StringBuilder reversedString = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversedString.append(words[i]);
            if (i != 0) {
                reversedString.append(" ");
            }
        }
        return reversedString.toString();
    }

    public static void removeSpecifiedChar(StringBuilder string, char c) {
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == c) {
                string.deleteCharAt(i);
                i--;
            }
        }
        System.out.println("After Removing Character: " + string);
    }

    public static void toUpperCase(StringBuilder string) {
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (c >= 'a' && c <= 'z') {
                string.setCharAt(i, (char) (c - 32));
            }
        }
        System.out.println("Uppercase String: " + string.toString());
    }

    public static boolean validateIpAddress(String string) {
        String[] octets = string.split("\\.");
        if (octets.length != 4) {
            return false;
        }
        try {
            for (String octet : octets) {
                int value = Integer.parseInt(octet);
                if (value < 0 || value > 255) {
                    return false;
                }
            }
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    public static boolean verifyMobileNumber(String string) {
        String phoneNumber = string.replaceAll("\\s", "");
        if (phoneNumber.length() == 10) {
            return phoneNumber.chars().allMatch(Character::isDigit);
        } else if (phoneNumber.length() == 13 && phoneNumber.startsWith("+91")) {
            return phoneNumber.substring(3).chars().allMatch(Character::isDigit);
        }
        return false;
    }

    public static int checkDepth(String string) {
        String[] locations = string.split("\\\\");
        return locations.length - 2;
    }
}
