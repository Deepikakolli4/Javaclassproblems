import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ReverseFileContent {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\kolli\\OneDrive\\Documents";
        String file = "sample.txt";
        reserveLines(path, file);
        wordsReverse(path, file);
    }

    public static void reserveLines(String path, String file) throws IOException {
        String content = Files.readString(Paths.get(path, file));
        StringBuilder reversedContent = new StringBuilder(content).reverse();
        System.out.println(reversedContent.toString());
    }

    public static void wordsReverse(String path, String file) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(path, file));
        StringBuilder reversedWords = new StringBuilder();
        StringBuilder wordsReader = new StringBuilder();
        for (String line : lines) {
            String cleanedLine = line.replaceAll("[,\\.]", "");
            String[] words = cleanedLine.split("\\s");
            for (int i = 0; i < words.length; i++) {
                wordsReader.setLength(0);
                reversedWords.append(wordsReader.append(words[i]).reverse().toString());
                if (i < words.length - 1) {
                    reversedWords.append(" ");
                }
            }
            reversedWords.append(System.lineSeparator());
        }
        System.out.println(reversedWords);
    }
}
