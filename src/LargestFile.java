import java.io.File;

public class LargestFile {
    public static void main(String[] args) {
        String path = findLargestFile("C:\\$WinREAgent");
        System.out.println("The Largest File is: " + path);
    }

    static long maxSize = Long.MIN_VALUE;
    static String maxSizePath = " ";

    public static String findLargestFile(String path) {
        File file = new File(path);
        File[] filesArray = file.listFiles();
        if (!file.isDirectory() || filesArray == null) {
            return null;
        }
        for (File f : filesArray) {
            if (f.isFile()) {
                if (f.length() > maxSize) {
                    maxSize = f.length();
                    maxSizePath = f.getPath();
                }
            } else {
                findLargestFile(f.getPath());
            }
        }
        return maxSizePath;
    }
}