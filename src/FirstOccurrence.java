public class FirstOccurrence {
    public static void main(String[] args) {
       String haystack = "leetcode";
       String needle = "leeto";
       int index = findOccurrence(haystack,needle);
       System.out.println(index);
    }
    public static int findOccurrence(String haystack,String needle){
        int index = -1;
        char letter = needle.charAt(0);
        if (needle.isEmpty()) {
            return 0;
        }
        if (haystack.length() < needle.length()) {
            return -1;
        }
        for(int i=0;i<=haystack.length()-needle.length();i++){
            if(haystack.charAt(i)==letter){
                if(haystack.substring(i,i+needle.length()).equals(needle)){
                    index=i;
                    break;
                }
            }
        }
        return index;
    }
}
