class MiddleCheck {
    public static void main(String[] args) {
        String input = "isCiaoCiaois";
        boolean result = isCiaoCiaoInTheMiddle(input.toLowerCase());
        System.out.println(result);
    }

    public static boolean isCiaoCiaoInTheMiddle(String input) {
        input=input.toLowerCase();
        String toCompare = "CiaoCiao".toLowerCase();
        if (input.length() < toCompare.length()) {
            return false;
        }
        // supeciao|ciaocute
        int startIndex = (input.length() - toCompare.length()) / 2;
        for (int i = 0; i < toCompare.length(); i++) {
            if (input.charAt(startIndex + i) != toCompare.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
