package data_structures.Lists;

import java.util.Arrays;
import java.util.List;

/**
 * ArrayList: Dynamic array-based list
 *
 * Characteristics:
 * - Access: O(1) - direct index access
 * - Insertion at end: O(1) amortized
 * - Insertion in middle: O(n) - needs to shift elements
 * - Removal: O(n) - needs to shift elements
 * - Memory: Contiguous, efficient
 * - Ordering: Maintains insertion order
 *
 * Use cases:
 * - Frequent element access
 * - Few insertions/removals in the middle
 * - When you need index-based access
 */
public class ArrayListExample {
    public static void main(String[] args) {
        // Initialize with initial capacity (good practice when size is known)
        java.util.ArrayList<String> list = new java.util.ArrayList<>(10);

        // Insertion - O(1) amortized at end
        list.add("A");
        list.add("B");

        // Insertion in middle - O(n)
        list.add(1, "C"); // Shifts elements

        // Access - O(1)
        String element = list.get(0);

        // Removal - O(n)
        list.remove(1); // Shifts elements

        // Search - O(n)
        int index = list.indexOf("B");

        // Iteration - common in ArrayList
        for (String item : list) {
            System.out.println(item);
        }

        // Bulk operations
        list.addAll(Arrays.asList("D", "E", "F"));

        // Sublist view
        List<String> subList = list.subList(1, 3);
    }
}
