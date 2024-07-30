public class Repeat {
    public static void main(String[] args) {
        String input = "hihihi";
        String repatingString = repeatingStrings("hihihi"); //return "🌼".
        System.out.println(repatingString);
//        repatingString = repeatingStrings("🌼🌼🌼"); //return "🌼".
//        System.out.println(repatingString);
//        repatingString = repeatingStrings("🌼🌻" + "🌼🌻" + "🌼🌻"); //return "🌼🌻".
//        System.out.println(repatingString);
//        repatingString = repeatingStrings("Ciao" + "Ciao"); //return "Ciao".
//        System.out.println(repatingString);
//        repatingString = repeatingStrings("Captain CiaoCiaoCaptain CiaoCiao"); //return "CaptainCiaoCiao".
//        System.out.println(repatingString);
//        repatingString = repeatingStrings("🌕🌔🌓🌑"); //return null.
//        System.out.println(repatingString);
//        repatingString = repeatingStrings("CaptainCiaoCiaoCaptain"); //return null.
//        System.out.println(repatingString);
//        repatingString = repeatingStrings("🌼"); //return null.
//        System.out.println(repatingString);
//        repatingString = repeatingStrings(""); //return null.
//        System.out.println(repatingString);
//        repatingString = repeatingStrings(null); //return null.
//        System.out.println(repatingString);// "🌼🌻"
    }

    public static String repeatingStrings(String input) {
        if (input == null || input.isEmpty()) {
            return null;
        }

        int len = input.length();
        for (int i = 1; i <= len / 2; i++) {
            String subStr = input.substring(0, i);
            String repeated = subStr.repeat(len / subStr.length());
            if (input.indexOf(repeated) == 0 && repeated.length() == len) {
                return subStr;
            }
        }
        return null;
    }
}
