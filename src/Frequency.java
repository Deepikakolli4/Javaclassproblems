import java.io.File;
import java.util.*;

public class Frequency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String string = input.nextLine();
        boolean flag=checkDuplicates(string);
        HashMap<String,Integer> mapping= frequency(string);
        for(String word:mapping.keySet()){
            System.out.println("word: "+word+"\t"+"\t"+"Frequency"+mapping.get(word));
        }
    }
    public static boolean checkDuplicates2(String string) {
        String[] words = string.split("\\s+");
        HashSet<String> sameElements = new HashSet<>();
        for (String word : words) {
            if (sameElements.contains(word)) {
                return true;
            } else {
                sameElements.add(word);
            }
        }
        for (String word : words) {
                System.out.println(word);
        }
        return false;
    }

    public static boolean checkDuplicates(String string) {
        String[] words = string.split("\\s+");
        HashSet<String> sameElements = new HashSet<>();
        for (String word : words) {
            if (!sameElements.add(word)) {
                System.out.println(word);
            }
        }

        if (sameElements.size() < words.length) {
            System.out.println("Found duplicates");
            return true;
        } else {
            System.out.println("No duplicates found");
            return false;
        }
    }
    public static HashMap<String,Integer> frequency(String string){
        String[] wordsList=string.split("\\s+");
        HashMap<String,Integer> mapping=new HashMap<>();
        for(String word:wordsList){
            mapping.put(word,mapping.getOrDefault(word,0)+1);
        }
        return mapping;
    }
}