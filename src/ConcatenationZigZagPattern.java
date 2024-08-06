import java.util.Arrays;

public class ConcatenationZigZagPattern {
    public static void main(String[] args) {
        String input = "applesweet";
        int n=3;
        char[][] spaces = printZigZag(input,n);
        conversionOfZigZagPattern(spaces,n,input.length());
    }
    public static char[][] printZigZag(String input,int n){
        char[][] spaces = new char[n][input.length()];

        if(n<=1){
            System.out.println(input);
        }
        else {
            for (int i = 0; i < spaces.length; i++) {
                Arrays.fill(spaces[i], ' ');
            }
            int index = 0;
            boolean down = true;
            int row = 0;
            int column = 0;
            while (index < input.length()) {
                spaces[row][column] = input.charAt(index++);
                if (down) {
                    row++;
                    if (row == n) {
                        row = row - 2;
                        down = false;
                        column++;
                    }
                } else {
                    row--;
                    column++;
                    if (row == -1) {
                        row = 1;
                        down = true;
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < input.length(); j++) {
                    System.out.print(spaces[i][j]);
                }
                System.out.println();
            }
        }
            return spaces;
    }
    public static void conversionOfZigZagPattern(char[][]spaces,int n,int len){
        StringBuilder result = new StringBuilder();
        for(int i=0;i<n;i++){
            for(int j=0;j<len;j++){
                if(spaces[i][j]!= ' '){
                    result.append(spaces[i][j]);
                }
            }
        }
        System.out.println(result.toString());
    }
}
