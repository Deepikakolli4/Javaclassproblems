import java.io.File;
import java.util.Comparator;
import java.util.PriorityQueue;

public class FileSorting {
    private static PriorityQueue<FileDetails> fileInfo = new PriorityQueue<>((f1, f2) -> Long.compare(f2.fileSize, f1.fileSize));
    public static void main(String[] args) {
        PriorityQueue<FileDetails> fileInfo = sortingFiles("C:\\Users\\kolli\\internship\\webpractise");
        printFiles(fileInfo);
    }

    public static PriorityQueue<FileDetails> sortingFiles(String path) {
        PriorityQueue<FileDetails> fileInfo = new PriorityQueue<>((f1, f2) -> Long.compare(f2.fileSize, f1.fileSize));
        File file = new File(path);
        File[] filesArray = file.listFiles();
        if (filesArray == null || path == null) {
            return null;
        }
        for (File f : filesArray) {
            if (f.isFile()) {
                FileDetails data = new FileDetails();
                data.fileName = f.getName();
                data.fileSize = f.length();
                fileInfo.add(data);
            } else {
                sortingFiles(f.getPath());
            }
        }
        return fileInfo;
    }

    public static void printFiles(PriorityQueue<FileDetails> fileInfo) {
        for (int i = 0; i < 10; i++) {
            FileDetails fileDetails = fileInfo.poll();
            System.out.println("FileName: " + fileDetails.fileName + "\t" + "FileSize: " + fileDetails.fileSize);
        }
    }
}

class FileDetails {
    String fileName;
    long fileSize;
}
