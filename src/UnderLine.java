import java.lang.reflect.Array;
import java.util.Arrays;

public class UnderLine {
    public static void main(String[] args) {
        String input = "hii bunny how are you bunny";
        String search = "bunny";
        printUnderline(input, search);
    }

    public static void printUnderline(String input, String search) {
        char[] inputChars = input.toCharArray();
        char[] underLines = new char[inputChars.length];
        Arrays.fill( underLines, ' ');
       // -----------------------------------------------------------------------------
        //method-1
        int currentIndex = 0;
        String[] words = input.split("\\s+");
        for (String word : words) {
            if (word.equals(search)) {
                for (int i = currentIndex; i < currentIndex + word.length(); i++) {
                    underLines[i] = '-';
                }
            }
            currentIndex += word.length() + 1;
        }

        System.out.println(input);
        System.out.println(new String(underLines));
    }
       // --------------------------------------------------------------------
       ///method2
//        int index=0;
//        while ((index = input.indexOf(search, index)) != -1) {
//            for (int i = index; i < index + search.length(); i++) {
//                underLines[i] = '-';
//            }
//            index += search.length();
//        }
//        System.out.println(input);
//        System.out.println(new String(underLines));
//    }
}
