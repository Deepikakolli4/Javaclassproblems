import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;

public class Occurence {
    public static void main(String[] args) throws IOException {
        String inputPath = "C:\\Users\\kolli\\OneDrive\\Documents\\sample.txt";
        List<String> lines = Files.readAllLines(Paths.get(inputPath));
        boolean flag = false;
        HashMap<String, Integer> occurrence = new HashMap<>();
        for (String line : lines) {
            String[] words = line.split("\\s+");
            for (String reqwords : words) {
                occurrence.put(reqwords.toLowerCase(), occurrence.getOrDefault(reqwords.toLowerCase(), 0) + 1);
            }
        }
        System.out.println("Words with 10 occurrences:");
        for (String word : occurrence.keySet()) {
            if (occurrence.get(word) == 10) {
                flag = true;
                System.out.println("Word: " + word + ", Occurrences: " + occurrence.get(word));
            }
        }
        if (flag == false) {
            System.out.println("No word is Occuring 10 times");
        }
    }
}
