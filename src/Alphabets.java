public class Alphabets {
    public static void main(String[] args) {
//        int maxRows = 10;
//        for (int i = 1; i <= maxRows; i++) {
//            for (int k = maxRows; k > i; k--) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }
//        for (int i = maxRows - 1; i >= 1; i--) {
//            for (int k = maxRows; k > i; k--) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }
//    }
        char maxLetter = 'Z';
        int maxLength = maxLetter - 'A' + 1;
        for (int i = 1; i <= maxLength; i++) {
            for (int k = maxLength; k > i; k--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print((char) ('A' + j) + " ");
            }
            System.out.println();
        }
        for (int i = maxLength;i>0;i--){
            for(int k=maxLength;k>i;k--){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                System.out.print((char)('A'+j)+" ");
            }
            System.out.println();
        }
    }
}