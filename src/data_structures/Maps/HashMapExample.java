package data_structures.Maps;

import java.util.HashMap;

/**
 * HashMap: Hash table based map
 * <p>
 * Characteristics:
 * - Access: O(1) average, O(n) worst-case in case of hash collisions
 * - Insert: O(1) average, O(n) worst-case (rehashing may occur)
 * - Remove: O(1) average, O(n) worst-case
 * - Memory: Uses hash table. Not contiguous, uses hash buckets
 * - Ordering: No order guarantee. No specific order (since Java 8 uses LinkedHashMap for iteration order if needed)
 * - Allows one null key
 * <p>
 * Use cases:
 * - Caching
 * - Counting frequencies
 * - Lookup tables
 */
public class HashMapExample {
    public static void main(String[] args) {
        // Initialize with capacity and load factor
        HashMap<String, Integer> map = new HashMap<>(16, 0.75f);

        // Basic operations
        map.put("A", 1);
        map.put("B", 2);

        // Access
        int value = map.get("A");
        int defaultValue = map.getOrDefault("C", 0);

        // Check existence
        boolean hasKey = map.containsKey("B");
        boolean hasValue = map.containsValue(2);

        // Functional operations
        map.computeIfPresent("A", (k, v) -> v + 1);
        map.computeIfAbsent("C", k -> 0);
        map.merge("A", 1, Integer::sum);

        // Iteration
        for (var entry : map.entrySet()) {
            System.out.printf("Key: %s, Value: %d%n",
                    entry.getKey(), entry.getValue());
        }

        // Stream operations
        map.forEach((k, v) -> System.out.println(k + ": " + v));
    }
}
