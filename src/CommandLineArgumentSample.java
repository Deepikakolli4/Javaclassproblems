class CommandLineArgumentSample {
    public static void main(String[] args) {
        int value1 = 0, value2 = 0;
        String operation = null;
        if (args.length != 6) {
            System.out.println("Not Enough Arguments");
        } else {
            for (int i = 0; i < args.length; i++) {
                if (args[i].equals("-a")) {
                    if (i + 1 < args.length) {
                        value1 = Integer.parseInt(args[i + 1]);
                    } else {
                        System.out.println("no adequate info. some arguments are missing");
                        System.exit(0); // terminate the program
                    }
                }
                if (args[i].equals("-b")) {
                    if (i + 1 < args.length) {
                        value2 = Integer.parseInt(args[i + 1]);
                    } else {
                        System.out.println("no adequate info. some arguments are missing");
                        System.exit(0); // terminate the program
                    }
                }
                if (args[i].equals("-operation")) {
                    if (i + 1 < args.length) {
                        operation = args[i + 1];
                    } else {
                        System.out.println("no adequate info. some arguments are missing");
                        System.exit(0); // terminate the program
                    }
                }
            }
            if (value1 == 0 && value2 == 0 && operation == null) {
                System.out.println("no adequate info. some arguments are missing");
            } else {
                if (operation.equals("add")) {
                    System.out.println("Sum: " + (value1 + value2));
                } else if (operation.equals("sub")) {
                    System.out.println("Sub: " + (value1 - value2));
                } else if (operation.equals("mul")) {
                    System.out.println("MUl: " + (value1 * value2));
                } else if (operation.equals("div")) {
                    if (value2 != 0) {
                        System.out.println("DIV: " + (value1 / value2));
                    } else {
                        System.out.println("not possible");
                    }
                } else {
                    System.out.println("enter the proper operation");
                }
            }
        }
    }
}