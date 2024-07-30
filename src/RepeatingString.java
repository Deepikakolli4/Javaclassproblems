public class RepeatingString {
    public static void main(String[] args) {
        String input = "hihihi";
        String repatingString = repeatingStrings("hihihi"); //return "🌼".
        System.out.println(repatingString);
        String repeatingStrings = repeatingStrings("🌼🌼🌼"); //return "🌼".
        System.out.println(repatingString);
        repatingString = repeatingStrings("🌼🌻" + "🌼🌻" + "🌼🌻"); //return "🌼🌻".
        System.out.println(repatingString);
        repatingString = repeatingStrings("Ciao" + "Ciao"); //return "Ciao".
        System.out.println(repatingString);
        repatingString = repeatingStrings("Captain CiaoCiaoCaptain CiaoCiao"); //return "CaptainCiaoCiao".
        System.out.println(repatingString);
        repatingString = repeatingStrings("🌕🌔🌓🌑"); //return null.
        System.out.println(repatingString);
        repatingString = repeatingStrings("CaptainCiaoCiaoCaptain"); //return null.
        System.out.println(repatingString);
        repatingString = repeatingStrings("🌼"); //return null.
        System.out.println(repatingString);
        repatingString = repeatingStrings(""); //return null.
        System.out.println(repatingString);
        repatingString = repeatingStrings(null); //return null.
        System.out.println(repatingString);
    }

    public static String repeatingStrings(String input) {
        if (input == null || input.isEmpty()) {
            return null;
        }

        String longestSubstring = "";
        for (int start = 0; start < input.length(); start++) {
            StringBuilder referenceString = new StringBuilder();

            for (int i = start; i < input.length(); i++) {
                referenceString.append(input.charAt(i));
                String ref = referenceString.toString();
                if (isRepeating(input, ref, i + 1)) {
                    if (ref.length() > longestSubstring.length()) {
                        longestSubstring = ref;
                    }
                }
            }
        }

        return longestSubstring;
    }

    private static boolean isRepeating(String input, String ref, int fromIndex) {
        for (int i = fromIndex; i <= input.length() - ref.length(); i++) {
            if (input.startsWith(ref, i)) {
                return true;
            }
        }
        return false;
    }
}
