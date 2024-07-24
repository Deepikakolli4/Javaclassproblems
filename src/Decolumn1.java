public class Decolumn1 {
    public static void main(String[] args) {
        String[] lines = {
                "I’m dishonest, and a to watch out for,",
                "dishonest man you    because you can",
                "can always trust to  never predict when",
                "be dishonest.        they’re going to do",
                "Honestly, it’s the   something incredibly",
                "honest ones you want stupid."
        };
        String result = decolumn(lines);
        System.out.println(result);
    }

    public static String decolumn(String[] lines) {
        int splitPoint = findSplitIndex(lines);
        StringBuilder result = new StringBuilder();

        for (String line : lines) {
            if (splitPoint < line.length()) {
                String leftPart = line.substring(0, splitPoint).trim();
                String rightPart = line.substring(splitPoint).trim();
                result.append(leftPart).append('\n');
                result.append(rightPart).append('\n');
            } else {
                result.append(line.trim()).append('\n');
            }
        }

        return result.toString();
    }

    public static int findSplitIndex(String[] lines) {
        int[] spaceCounts = new int[lines[0].length()];
        for (String line : lines) {
            for (int i = 0; i < line.length(); i++) {
                if (line.charAt(i) == ' ') {
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
        System.out.println(splitPoint);
        return splitPoint;
    }
}
