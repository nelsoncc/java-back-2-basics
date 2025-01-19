package data_structures.Sets;

import java.util.Arrays;
import java.util.HashSet;

/**
 * HashSet: Hash table based set
 *
 * Characteristics:
 * - Access/Insert/Remove: O(1) average
 * - Memory: Uses hash table
 * - Ordering: No order guarantee
 * - No duplicates allowed
 *
 * Use cases:
 * - Fast element existence check
 * - Remove duplicates
 * - When order doesn't matter
 */
public class HashSetExample {
    public static void main(String[] args) {
        // Initialize with capacity and load factor
        HashSet<String> set = new HashSet<>(16, 0.75f);

        // Insertion - O(1)
        set.add("A");
        set.add("B");
        set.add("A"); // Won't add duplicate

        // Check existence - O(1)
        boolean exists = set.contains("A");

        // Removal - O(1)
        set.remove("B");

        // Size operations
        System.out.println("Size: " + set.size());
        boolean isEmpty = set.isEmpty();

        // Bulk operations
        set.addAll(Arrays.asList("C", "D", "E"));

        // Iteration - order not guaranteed
        for (String item : set) {
            System.out.println(item);
        }

        // Convert to array
        String[] array = set.toArray(new String[0]);
    }
}
