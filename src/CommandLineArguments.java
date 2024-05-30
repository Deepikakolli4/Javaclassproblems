public class CommandLineArguments {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Please enter the proper inputs");
            return;
        }
        double number1 = Double.parseDouble(args[0]);
        double number2 = Double.parseDouble(args[1]);
        String operation = args[2];
        if (operation.equals("add")) {
            System.out.println("Sum: " + (number1 + number2));
        } else if (operation.equals("sub")) {
            System.out.println("Sub: " + (number1 - number2));
        } else if (operation.equals("mul")) {
            System.out.println("Mul: " + (number1 * number2));
        } else if (operation.equals("div")) {
            if (number2 == 0) {
                System.out.println("division is not possible");
            }
            System.out.println("Div: " + (number1 / number2));
        } else {
            System.out.println("Enter the proper inputs");
        }
    }
}
