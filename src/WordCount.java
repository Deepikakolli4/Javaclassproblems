import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" NOTE PLEASE MENTION \"exit\" IF YOU COMPLETED ENTERING THE SENTENCES\n"+
               " Enter the string to count the words: ");
        StringBuilder sentence = new StringBuilder();
        while (true) {
            String lines = input.nextLine();
            if (lines.equals("exit")) {
                break;
            } else {
                sentence.append(lines).append(" ");
            }
        }
        String actualString = sentence.toString().trim();
        String[] words = actualString.split("\\s+");
        System.out.println(words.length);
    }
}


