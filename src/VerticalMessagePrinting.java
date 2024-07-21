class VerticalMessagePrinting {
    public static void main(String[] args) {
        String input = "dht\n" +
                "eee\n" +
                "ara\n" +
                "rom!";

        String horizontalMessage = printVerticalToHorizontalWriting(input);
        System.out.println("Horizontal message: " + horizontalMessage);
    }

    public static String printVerticalToHorizontalWriting(String input) {
        String[] lines = input.split("\n");
        StringBuilder horizontalMessage = new StringBuilder();
        int maxLength = 0;
        for (String line : lines) {
            if (line.length() > maxLength) {
                maxLength = line.length();
            }
        }
        for (int i = 0; i < maxLength; i++) {
            for (String line : lines) {
                if (i < line.length()) {
                    horizontalMessage.append(line.charAt(i));
                }
            }
            horizontalMessage.append(" ");
        }

        return horizontalMessage.toString();
    }
}
