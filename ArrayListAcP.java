import java.util.ArrayList;
import java.util.List;

public class ArrayListAcP {

    public static void processQueries(List<Integer> arr, List<int[]> queries) {
        for (int[] query : queries) {
            int qType = query[0];

            if (qType == 1) {
                // Query type 1: Insert r at index p
                int p = query[1];
                int r = query[2];
                arr.add(p, r); // Insert r at index p
                System.out.println(arr);
            } else if (qType == 2) {
                // Query type 2: Find the last index of p
                int p = query[1];
                int index = arr.lastIndexOf(p); // Find last occurrence of p
                System.out.println(index); // Print the index (or -1 if not found)
            }
        }
    }

    public static void main(String[] args) {
        // Initial ArrayList
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);

        // Queries in the format {qType, p, r}
        // qType 1 -> Insert r at index p
        // qType 2 -> Find last index of p
        List<int[]> queries = new ArrayList<>();
        queries.add(new int[] { 1, 2, 5 }); // Insert 5 at index 2
        queries.add(new int[] { 2, 3 }); // Find last index of 3
        queries.add(new int[] { 2, 5 }); // Find last index of 5
        queries.add(new int[] { 1, 0, 9 }); // Insert 9 at index 0
        queries.add(new int[] { 2, 9 }); // Find last index of 9

        // Queries
        processQueries(arr, queries);
    }
}
