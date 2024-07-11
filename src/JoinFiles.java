import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JoinFiles {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        String inputPath1 = "C:\\Users\\kolli\\OneDrive\\Documents\\sample.txt";
        String inputPath2 = "C:\\Users\\kolli\\OneDrive\\Documents\\sample2.txt";
        String outputPath = "C:\\Users\\kolli\\OneDrive\\Documents\\output.txt";
        List<String> lines1 = Files.readAllLines(Paths.get(inputPath1));
        List<String> lines2 = Files.readAllLines(Paths.get(inputPath2));
        List<String> resultLines = new ArrayList<>(lines1);
        resultLines.addAll(lines2);
        Path output = Paths.get(outputPath);
        Files.write(output, resultLines);
        System.out.println("saved to " + outputPath);
        System.out.println("Enter the number of lines you want: ");
        int number = input.nextInt();
        System.out.println("Starting: ");
        for(int i=0;i<number;i++){
            System.out.println(resultLines.get(i));
        }
        System.out.println("Ending: ");
        if(number<=resultLines.size()) {
            int start = resultLines.size() - number;
            for (int i = start; i < resultLines.size(); i++) {
                System.out.println(resultLines.get(i));
            }
        }
    }
}
