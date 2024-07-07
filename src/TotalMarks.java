import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class TotalMarks {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\kolli\\Downloads\\marks.csv";
        List<String> marks = Files.readAllLines(Paths.get(path));
        for (int i = 0; i < marks.size(); i++) {
            String[] securedMarks = marks.get(i).replaceAll("[^\\x20-\\x7E]", "").split(",");
            float sum = 0;
            for (int j = 0; j < securedMarks.length; j++) {
                sum += Float.parseFloat(securedMarks[j]);
            }
            System.out.println("TOTAL MARKS OF " + (i + 1) + "=" + sum);
        }
    }
}
