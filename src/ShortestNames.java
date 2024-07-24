public class ShortestNames {
    public static void main(String[] args) {
        String[] names = {"JO KER", "VINDYA", "RAM", "h"};
        shortestName(names);

    }

    public static void shortestName(String... names) {
        if (names.length == 0) {
            System.out.println("No Names Provided");
        }
        String sortestString = names[0];
        for (String name : names) {
            String[] parts = name.split("\\s");
            for (String part : parts) {
                if (part.length() < sortestString.length()) {
                    sortestString = part;
                }
            }
        }
        System.out.println(sortestString);
    }
}
