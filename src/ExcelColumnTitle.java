public class ExcelColumnTitle {
    public static void main(String[] args) {
        int num = 25;
        String columnTitle = getTitle(num);
        System.out.println(columnTitle);
    }

    public static String getTitle(int num) {
        StringBuilder columnTitle = new StringBuilder();
        while (num > 0) {
            num = num - 1;
            int rem = num % 26;
            columnTitle.append((char) (rem + 'A'));
            num = num / 26;
        }
        return columnTitle.reverse().toString();
    }
}
