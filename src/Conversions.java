import java.util.Scanner;

public class Conversions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string : ");
        StringBuilder line = new StringBuilder();
        line.append(input.nextLine());
        System.out.println("1.snakecase\n2.camelcase\n3.pascalcase\n4.kebabcase\n5.dotCase\n6.titlecase");
        do {
            System.out.println("Enter your choice: ");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    snakeCase(line);
                    break;
                case 2:
                    camelCase(line);
                    break;
                case 3:
                    pascalCase(line);
                    break;
                case 4:
                    kebabCase(line);
                    break;
                case 5:
                    dotCase(line);
                    break;
                case 6:
                    titleCase(line);
                    break;
                case 7:
                    System.out.println("Exiting.....");
                    System.exit(0);
                default:
                    System.out.println("Enter the right choice in numbers: \n");
            }
        } while (true);
    }

    public static void snakeCase(StringBuilder line) {
        String finalString = line.toString();
        finalString = finalString.replace(" ", "_");
        System.out.println(finalString);
    }

    public static void camelCase(StringBuilder line) {
        for (int i = 0; i < line.length() - 1; i++) {
            if (line.charAt(i) == ' ') {
                char nextchar = line.charAt(i + 1);
                line.setCharAt(i + 1, Character.toUpperCase(nextchar));
            }
        }
        System.out.println(line.toString().replace(" ", ""));
    }

    public static void pascalCase(StringBuilder line) {
        String[] words = line.toString().split("\\s+");
        StringBuilder required = new StringBuilder();
        for (String s : words) {
            char c = Character.toUpperCase(s.charAt(0));
            String remaining = s.substring(1);
            required.append(c).append(remaining);
        }
        System.out.println(required.toString());
    }

    public static void kebabCase(StringBuilder line) {
        System.out.println(line.toString().toLowerCase().replace(" ", "-"));
    }

    public static void dotCase(StringBuilder line) {
        System.out.println(line.toString().toLowerCase().replace(" ", "."));
    }

    public static void titleCase(StringBuilder line) {
        String[] words = line.toString().split("\\s+");
        StringBuilder required = new StringBuilder();
        for (String s : words) {
            char c = Character.toUpperCase(s.charAt(0));
            String remaining = s.substring(1);
            required.append(c).append(remaining).append(" ");
        }
        System.out.println(required.toString());
    }
}