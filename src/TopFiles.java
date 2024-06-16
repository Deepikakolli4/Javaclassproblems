import java.io.File;
import java.util.PriorityQueue;

public class TopFiles {
  public static void main(String[] args) {
      PriorityQueue<String> fileNames = new PriorityQueue<>();
      sortingFiles("C:\\Users\\kolli\\internship\\CODSOFT",fileNames);
  }
      public static void sortingFiles(String path,PriorityQueue<String> fileNames){
          File file=new File(path);
          File[] files=file.listFiles();
          if(files==null && !file.isDirectory()){
              return;
          }
          for(File f:files){
              if(f.isFile()){
                  fileNames.add(f.getName());
              } else {
                  sortingFiles(f.getPath(),fileNames);
              }
          }
      }
  }