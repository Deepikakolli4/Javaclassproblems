import java.io.File;
import java.text.SimpleDateFormat;
import java.util.*;

public class FileInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the path1: ");
        String path1 = input.nextLine();
        System.out.println("Enter the path2: ");
        String path2 = input.nextLine();

        // Check for duplicate files
        HashSet<String> duplicateFiles = checkDuplicate(path1, path2);
        if (duplicateFiles.isEmpty()) {
            System.out.println("NO DUPLICATES");
        } else {
            System.out.println("DUPLICATES ");
            for (String file : duplicateFiles) {
                System.out.println(file);
            }
        }

        // Check for file extensions
        HashMap<String, Integer> files = fileExtensionCount1(path1);
        for (String extension : files.keySet()) {
            System.out.println("Extension: " + extension + "\t" + "Files count: " + files.get(extension));
        }

        System.out.println("Enter the extension: ");
        String extension = input.nextLine();

        // Check file path
        boolean isDirectory = checkFilePath(path1);
        System.out.println(isDirectory);

        // Get file count
        ArrayList<File> filesList = fileCount(path1);
        int count = 0;
        for (File f : filesList) {
            System.out.println("File: " + f.getAbsoluteFile());
            count++;
        }
        System.out.println("Files count: " + count);

        // Match files with extension
        ArrayList<File> obtainedFiles = matchFile(path1, extension);
        for (File f : obtainedFiles) {
            System.out.println("File: " + f.getAbsoluteFile());
        }

        // Check top files
        checkTopFiles(path1);

        // Check for duplicates again (duplicated logic in original)
        HashSet<String> duplicateFiles1 = checkDuplicate1(path1, path2);
        for (String file : duplicateFiles1) {
            System.out.println(file);
        }

        // Find older file
        findOlderFile(path1);

        // Get file details
        fileDetails(path1);

        // Get the largest file
        getMaxFile(path1);
    }

    public static HashSet<String> checkDuplicate(String path1, String path2) {
        File file1 = new File(path1);
        File file2 = new File(path2);
        File[] fileArray1 = file1.listFiles();
        File[] fileArray2 = file2.listFiles();
        HashSet<String> same = new HashSet<>();
        HashSet<String> duplicateFiles = new HashSet<>();
        if (fileArray1 != null) {
            for (File f : fileArray1) {
                same.add(f.getName());
            }
        }
        if (fileArray2 != null) {
            for (File f : fileArray2) {
                if (same.contains(f.getName())) {
                    duplicateFiles.add(f.getName());
                }
            }
        }
        return duplicateFiles;
    }

    public static HashSet<String> checkDuplicate1(String path1, String path2) {
        File file1 = new File(path1);
        File file2 = new File(path2);
        File[] fileArray1 = file1.listFiles();
        File[] fileArray2 = file2.listFiles();
        HashSet<String> directory1 = new HashSet<>();
        HashSet<String> directory2 = new HashSet<>();
        HashSet<String> duplicateFiles = new HashSet<>();
        if (!file1.isDirectory() || fileArray1 == null) {
            System.out.println("IT IS NOT A PROPER PATH");
            return null;
        }
        if (!file2.isDirectory() || fileArray2 == null) {
            System.out.println("IT IS NOT A PROPER PATH");
            return null;
        }
        for (File f1 : fileArray1) {
            directory1.add(f1.getName());
        }
        for (File f2 : fileArray2) {
            directory2.add(f2.getName());
        }
        for (String file : directory2) {
            if (directory1.contains(file)) {
                duplicateFiles.add(file);
            }
        }
        if (duplicateFiles.isEmpty()) {
            System.out.println("No duplicates found");
        }
        return duplicateFiles;
    }

    public static ArrayList<String> checkDuplicate2(String path1, String path2) {
        File file1 = new File(path1);
        File file2 = new File(path2);
        File[] fileArray1 = file1.listFiles();
        File[] fileArray2 = file2.listFiles();
        ArrayList<String> directory1 = new ArrayList<>();
        ArrayList<String> directory2 = new ArrayList<>();
        ArrayList<String> duplicateFiles = new ArrayList<>();
        if (!file1.isDirectory() || fileArray1 == null) {
            System.out.println("IT IS NOT A PROPER PATH");
            return null;
        }
        if (!file2.isDirectory() || fileArray2 == null) {
            System.out.println("IT IS NOT A PROPER PATH");
            return null;
        }
        for (File f1 : fileArray1) {
            directory1.add(f1.getName());
        }
        for (File f2 : fileArray2) {
            directory2.add(f2.getName());
        }
        for (String file1Name : directory1) {
            for (String file2Name : directory2) {
                if (file1Name.equals(file2Name)) {
                    duplicateFiles.add(file1Name);
                }
            }
        }
        return duplicateFiles;
    }

    public static void checkTopFiles(String path) {
        File file = new File(path);
        File[] fileArray = file.listFiles();
        if (!file.isDirectory() || fileArray == null) {
            System.out.println("IT IS NOT A PROPER PATH");
            return;
        }
        Arrays.sort(fileArray, (f1, f2) -> Long.compare(f2.length(), f1.length()));
        System.out.println("TOP 10 FILES");
        for (int i = 0; i < Math.min(10, fileArray.length); i++) {
            System.out.println("Name: " + fileArray[i].getName() + " Size: " + fileArray[i].length());
        }
    }

    public static void findOlderFile(String path) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        File directory = new File(path);
        if (!directory.isDirectory()) {
            System.out.println("IT IS NOT A PROPER PATH");
            return;
        }
        File[] files = directory.listFiles();
        if (files == null) return;
        String filePath = null;
        long oldestDate = Long.MAX_VALUE;
        for (File f : files) {
            long lastModified = f.lastModified();
            if (lastModified < oldestDate) {
                oldestDate = lastModified;
                filePath = f.getPath();
            }
        }
        System.out.println("Older file: " + filePath + "\t" + "Last Modified Date: " + dateFormat.format(new Date(oldestDate)));
    }

    public static void fileDetails(String path) {
        File directory = new File(path);
        if (!directory.isDirectory()) {
            System.out.println("IT IS NOT A PROPER PATH");
            return;
        }
        System.out.println("Directory Name: " + directory.getName());
        File[] files = directory.listFiles();
        if (files == null) {
            System.out.println("Total files: 0");
            return;
        }
        System.out.println("Total files: " + files.length);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        for (File f : files) {
            Date date = new Date(f.lastModified());
            System.out.println("File Name: " + f.getPath() + "\t" + f.length() + " bytes" + "\t" + "Modified Date: " + dateFormat.format(date));
        }
    }

    public static void getMaxFile(String path) {
        File directory = new File(path);
        File[] files = directory.listFiles();
        if (files == null) return;
        String maxSizePath = null;
        long maxSize = Long.MIN_VALUE;
        for (File f : files) {
            long fileSize = f.length();
            if (fileSize > maxSize) {
                maxSize = fileSize;
                maxSizePath = f.getPath();
            }
        }
        System.out.println("Maximum file size: " + maxSize + "\t" + "File path is: " + maxSizePath);
    }

    public static boolean checkFilePath(String path) {
        File f = new File(path);
        return f.isDirectory();
    }

    public static void fileExtensionCount(String path) {
        File file = new File(path);
        File[] fileArray = file.listFiles();
        if (fileArray == null) return;
        HashMap<String, Integer> files = new HashMap<>();
        for (File f : fileArray) {
            String filename = f.getName();
            String extension = getFileExtension(filename);
            files.put(extension, files.getOrDefault(extension, 0) + 1);
        }
        for (String ex : files.keySet()) {
            System.out.println("Extension: " + ex + ", Count: " + files.get(ex));
        }
    }

    private static String getFileExtension(String filename) {
        int index = filename.lastIndexOf(".");
        return filename.substring(index + 1).toLowerCase();
    }

    public static HashMap<String, Integer> fileExtensionCount1(String path) {
        File f = new File(path);
        File[] filesArray = f.listFiles();
        HashMap<String, Integer> files = new HashMap<>();
        if (!f.isDirectory() || filesArray == null) {
            System.out.println("It is not a directory");
            return files;
        }
        for (File file : filesArray) {
            String fileName = file.getName();
            String extension = getFileExtensionCount(fileName);
            files.put(extension, files.getOrDefault(extension, 0) + 1);
        }
        return files;
    }

    public static String getFileExtensionCount(String fileName) {
        int index = fileName.lastIndexOf(".");
        return fileName.substring(index + 1).toLowerCase();
    }

    public static void filesCount(String path) {
        File f = new File(path);
        File[] files = f.listFiles();
        if (files == null) return;
        System.out.println("Total Files Found: " + files.length);
        for (File find : files) {
            System.out.println(find);
        }
    }

    public static ArrayList<File> fileCount(String path) {
        File f = new File(path);
        File[] fileArray = f.listFiles();
        ArrayList<File> files = new ArrayList<>();
        if (!f.isDirectory() || fileArray == null) {
            System.out.println("Files are null");
            return files;
        }
        for (File file : fileArray) {
            files.add(file);
        }
        return files;
    }

    public static ArrayList<File> matchFile(String path, String extension) {
        File file = new File(path);
        File[] files = file.listFiles();
        ArrayList<File> required = new ArrayList<>();
        if (!file.isDirectory() || files == null) {
            System.out.println("No Match Found");
            return required;
        }
        for (File f : files) {
            if (f.getName().toLowerCase().endsWith(extension.toLowerCase())) {
                required.add(f);
            }
        }
        return required;
    }
}
