import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TotalMarksOfSem {
    public static void main(String[] args) throws IOException {
        String inputPath = "C:\\Users\\kolli\\OneDrive\\Documents\\marks.csv";
        String outputPath = "C:\\Users\\kolli\\OneDrive\\Documents\\output.csv";

        List<String> marks = Files.readAllLines(Paths.get(inputPath));
        List<String> resultMarks = new ArrayList<>();

        int maxCount = Integer.MIN_VALUE;
        int bestSemester = 0;
        int highestMarkInBestSemester = 0;

        for (String line : marks) {
            String[] marksOfSub = line.split(",");
            int sem = Integer.parseInt(marksOfSub[0].trim());
            int total = 0;
            int highestMark = Integer.MIN_VALUE;

            for (int i = 0; i < marksOfSub.length; i++) {
                int mark = Integer.parseInt(marksOfSub[i].trim());
                total += mark;
                if (mark > highestMark) {
                    highestMark = mark;
                }
            }
            if (total > maxCount) {
                maxCount = total;
                highestMarkInBestSemester = highestMark;
            }
            resultMarks.add(line + "," + total + "," + highestMark);
        }

        Path output = Paths.get(outputPath);
        Files.write(output, resultMarks);

        System.out.println("Total marks calculated and saved to " + outputPath);
        System.out.println("The semester with the highest score is: " + highestMarkInBestSemester + " with a total of " + maxCount);
    }
}
