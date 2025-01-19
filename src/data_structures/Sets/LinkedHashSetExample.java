package data_structures.Sets;

import java.util.Arrays;
import java.util.LinkedHashSet;

/**
 * LinkedHashSet: Hash table and linked list implementation
 *
 * Characteristics:
 * - Access/Insert/Remove: O(1)
 * - Memory: More than HashSet (additional links)
 * - Ordering: Maintains insertion order
 * - No duplicates allowed
 *
 * Use cases:
 * - Need unique elements with insertion order
 * - Predictable iteration order
 * - Cache-like structures with order
 */
public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();

        // Insertion preserves order
        set.add("C");
        set.add("A");
        set.add("B");

        // Iteration - maintains insertion order
        System.out.println("Iteration maintains order:");
        for (String item : set) {
            System.out.println(item); // Prints: C, A, B
        }

        // Check existence
        boolean hasElement = set.contains("A");

        // Remove element
        set.remove("A");

        // Bulk operations preserve order
        set.addAll(Arrays.asList("D", "E", "F"));

        // Clear all elements
        set.clear();
    }
}
