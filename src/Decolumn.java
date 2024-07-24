public class Decolumn {

    public static void main(String[] args) {
        String[] columns = {
                "I’m dishonest, and a to watch out for,",
                "dishonest man you    because you can",
                "can always trust to  never predict when",
                "be dishonest.        they’re going to do",
                "Honestly, it’s the   something incredibly",
                "honest ones you want stupid."
        };

        int splitPoint = findCommonSplitPoint(columns);
        System.out.println("Common split column: " + splitPoint);

        String result = decolumnize(columns, splitPoint);
        System.out.println(result);
    }

    public static String decolumnize(String[] columns, int splitPoint) {
        StringBuilder leftColumn = new StringBuilder();
        StringBuilder rightColumn = new StringBuilder();

        for (String column : columns) {
            if (splitPoint < column.length()) {
                String leftPart = column.substring(0, splitPoint).trim();
                String rightPart = column.substring(splitPoint).trim();
                leftColumn.append(leftPart).append('\n');
                rightColumn.append(rightPart).append('\n');
            } else {
                leftColumn.append(column.trim()).append('\n');
            }
        }

        return leftColumn.append(rightColumn).toString();
    }

    public static int findCommonSplitPoint(String[] columns) {
        int[] spaceCounts = new int[columns[0].length()];
        for (String col : columns) {
            for (int i = 0; i < col.length(); i++) {
                if (col.charAt(i) == ' ') {
                    spaceCounts[i]++;
                }
            }
        }

        int maxSpaceCount = 0;
        int splitPoint = 0;
        for (int i = 0; i < spaceCounts.length; i++) {
            if (spaceCounts[i] > maxSpaceCount) {
                maxSpaceCount = spaceCounts[i];
                splitPoint = i;
            }
        }

        return splitPoint;
    }
}
