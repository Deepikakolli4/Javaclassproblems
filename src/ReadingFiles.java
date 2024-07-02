
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ReadingFiles {
    public static void main(String[] args) throws IOException {
        int wordCount = 0;
        int charCount = 0;
        String path = "C:\\Users\\kolli\\OneDrive\\Documents";
        String file = "sample.txt";
        List<String> lines = Files.readAllLines(Paths.get(path, file));
        for (String line : lines) {
            String[] words = line.split("\\s");
            wordCount += words.length;
            charCount += line.length();
            System.out.println(line);
        }
        System.out.println("number of lines in the file are : " + lines.size());
        System.out.println("number of words in the file are : " + wordCount);
        System.out.println("number of characters in the file are : " + charCount);
    }
}
