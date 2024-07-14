import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Occurence {
    public static void main(String[] args) throws IOException {
        String inputPath = "C:\\Users\\kolli\\OneDrive\\Documents\\sample.txt";
        List<String> lines = Files.readAllLines(Paths.get(inputPath));
        //   boolean flag = false;
        HashMap<String, Integer> occurrence = new HashMap<>();
        for (String line : lines) {
            String[] words = line.split("\\s+");
            for (String reqwords : words) {
                occurrence.put(reqwords.toLowerCase(), occurrence.getOrDefault(reqwords.toLowerCase(), 0) + 1);
            }
        }
        List<Map.Entry<String, Integer>> list = new ArrayList<>(occurrence.entrySet());
        list.sort((o1, o2) -> o2.getValue().compareTo(o1.getValue()));
        for (Map.Entry<String, Integer> entry : list) {
            System.out.println("Word: " + entry.getKey() + ", Occurrences: " + entry.getValue());
        }
    }
}
//            if (occurrence.get(word) == 10) {
//                flag = true;
//                System.out.println("Word: " + word + ", Occurrences: " + occurrence.get(word));
//            }
//        }
//        if (flag == false) {
//            System.out.println("No word is Occuring 10 times");
//        }